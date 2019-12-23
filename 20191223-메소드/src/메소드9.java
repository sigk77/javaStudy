import java.util.Scanner;

// 국어 , 영어, 수학 점수를 받아서
// 총점, 평균, 학점을 출력하는 메소드를 만든다
/*
 * 		1.입력
 * 	
 * 		2.총점
 * 		3.평균
 * 		4.학점
 * 		5.출력
 * 		
 */

public class 메소드9 {
	
//	 		1.입력
	static int[] kor()
	{
		int[] kor=new int[3];
		Scanner scan=new Scanner(System.in);
	for(int i=0;i<3;i++)
	     {
		System.out.println("국어점수를 입력해 주세요(0~100점).");
		int input=scan.nextInt();
			if(input>100 || input<=0)
			{
				System.out.println("0~100사이로 입력해주세요.");
				continue;
			}
			break;
	     }
		return kor;
	}
	
	static int[] eng()
	{
		int[] eng=new int[3];
		Scanner scan=new Scanner(System.in);
	for(int i=0;i<3;i++)
	     {
		System.out.println("영어점수를 입력해 주세요(0~100점).");
		int input=scan.nextInt();
			if(input>100 || input<=0)
			{
				System.out.println("0~100사이로 입력해주세요.");
				continue;
			}
			break;
	     }
		return eng;
	}
	static int[] math()
	{
		int[] math=new int[3];
		Scanner scan=new Scanner(System.in);
	for(int i=0;i<3;i++)
	     {
		System.out.println("국어점수를 입력해 주세요(0~100점).");
		int input=scan.nextInt();
			if(input>100 || input<=0)
			{
				System.out.println("0~100사이로 입력해주세요.");
				continue;
			}
			break;
	     }
		return math;
	}
//	 		2.총점
//	 		3.평균
//	 		4.학점
//	 		5.출력

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
