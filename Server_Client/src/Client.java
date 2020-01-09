import java.net.*;
import java.io.*;

public class Client {
	public static void main(String[] args) {
		try {
			String serverIp = "211.238.142.187";
			//���ϻ����� �����û
			Socket socket = new Socket(serverIp,8888);
			
			System.out.println("������ ����Ǿ����ϴ�.");
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
		}catch(ConnectException ce) {
			ce.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
