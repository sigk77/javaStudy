import java.net.*;
import java.io.*;
import java.util.Scanner;

public class TcpMultiClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1) {
			System.out.println("USAGE: java TcpMultiClient 대화명");
			System.exit(0);
		}
		try {
			String serverIp = "";
			// 소켓 생성 후 연결 요청
			Socket socket = new Socket(serverIp,8888);
			System.out.println("서버연결되었습니다");
			Thread sender = new Thread(new ClientSender(spcket,args[0]));
			Thread receiver = new Thread(new ClientReceiver(socket));
			
			sender.start();
			receiver.start();
		}catch(ConnectException ce) {
			ce.printStackTrace();
		}catch(Exception e) {}
	} //main

}
