import java.util.Scanner;

import javax.xml.crypto.Data;

/*
 *     ���ĺ��� �빮�� 
 *      DDD  ==>  AAA
 *      ZZZ  ==>  WWW
 */
public class �ݺ���6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("���ĺ� �빮�� 3���� �Է�:");
       String data=scan.next();
       for(int i=0;i<data.length();i++)
       {
           char c=data.charAt(i);
           
           System.out.print((char)(c-3)); // c-3�� �ϴ� ���� ������ �ٲ�� ������ (char)�� ������ ������ ��µ�
       }

    		   
	}

}
