import java.util.Scanner;

// 정수 2개를 입력 받아서 ==> 연산자 1개 ==> 사칙연산
// 자바 => 입력 받는 경우에 => char(X) , 무조건 String으로 받음
// String => (==) , equals
public class 다중조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a=(int)"10" <= 오류
		// Integer.parseInt("10")
//		
//         String s1=new String("Hello");
//         String s2=new String("Hello");
//         
//         if(s1.equals(s2))
//         {
//        	 System.out.println("s1==s2");
//         }
//         else
//         {
//        	 System.out.println("s1!=s2");
//         }
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번쨰 정수:");
		int num1=scan.nextInt();
		
		System.out.print("두번쨰 정수:");
		int num2=scan.nextInt();
		
		System.out.print("연산자(+,-,*,/):");
		String op=scan.next();
		
		// 처리 
		// 결과
		if(op.equals("+"))
		{
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		else if(op.equals("-"))
		{
			System.out.printf("%d=%d=%d\n",num1,num2,num1-num2);			
		}
		else if(op.equals("*"))
		{
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);			
		}
		else if(op.equals("/"))
		{
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다");
			else
			    System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2);			
		}
		else
		{
			System.out.println("잘못된 연산자 입니다!!");
		}
	}

}
