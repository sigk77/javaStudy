import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;

public class GameRoom extends JPanel{
	Image back;
	
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	GameRoom()
	{
		setLayout(null);
		back=Toolkit.getDefaultToolkit().getImage("C:\\image\\background.jpg");
		la1=new JLabel("Id",JLabel.RIGHT);
		la1.setForeground(Color.white);
		la2=new JLabel("Password",JLabel.RIGHT);
		la2.setForeground(Color.white);
		
		tf=new JTextField();
		pf=new JPasswordField();
		
		b1=new JButton("카드1");
		b2=new JButton("카드2");
		
		//배치
		la1.setBounds(390,330,80,30);
		tf.setBounds(475, 330, 150, 30);
		
		la2.setBounds(390,365,80,30);
		pf.setBounds(475, 365, 150, 30);
		
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(390, 405, 275, 35);
		p.setOpaque(false);
		add(la1);
		add(tf);
		add(la2);
		add(pf);
		add(p);

	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
		
	}

}
