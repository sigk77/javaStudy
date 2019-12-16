import java.util.Scanner;
public class 배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] num=new int[5];
		// 값 입력
		for(int i=0;i<5;i++)
		{
			num[i]=(int)(Math.random()*100)+1;
		}
		int[] rank=new int[5];
		// 처리 => 최대값,최소값
		for(int i = 0;i<5;i++)
		{
			rank[i]=1;
			for(int j=0;j<5;j++)
			{
				if(num[i]<num[j])
				{
					rank[i]++;
				}
					
			}
		}
		
		//출력
		for(int i=0;i<5;i++)
		{
			System.out.println(num[i]+"["+rank[i]+"]"+"  ");
		}
	}
}
