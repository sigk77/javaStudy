package com.sist.board;

public class Board {
	int no;
	String name;
	String regdate; // default => ���� ����
	public Board(int no,String name,String regdate)
	{
		this.no=no;
		this.name=name;
		this.regdate=regdate;
	}
	public void boradList()
	{
		System.out.println("��ȣ:"+no);
		System.out.println("�̸�:"+name);
		System.out.println("�����:"+regdate);
		
	}
}
