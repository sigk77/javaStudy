import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			// 서버 소켓 생성 + 8888번포트와 결합
			serverSocket = new ServerSocket(8888);
			System.out.println("서버준비완료");
			
			socket = serverSocket.accept();
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
		    }catch (Exception e) {
		    	e.printStackTrace();
		    }
		
		}
	}
class Sender extends Thread {
	Socket socket;
	DataOutputStream out;
	String name;
	
	Sender(Socket socket){
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "["+socket.getInetAddress()+":"+socket.getPort()+"]";
		}catch(Exception e) {}
	}
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		while(out!=null);
			try {
				out.writeUTF(name+scan.nextLine());
			}catch(IOException e) {}
		}
	}

class Receiver extends Thread {
	Socket socket;
	DataInputStream in;
	
	Receiver (Socket socket) {
		this.socket = socket;
		try {
			in =new DataInputStream(socket.getInputStream());
		}catch(IOException e) {}
	}
	public void run() {
		while(in!=null) {
			try {
				System.out.println(in.readUTF());
			}catch(IOException e) {}
		}
	}
}