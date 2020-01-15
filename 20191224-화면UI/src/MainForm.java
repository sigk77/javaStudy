import java.awt.*;
import javax.swing.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.StringTokenizer;

import com.sist.common.Function;
import com.sist.dao.*;
public class MainForm extends JFrame implements ActionListener,Runnable{
	Login login=new Login();
	WaitRoom wr=new WaitRoom();
	GameRoom gr=new GameRoom();
	CardLayout card=new CardLayout();
	//��������� ���õ� ���̺귯��
	Socket s; //���� ����
	OutputStream out; //������ ������ ����(��û) 
	BufferedReader in; //�������� ������ �����͸� ����
	 MainForm() {
		 setLayout(card);
		  add("GAME",gr);
		  add("Center",login);
		  add("WR",wr);

		setSize(1024, 768);
		setVisible(true);// ������ ������
		login.b1.addActionListener(this);
	}

		// TODO Auto-generated method stub
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			JFrame.setDefaultLookAndFeelDecorated(true);
		}
		catch(Exception e) {}
		MainForm mf=new MainForm();
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==login.b1)
			{
				String id=login.tf.getText();
				if(id.length()<1)
				{
					JOptionPane.showMessageDialog(this, "ID�� �Է��ϼ���");
					login.tf.requestFocus();
					return;
				}
				
				String pwd=String.valueOf(login.pf.getPassword());
				if(pwd.length()<1)
				{
					JOptionPane.showMessageDialog(this, "��й�ȣ�� �Է��ϼ���");
					login.pf.requestFocus();
					return;
				}
				
				// ó��
				MemberDAO dao=new MemberDAO();
				String result=dao.isLogin(id, pwd);
				if(result.equals("NOID"))
				{
					JOptionPane.showMessageDialog(this, "ID�� �������� �ʽ��ϴ�");
					login.tf.setText("");
					login.pf.setText("");
					login.tf.requestFocus();
				}
				else if(result.equals("NOPWD"))
			   {
					JOptionPane.showMessageDialog(this, "��й�ȣ�� Ʋ���ϴ�");
					login.pf.setText("");
					login.pf.requestFocus();
			}
				else
				{
					connection(result);
				}
			
			
			}
		}
		public void connection(String userData)
		{
			try
			{
				s=new Socket("localhost",8888); // ��ȭ�ɱ�
				// �۽�/����
				out=s.getOutputStream();
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				// �α��� ������ ������
				// 100|hong|ȫ�浿|����\n
				out.write((Function.LOGIN+"|"+userData+"\n").getBytes());
			}catch(Exception ex) {}
			// �����κ��� �����͸� �б� ����
			new Thread(this).start();
		}
		// �����κ��� �����͸� �����ϴ� ���
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try
			{
				while(true)
				{
					// 100|hong|ȫ�浿|����|����
					String msg=in.readLine();
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
					  case Function.LOGIN:
					  {
						String[] data= {
								st.nextToken(), //���̵�
								st.nextToken(), // �̸�
								st.nextToken(), // ����
								st.nextToken()  // ��ġ
						};
						wr.model2.addRow(data);
					 	break;
					  }
					  case Function.MYLOG:
					  {
						  String id=st.nextToken();
						  setTitle(id);
						  card.show(getContentPane(), "WR");
						  break;
					  }
					}
				}
			}catch(Exception ex) {}
		}
}

