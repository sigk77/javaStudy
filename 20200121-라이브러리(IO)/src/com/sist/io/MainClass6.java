package com.sist.io;
import java.io.*;
// ���� ����
/*
 * 
 * 	�б� : int read() �ѱ��ھ� ,int read(byte[] , off , len) �ѹ��� ��Ƽ�
 * 		 === 			   ===
 * 		 ���ڹ�ȣ 			    ���� ����Ʈ �� 
 * 	���� : write(byte[]) , write(String)
 * 	�ݱ�  : close()
 */
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=
					new FileInputStream("c:\\image\\1.JPG");
			FileOutputStream fos=
					new FileOutputStream("c:\\oracle\\1.JPG");
			
			int i=0;
			byte[] buffer=new byte[1024];
			while((i=fis.read(buffer, 0, 1024))!=-1)  
			//buffer��ŭ ���� �о .. �ѱ��ھ� ���� 0~1024���� �� ���� �Ŀ� �ѹ��� �����ֱ�  
			//1024�� ����� ���� �������� 2�� ����� ������ 1024�� ���� ���� ������
			{
				fos.write(buffer, 0, i); // ��� ������ 1024���� �ִ°��� �ƴϹǷ� ���� �Ѱ���(i)�� �־���
				// out.write()
			}
			fis.close();
			fos.close();
			System.out.println("���� ���� �Ϸ�");
		} catch (Exception ex) {
			// TODO: handle exception
		}
	}

}
