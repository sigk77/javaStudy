// Call by Reference (�ּ�) => �迭,Ŭ����
/*
 * 		class A
 * 		{
 * 			int a=10;
 * 		}
 * 
 * 		swap(A aa)
 * 		{
 * 			aa.a=1000;
 * 		}
 * 
 * 		A aa=new A();
 * 		swap(aa)
 * 
 * 		aa.a
 */
public class �޼ҵ�2 {
	static void swap(int[] arr)
	{
		System.out.println("������=> swap:arr[0]="+arr[0]+",arr[1]="+arr[1]);
		//����
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("������=> swap:arr[0]="+arr[0]+",arr[1]="+arr[1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭
		for(int i=0;i<10;i++)
		{
			int a=i;
			System.out.println(a);
		}
		�޼ҵ�2 a=new �޼ҵ�2();
		�޼ҵ�2 b=new �޼ҵ�2();
		�޼ҵ�2 c=new �޼ҵ�2();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		int[] arr= {100,200};
		swap(arr);// �ּ�����(����)
		System.out.println("main: swap:arr[0]="+arr[0]+",arr[1]="+arr[1]);
	}
}
