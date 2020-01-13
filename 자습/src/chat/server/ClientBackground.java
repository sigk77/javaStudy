package chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
 
public class ClientBackground {
 
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private ClientGui gui;
     
 
    public final void setGui(ClientGui gui) {
        this.gui = gui;
    }
 
    public void connet() {
        try {
            socket = new Socket("127.0.0.1", 7777);
            System.out.println("���� �����.");
             
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
             
            out.writeUTF("�ȳ��ϼ���. ���� Ŭ���̾�Ʈ�Դϴ�.");
            System.out.println("Ŭ���̾�Ʈ : �޽��� ���ۿϷ�");
             
             
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
        ClientBackground clientBackground = new ClientBackground();
        clientBackground.connet();
    }
 
}