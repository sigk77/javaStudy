package com.sist.client;
import java.awt.*;
import javax.swing.*;
/*
 * 		java	==> 1.2
 * 		javax ================> x(extends)
 * 
 * 		HTML => XML (확장된 HTML 확장(사용자 정의라는 뜻))
 */
public class LayoutEx2 {
	JFrame frame=new JFrame();
	public LayoutEx2() {
		//frame.setLayout(new FlowLayout());
		frame.setLayout(new GridLayout(2,3,10,10));
		JButton b1=new JButton("국어");
		JButton b2=new JButton("영어");
		JButton b3=new JButton("수학");
		JButton b4=new JButton("국어");
		JButton b5=new JButton("영어");
		JButton b6=new JButton("수학");
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LayoutEx2();
	}

}
