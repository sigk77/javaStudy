/*
 *   정수 두개와 연산자를 받아서 사친연산
 * 
 *   첫번쨰 정수 입력:10
 *   두번째 정수 입력:20
 *   연산자 입력:+ ==>조건) String op=scan.next()
 *                     char c=op.charAt(0)
 *                     
 *   결과값
 *   => 10+20=30
 */
import java.util.Scanner;
public class 문제_사칙연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("첫번째 정수 :");
    int num1=scan.nextInt();
    System.out.println("두번째 정수 :");
    int num2=scan.nextInt();
    System.out.println("연산자 입력:");
    String op=scan.next();
    
    char c=op.charAt(0);
    //"+" -> '+'
    if(c=='+')
    {
    	System.out.println(num1+"+"+num2+"="+(num1+num2));
    }
    if(c=='-')
    {
    	System.out.println(num1+"-"+num2+"="+(num1-num2));
    }
    if(c=='*')
    {
    	System.out.println(num1+"*"+num2+"="+(num1*num2));
    }
    if(c=='/')
    {
    	System.out.println(num1+"/"+num2+"="+(num1/num2));
    }
    
    
	}

}
