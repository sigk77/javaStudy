// 정수 1개를 입력을 받아서 => 2진법 출력
// 10 ==> 16bit
// 0000 0000 0000 1010
import java.util.Scanner;
public class 메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//변수
		int input=0; // 사용자 입력한 값을 받는 변수
		System.out.println("정수 입력:");
		input=scan.nextInt();
		//System.out.println(Integer.toBinaryString(input));
		int[] binary=new int[16];
		// 배열의 위치
		int index=15; // 배열 => 값을 변경 ==> 위치 (뒤(length-1),앞(0))
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
		
		// 출력
		for(int i=0;i<16;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
	}

}
