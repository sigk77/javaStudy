package com.sist.io;
import java.io.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File dir=new File("c:\\oracle");
			if(dir.exists())
			{
				File[] files=dir.listFiles();
				//System.out.println(files.length); // files�� ���ϰ���Ȯ��
				if(files.length>0) //dir�� ������ �ִٸ� 
				{
					for(File f:files)
					{
						f.delete();   //files�� ���ϻ���
					}
					dir.delete();  // ���丮 ����
				}
				else   				//dir�� ������ ���ٸ� 
				{
					dir.delete(); // ������
				}
			}
			System.out.println("oracle���� ����");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
