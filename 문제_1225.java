/*
 * 매개변수 없이 어떻게...?
 * 
 */
public class 문제_1225 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="홍길동";
		int ban=1;
		int no=1;
	    int kor=100;
		int eng=60;
		int math=76;
		
		int getTotal=getTotal(kor,eng,math);
		float getAverage=getAverage(getTotal);
		
		System.out.println("이름:"+name);
		System.out.println("총점:"+getTotal);
		System.out.printf("평균%.1f",getAverage);
	}

	static int getTotal(int kor,int eng,int math)
	{
		return kor+eng+math;
		
	}
	
	static float getAverage(float getTotal)
	{
		return getTotal/3;
	}

	
	
}
