package com.sist.io;
import java.io.*;
// 파일 복사
/*
 * 
 * 	읽기 : int read() 한글자씩 ,int read(byte[] , off , len) 한번에 모아서
 * 		 === 			   ===
 * 		 문자번호 			    읽은 바이트 수 
 * 	쓰기 : write(byte[]) , write(String)
 * 	닫기  : close()
 */
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=
					new FileInputStream("c:\\image\\1.JPG");
			FileOutputStream fos=
					new FileOutputStream("c:\\oracle\\1.JPG");
			
			int i=0;
			byte[] buffer=new byte[1024];
			while((i=fis.read(buffer, 0, 1024))!=-1)  
			//buffer만큼 값을 읽어서 .. 한글자씩 말고 0~1024까지 다 읽은 후에 한번에 보내주기  
			//1024는 맘대로 정할 수있지만 2의 배수가 좋으며 1024가 가장 빨라서 무난함
			{
				fos.write(buffer, 0, i); // 모든 파일이 1024까지 있는것이 아니므로 읽은 총갯수(i)를 넣어줌
				// out.write()
			}
			fis.close();
			fos.close();
			System.out.println("파일 복사 완료");
		} catch (Exception ex) {
			// TODO: handle exception
		}
	}

}
