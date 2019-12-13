//  ==> 문자 ==> charAt(0)
//  String s="abacsdkwkdkaskdkak"
import java.util.Scanner;
public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("영어 입력:");
		String s=scan.next();
		
		int i=0;
		int count=0;
		while(i<s.length())  // =을 빼줌 자바는 0부터 시작하기때문에 length의 계산을 제대로 해주려고
		{
			System.out.println((i+1)+"번째 문자:"+s.charAt(i));
			char c=s.charAt(i);
			if(c=='a'||c=='A')
            System.out.println("a(A)의 갯수는 "+count+"개 입니다.");
			    count++;
			i++;

		}
	}

}
