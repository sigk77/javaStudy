package 자습;
/*
* 매개변수 없이 어떻게...?
* 	http://try.jsoup.com.
* 
*/
public class 스터디_1225 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.name="홍길동";
		s.ban=1;
		s.no=1;
	    s.kor=100;
		s.eng=60;
		s.math=76;
		
		
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.printf("평균"+s.getAverage());
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