package com.sist.server;
import java.io.*;
import java.net.*;
import java.util.*;
import com.sist.common.*;
public class Server2 implements Runnable{
	//����=> ����ó�� => ServerSocket
	//�� Ŭ���̾�Ʈ���� ��Ŵ�� (Thread) => Socket <=> Socket
	//1. ���� ����
	private ServerSocket ss;
	private final int PORT=8888;
	
	// ������ ���� ����
	private Vector<Client> waitVc=new Vector<Client>();
	
	public Server2()
	{
		try
		{
			ss=new ServerSocket(PORT); //bind,listen
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	// ���ӽ� ó�� 
	public void run() 
	{
		try
		{
			while(true) // ������ ó���ϴ� �κ�
			{
				// ������ �ߴٸ� => Ŭ���̾�Ʈ�� �������� => IP,PORT(Socket) ���Ͽ� IP,PORT�� ���
				Socket s=ss.accept();
				// s(Ŭ���̾�Ʈ�� ���� (ip,port) => Thread�� ���� (���ڸ��� ����� �� �� �ִ�)
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
	//����� ����ϴ� �κ� (�� Ŭ���̾�Ʈ ���� ���� �۾��� �ϱ⶧���� Ŭ���̾�Ʈ ���ӽø��� ���� ����)
	class Client extends Thread
	{
		String id,name,sex,pos;
		// pos=> ����ġ
		// ���
		Socket s;// ������
		// ������
		OutputStream out;
		// �ޱ�
		BufferedReader in; //�ڿ� Reader�� �پ������� 2byte�� ����(�ѱ��� �����Ƿ� �ʿ�)
		
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				out=s.getOutputStream(); //Ŭ���̾�Ʈ�� ������ġ => �о �� �ְ� �����
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				//InputStreamReader (���ͽ�Ʈ��) => byte => 2byte�� ��ȯ
			}catch(Exception ex) {}
		}
		
		// Ŭ���̾�Ʈ�� ���
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
							pos="����";
						
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
		
		// �ݺ��� ���� => �޼ҵ�
		// �������� => ����
		// ���������� ���� (MassegeTo)
		public synchronized void messageTo(String msg)  
		// synchronized ����ȭ ���α׷� �ϳ��� �Ϸ�� �� ���� �ɷ� �Ѿ
		{
			try
			{
				out.write((msg+"\n").getBytes());
				// readLine() => ������ ���� =(\n) �������ð� �ִ� �� ����
			}catch(Exception ex) {}
		}
		// ��ü������ ���� (��:���� MassegeAll)
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
