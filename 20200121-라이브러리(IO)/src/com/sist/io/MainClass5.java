package com.sist.io;
import java.io.*;
/*
 *  File �Ӽ� ==> File �����
 *  =====================
 *  	FileInputStream , FileOutputStream ==> 1byte
 *  	FileReader		, FileWriter	==> 2byte
 */
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File file=new File("C:\\javaDev\\javaStudy\\20200120-�ڹ���������\\src\\com\\sist\\java\\MainClass.java");
			// FileInputStream fis=new FileInputStream(file);   // �̰ɷ� �ϸ� 1byte �޸�ǥ�� �ѱ� ����
			FileReader fis=new FileReader(file);  // �̰ɷ� �ϸ� 2byte �޸� ǥ��  �ѱ� �ȱ���
			// ������=> �������� �����ڸ� ������ ���� �� �ִ� (�����ε�)
			int i=0; // ���� �б� ==> int read() => ASC�� �о� �´�
			String data="";
			while((i=fis.read())!=-1) // ***-1�� EOF ���� ���� ������ �о�޶�� ǥ��
			{
				//System.out.print((char)i);   // i�� int�� ���ڷ� ǥ���Ǳ� ������ (char)����
				data+=String.valueOf((char)i);  // String���� ��� ǥ�� (1)
			}
			System.out.println(data);  // String���� ��� ǥ�� (1)
			fis.close(); // ���� �� �ݾ������
			/*
			 * 	r : �б�
			 * 	w : ����
			 * 	a : �߰�
			 */
			File file2=new File("c:\\image\\data.txt");
			if(!file2.exists()) //���࿡ file2�� ���ٸ�
			{
				file2.createNewFile(); // file2�� ������
			}
			/*
			 * 	textarea => setText() , append()
			 */
			FileWriter fos=new FileWriter(file2,true);  // (file2) �ȿ� true�� �־��ָ� ���ٿ���, append���
			fos.write(data);
			fos.close();
			System.out.println("���� ���� �Ϸ�"); // ������ �̹Ƿ� ������ �ִ� ������ ����� ��� �ѹ� �� �����Ű�� �����
			// (true)���� ����� �����ָ� �����̱�
			
			
 			/*
			 *  Ŭ����
			 *  ====
			 *    1) �������
			 *    	1. ������� : (������뺯��,���뺯��), ���뺯��(��������))
			 *    				private int a; ==> ��������� ���� �Ŀ� ����
			 *    							       ==========
			 *    									   new
			 *    				private static int b; ==> , Ŭ���� �δ�
			 *    				
			 *    				�⺻��, Ŭ���� , �迭 ==> ��������
			 *    					  =========
			 *    						��������� ��������
			 *    				==> �޼ҵ�ȿ��� ����ϴ� ���� : ��������
			 *    			==========================================
			 *    			������� : �ڵ��ʱ�ȭ
			 *    			�������� : �ݵ�� �ʱ�ȭ�� �ؼ� ����Ѵ�
			 *    	2. �޼ҵ� :
			 *    		= ���𸸵� �޼ҵ� (�߻�޼ҵ�) => �̿ϼ��� Ŭ����
			 *    		  ========== �ϼ��� �ؼ� ��� (�߻�Ŭ����,�������̽�)
			 *    		  public void display()
			 *    		  { 
			 *    			// ������
			 *    		  }
			 *    			
			 *    		  => ������� ��û���� �޾Ƽ� ó�� ����� �����ش�
			 *    			 ==========      ======
			 *    			  �Ű�����                          ������
			 *    							  ====
			 *    							   1���� ���
			 *    							 = ����� ���� ���� ���
			 *    							 = �����Ͱ� ���� (�迭,Ŭ����,�÷���)
			 *    			  => �Ű����� : 3���̻��̸� => Ŭ������ ��� ����
			 *    			  => �޼ҵ�� ����ȭ
			 *    				aaa();
			 *    				bbb();
			 *    				ccc();
			 *    
			 *    			  => �޼ҵ��� �ַ� �ϴ� ���� : ���(Ŭ������ Ŭ����=> �޼���)
			 *    	3. ������ : ��������� �ʱ�ȭ : ��������� ���� ����
			 *    						   =============
			 *    							1) File�� �о ���� ����
			 *    							2) ��� ���
			 *    							*** class�� ����� ������ �� �� ����(����)
			 *    
			 *    							Class A
			 *    							{
			 *    								int a;
			 *    								a==19;(X)
			 *      						}
			 */
		}catch(Exception ex) {}
	}

}
