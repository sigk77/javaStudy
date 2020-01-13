package 자습;

import java.util.Scanner;

/* 
 *  정수 n을 입력받아 n의 모든 소수 구하기 기준 (10000)
 *  2. 소수 구하는 방법(알고리즘)
 *     자기 자신보다 작은 수들로 나누어 봐서 하나라도 나누어지면 소수가 아님
 */
public class 자습1_12월23일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("소수를 알고 싶은 정수를 입력해 주세요:");
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
//		System.out.println("소수를 알고 싶은 정수를 입력해 주세요:");
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

