/*
 *   ���� �ΰ��� �����ڸ� �޾Ƽ� ��ģ����
 * 
 *   ù���� ���� �Է�:10
 *   �ι�° ���� �Է�:20
 *   ������ �Է�:+ ==>����) String op=scan.next()
 *                     char c=op.charAt(0)
 *                     
 *   �����
 *   => 10+20=30
 */
import java.util.Scanner;
public class ����_��Ģ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("ù��° ���� :");
    int num1=scan.nextInt();
    System.out.println("�ι�° ���� :");
    int num2=scan.nextInt();
    System.out.println("������ �Է�:");
    String op=scan.next();
    
    char c=op.charAt(0);
    //"+" -> '+'
    if(c=='+')
    {
    	System.out.println(num1+"+"+num2+"="+(num1+num2));
    }
    if(c=='-')
    {
    	System.out.println(num1+"-"+num2+"="+(num1-num2));
    }
    if(c=='*')
    {
    	System.out.println(num1+"*"+num2+"="+(num1*num2));
    }
    if(c=='/')
    {
    	System.out.println(num1+"/"+num2+"="+(num1/num2));
    }
    
    
	}

}
