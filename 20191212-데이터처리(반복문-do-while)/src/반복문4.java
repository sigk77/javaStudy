import java.util.Scanner;

/*
 *    �ΰ��� ������ �Է¹޾Ƽ�
 *    �ִ밪,�ּҰ�
 *    do~while
 *    10 30 ==> �ִ밪:30 , �ּҰ�:10
 */
public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int num1=0,num2=0;
        int i=1;
        do 
        {
        	if(i==1)
        	{
            	System.out.println("���� �Է�");
            	num1=scan.nextInt();
        	}
        	else
        	{
        		System.out.println("���� �Է�");
        		num2=scan.nextInt();
        	}
        	i++;
        }while(i<=2);
        
        if(num1>num2)
        	System.out.println("�ִ밪:"+num1+",�ּҰ�:"+num2);
        else
        	System.out.println("�ִ밪:"+num2+",�ּҰ�:"+num1);
        
        System.out.println("�ִ밪:"+(num1>num2?num1:num2)
        		+",�ּҰ�:"+(num1<num2?num1:num2));
        System.out.println("�ִ밪:"+(Math.max(num1,num2))
        		+",�ּҰ�:"+(Math.min(num1,num2)));

	}

}
