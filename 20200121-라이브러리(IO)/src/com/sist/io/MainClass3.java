package com.sist.io;
import java.io.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File dir=new File("c:\\oracle");
			if(dir.exists())
			{
				File[] files=dir.listFiles();
				//System.out.println(files.length); // files의 파일갯수확인
				if(files.length>0) //dir에 파일이 있다면 
				{
					for(File f:files)
					{
						f.delete();   //files의 파일삭제
					}
					dir.delete();  // 디렉토리 삭제
				}
				else   				//dir에 파일이 없다면 
				{
					dir.delete(); // 빈폴더
				}
			}
			System.out.println("oracle폴더 삭제");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
