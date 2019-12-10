import java.util.Scanner;
/*
 * 1년 1월1일
 * 2019년 1월 1일
 * 총날수%7
 */
public class 문제16시부터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.println("년도");
		int year=scan.nextInt();
		System.out.println("월");
		int month=scan.nextInt();
		System.out.println("일");
		int day=scan.nextInt();
//		if ((num-1)%4==0 && (num-1)%100==0||(num-1)%400==0)
//			year=366;
//		else
//			year=365;
		
		int total=(year-1)*365
				 +(year-1)/4
				 -(year-1)/100
				 +(year-1)/400;
		
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0 && year%100!=0)||(year%400==0))
           lastDay[1]=29;
        else
           lastDay[1]=28;
        /*
         *  if(month-1==1)
         *     total+=31
         *  if(month-1==2)
         *     total+=31+28
         *     등등으로 해야할 것 같아서 배열로 강사님이 써주심
         */
        for(int i=0;i<month-1;i++)
        {
        	total+=lastDay[i];
        }
        total+=day;
        int week=total%7;
        // 결과
        char strWeek='월';
        if(week==0)
        	 strWeek='일';
        if(week==1)
       	     strWeek='월';
        if(week==2)
       	     strWeek='화';
        if(week==3)
       	     strWeek='수';
        if(week==4)
           	 strWeek='목';
        if(week==5)
         	 strWeek='금';
        if(week==6)
        	 strWeek='토';
        	
        System.out.println(year+"년도"+month+"월"+day+"일은 "+strWeek+"입니다");
		
        

	}

}
