/*
 * 		5���� ������ �޾Ƽ�
 * 		�ִ밪,�ּҰ�...
 * 
 * 		1) ����
 * 		   int a,b,c,d,e ==> ���� (�Ѱ��� ��Ƽ� ó��) => �迭
 * 		   int max,min
 */

import java.util.Scanner;
public class �迭9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] num=new int[5];
		// �� �Է�
		for(int i=0;i<5;i++)
		{
			num[i]=(int)(Math.random()*100)+1;
		}
		int max=num[0];
		int min=num[0];
		
		
		// ó�� => �ִ밪,�ּҰ�
		for(int i:num)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		
		//���
		for(int i:num)
		{
			System.out.println(i+"  ");
		}
		System.out.println();
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
		
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("�����Է�:");
//			num[i]=scan.nextInt();
//			max=num[0];
//			min=num[0];
//			if(num[i]>max)
//			{
//				max=num[i];
//			}
//			if(num[i]<min)
//			{
//				min=num[i];
//			}
//		}
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(num[i]);
//		}
//		System.out.println(max+" "+min);
				
		
	}

	private static void fot(Class<Integer> class1) {
		// TODO Auto-generated method stub
		
	}

}
