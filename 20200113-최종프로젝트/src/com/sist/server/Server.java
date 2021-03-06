package com.sist.server;
import java.io.*;
import java.net.*;
import java.util.*;
import com.sist.common.*;
public class Server implements Runnable{
	// 연결=>접속처리 => ServerSocket
	// 각 클라이언트마다 통신담당 (Thread) => Socket <=> Socket
	// 1. 서버 가동 
	private ServerSocket ss;
	private final int PORT=8888;
	// 접속자 저장 공간 
	private Vector<Client> waitVc=new Vector<Client>();  // <Server.Client> 였어야하는데 Server클래스 안이라 생략해줌
	private Vector<Room> roomVc=new Vector<Room>(); //영구적으로 저장되는게 아니라 DB대신 여기에

	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT);//bind,listen
			System.out.println("Server Start...");
		}catch(Exception ex){}
	}
	// 접속시 처리 
    public void run()
    {
    	try
    	{
    		while(true)
    		{
    			// 접속을 했다면 => 클라이언트의 정보수집 => IP,PORT(Socket)
    			Socket s=ss.accept();
    			// s(클라이언트의 정보 (ip,port) => Thread로 전송 (각자마다 통신을 할 수 있다)
    		    Client client=new Client(s);
    		    client.start();
    		}
    	}catch(Exception ex) {}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Server server=new Server();
        new Thread(server).start();
	}
	// 통신을 담당하는 부분(각클라이언트마다 따로 작업을 한다)
	class Client extends Thread
	{
		String id,name,sex,pos;
		int avata;
		// pos=> 방위치 
		// 통신 
		Socket s;// 통신장비 
		// 보내기
		OutputStream out;
		// 받기
		BufferedReader in;
		
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				out=s.getOutputStream();// 클라이언트의 저장위치 => 읽어갈 수 있게 만든다
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				//InputStreamReader (필터스트림) => byte=>2byte로 변환 
			}catch(Exception ex) {}
		}
		
		// 클라이언트와 통신 
		public void run()
		{
			// 100|hong|홍길동|남자\n
			try
			{
				while(true)
				{
					String msg=in.readLine();
					StringTokenizer st=
							new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
					   case Function.LOGIN:
					   {
						   id=st.nextToken();
						   name=st.nextToken();
						   sex=st.nextToken();
						   pos="대기실";
						   
						   
						   messageAll(Function.LOGIN+"|"
								   +id+"|"+name+"|"+sex+"|"+pos);
						   
						   waitVc.add(this);
						   
						   messageTo(Function.MYLOG+"|"+id);
						   
						   for(Client user:waitVc)
						   {
							   messageTo(Function.LOGIN+"|"
						        +user.id+"|"+user.name+"|"
						        +user.sex+"|"+user.pos);
						   }
						   
						   // 로그인 한 사람에게 개설된 방정보 전송 messeageTo(로그인한 당사자에게만)
						   for(Room room:roomVc)
						   {
							   messageTo(Function.MAKEROOM+"|"+room.roomName+"|"
									   +room.roomState+"|"
									   +room.current+"/"+room.maxcount);
						   }
						   
						   break;
					   }
					   case Function.WAITCHAT:
					   {
						   messageAll(Function.WAITCHAT+"|["+name+"]"+st.nextToken());
						   break;
					   }
					   case Function.EXIT:
					   {
						   String mid=id;
						   for(int i=0;i<waitVc.size();i++)
						   {
							   Client user=waitVc.get(i);
							   if(mid.equals(user.id))
							   {
								   // 윈도우 종료
								   messageTo(Function.MYEXIT+"|");
								   // Vector에서 제거
								   waitVc.remove(i);
								   // 닫기(통신 종료)
								   in.close();
								   out.close();
								   break;
							   }
						   }
						   // 전체 메세지 => 나가는 유저를 테이블에서 삭제
						   messageAll(Function.EXIT+"|"+mid);
						   break;
					   }
					   case Function.MAKEROOM: //MAKEROOM을 눌렀다면
					   {
						/*
						 * Function.MAKEROOM+"|"+rn+"|" +rs+"|"+rp+"|"+inwon+
						 */
						   
						   Room room=new Room(st.nextToken(),st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));
						   room.userVc.add(this);
						   
						   roomVc.add(room);
						   pos=room.roomName;
						   
						   messageAll(Function.MAKEROOM+"|"+room.roomName+"|"
								   +room.roomState+"|"
								   +room.current+"/"+room.maxcount);   //개설된 방 정보 갱신
						   // 방에 들어가게 만든다
						   messageTo(Function.ROOMIN+"|"+room.roomName+"|"
								   +id+"|"+sex+"|"+avata);
						   // 대기실
						   messageAll(Function.POSCHANGE+"|"+id+"|"+pos); // id를 찾아서 위치정보를 변경해라
						   break;
					   }
					   case Function.ROOMIN:
					   {
						   // Function.ROOMIN+"|"+rn 위에서 적었으로
						   String rn=st.nextToken();
						   /*
						    *  1. 방이름을 받는다
						    *  2. 방을 찾는다(roomVc)
						    *  3. pos,current를 변경
						    *  ===================
						    *  = 방에 있는 사람 처리 => ROOMADD
						    *  	 1. 방에 입장하는 사람의 정보 전송(id,avata..)
						    *    2. 입장메세지 전송
						    *  = 방에 들어가는 사람 처리
						    *    1. 방에 들어가라 => ROOMIN
						    *    2. 방에 있는 사람들의 정보를 보내준다
						    *  = 대기실 변경
						    *    인원수가 변경 => 메세지 전송
						    */
						   for(Room room:roomVc)
						   {
							   if(rn.equals(room.roomName))//방찾기
							   {
								   pos=room.roomName;
								   room.current++;
								   
								   for(Client user:room.userVc)
								   {
									   user.messageTo(Function.ROOMADD+"|"
											   +id+"|"+sex+"|"+avata);
									   user.messageTo(Function.ROOMCHAT
									   		+"|[알림☞]"+id+"님이 입장하셨습니다");
								   }
								   // 본인 처리
								   room.userVc.add(this);
								   messageTo(Function.ROOMIN+"|"+room.roomName+"|"
										   +id+"|"+sex+"|"+avata);
								   
								   for(Client user:room.userVc)
								   {
									   if(!id.equals(user.id))
									   {
										   messageTo(Function.ROOMADD+"|"
												   +user.id+"|"+user.sex+"|"+user.avata);
									   }
								   }
								   messageAll(Function.WAITUPDATE+"|"
										   +room.roomName+"|"+room.current+"|"+room.maxcount+"|"+id+"|"+pos);
							   }
						   }
						   // 대기실 변경
//						   messageAll(Function.WAITUPDATE+"|"
//								   +user.id+"|"+user.sex+"|"+user.avata+"|"+room.bang);
						   
						   // 전체적으로 전송
						   /*
						    * 	대기실 => messageAll
						    * 	방,개인 => messageTo
						    * 
						    * 	==> 행위자 처리
						    * 	==> 남아 있는 사람..
						    * 	==> 대기실 처리 
						    * 
						    */
						   break;
					   }
					   case Function.ROOMCHAT:
					   {
						   String rn=st.nextToken();
						   String strMsg=st.nextToken();
						   // 방을 찾는다
						   for(Room room:roomVc)
						   {
							   if(rn.equals(room.roomName))
							   {
								   for(Client user:room.userVc)
								   {
									   user.messageTo(Function.ROOMCHAT+"|["+name+"]"+strMsg);
								   }
							   }
							   
						   }
						   break;
					   }
					   case Function.ROOMOUT:
					   {
						   // 방찾기
						   String rn=st.nextToken();
						   for(int i=0;i<roomVc.size();i++)
						   {
							   Room room=roomVc.get(i);
							   if(rn.equals(room.roomName))
							   {
								   pos="대기실";
								   room.current--;
								   
								   // 방에 남아 있는 사람
								   for(Client user:room.userVc)
								   {
									   if(!user.id.equals(id))
									   {
										   user.messageTo(Function.ROOMOUT+"|"+id);  // id에 해당되는 맵을 빼라
										   user.messageTo(Function.ROOMCHAT+"|[알림☞]"+name+"님이 퇴장하셨습니다");
									   }
								   }
								   // 실제 나가는 사람
								   for(int j=0;j<room.userVc.size();j++)
								   {
									   Client user=room.userVc.get(j);
									   if(id.equals(user.id))
										{
										   //userVc에서 제거
										   room.userVc.remove(j);
										   messageTo(Function.MYROOMOUT+"|"); // 방나가기
										   break;
									    }
								   }
								   // 대기실
								   messageAll(Function.WAITUPDATE+"|"
										   +room.roomName+"|"+room.current+"|"+room.maxcount+"|"+id+"|"+pos);
								   if(room.current==0)
								   {
									   roomVc.remove(i);
									   break;
								   }
							   }
						   }
						   break;
					   }
					   case Function.KANG:
					   {
						   String rn=st.nextToken();
						   String yid=st.nextToken();
						   for(Client user:waitVc)
						   {
							   if(yid.equals(user.id))
							   {
								   user.messageTo(Function.KANG+"|"+rn);
								   break;
							   }
						   }
					   }
					}
				}
			}catch(Exception ex) {}
		}
		// 반복을 제거 => 메소드 
		// 서버에서 => 전송 
		// 개인적으로 전송
		public synchronized void messageTo(String msg)
		{
			try
			{
				out.write((msg+"\n").getBytes());
				// readLine() => 끝나는 시점 =(\n)
			}catch(Exception ex) {}
		}
		// 전체적으로 전송 
		public synchronized void messageAll(String msg)
		{
			try
			{
				for(Client user:waitVc)
				{
					user.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
		
	}

}