// 사칙연산
// + - * /
public class 메소드12 {
	static void calc()
	{
		int a=10;
		int b=20;
		char op='+';
		if(op=='+')
		{
			System.out.println(a+b);
		}
		else if(op=='-')
		{
			System.out.println(a-b);
		}
		else if(op=='*')
		{
			System.out.println(a*b);
		}
		else if(op=='/')
		{
			if(b==0)
				System.out.println("0으로 나눌 수없다");
			else
				System.out.println(a/b);
		}
		else 
		{
			System.out.println("연산자가 잘못되었습니다");
		}
	}
		static void process() {
			calc();
			System.out.println(a+op+b);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           process();
           
	}

}
