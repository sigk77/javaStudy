package �ڽ�;

import java.util.Scanner;

/* 
 *  ���� n�� �Է¹޾� n�� ��� �Ҽ� ���ϱ� ���� (10000)
 *  2. �Ҽ� ���ϴ� ���(�˰���)
 *     �ڱ� �ڽź��� ���� ����� ������ ���� �ϳ��� ���������� �Ҽ��� �ƴ�
 */
public class �ڽ�1_12��23�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�Ҽ��� �˰� ���� ������ �Է��� �ּ���:");
		int num=scan.nextInt();
		int[] prime=new int[num];
		for(int i=num;i<2;i--)
		{
			for(int j=2;j<=num;j++)
			{
				if(num%j==0)
				{
					prime[i]=i;
				}
			}
				
			}
		
		for(int x=0; x<num;x++)
		{
			System.out.println(prime[x]);
		}
			
	}
}
//		Scanner scan=new Scanner(System.in);
//		System.out.println("�Ҽ��� �˰� ���� ������ �Է��� �ּ���:");
//		int num=scan.nextInt();
//		boolean bCheck=false;
//		for(int i=num;i<=1;i--)
//		{
//			if(num%i==0)
//			{
//				System.out.println(i);
//			}
//		}
//	}
//}

