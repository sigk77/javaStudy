package com.sist.server;
import java.io.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileReader fis=
					// FileInputStream�̸� �ѱ��� ���� 
					new FileReader("C:\\Users\\sist187\\git\\repository\\20200113-����������Ʈ\\src\\com\\sist\\server\\Server.java");
			String s="";
			int i=0;
			while((i=fis.read())!=-1) // read() ���ڸ� �ѱ��ھ� ���� 
			{
				// -1 => EOF
				s+=String.valueOf((char)+i);
			}
			
			System.out.println(s);
		}catch(Exception ex) {}
	}

}
