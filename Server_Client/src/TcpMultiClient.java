import java.net.*;
import java.io.*;
import java.util.Scanner;

public class TcpMultiClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1) {
			System.out.println("USAGE: java TcpMultiClient ��ȭ��");
			System.exit(0);
		}
		try {
			String serverIp = "";
			// ���� ���� �� ���� ��û
			Socket socket = new Socket(serverIp,8888);
			System.out.println("��������Ǿ����ϴ�");
			Thread sender = new Thread(new ClientSender(spcket,args[0]));
			Thread receiver = new Thread(new ClientReceiver(socket));
			
			sender.start();
			receiver.start();
		}catch(ConnectException ce) {
			ce.printStackTrace();
		}catch(Exception e) {}
	} //main

}
