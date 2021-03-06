package com.sist.server;
import java.io.*;
import java.net.*;
import java.util.*;
import com.sist.common.*;
public class Server2 implements Runnable{
	//연결=> 접속처리 => ServerSocket
	//각 클라이언트마다 통신담당 (Thread) => Socket <=> Socket
	//1. 서버 가동
	private ServerSocket ss;
	private final int PORT=8888;
	
	// 접속자 저장 공간
	private Vector<Client> waitVc=new Vector<Client>();
	
	public Server2()
	{
		try
		{
			ss=new ServerSocket(PORT); //bind,listen
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	// 접속시 처리 
	public void run() 
	{
		try
		{
			while(true) // 접속을 처리하는 부분
			{
				// 접속을 했다면 => 클라이언트의 정보수집 => IP,PORT(Socket) 소켓에 IP,PORT를 묶어서
				Socket s=ss.accept();
				// s(클라이언트의 정보 (ip,port) => Thread로 전송 (각자마다 통신을 할 수 있다)
				Client client=new Client(s);
				client.start();
			}
		}catch(Exception ex) {}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server2 server=new Server2();
		new Thread(server).start();
	}
	//통신을 담당하는 부분 (각 클라이언트 마다 따로 작업을 하기때문에 클라이언트 접속시마다 따로 생성)
	class Client extends Thread
	{
		String id,name,sex,pos;
		// pos=> 방위치
		// 통신
		Socket s;// 통신장비
		// 보내기
		OutputStream out;
		// 받기
		BufferedReader in; //뒤에 Reader가 붙어있으면 2byte씩 전송(한글이 있으므로 필요)
		
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				out=s.getOutputStream(); //클라이언트의 저장위치 => 읽어갈 수 있게 만든다
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				//InputStreamReader (필터스트림) => byte => 2byte로 변환
			}catch(Exception ex) {}
		}
		
		// 클라이언트와 통신
		public void run()
		{
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
							break;
						}
					}
				}
				
			}catch(Exception ex) {}
		}
		
		// 반복을 제거 => 메소드
		// 서버에서 => 전송
		// 개인적으로 전송 (MassegeTo)
		public synchronized void messageTo(String msg)  
		// synchronized 동기화 프로그램 하나가 완료된 뒤 다음 걸로 넘어감
		{
			try
			{
				out.write((msg+"\n").getBytes());
				// readLine() => 끝나는 시점 =(\n) 역슬러시가 있는 것 주의
			}catch(Exception ex) {}
		}
		// 전체적으로 전송 (예:대기실 MassegeAll)
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
