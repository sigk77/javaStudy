/*
 *  �� ǥ��
 *  char ==> ''
 *  int ==> 10(10����) , 010(8����) , 0x12(16����) , 0b1010101(2����)
 *  long ==> 10L , 10l
 *  float ==> 10.5F , 10.5f
 *  boolean => true , false
 *  string => ""
 *  
 *  �񱳿����� => �ᱣ��(boolean) : true,false
 *  =======
 *    1) == ����  6==7 (false)  6==6 (true)
 *    2) != �����ʴ� 6!=7 (true)  6!=6(false)
 *    3) < �۴� 6<5 (false) 6<7 (false)
 *    4) > ũ�� 6>5 (ture) 6>7 (false)
 *    5) <= �۰ų� ���� 6<=6(true)
 *                  ====
 *                  6<6 || 6==6 ==> || (������ true=> true)
 *    6) >= ũ�ų� ���� 6>=6 (true)
 *    ============================ if,while,for���� �ַ� ���
 *        ** if => ���ǹ� , while, for => �ݺ���
 */
import java.util.Scanner;
public class ���׿�����_�񱳿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean b1=10==11;
        System.out.println("b1="+b1);
        
        b1=10!=11;
        System.out.println("b1="+b1);
        
        b1=10<11;
        System.out.println("b1="+b1);
        
        b1=10>11;
        System.out.println("b1="+b1);
        // char => ��� ���꿡�� ������ ����
        b1=65<='A';// => 65<=65
        System.out.println("b1="+b1);
        
        b1=65>='B';
        System.out.println("b1="+b1);
        
        // char => ��ȣ  ==> ASC (�ƽ�Ű�ڵ�)
        System.out.println((int)'A'); // 65
        System.out.println((int)'0'); // 48  '1' => 49
        System.out.println((int)'a'); // 97
        
        // �ΰ��� ������ �޾Ƽ� ū���� ���
        
        Scanner scan=new Scanner(System.in);
        // new => �޸𸮿� ���� , ������ => �ʱⰪ �ο�
        /*
         *   scan.netxInt()   ==> int
         *   scan.nextDouble() ==> double
         *   scan.next()       ==> String
         *   scan.nextBoolean() ==> boolean
         *   ==> char(X)
         */
        // 1. �޾Ƽ� ������ ����
        int num1,num2;
        System.out.print("ù��° ���� �Է�:");
        // �Է��� �ϰ� => enter ==> num1�� ����
        num1=scan.nextInt();
        
        System.out.println("�ι�° ���� �Է�:");
        num2=scan.nextInt();
        
        int result=num1<num2?num2:num1;
        
        System.out.println("ū���� "+result+"�Դϴ�");
        
        
        
	}

}
