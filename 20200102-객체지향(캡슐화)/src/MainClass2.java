/*
 *   변수 초기화
 *   =======
 *    선언과 동시에 초기화
 *    int a=10;
 *    a=100(X)
 *    ==========
 *    {
 *    	a=100;
 *    }
 *    ========== 초기화 블록(멤버변수의 초기화)
 *    static
 *    {
 *    	코딩
 *    }
 *    ========== static 초기화 블록 (멤버변수(static) 초기화)
 *    
 *    클래스명()
 *    {
 *    	a=200;
 *    }
 */

class MyData{
//	static int[] arr=new int[6]; //스태틱 변수
//	int a=10;
//	a=20; // 구현은 불가능하기 때문에 오류	
	int[] arr=new int[6]; //인스턴스변수
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
		MyData m2=new MyData(); // arr 다 다른값
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
