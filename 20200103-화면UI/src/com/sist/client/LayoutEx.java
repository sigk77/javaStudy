package com.sist.client;
/*
 *   배치
 *    = BorderLayout : JFrame , JDialog , Jwindow
 *    		East West center
 *    = FlowLayout
 *    = GridLayout
 *    = 사용자 정의
 */
import java.awt.*; // Layout , Event.....
import javax.swing.*;
/*
 * 		class JFrame
 * 
 * 
 */


public class LayoutEx {
	JFrame frame =new JFrame("BorderLayout");
	public void init()
	{
		
	}
	public LayoutEx()
	{
		JButton[] btn=new JButton[5];
		String[] layout = {"East","West","Center","North","South"};
/*for(int i=0;i<5;i++)
{
	btn[i]=new NButton(layout[i]);
	freame.add(layout[i],btn[i]);
}*/
		btn[0]=new JButton("Center");
		frame.add("Center",btn[0]);
		btn[1]=new JButton("South");
		frame.add("South",btn[1]);
		frame.setSize(350, 350);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LayoutEx ex=new LayoutEx();
		ex.init();
	}

}
