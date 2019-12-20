// String : ���ڿ��� ����
/*
 *  java.lang => import�� ������ �� �ִ�
 *  ���ڿ��� �����ϴ� ���
 *  	1) String ������ = "Hello Java";
 *  	2) String ������ = new String("Hello Java");// ���� ���ڿ� => ������ ����
 *  					====
 *  					���ο� �޸𸮿� ����
 *  
 *  String���� �����ϴ� ���
 *  	1) equals : ����� ���ڿ� ������ ���� Ȯ�� (true/false)
 *  		ID , PWD ==> �α��� (��ҹ��� ����)
 *  		���ڿ��� (==)�� ����ϸ� �ȵȴ� 
 *  
 *  		String s="Hello";
 *  		String s1="Hello";
 *  		String s2=new String("Hello")
 *  		if(s==s1) true
 *  		if(s==s2) false
 *  		if(s.equals(s2)) true
 *  
 *  		=> ����
 *  			boolean equals(String data)
 *  	2) substring : ���ڿ��� �ڸ� ��
 *  		String s="0123456789";
 *  		substring(3) => "3456789"
 *  		String  s="112��,15���̻������"
 *  		String(0,3) => "112"
 *  				===
 *  				end-1  == 012
 *  		substring(int start)
 *  		substrign(int start, int end)
 *  		
 *  	3) length : ���ڿ� ����
 *  		String s="Hello ȫ�浿";
 *  	4) trim
 *  		String s="Hello Java          ";
 *  			=> s.trim).length
 *  	5) startsWith,endsWith
 *  		startsWith("�ڹ�")
 *  	6) indexOf,lastIndexOf
 *  		������ ��ġ(indexOf:�տ���,lastIndexOf:�ڿ���)
 *  		String s="Hello Java";
 *  				  0123456789
 *  		s.indexOf('a') ==> 7
 *  		s.lastIndexOf('a') ==> 9  aaa.java
 *  	7) split
 *  		String s="�̺���, ������, ������, ������, ����";
 *  		�޸� ���� ©�� �迭�� ������ ��
 *  		String[] names=s.split(",")
 *  		���Խ�
 *  		====
 *  			211.238.142.181
 *  			211.238.142.180
 *  			211.238.142.1
 *  			211.238.142.23
 *  			211.238.142.0
 *  			211.238.1.1
 *  			[0-9]{1,3}\\.[0-9]{1,3}......
 *  	8) toUpperCase,toLowerCase
 *  		�빮�� ��ȯ         �ҹ��ں�ȯ
 *  		String s="Hello";
 *  		s.toUpperCase() ==> HELLO
 *  		s.toLowerCase() ==> hello
 *  	9) replace , replaceAll ==> ���Խ�
 *  				 String s="113��"
 *  				 s.replaceALL("[^0-9]","") ==> 113  (���ڸ� ������ ������ �����)
 *  				 s.replaceALL("^[0-9]","")  (���ڷ� �����ϴ� �ܾ� ã��)
 *  				 s.replaceALL("[0-9]$","")  (���ڷ� ������ �ܾ� ã��)
 *  				 s.replaceALL("[^��-�R]","") �ѱۻ��� �� ����
 *  				 s.replaceALL("[^A-Za-z]","") �������� �� ����
 *  				  ¥+
 *  	   =======
 *  	   ���� ==> String s="Hello Java"
 *  			s.replace('a','b') ==> Hello java
 *  	10) contains() : ���Ե� ���ڸ� ã�� ��� 
 */
import java.util.Scanner;
public class ���ڿ�Ŭ���� {
	
	static String[] autoComplate(String data)
	{
		String[] ss= {
					"�ڹٿ� JPS","�ڹ� ���α׷���","������ 5","AJax�� JSP","�������� ����Ʈ",
					"�ڹ� ����Ŭ","MVC ����","��Ʋ���� �ȵ���̵�",
					"��Ʋ�� ���α׷�","������ ������",
					"ȥ�� ���� �ڹ�","������ �� ���α׷�","�� ���α׷�","�ڹ� �� ���α׷�",
					"����Ŭ �ڹ�"
		};
		String[] findData=new String[10];
		int j=0;
		for(int i=0;i<ss.length;i++)
		{
			//if(ss[i].startsWith(data))    //�˻��� ���ڷ� ���۵Ǵ� �� ã��
			if(ss[i].contains(data))        //�˻��� ���ڰ� ���ԵǴ� �� ã��
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
		System.out.println("�˻��� �Է�:");
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
