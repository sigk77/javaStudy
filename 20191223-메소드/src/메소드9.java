import java.util.Scanner;

// ���� , ����, ���� ������ �޾Ƽ�
// ����, ���, ������ ����ϴ� �޼ҵ带 �����
/*
 * 		1.�Է�
 * 	
 * 		2.����
 * 		3.���
 * 		4.����
 * 		5.���
 * 		
 */

public class �޼ҵ�9 {
	
//	 		1.�Է�
	static int[] kor()
	{
		int[] kor=new int[3];
		Scanner scan=new Scanner(System.in);
	for(int i=0;i<3;i++)
	     {
		System.out.println("���������� �Է��� �ּ���(0~100��).");
		int input=scan.nextInt();
			if(input>100 || input<=0)
			{
				System.out.println("0~100���̷� �Է����ּ���.");
				continue;
			}
			break;
	     }
		return kor;
	}
	
	static int[] eng()
	{
		int[] eng=new int[3];
		Scanner scan=new Scanner(System.in);
	for(int i=0;i<3;i++)
	     {
		System.out.println("���������� �Է��� �ּ���(0~100��).");
		int input=scan.nextInt();
			if(input>100 || input<=0)
			{
				System.out.println("0~100���̷� �Է����ּ���.");
				continue;
			}
			break;
	     }
		return eng;
	}
	static int[] math()
	{
		int[] math=new int[3];
		Scanner scan=new Scanner(System.in);
	for(int i=0;i<3;i++)
	     {
		System.out.println("���������� �Է��� �ּ���(0~100��).");
		int input=scan.nextInt();
			if(input>100 || input<=0)
			{
				System.out.println("0~100���̷� �Է����ּ���.");
				continue;
			}
			break;
	     }
		return math;
	}
//	 		2.����
//	 		3.���
//	 		4.����
//	 		5.���

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
