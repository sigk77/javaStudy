import java.util.Scanner;

public class ����빮�ڸ��̳ʽ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("���ĺ��Է�:");
        String eng=scan.next();
        for(int i=0;i<eng.length();i++)
        {
            char c=eng.charAt(i);
            System.out.println((char)(c-3));
        }
        	
	}

}
