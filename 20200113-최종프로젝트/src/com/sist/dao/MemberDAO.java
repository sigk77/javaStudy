package com.sist.dao;
import java.sql.*;
public class MemberDAO {
	private Connection conn;//����Ŭ ���� => Socket
	private PreparedStatement ps; // BUfferedReader,OutputStream
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	// ����Ŭ ���� �ּ�
	// 1. ����̹� ��� => �ѹ� ���� => ������
	public MemberDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	// 2. ����
	public void getConnection() {
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
			// conn hr/happy
		}catch(Exception ex) {}
	}
	// 3. ��������
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			// exit
		}catch(Exception ex) {}
	}
	// 4. ��� ó��
	public String isLogin(String id,String pwd)
	{
		String result="";
		try
		{
			// ����
			getConnection();
			// ����Ŭ�� ��û
			String sql="SELECT COUNT(*) FROM member WHERE id=?"; 
			// id�� ���� ����� 0�̸� Ʋ��, 1�̸� ���̵�� ���� 
			ps=conn.prepareStatement(sql); //����Ŭ�� ����
			// ?�� ���� ä���
			ps.setString(1, id);
			// �����û
			ResultSet rs=ps.executeQuery(); // rs�� �����Ͱ� �� ��
			rs.next(); // ���� �����ġ�� Ŀ���� �̵��Ѵ�			
			int count=rs.getInt(1); // ����Ŭ�� ����,�Ǽ� ���� X �׳� ����           
			rs.close();
			
			if(count==0)
			{
				result="NOID";
			}
			else
			{
				// ��û
				sql="SELECT * FROM member WHERE id=?";
						// ����ǥ�� ���߿� ä��ڴٴ� ��
				ps=conn.prepareStatement(sql);// ����
				ps.setString(1, id); // �������� ?�� ���� ä���
				rs=ps.executeQuery(); // ����
				rs.next();
				
				// ���� �޴´�
				String mid=rs.getString(1);
				String mpwd=rs.getString(2);
				String name=rs.getString(3);
				String sex=rs.getString(4);
				System.out.println(name+" "+sex);
				rs.close();
				
				if(mpwd.equals(pwd))
				{
					//�α���
					result=mid+"|"+name+"|"+sex;
				}
				else
				{
					//��й�ȣ�� Ʋ����
					result="NOPWD";
				}
						/*
						 *  String name="";
						 *  String sex="";
						 *  String id="";
						 *  int age=10;
						 *  VARCHAR
						 *  sql="INSERT INTO member VALUES('"+name+"','"+sex+"','"+id+"',"+age+")"
						 *  sql="INSERT INTO member VALUES(?,?,?,?)"
						 */
			}
			
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally {
			//���� ����
			disConnection();
		}
		return result;
		
	}
	
		
		
}
