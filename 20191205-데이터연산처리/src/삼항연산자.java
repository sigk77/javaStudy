
// ? :
// (조건문?값1:값2) => 웹(React => 삼항연산자)에서 많이 나옴 
// 조건(true)  => 값1
// 조건(false) => 값2
/*
 *      <%
 *          int sex=1;
 *          if(sex==1)
 *          {
 *       %>
 *           남자
 *       <%
 *           }
 *           else
 *           {
 *        %>
 *           여자
 *        <%
 *           }
 *        %>
 *        =======================
 *        <%
 *             sex==1?"남자":"여자"
 *        %>
 */
import java.util.Scanner;

/* 
 *  국어,영어,수학 점수를 입력받아서 평균 => 평균이 60이상이면 pass , nopass
 *  
 *  // 나이를 입력 ==> 15세이상이면 (영화관람가능) / 이하 (영화관람불가)
 *  // 좌석 => 1 2 3 4 5 => 1,2,4 => 좌석예매 불가능 , 3,5 => 좌석예매가능
 */
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("국어 점수:"); // 저장 int kor=scan.nextInt();
		int kor = scan.nextInt();
		System.out.print("영어 점수:");
		int eng = scan.nextInt();
		System.out.print("수학 점수:");
		int math = scan.nextInt();

		int avg = (kor + eng + math) / 3;

		String result = avg >= 60 ? "pass" : "NonPass";

		System.out.println("결과:" + result);

		System.out.print("나이:");
		int age = scan.nextInt();

		String result1 = age >= 15 ? "영화관람가능" : "영화관람불가";
		System.out.println("답:" + result1);

		System.out.print("좌석번호(1~5):");
		int num = scan.nextInt();

		String re = num == 3 || num == 5 ? "좌석예매가능" : "좌석예매 불가능";
		System.out.println("예매여부:" + re);
	}
}
