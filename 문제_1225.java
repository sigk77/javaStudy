/*
 * �Ű����� ���� ���...?
 * 
 */
public class ����_1225 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="ȫ�浿";
		int ban=1;
		int no=1;
	    int kor=100;
		int eng=60;
		int math=76;
		
		int getTotal=getTotal(kor,eng,math);
		float getAverage=getAverage(getTotal);
		
		System.out.println("�̸�:"+name);
		System.out.println("����:"+getTotal);
		System.out.printf("���%.1f",getAverage);
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
