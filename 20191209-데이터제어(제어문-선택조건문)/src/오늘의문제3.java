/*
 *    1.if ~ else
 *      ������ �Ѱ� �Է¹޾Ƽ� ¦��/Ȧ��
 *    2.���ĺ� �޾Ƽ� �빮��/�ҹ��� (if~else)
 *      ====
 *      char a='A'
 *    3.���� 3���� �Է¹޾Ƽ� 
 *      ��� => 90�̻� => 'A'
 *            80�̻� => 'B'
 *            70�̻� => 'C'
 *            60�̻� => 'D'
 *            60���� => 'F'
 */
import java.util.Scanner;
public class �����ǹ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");
        int num=scan.nextInt();
        
        if(num%2==0)
        	System.out.println("¦��");
        else if(num%2!=0)
            System.out.println("Ȧ��");
       
        //����1 ��
        char a='A';
        if(a>='A'&&a<='Z')
        	System.out.println(a+"�� �빮��");
        else if(a>='a'&&a<='z')
        	System.out.println(a+"�� �ҹ���");
        else
        	System.out.println(a+"�� ���ĺ��� �ƴϴ�");
        //����2 ��
        System.out.println("�������� �Է�: ");
        int kor=scan.nextInt();
        System.out.println("�������� �Է�: ");
        int eng=scan.nextInt();
        System.out.println("�������� �Է�: ");
        int math=scan.nextInt();
        
        int avg=(kor+eng+math)/3;
        
//        if(avg>=90)
//        	System.out.println("A");
//        if(avg>=80 && avg<=90)
//        	System.out.println("B");
//        if(avg>=70 && avg<=80)
//        	System.out.println("C");
//        if(avg>=60 && avg<=70)
//        	System.out.println("D");
//        if(avg<=59)
//        	System.out.println("F");
//        
        int res=avg/10;
        
        if(res==10||res==9)
        	System.out.println("A");
        if(res==8)
        	System.out.println("B");
        if(res==7)
        	System.out.println("C");
        if(res==6)
        	System.out.println("D");
        if(res<6)
        	System.out.println("F");
        
        
	}

}
