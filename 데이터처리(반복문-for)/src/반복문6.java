import java.util.Scanner;

import javax.xml.crypto.Data;

/*
 *     알파벳을 대문자 
 *      DDD  ==>  AAA
 *      ZZZ  ==>  WWW
 */
public class 반복문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("알파벳 대문자 3글자 입력:");
       String data=scan.next();
       for(int i=0;i<data.length();i++)
       {
           char c=data.charAt(i);
           
           System.out.print((char)(c-3)); // c-3을 하는 순간 정수로 바뀌기 떄문에 (char)가 빠지면 정수로 출력됨
       }

    		   
	}

}
