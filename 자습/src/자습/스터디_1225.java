package �ڽ�;
/*
* �Ű����� ���� ���...?
* 	http://try.jsoup.com.
* 
*/
public class ���͵�_1225 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.name="ȫ�浿";
		s.ban=1;
		s.no=1;
	    s.kor=100;
		s.eng=60;
		s.math=76;
		
		
		System.out.println("�̸�:"+s.name);
		System.out.println("����:"+s.getTotal());
		System.out.printf("���"+s.getAverage());
	}
}
	class Student
	{
	    float getAverage;
		int getTotal;
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
		
		int getTotal()
		{
			return kor+eng+math;			
		}
		
		float getAverage()
		{
			float avg=getTotal()/3f;
			return avg(%.2f);
		}
	}
/*
 * 	int getTotal=getTotal(kor,eng,math);
	float getAverage=getAverage(getTotal);
 */