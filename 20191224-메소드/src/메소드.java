/*
 * 		�޼ҵ�
 * 		1) ����
 * 		2) ������ �޼ҵ��(�Ű�����...) => �����
 * 			{
 * 				��ɱ���
 * 				return �����
 * 					   ==== ������ == �����
 * 			}
 * 			==> �������� ���� ��� ==> return �� ������ �� �ִ�
 * 			==> ��� �޼ҵ�� �����ϱ� ���ؼ� �ݵ�� �������� return�� ����Ѵ�
 * 				����) => ���ǹ��� ����ؼ� return�� ��� �� �� �ִ�
 * 					=> return�� �Ʒ��� � ���嵵 ����� �Ұ����ϴ�
 * 			
 * 			display(10); => �޼ҵ� ȣ��
 * 			static void display(int a)
 * 			{
 * 				System.out.println(a);
 * 				return;
 * 				System.out.println(a+1);// ����
 * 			}
 * 
 * 			static void display(int a)
 * 			{
 * 				System.out.println(a);
 * 				if(a==10)
 * 					return;
 * 				System.out.println(a+1);
 * 			}
 * 
 * 		2) ������ : �⺻�� , Ŭ���� , �迭
 * 			int method()
 * 			Movie method()
 * 			int[] method()
 * 			������� ���� ��� => void
 * 		3) �Ű����� : ����� ��û��
 * 			=> 3�� �̻��̸� ��� ��û => �迭,Ŭ����
 * 				ȸ������ (Ŭ����)
 * 				�Խ��� �۾��� (Ŭ����)			
 * 		4) �Ű����� ���۹�
 * 			=> call by value : �⺻��,String
 * 			   ============== �޸𸮸� ���� ����(����(��))
 * 			=> call by reference : �迭, Ŭ����
 * 			   ================== ���� �ּҸ� �̿��ؼ� ���� ����
 * 		5) ȣ��
 * 			�޼ҵ��()
 * 			�޼ҵ��(10,20)
 * 			============= return�� ���� ���
 * 			�������� ����=�޼ҵ�()
 * 			�������� ����=�޼ҵ�(19,20)
 * 		*** ��� �޼ҵ�� ������ ������ ������ �ٽ� ȣ���� ��ġ�� ���ƿ´�
 * 		*** �޼ҵ带 ������ ȣ��� => �Ѱ��� �޼ҵ尡 ������ �����ؾ�
 * 						              ���� �޼ҵ带 ȣ��
 * 			a()
 * 			b()
 * 			c()
 * 			===================
 * 				c()
 * 			===================
 * 				b()
 * 			===================
 * 				a()	===============> ����
 * 			===================
 */
// �Ű����� ���� -> call by value
public class �޼ҵ� {
	static void swap(String a,String b)
	{
		System.out.println("������ => swap:a="+a+",b="+b);
		// a=10 , b=20;
		//  ����
		/* 
		 *  int a=10;
		 *  int b=20;
		 *  
		 *  a=b ===> a=20
		 *  b=a ===> b=20
		 *  
		 *  int temp=a; temp=10
		 *  a=b ==> a=20
		 *  b=temp ==> b=10
		 */
		String temp=a;
		a=b;
		b=temp;
		System.out.println("������=> swap:a="+a+",b="+b);
		// a=20 , b=10
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello";
		String b="Java";
		swap(a,b);
		System.out.println("main:a="+a+",b="+b);
		// a=10,b=20
	}

}
