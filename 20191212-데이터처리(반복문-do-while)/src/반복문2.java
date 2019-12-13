/*
 * 
 *    1) 3명의 학생 => 국어,영어,수학 점수 => 평균,총점,학점을 출력
 *    
 *         국어 영어 수학 총점 평균 학점
 *         80 80 80 240 80 'B'
 *         70 70 70 210 70 'C'
 */
import java.util.Scanner;
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,math,total,avg;
		String result="";
		int i=1;
		Scanner scan=new Scanner(System.in);
		do {
			 System.out.println("국어 점수:");
			 kor=scan.nextInt();
			 
			 System.out.println("영어 점수:");
			 eng=scan.nextInt();
			 
			 System.out.println("수학 점수:");
			 math=scan.nextInt();
			 
			 total=kor+eng+math;
			 avg=total/3;
			 
			 char c='A';
			 switch(avg/10)
			 {
				 case 10:
				 case 9:
					 c='A';
					 break;
				 case 8:
					 c='B';
					 break;
				 case 7:
					 c='C';
					 break;
				 case 6:
					 c='D';
					 break;
				default:
					 c='F';
			 }
			 result+=kor+" "+eng+" "+math+" "+total+" "+avg+" "+c+"\n";
			 i++;
		}while(i<=3);
		
		System.out.println("국어 영어 수학 총점 평균 학점");
		System.out.println(result);
		
		/*
		 * Scanner scan=new Scanner(System.in); System.out.println("(1)국어 점수입력"); int
		 * kor1=scan.nextInt(); System.out.println("(1)영어 점수입력"); int
		 * eng1=scan.nextInt(); System.out.println("(1)수학 점수입력"); int
		 * math1=scan.nextInt(); System.out.println("(2)국어 점수입력"); int
		 * kor2=scan.nextInt(); System.out.println("(2)영어 점수입력"); int
		 * eng2=scan.nextInt(); System.out.println("(2)수학 점수입력"); int
		 * math2=scan.nextInt(); System.out.println("(3)국어 점수입력"); int
		 * kor3=scan.nextInt(); System.out.println("(3)영어 점수입력"); int
		 * eng3=scan.nextInt(); System.out.println("(3)수학 점수입력"); int
		 * math3=scan.nextInt();
		 * 
		 * int total1=kor1+eng1+math1; int total2=kor2+eng2+math2; int
		 * total3=kor3+eng3+math3;
		 * 
		 * int avg1=total1/3; int avg2=total2/3; int avg3=total3/3;
		 * 
		 * avg1=avg1/10; avg2=avg2/10; avg3=avg3/10;
		 * 
		 * 
		 * do { switch(avg1,avg2,avg3) case1 90 case2
		 * 
		 * 
		 * }
		 * 
		 * System.out.println("국어 영어 수학 총점 평균 학점");
		 * System.out.println("%d %d %d %d %d %d");
		 * 
		 */
       
	}

}
