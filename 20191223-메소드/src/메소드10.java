import java.util.Scanner;

public class 메소드10 {
	static int[] input() {
		int[] arr=new int[3];
		String[] msg= {"국어","영어","수학"};
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println(msg[i]+"점수:");
			arr[i]=scan.nextInt();
		}
		return arr;
	}
	static int total(int[] score)
	{
		return score[0]+score[1]+score[2];
	}
	static double avg(int total)
	{
		return total/3.0;
	}
	static char hakjum(double avg)
	{
		char c='A';
		switch((int)(avg/10))
		{
		case 10:case 9: c='A';break;
		case 8:c='B';break;
		case 7:c='C';break;
		case 6:c='D';break;
		default:c='F';
		}
		return c;
	}
	static void print(int[] score,int total,double avg,char c)
	{
		System.out.printf("%d %d %d %d %.2f %c\n",
				score[0],score[1],score[2],total,avg,c);
	}
	static void process()   // 세명 분 하려면 여기에 for문으로 세번 돌리기
	{
		int[] score=input();
		int total=total(score);
		double avg=avg(total);
		char c=hakjum(avg);
		print(score,total,avg,c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
