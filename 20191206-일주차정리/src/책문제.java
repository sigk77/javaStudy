import java.util.Scanner;
public class å���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=0,num2=0; //���۰� , ����
        int sum=0;
        Scanner scan=new Scanner(System.in);
        
        int menu=0;
        EXIT:while(true) {
        	System.out.println("������������������������������������������������");
        	System.out.println("��      ���� ���ϴ� ���α׷�       ��");
        	System.out.println("������������������������������������������������");
        	System.out.println("1.�� �Է�");
        	System.out.println("2.��� ����");
        	System.out.println("3.����");
        	System.out.println("����>_");
        	menu = scan.nextInt();
        	
        	switch(menu){
        	case 1:
            	System.out.println("������������������������������������������������");
            	System.out.println("��      1.  �� �Է�                 ��");
            	System.out.println("������������������������������������������������");
            	System.out.println("ó������:");
            	num1 = scan.nextInt();
            	System.out.println("�ι�° ����");
            	num2 = scan.nextInt();
            	if(num1>=num2)
            	{
            		System.out.println("�ٽ� �Է��ϼ���");
            		continue;
            	}
            	else
            	{
            		break;
            	}
        	case 2:
            	System.out.println("������������������������������������������������");
            	System.out.println("��       2. ��� ����              ��");
            	System.out.println("������������������������������������������������");
            	int sum1=0;
            	int n=num2-num1+1;
            	sum1=n*(num1+num2)/2;
            	System.out.printf("%d���� %d������ ��� ���� ���� %d�Դϴ�.\n",num1,num2,sum1);
            	
        	}
        	}
        }
	}


