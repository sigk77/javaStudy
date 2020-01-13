package chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
 
public class ServerBackground {
 
    // �̽�1. ���� �޽����� �ְ�ް� �;��. 
    // �̽�2. �ϱ����� ���� GUI �� ���鵵�� �ϰڽ��ϴ�. 
    // �̽�3. ����
     
    private ServerSocket serverSocket;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private ServerGui gui;
     
     
     
    public final void setGui(ServerGui gui) {
        this.gui = gui;
    }
 
    public void setting(){
        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("���� �����...");
            socket = serverSocket.accept();
            System.out.println(socket.getInetAddress()+"���� �����߽��ϴ�.");
         
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
             
            String msg = in.readUTF();
            System.out.println("Ŭ���̾�Ʈ�κ����� �޽��� : "+msg);
            gui.appendMsg(msg);
             
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
    public static void main(String[] args) {
        ServerBackground serverBackground= new ServerBackground();
        serverBackground.setting();
             
    }
     
}