import java.util.*;// Scanner => scanf
/*
 *   자바 / C
 *   
 *   자바 => 클래스단위
 *   
 *   C => 함수단위
 * 
 * 
 */
public class 이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 변수 => 값을 설정 => 직접입력
		/*
		 *   int a; // 선언
		 *   a=10
		 *   
		 *   int a=10l // 선언과 동시에 값을 대입
		 *   
		 *   입력한 값을 받아서 저장
		 *   랜덤 (난수) => 임의의 수를 저장
		 * 
		 */
//		int a=(int)(Math.random()*100)+1;
//		// Math.random() => 0.0~0.99 ==> 0.0~99.0 => 정수형 0~99 +1
//		// 1~100의 난수 발생
//		System.out.println("a="+a);
//		
//		Scanner scan=new Scanner(System.in);
//		//   System.in => 키보드입력값을 받는다
//		System.out.print("정수입력:");
//		int b=scan.nextInt();
//		System.out.println("b="+b);
		
		//산술 연산자 ==> + , /
		//국어,영어,수학 점수를 받아서 총점,평균 => 소수점 2자리 출력
		int kor,eng,math,total;
		double avg;
		
		// 입력할 수 있는 기능의 클래스를 가지고 온다
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수:");
		kor=scan.nextInt();
		
		System.out.print("영어점수:");
		eng=scan.nextInt();
		
		System.out.print("수학점수:");
		math=scan.nextInt();
		
		//총점
		total=kor+eng+math;
		
		//평균
		avg=total/3.0;
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f",avg);
	}

}
