import java.util.Scanner;
public class �޼ҵ�3 {
	// �Է�
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�");
		int input=scan.nextInt();
		return input;
	}
	// ������ ó��
	static int[] toBinary(int input)
	{
		int[] binary=new int[16];
		// �迭�� ��ġ
		int index=15; // �迭 => ���� ���� ==> ��ġ (��(length-1),��(0))
		/*
		 * 	10%2 ==> 0
		 * 	5%2==1
		 * 	2%2==0
		 * 	1%2==1 1/2=0
		 */
		while(true)
		{
			binary[index]=input%2;
			input=input/2; // input/=2
			if(input==0)  // 1/2=0
				break;
			
			index--;
		}
		return binary;
	}
	// ���
	static void print(int[] binary)
	{
		for(int i=0;i<16;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
	}
	// ����
	static void process()
	{
		int input=userInput();
		int[] binary=toBinary(input);
		print(binary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
