import java.util.Scanner;
public class ����3�ٽ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("�������� �Է�: ");
        int kor=scan.nextInt();
        System.out.println("�������� �Է�: ");
        int eng=scan.nextInt();
        System.out.println("�������� �Է�: ");
        int math=scan.nextInt();
        
        int avg=(kor+eng+math)/3;
        
       if(avg>=90)
      	System.out.println("A");
       if(avg>=80 && avg<=90)
      	System.out.println("B");
       if(avg>=70 && avg<=80)
    	System.out.println("C");
       if(avg>=60 && avg<=70)
       	System.out.println("D");
       if(avg<=59)
      	System.out.println("F");
	}

}
