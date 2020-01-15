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
	//서버연결과 관련된 라이브러리
	Socket s; //서버 연결
	OutputStream out; //서버로 데이터 전송(요청) 
	BufferedReader in; //서버에서 응답한 데이터를 받음
	 MainForm() {
		 setLayout(card);
		  add("GAME",gr);
		  add("Center",login);
		  add("WR",wr);

		setSize(1024, 768);
		setVisible(true);// 윈도우 보여라
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
					JOptionPane.showMessageDialog(this, "ID를 입력하세요");
					login.tf.requestFocus();
					return;
				}
				
				String pwd=String.valueOf(login.pf.getPassword());
				if(pwd.length()<1)
				{
					JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
					login.pf.requestFocus();
					return;
				}
				
				// 처리
				MemberDAO dao=new MemberDAO();
				String result=dao.isLogin(id, pwd);
				if(result.equals("NOID"))
				{
					JOptionPane.showMessageDialog(this, "ID가 존재하지 않습니다");
					login.tf.setText("");
					login.pf.setText("");
					login.tf.requestFocus();
				}
				else if(result.equals("NOPWD"))
			   {
					JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
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
				s=new Socket("localhost",8888); // 전화걸기
				// 송신/수신
				out=s.getOutputStream();
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				// 로그인 데이터 보내기
				// 100|hong|홍길동|남자\n
				out.write((Function.LOGIN+"|"+userData+"\n").getBytes());
			}catch(Exception ex) {}
			// 서버로부터 데이터를 읽기 시작
			new Thread(this).start();
		}
		// 서버로부터 데이터를 수신하는 기능
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try
			{
				while(true)
				{
					// 100|hong|홍길동|남자|대기실
					String msg=in.readLine();
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
					  case Function.LOGIN:
					  {
						String[] data= {
								st.nextToken(), //아이디
								st.nextToken(), // 이름
								st.nextToken(), // 성별
								st.nextToken()  // 위치
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

