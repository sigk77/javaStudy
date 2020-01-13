package 자습;

import java.util.Scanner;

/* 
 *  단어의 가운데 글자를 반환하는 클래스 solution을 만드시오
 *  (단어의 길이가 짝수라면 가운데 두글자를 반환)
 *  예) abcde => c / qwer => we
 */
public class 스터디_0102 {

class solution{
	Scanner scan=new Scanner(System.in);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution();
	}

	private static String solution() {
		// TODO Auto-generated method stub
		System.out.print("글자입력");
		String Str = Scanner.next();
		System.out.println(Str.substring((Str.length())/2));
		return Str;
		
	}
	

}
