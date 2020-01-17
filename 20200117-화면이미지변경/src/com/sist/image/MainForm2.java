package com.sist.image;
/*
 *   디벨로퍼	: 95%
 *   프로그래머 :  5%
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainForm2 extends JFrame implements ActionListener,Runnable{
	JButton b;
	JProgressBar bar;
	public MainForm2()
	{
		b=new JButton("Start");
		bar=new JProgressBar();
		bar.setMinimum(0); // 0번부터 어디까지?
		bar.setMaximum(100); // 100번까지 (Maximum 까지 필수)
		bar.setForeground(Color.cyan);
		bar.setBackground(Color.white);
		bar.setStringPainted(true); // 진행상황 %로 표시?
		
		add("Center",bar);
		add("South",b);
		
		setSize(450,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b.addActionListener(this);
	}
	public void go()
	{
		try
		{
			for(int i=0;i<=100;i++)
			{
				bar.setValue(i);
				Thread.sleep(100); //0.1초마다 올라감
			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainForm2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			new Thread(this).start();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		go();
	}

}
