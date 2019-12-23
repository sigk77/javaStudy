/*
 * 		메소드
 * 		 = 매개변수 (사용자 요청값) => 행위  ====> 여러개
 * 			movieId=123123
 * 		 = 리턴형 => 요청내용에 대한 결과값 전송 => 한개 (데이터 여러개 => 묶어서 하나의 이름으로 전송)
 * 				  ==================
 * 				  기본형, 배열, 클래스
 * 		==================================================================
 * 		형식)
 * 			리턴형 메소드명(매개변수,..) => 선언부
 * 			{
 * 				==> 규현부
 * 				return 결과값  =====> (리턴형 = 결과값)
 * 					   ====				  ===== 작은 데이터형을 사용 할 수 있다
 * 			}
 * 			
 * 			int aaa()
 * 			{
 * 				return (int, char, byte, short)
 * 			}
 * 
 * 			****** 호출
 * 				int a=aaa()
 * 
 * 			==> return이 생략이 되는 경우 ==> 리턴형(void일떄)
 * 
 * 			배열
 * 			int[] aaa()
 * 			클래스
 * 			{
 * 				return 배열명
 * 			}
 * 			클래스
 * 			String aaa()
 * 			{
 * 				return ""(문자열)
 * 			}
 * 
 * 			결과값이 없는 경우
 * 			void aaa()
 * 			{
 * 				return;
 * 			}
 * 			aaa()
 * 			======================================
 * 
 * 			매개변수가 있는 경우
 * 			int plus(int a,int b)
 * 			===		=============
 * 			{
 * 				a=10, b-2
 * 				return a+b;
 * 			}
 * 			
 * 			int a=plus(10,30)
 * 
 * 			void aaa()
 * 			{
 * 				=== 1
 *  			=== 2
 *    			=== 3
 *      		=== 4
 *        		=== 5
 *          	=== 6
 *   			=== 7
 *   		}
 *   	
 *   		aaa() => 1234567
 *   		aaa() => 1234567 ==> 반복과 관련 
 *   
 *          1234567
 *          780
 *          345
 *          1234567
 *          70
 *          90
 *          1234567
 *          
 *          제어문 ==> 반드시 패턴이 존재
 *          
 *         int[] arr={ 1 5 7 4 3 2 1 2 8 9}
 *         =====================
 *         String s="Hello Java";
 *         
 *         1 232 43434 434 343 4 34 34 343434 => int
 *         
 *         113 "aaa" "aadad" 0.9 10.2F 10L    => class                                                                                                                                                                                                                                                                                                                                                                                         
 */
public class 메소드1 {
	String name;
	static void message()
	{
		System.out.println("Hello Java!!");
		// return; 생략가능  , 생략이 되면 ==> JVM(가상머신)이 자동으로 코딩을 해줌
	}
	// int a=10
	static int aaa()
	{
		return 10;
	}
	static double bbb()
	{
		return 10.5;
	}
	static String ccc()
	{
		return "Hello";
	}
	static int[] ddd()
	{
		int[] arr= {1,2,3,4,5};
		return arr;
	}
	static int eee(int a)
	{
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		message();
		int a=aaa();
		double d=bbb();
		String s=ccc();
		int[] arr=ddd();
		int aa=eee(10);
		// 호출 ===> 결과값
		
	}

}
