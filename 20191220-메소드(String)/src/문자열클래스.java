// String : 문자열을 제어
/*
 *  java.lang => import를 생략할 수 있다
 *  문자열을 저장하는 방법
 *  	1) String 변수명 = "Hello Java";
 *  	2) String 변수명 = new String("Hello Java");// 같은 문자열 => 별도로 저장
 *  					====
 *  					새로운 메모리에 저장
 *  
 *  String에서 제공하는 기능
 *  	1) equals : 저장된 문자열 같은지 여부 확인 (true/false)
 *  		ID , PWD ==> 로그인 (대소문자 구분)
 *  		문자열은 (==)을 사용하면 안된다 
 *  
 *  		String s="Hello";
 *  		String s1="Hello";
 *  		String s2=new String("Hello")
 *  		if(s==s1) true
 *  		if(s==s2) false
 *  		if(s.equals(s2)) true
 *  
 *  		=> 원형
 *  			boolean equals(String data)
 *  	2) substring : 문자열을 자를 때
 *  		String s="0123456789";
 *  		substring(3) => "3456789"
 *  		String  s="112분,15세이상관람가"
 *  		String(0,3) => "112"
 *  				===
 *  				end-1  == 012
 *  		substring(int start)
 *  		substrign(int start, int end)
 *  		
 *  	3) length : 문자열 갯수
 *  		String s="Hello 홍길동";
 *  	4) trim
 *  		String s="Hello Java          ";
 *  			=> s.trim).length
 *  	5) startsWith,endsWith
 *  		startsWith("자바")
 *  	6) indexOf,lastIndexOf
 *  		문자의 위치(indexOf:앞에서,lastIndexOf:뒤에서)
 *  		String s="Hello Java";
 *  				  0123456789
 *  		s.indexOf('a') ==> 7
 *  		s.lastIndexOf('a') ==> 9  aaa.java
 *  	7) split
 *  		String s="이병헌, 하정우, 마동석, 전혜진, 수지";
 *  		콤마 별로 짤라서 배열로 저장해 줌
 *  		String[] names=s.split(",")
 *  		정규식
 *  		====
 *  			211.238.142.181
 *  			211.238.142.180
 *  			211.238.142.1
 *  			211.238.142.23
 *  			211.238.142.0
 *  			211.238.1.1
 *  			[0-9]{1,3}\\.[0-9]{1,3}......
 *  	8) toUpperCase,toLowerCase
 *  		대문자 변환         소문자변환
 *  		String s="Hello";
 *  		s.toUpperCase() ==> HELLO
 *  		s.toLowerCase() ==> hello
 *  	9) replace , replaceAll ==> 정규식
 *  				 String s="113분"
 *  				 s.replaceALL("[^0-9]","") ==> 113  (숫자를 제외한 나머지 지우기)
 *  				 s.replaceALL("^[0-9]","")  (숫자로 시작하는 단어 찾기)
 *  				 s.replaceALL("[0-9]$","")  (숫자로 끝나는 단어 찾기)
 *  				 s.replaceALL("[^가-힣]","") 한글빼고 다 삭제
 *  				 s.replaceALL("[^A-Za-z]","") 영문빼고 다 삭제
 *  				  짜+
 *  	   =======
 *  	   변경 ==> String s="Hello Java"
 *  			s.replace('a','b') ==> Hello java
 *  	10) contains() : 포함된 문자를 찾는 경우 
 */
import java.util.Scanner;
public class 문자열클래스 {
	
	static String[] autoComplate(String data)
	{
		String[] ss= {
					"자바와 JPS","자바 프로그래밍","스프링 5","AJax와 JSP","리덕스와 리액트",
					"자바 오라클","MVC 구조","코틀린과 안드로이드",
					"코틀린 프로그램","스프링 데이터",
					"혼자 배우는 자바","지능형 웹 프로그램","웹 프로그램","자바 웹 프로그램",
					"오라클 자바"
		};
		String[] findData=new String[10];
		int j=0;
		for(int i=0;i<ss.length;i++)
		{
			//if(ss[i].startsWith(data))    //검색한 글자로 시작되는 것 찾기
			if(ss[i].contains(data))        //검색한 글자가 포함되는 것 찾음
			{
				findData[j]=ss[i];
				j++;
			}
		}
		return findData;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("검색어 입력:");
		String data=scan.next();
		
		String[] fd=autoComplate(data);
		for(int i=0;i<fd.length;i++)
		{
			if(fd[i]!=null)
			{
				System.out.println(fd[i]);
			}
		}
		 		
	}

}
