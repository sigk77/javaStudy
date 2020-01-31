package com.sist.io;
/*
 * 	java.io(��=>File) : �ٿ�ε�/���ε�
 * 	=======
 * 	�����
 * 	  = �޸� 
 * 	    Input : BufferedReader(new InputStreamReader(System.in))
 * 				=> Ű���� �Է°��� �޴� ��� 
 * 		Output : System.out.printIn()
 * 	  = ����
 * 		Input : BufferedReader(new InputStreamReader(new FileInputStream("��θ�")
 * 		Output : FileOutputStream , FileWriter
 * 	  = ��Ʈ��ũ
 * 		Input : BufferedReader(new InputStreamReader(s.getOutputStream(
 * 													===
 * 													s=Socket
 * 		Output : s.getOutputStream()
 * 	=============================================================================
 * 		IO = (Stream=>������ �̵� ���) = �ܹ��� ��� 
 * 		===
 * 		Input :  1byte => InputStream , 2byte => Reader (�ѱ�)
 * 		Output : 1byte => OutputStream , 2byte => writer
 * 
 * 		====> .txt , xml , .json (javascript �ַ� ��� ����������)
 * 					============= Web���� �ַ� ��� (���������� => ����)
 * 					.json => React,Vue => Ajax,RestController
 * 
 * 		File Ŭ����
 * 		=========
 * 		= ���� ============> new File("c:\\javaDev\\a.jpg")
 * 		= ���丮(����)=====> new File("c:\\javaDev")
 */
// Application => Ž���� 
import java.io.*;
/*
 * 	io , sql ==> ������ ����ó�� => �ݵ�� ����ó�� ���
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File dir=new File("c:\\javaDev");
			File[] files=dir.listFiles();
			for(File f:files)
			{
				if(f.isDirectory())// ����
				{
					System.out.println("["+f.getName()+"]");
				}
				else // ����
				{
					System.out.println(f.getName());
				}
			}
		}catch(Exception ex) {}
	}

}
