import java.awt.*;
import javax.swing.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainForm extends JFrame implements ActionListener{
	GameRoom gr=new GameRoom();
	Login login=new Login();
	WaitRoom wr=new WaitRoom();
	CardLayout card=new CardLayout();
	 MainForm() {
		 setLayout(card);
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
				card.show(getContentPane(),"WR");
			}
			
		}

}
