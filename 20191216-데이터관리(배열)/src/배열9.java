/*
 * 		5개의 정수를 받아서
 * 		최대값,최소값...
 * 
 * 		1) 변수
 * 		   int a,b,c,d,e ==> 같다 (한개로 모아서 처리) => 배열
 * 		   int max,min
 */

import java.util.Scanner;
public class 배열9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] num=new int[5];
		// 값 입력
		for(int i=0;i<5;i++)
		{
			num[i]=(int)(Math.random()*100)+1;
		}
		int max=num[0];
		int min=num[0];
		
		
		// 처리 => 최대값,최소값
		for(int i:num)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		
		//출력
		for(int i:num)
		{
			System.out.println(i+"  ");
		}
		System.out.println();
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
		
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("정수입력:");
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
