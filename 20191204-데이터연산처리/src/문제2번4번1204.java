import java.util.*;

public class 문제2번4번1204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int base=1500000;
 int add=55000;
 double tax=base*0.1;
 int xx=(int)(base+add-tax);
 
 System.out.println("실수령액:"+xx+"원");
 
 String name;
 int kor,eng,mat,total;
 double avg;
 
 Scanner scan=new Scanner(System.in);
 System.out.print("Input name:");
 name=scan.next();
 
 System.out.print("kor:");
 kor=scan.nextInt();
 
 System.out.print("eng:");
 eng=scan.nextInt();
 
 System.out.print("mat:");
 mat=scan.nextInt();
 
 total=kor+eng+mat;
 
 avg=total/3.0;
 
 System.out.println("이름 : "+name);
 System.out.println("합계점수 : "+total);
 System.out.printf("평균점수:%.1f",avg);
 
 
 
	}

}
