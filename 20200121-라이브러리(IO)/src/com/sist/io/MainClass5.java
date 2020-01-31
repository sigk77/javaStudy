package com.sist.io;
import java.io.*;
/*
 *  File 속성 ==> File 입출력
 *  =====================
 *  	FileInputStream , FileOutputStream ==> 1byte
 *  	FileReader		, FileWriter	==> 2byte
 */
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File file=new File("C:\\javaDev\\javaStudy\\20200120-자바최종정리\\src\\com\\sist\\java\\MainClass.java");
			// FileInputStream fis=new FileInputStream(file);   // 이걸로 하면 1byte 메모리표시 한글 깨짐
			FileReader fis=new FileReader(file);  // 이걸로 하면 2byte 메모리 표시  한글 안깨짐
			// 생성자=> 여러개의 생성자를 가지고 있을 수 있다 (오버로딩)
			int i=0; // 값을 읽기 ==> int read() => ASC를 읽어 온다
			String data="";
			while((i=fis.read())!=-1) // ***-1은 EOF 파일 끝날 때까지 읽어달라는 표시
			{
				//System.out.print((char)i);   // i는 int라 숫자로 표현되기 때문에 (char)써줌
				data+=String.valueOf((char)i);  // String으로 묶어서 표현 (1)
			}
			System.out.println(data);  // String으로 묶어서 표현 (1)
			fis.close(); // 읽은 후 닫아줘야함
			/*
			 * 	r : 읽기
			 * 	w : 쓰기
			 * 	a : 추가
			 */
			File file2=new File("c:\\image\\data.txt");
			if(!file2.exists()) //만약에 file2가 없다면
			{
				file2.createNewFile(); // file2를 만들어라
			}
			/*
			 * 	textarea => setText() , append()
			 */
			FileWriter fos=new FileWriter(file2,true);  // (file2) 안에 true를 넣어주면 덧붙여줌, append모드
			fos.write(data);
			fos.close();
			System.out.println("파일 쓰기 완료"); // 쓰기모드 이므로 기존에 있던 내용을 지우고 덮어씀 한번 더 실행시키면 덮어쓰기
			// (true)빼면 덮어쓰기 적어주면 덧붙이기
			
			
 			/*
			 *  클래스
			 *  ====
			 *    1) 구성요소
			 *    	1. 멤버변수 : (개별사용변수,공통변수), 공통변수(정적변수))
			 *    				private int a; ==> 저장공간을 생성 후에 저장
			 *    							       ==========
			 *    									   new
			 *    				private static int b; ==> , 클래스 로더
			 *    				
			 *    				기본형, 클래스 , 배열 ==> 데이터형
			 *    					  =========
			 *    						사용자정의 데이터형
			 *    				==> 메소드안에서 사용하는 변수 : 지역변수
			 *    			==========================================
			 *    			멤버변수 : 자동초기화
			 *    			지역변수 : 반드시 초기화를 해서 사용한다
			 *    	2. 메소드 :
			 *    		= 선언만된 메소드 (추상메소드) => 미완성된 클래스
			 *    		  ========== 완성을 해서 사용 (추상클래스,인터페이스)
			 *    		  public void display()
			 *    		  { 
			 *    			// 구현부
			 *    		  }
			 *    			
			 *    		  => 사용자의 요청값을 받아서 처리 결과를 보내준다
			 *    			 ==========      ======
			 *    			  매개변수                          리턴형
			 *    							  ====
			 *    							   1개만 사용
			 *    							 = 경우의 수가 많은 경우
			 *    							 = 데이터가 많다 (배열,클래스,컬렉션)
			 *    			  => 매개변수 : 3개이상이면 => 클래스로 묶어서 전송
			 *    			  => 메소드는 동기화
			 *    				aaa();
			 *    				bbb();
			 *    				ccc();
			 *    
			 *    			  => 메소드의 주로 하는 역할 : 통신(클래스와 클래스=> 메세지)
			 *    	3. 생성자 : 멤버변수의 초기화 : 멤버변수에 값을 대입
			 *    						   =============
			 *    							1) File을 읽어서 값을 대입
			 *    							2) 제어문 사용
			 *    							*** class의 블록은 구현을 할 수 없다(선언)
			 *    
			 *    							Class A
			 *    							{
			 *    								int a;
			 *    								a==19;(X)
			 *      						}
			 */
		}catch(Exception ex) {}
	}

}
