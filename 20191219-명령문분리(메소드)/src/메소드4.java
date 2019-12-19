/*
 * 		=======================
 * 		1. 메소드 호출
 * 		2. 메소드 블록으로 접근
 * 		3. 블록 안에 있는 모든 문장 수행
 * 		4. 메소드 호출한 위치로 돌아간다
 * 		=======================
 * 
 * 		게시판
 * 		  목록 출력    (페이지가 매개변수)
 * 		  내용 보기   리터럴(여러가지 이므로 클래스) 매개변수(게시물 번호)
 * 	           글쓰기
 * 	           수정하기
 * 		  답변하기
 * 		  삭제하기
 * 		  찾기         매개변수(사용자 검색어)
 * 		
 * 
 * 	 사용자가 답을 입력하면 구구단 출력
 * 	 	매개변수(단) 리터럴(일반적으로 void이지만 굳이 쓴다면 String)
 * 
 *  로그인 (아이디 틀림,비밀번호 틀림, 둘 다 맞음)
 *  	매개변수(아이디,비밀번호) 리터럴(경우의 수 3가지 , String)(정수로 처리도 가능은 함)
 *  
 *  아이디 중복확인
 *  	매개변수(String) 리터널(boolean)
 *  
 *  연년
 *  	값을 가져오고 싶으면 get();
 *  	문자열 설정 set();....? (void)
 *  	존재 하는지.. is (boolean)
 *  
 *  로또 번호 달라고 했을 때
 *  	리터럴(
 */
import java.util.Scanner;
public class 메소드4 {
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
	static String gugudan2(int dan)
	{
		String result="";
		for(int i=1;i<=9;i++)
		{
			result+=dan+"*"+i+"="+(dan+i)+"\n";
		}
		
		return result;
	}
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력:");
		int dan=scan.nextInt();
		//구구단
		String res=gugudan2(dan);
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
