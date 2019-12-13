import java.util.Scanner;

public class 영어대문자마이너스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("알파벳입력:");
        String eng=scan.next();
        for(int i=0;i<eng.length();i++)
        {
            char c=eng.charAt(i);
            System.out.println((char)(c-3));
        }
        	
	}

}
