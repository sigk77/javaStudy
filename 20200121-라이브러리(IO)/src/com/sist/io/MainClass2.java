package com.sist.io;
// ����	
/*
 * 	1) ������ �ִ� ��� ���� �б� ==> listFiles => ������ : File[]
 * 	2) ���� ���� : mkdir()  => void
 *  3) ���� ���� : delete() => void
 */
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File dir=new File("c:\\oracle");
//			if(dir.exists())// oracle������ �������� ������...
//			{
//				// oracle������ ������
//				dir.mkdir();
//			}
//			System.out.println("oracle���� ���� �Ϸ�");
			if(dir.exists())
			{
				dir.delete();
			}
			
			System.out.println("oracle���� ���� �Ϸ�");
		}catch(Exception ex) {}
	}

}
