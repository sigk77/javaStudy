//  ==> ���� ==> charAt(0)
//  String s="abacsdkwkdkaskdkak"
import java.util.Scanner;
public class �ݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�:");
		String s=scan.next();
		
		int i=0;
		int count=0;
		while(i<s.length())  // =�� ���� �ڹٴ� 0���� �����ϱ⶧���� length�� ����� ����� ���ַ���
		{
			System.out.println((i+1)+"��° ����:"+s.charAt(i));
			char c=s.charAt(i);
			if(c=='a'||c=='A')
            System.out.println("a(A)�� ������ "+count+"�� �Դϴ�.");
			    count++;
			i++;

		}
	}

}
