/*
 * 		�޼ҵ�
 * 		 = �Ű����� (����� ��û��) => ����  ====> ������
 * 			movieId=123123
 * 		 = ������ => ��û���뿡 ���� ����� ���� => �Ѱ� (������ ������ => ��� �ϳ��� �̸����� ����)
 * 				  ==================
 * 				  �⺻��, �迭, Ŭ����
 * 		==================================================================
 * 		����)
 * 			������ �޼ҵ��(�Ű�����,..) => �����
 * 			{
 * 				==> ������
 * 				return �����  =====> (������ = �����)
 * 					   ====				  ===== ���� ���������� ��� �� �� �ִ�
 * 			}
 * 			
 * 			int aaa()
 * 			{
 * 				return (int, char, byte, short)
 * 			}
 * 
 * 			****** ȣ��
 * 				int a=aaa()
 * 
 * 			==> return�� ������ �Ǵ� ��� ==> ������(void�ϋ�)
 * 
 * 			�迭
 * 			int[] aaa()
 * 			Ŭ����
 * 			{
 * 				return �迭��
 * 			}
 * 			Ŭ����
 * 			String aaa()
 * 			{
 * 				return ""(���ڿ�)
 * 			}
 * 
 * 			������� ���� ���
 * 			void aaa()
 * 			{
 * 				return;
 * 			}
 * 			aaa()
 * 			======================================
 * 
 * 			�Ű������� �ִ� ���
 * 			int plus(int a,int b)
 * 			===		=============
 * 			{
 * 				a=10, b-2
 * 				return a+b;
 * 			}
 * 			
 * 			int a=plus(10,30)
 * 
 * 			void aaa()
 * 			{
 * 				=== 1
 *  			=== 2
 *    			=== 3
 *      		=== 4
 *        		=== 5
 *          	=== 6
 *   			=== 7
 *   		}
 *   	
 *   		aaa() => 1234567
 *   		aaa() => 1234567 ==> �ݺ��� ���� 
 *   
 *          1234567
 *          780
 *          345
 *          1234567
 *          70
 *          90
 *          1234567
 *          
 *          ��� ==> �ݵ�� ������ ����
 *          
 *         int[] arr={ 1 5 7 4 3 2 1 2 8 9}
 *         =====================
 *         String s="Hello Java";
 *         
 *         1 232 43434 434 343 4 34 34 343434 => int
 *         
 *         113 "aaa" "aadad" 0.9 10.2F 10L    => class                                                                                                                                                                                                                                                                                                                                                                                         
 */
public class �޼ҵ�1 {
	String name;
	static void message()
	{
		System.out.println("Hello Java!!");
		// return; ��������  , ������ �Ǹ� ==> JVM(����ӽ�)�� �ڵ����� �ڵ��� ����
	}
	// int a=10
	static int aaa()
	{
		return 10;
	}
	static double bbb()
	{
		return 10.5;
	}
	static String ccc()
	{
		return "Hello";
	}
	static int[] ddd()
	{
		int[] arr= {1,2,3,4,5};
		return arr;
	}
	static int eee(int a)
	{
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		message();
		int a=aaa();
		double d=bbb();
		String s=ccc();
		int[] arr=ddd();
		int aa=eee(10);
		// ȣ�� ===> �����
		
	}

}
