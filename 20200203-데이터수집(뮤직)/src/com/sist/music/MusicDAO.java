package com.sist.music;
// ����Ŭ ���� 
import java.util.*;
import java.sql.*;
public class MusicDAO {
	private Connection conn;//����Ŭ ����
	private PreparedStatement ps;// SQL���� ����
	// SELECT , INSERT , UPDATE , DELETE => ����Ŭ���� �ڵ� VS �ڹٿ��� SQL
	// SELECT * FROM emp WHERE ename LIKE '%A%' (X)
	// SELECT * FROM emp WHERE ename LIKE '%'||A||'%' (O)
	// �ּ�
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	// ����̹� ���
	public MusicDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ���÷��� => Ŭ������ �̸��� �о�ͼ� �޸� �Ҵ�
			// new , Class.forName => �޸��Ҵ� ==> Spring => �޼ҵ� ȣ���� ����
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	//����
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
	}
	//����
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}	
	}
	//��� => ���� ==> AutoCommit(false)

	public void musicInsert(MusicVO vo)
	{
		try
		{
			getConnection();
			String sql="INSERT INTO music_genie VALUES("
					+"(SELECT NVL(MAX(mno)+1,1) FROM music_genie),?,?,?,?,?,?,?,?)"; //����
			ps=conn.prepareStatement(sql);
			// ���� ä���
			ps.setInt(1, vo.getRank());   // (1, ) ù���� ����ǥ��� ��
			ps.setString(2, vo.getTitle()); // => 'abcd'  ���⼭ �˾Ƽ� ''�ٿ��ִϱ� ���� ?�� ''�Ⱥ���
			ps.setString(3, vo.getSinger());
			ps.setString(4, vo.getAlbum());
			ps.setString(5, vo.getPoster());
			ps.setInt(6, vo.getIdcrement());
			ps.setString(7, vo.getState());
			ps.setString(8, vo.getKey());
			
			// ����
			ps.executeUpdate(); // commit()
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
	}
}
