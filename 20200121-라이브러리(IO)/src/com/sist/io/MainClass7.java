package com.sist.io;
// ��ü ���� ���� (������)
import java.io.*;
import java.util.*;
class Member implements Serializable{
	private String id;
	private String name;
	private String sex;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArrayList<Member> list=new ArrayList<Member>();
			Member m1=new Member();
			m1.setId("hong");
			m1.setName("ȫ�浿:");
			m1.setSex("����");
			list.add(m1);
			
			m1=new Member();
			m1.setId("shim");
			m1.setName("��û��:");
			m1.setSex("����");
			list.add(m1);
			
			m1=new Member();
			m1.setId("lee");
			m1.setName("�̼���:");
			m1.setSex("����");
			list.add(m1);
			
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c:\\oracle\\member.txt"));
			oos.writeObject(list);
			oos.close();
			
			System.out.println("ArrayList���� �Ϸ�");
		} catch (Exception ex) {
			// TODO: handle exception
		}
	}

}
