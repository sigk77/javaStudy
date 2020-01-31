package com.sist.io;
/*
 * 	��������
 * 	======
 * 	1) ���ϸ� : getName()
 * 	2) ���~���ϸ� : getPath()
 * 	3) ��θ� : getParent()
 * 	4) ������ : LastModified => long ==> new Date()
 * 	5) ���ϻ��� : createFile()
 * 	6) ����ũ�� : length
 * 	7) �Ӽ� (�б�/����/����) canRead,canWrite,isHidden(),isFile()
 * 		============== boolean ������ �Ǿ�����
 */
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File file=new File("c:/javaDev/��ü.pptx");			// ***�� �߿�ǥ��
			if(file.exists())
			{
				System.out.println("***���ϸ�:"+file.getName());
				System.out.print("��θ�:"+file.getName());
				System.out.println("***��ü���:"+file.getPath());
				System.out.println("***ũ��:"+file.length());
				System.out.println("�б�����:"+file.canRead());
				System.out.println("��θ�:"+file.getParent());
				System.out.println("��������:"+file.canWrite());
				System.out.println("��������:"+file.isHidden());
				System.out.println("***���Ͽ���:"+file.isFile());
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM��dd��");
				String day=sdf.format(new Date(file.lastModified()));
				System.out.println("***������:"+day); //simpleDataFormat���� ��¥��������
			}
		}catch(Exception ex) {}
	}

}
