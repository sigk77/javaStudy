/*
 * 		메소드
 * 		1) 형식
 * 		2) 리턴형 메소드명(매개변수...) => 선언부
 * 			{
 * 				기능구현
 * 				return 결과값
 * 					   ==== 리턴형 == 결과값
 * 			}
 * 			==> 리턴형이 없는 경우 ==> return 을 생략할 수 있다
 * 			==> 모든 메소드는 종료하기 위해서 반드시 마지막에 return을 사용한다
 * 				예외) => 조건문을 사용해서 return을 사용 할 수 있다
 * 					=> return문 아래는 어떤 문장도 사용이 불가능하다
 * 			
 * 			display(10); => 메소드 호출
 * 			static void display(int a)
 * 			{
 * 				System.out.println(a);
 * 				return;
 * 				System.out.println(a+1);// 오류
 * 			}
 * 
 * 			static void display(int a)
 * 			{
 * 				System.out.println(a);
 * 				if(a==10)
 * 					return;
 * 				System.out.println(a+1);
 * 			}
 * 
 * 		2) 리턴형 : 기본형 , 클래스 , 배열
 * 			int method()
 * 			Movie method()
 * 			int[] method()
 * 			결과값이 없는 경우 => void
 * 		3) 매개변수 : 사용자 요청값
 * 			=> 3개 이상이면 묶어서 요청 => 배열,클래스
 * 				회원가입 (클래스)
 * 				게시판 글쓰기 (클래스)			
 * 		4) 매개변수 전송법
 * 			=> call by value : 기본형,String
 * 			   ============== 메모리를 따라 생성(복제(값))
 * 			=> call by reference : 배열, 클래스
 * 			   ================== 같은 주소를 이용해서 값을 변경
 * 		5) 호출
 * 			메소드명()
 * 			메소드명(10,20)
 * 			============= return이 없는 경우
 * 			데이터형 변수=메소드()
 * 			데이터형 변수=메소드(19,20)
 * 		*** 모든 메소드는 수행이 종료한 다음에 다시 호출한 위치로 돌아온다
 * 		*** 메소드를 여러개 호출시 => 한개의 메소드가 수행을 종료해야
 * 						              다음 메소드를 호출
 * 			a()
 * 			b()
 * 			c()
 * 			===================
 * 				c()
 * 			===================
 * 				b()
 * 			===================
 * 				a()	===============> 수행
 * 			===================
 */
// 매개변수 전송 -> call by value
public class 메소드 {
	static void swap(String a,String b)
	{
		System.out.println("변경전 => swap:a="+a+",b="+b);
		// a=10 , b=20;
		//  변경
		/* 
		 *  int a=10;
		 *  int b=20;
		 *  
		 *  a=b ===> a=20
		 *  b=a ===> b=20
		 *  
		 *  int temp=a; temp=10
		 *  a=b ==> a=20
		 *  b=temp ==> b=10
		 */
		String temp=a;
		a=b;
		b=temp;
		System.out.println("변경후=> swap:a="+a+",b="+b);
		// a=20 , b=10
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello";
		String b="Java";
		swap(a,b);
		System.out.println("main:a="+a+",b="+b);
		// a=10,b=20
	}

}
