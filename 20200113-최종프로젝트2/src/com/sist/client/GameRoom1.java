package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GameRoom1 extends JPanel{
	
   Image back;
   JPanel[] pans=new JPanel[2];
   JTextField[] ids=new JTextField[2];
   JTextArea ta=new JTextArea();
   JTextField tf=new JTextField();
   JButton b1,b2,b3;
   GameView games=new GameView();
   
   boolean[] sw=new boolean[2];
   
   public GameRoom1()
   {
	   setLayout(null);
	   back = Toolkit.getDefaultToolkit().getImage("images/gameBackground.jpg");
	   for(int i=0;i<2;i++)
	   {
		   pans[i]=new JPanel();
		   pans[i].setBackground(Color.black);
		   ids[i]=new JTextField();
		   ids[i].setEnabled(false);
	   }
	   setLayout(null);
	   pans[0].setBounds(20, 10, 90, 120 );
	   pans[0].setLayout(new BorderLayout());
	   pans[0].add("Center",new JLabel(new ImageIcon(getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));
	   ids[0].setBounds(20, 135, 90, 20);
	   
	   pans[1].setBounds(20, 560, 90,120 );
	   pans[1].setLayout(new BorderLayout());
	   pans[1].add("Center",new JLabel(new ImageIcon(getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));
	   ids[1].setBounds(20, 685, 90, 20);
	   
	   for(int i=0;i<2;i++)
	   {
		   add(pans[i]);
		   add(ids[i]);
	   }
	   // games.setBackground(Color);
	   games.setBounds(130, 10, 870, 540);
	   add(games);
	   
	   JScrollPane js=new JScrollPane(ta);
	   ta.setEditable(false);
	   js.setBounds(130, 560, 680, 130);
	   add(js);
	   
	   tf.setBounds(130, 695, 680, 30);
	   add(tf);
	   
	   b1=new JButton("게임준비");
	   b2=new JButton("게임시작");
	   b3=new JButton("나가기");
	   
	   JPanel p=new JPanel();
	   p.setLayout(new GridLayout(3,1,5,5));
	   p.add(b1);p.add(b2);p.add(b3);
	   p.setBounds(850, 560, 120, 150);
	   add(p);
   }
   public Image getImageSizeChange(ImageIcon icon,int width,int height)
   {
   	Image img=icon.getImage();
   	Image change=img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
   	return change;
   }
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	}
}