import java.util.Scanner;
public class 문제3다시 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("국어점수 입력: ");
        int kor=scan.nextInt();
        System.out.println("영어점수 입력: ");
        int eng=scan.nextInt();
        System.out.println("수학점수 입력: ");
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
