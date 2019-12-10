/*
 *    1.if ~ else
 *      정수를 한개 입력받아서 짝수/홀수
 *    2.알파벳 받아서 대문자/소문자 (if~else)
 *      ====
 *      char a='A'
 *    3.정수 3개를 입력받아서 
 *      평균 => 90이상 => 'A'
 *            80이상 => 'B'
 *            70이상 => 'C'
 *            60이상 => 'D'
 *            60이하 => 'F'
 */
import java.util.Scanner;
public class 오늘의문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
        int num=scan.nextInt();
        
        if(num%2==0)
        	System.out.println("짝수");
        else if(num%2!=0)
            System.out.println("홀수");
       
        //문제1 끝
        char a='A';
        if(a>='A'&&a<='Z')
        	System.out.println(a+"는 대문자");
        else if(a>='a'&&a<='z')
        	System.out.println(a+"는 소문자");
        else
        	System.out.println(a+"는 알파벳이 아니다");
        //문제2 끝
        System.out.println("국어점수 입력: ");
        int kor=scan.nextInt();
        System.out.println("영어점수 입력: ");
        int eng=scan.nextInt();
        System.out.println("수학점수 입력: ");
        int math=scan.nextInt();
        
        int avg=(kor+eng+math)/3;
        
//        if(avg>=90)
//        	System.out.println("A");
//        if(avg>=80 && avg<=90)
//        	System.out.println("B");
//        if(avg>=70 && avg<=80)
//        	System.out.println("C");
//        if(avg>=60 && avg<=70)
//        	System.out.println("D");
//        if(avg<=59)
//        	System.out.println("F");
//        
        int res=avg/10;
        
        if(res==10||res==9)
        	System.out.println("A");
        if(res==8)
        	System.out.println("B");
        if(res==7)
        	System.out.println("C");
        if(res==6)
        	System.out.println("D");
        if(res<6)
        	System.out.println("F");
        
        
	}

}
