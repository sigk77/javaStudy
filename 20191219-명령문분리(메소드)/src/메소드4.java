/*
 * 		=======================
 * 		1. �޼ҵ� ȣ��
 * 		2. �޼ҵ� ������� ����
 * 		3. ��� �ȿ� �ִ� ��� ���� ����
 * 		4. �޼ҵ� ȣ���� ��ġ�� ���ư���
 * 		=======================
 * 
 * 		�Խ���
 * 		  ��� ���    (�������� �Ű�����)
 * 		  ���� ����   ���ͷ�(�������� �̹Ƿ� Ŭ����) �Ű�����(�Խù� ��ȣ)
 * 	           �۾���
 * 	           �����ϱ�
 * 		  �亯�ϱ�
 * 		  �����ϱ�
 * 		  ã��         �Ű�����(����� �˻���)
 * 		
 * 
 * 	 ����ڰ� ���� �Է��ϸ� ������ ���
 * 	 	�Ű�����(��) ���ͷ�(�Ϲ������� void������ ���� ���ٸ� String)
 * 
 *  �α��� (���̵� Ʋ��,��й�ȣ Ʋ��, �� �� ����)
 *  	�Ű�����(���̵�,��й�ȣ) ���ͷ�(����� �� 3���� , String)(������ ó���� ������ ��)
 *  
 *  ���̵� �ߺ�Ȯ��
 *  	�Ű�����(String) ���ͳ�(boolean)
 *  
 *  ����
 *  	���� �������� ������ get();
 *  	���ڿ� ���� set();....? (void)
 *  	���� �ϴ���.. is (boolean)
 *  
 *  �ζ� ��ȣ �޶�� ���� ��
 *  	���ͷ�(
 */
import java.util.Scanner;
public class �޼ҵ�4 {
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
	static String gugudan2(int dan)
	{
		String result="";
		for(int i=1;i<=9;i++)
		{
			result+=dan+"*"+i+"="+(dan+i)+"\n";
		}
		
		return result;
	}
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("�� �Է�:");
		int dan=scan.nextInt();
		//������
		String res=gugudan2(dan);
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
