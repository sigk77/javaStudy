/*
 *   ���� �ʱ�ȭ
 *   =======
 *    ����� ���ÿ� �ʱ�ȭ
 *    int a=10;
 *    a=100(X)
 *    ==========
 *    {
 *    	a=100;
 *    }
 *    ========== �ʱ�ȭ ���(��������� �ʱ�ȭ)
 *    static
 *    {
 *    	�ڵ�
 *    }
 *    ========== static �ʱ�ȭ ��� (�������(static) �ʱ�ȭ)
 *    
 *    Ŭ������()
 *    {
 *    	a=200;
 *    }
 */

class MyData{
//	static int[] arr=new int[6]; //����ƽ ����
//	int a=10;
//	a=20; // ������ �Ұ����ϱ� ������ ����	
	int[] arr=new int[6]; //�ν��Ͻ�����
	public MyData()
	{
		for(int i=0;i<6;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	
	
}
public class MainClass2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyData m1=new MyData(); // arr
		for(int i=0;i<6;i++)
		{
			System.out.print(m1.arr[i]+" ");
		}
		MyData m2=new MyData(); // arr �� �ٸ���
		for(int i=0;i<6;i++)
		{
			System.out.print(m2.arr[i]+" ");
		}
		MyData m3=new MyData();
		MyData m4=new MyData();
		MyData m5=new MyData();
		MyData m6=new MyData();
		MyData m7=new MyData();
//		
//		MyData m1=new MyData();
//		for(int i=0;i<6;i++);
//		{
//			System.out.print(m1.arr[i]+" ");
//		}
//		
//		MyData m2=new MyData();
//		for(int i=0;i<6;i++);
//		{
//			System.out.print(m2.arr[i]+" ");
//		}
		int a;
		a=100;
		System.out.println(a);
	}

}
