import java.util.Scanner;

// 구구단 => dan을 입력 받아서 
public class 반복문8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("몇단?:");
		int dan=scan.nextInt();
		int i=1;
		while(i<=9)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
			i++;
		}

	}

}
