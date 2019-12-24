/*
 * 
 * 	1. 묶어서 사용(데이터)
 * 	       배열 ===> 클래스 ===> 패키지 ===> 라이브러리(jar)
 * 	   === 
 * 
 * 	      프로그램
 * 		데이터 + 명령문 (메소드) => 클래스
 * 		===========
 * 		클래스 여러개 ========> 조립 (자바 CBD) 
 * 
 * 		2. 자바 ===> 오라클 ===> HTML (CSS,JavaScript) ===> JSP ===> MVC ===> Spring
 *                          ===============================     ================
 *                            Front 								Back
 * 			===> kotlin(모바일)
 * 			========================> 웹앱
 * 
 * 		배열 단점 : 고정적 ===> 가변형 ===> 같은 데이터형만 모아서 사용
 * 		======
 * 		 선언시 ===> 메모리 크기를 결정
 * 		=====================
 * 		1) 선언
 *         int[] arr
 *         ===   === 배열명(실제 저장된 데이터의 주소)
 *         데이터형         
 * 		2) 초기화
 * 		   arr={1,2,3,4,5}
 * 		   arr=new int[5] => 메모리 공간 할당 ==> 나중에 데이터를 대입
 * 		3) 값을 읽기, 쓰기 ==> 인덱스
 * 		   
 * 			int[] arr={10,20,30,40,50}
 *                       일반변수 취급을 한다
 *                       int a=10; a=11...
 * 			 arr         arr[0] arr[1] ....... 연속적==>for
 * 						 arr[0]=10 arr[0]=20.....
 * 			======      ====================
 * 		     100		 10	20	30	40	50
 * 			======	   |====================
 * 					  100
 */

// 달력
import javax.swing.text.SimpleAttributeSet;

/*
 *     달력
 *     ===
 *     	1) 년도,월 입력 받는다
 *     	2) 요일
 *     	3) 마지막날짜 
 *     	4) 출력
 */
import java.util.*;
import java.text.*;
public class 배열1 {

	public static void
	
	main(String[] args) {
		// TODO Auto-generated method stub
/*		Date date=new Date();
				SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:dd");
		while(true)
		{
			System.out.println(sdf.format(date));
			try
			{
				Thread.sleep(1000);
			}catch(Exception ex) {}	*/	
		// 년도 , 월
		char[] strWeek={'일','월','화','수','목','금','토'};
		// MONTH => -
		// DAY_OF_WEEK => 1 -1
		Calendar cal=Calendar.getInstance();
		int y=cal.get(cal.YEAR);
		int m=cal.get(cal.MONTH);
		int d=cal.get(cal.DATE);
		int w=cal.get(cal.DAY_OF_WEEK);
		System.out.println("====== "+y+"년도 "+m+"월 "+d+"일 "
				+strWeek[w-1]+"요일 ========");
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		
		System.out.println("월 입력:");
		int month=scan.nextInt();	
		System.out.println(year+"년도"+month+"월");
		System.out.println("\n");
		
		/*System.out.print("일\t");
		System.out.print("월\t");
		System.out.print("화\t");
		System.out.print("수\t");
		System.out.print("목\t");
		System.out.print("금\t");
		System.out.print("토\t");*/
		for(int i=0;i<7;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		
		// 1일자의 요일을 구한다
		// 전년도의 12/31 => 총합
		int total=(year-1)*365
				  +(year-1)/4
				  -(year-1)/100
				  +(year-1)/400;
		// 전달
		int[] lastday= {31,28,31,30,31,30,
						31,31,30,31,30,31};
		if((year%4==0 && year%100!=0)|| (year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		// +1 ====> %7 ===> 요일을 구한다
		total++; // 각 달의 1일자
		int week=total%7;
		
		System.out.println();
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
		
		}
	



char[] strWeek={'일','월','화','수','목','금','토'};
Calendar cal=Calendar.getInstance();
int y=cal.get(cal.YEAR);
int m=cal.get(cal.MONTH);
int d=cal.get(cal.DATE);
int w=cal.get(cal.DAY_OF_WEEK);
System.out.println("====== "+y+"년도 "+m+"월 "+d+"일 "
		+strWeek[w-1]+"요일 ========");
Scanner scan=new Scanner(System.in);
System.out.println("년도 입력:");
int year=scan.nextInt();

System.out.println("월 입력:");
int month=scan.nextInt();	
System.out.println(year+"년도"+month+"월");
System.out.println("\n");

for(int i=0;i<7;i++)
{
	System.out.print(strWeek[i]+"\t");
}

// 1일자의 요일을 구한다
// 전년도의 12/31 => 총합
int total=(year-1)*365
		  +(year-1)/4
		  -(year-1)/100
		  +(year-1)/400;
// 전달
int[] lastday= {31,28,31,30,31,30,
				31,31,30,31,30,31};
if((year%4==0 && year%100!=0)|| (year%400==0))
	lastday[1]=29;
else
	lastday[1]=28;

for(int i=0;i<month-1;i++)
{
	total+=lastday[i];
}
// +1 ====> %7 ===> 요일을 구한다
total++; // 각 달의 1일자
int week=total%7;

System.out.println();
for(int i=1;i<=lastday[month-1];i++)
{
	if(i==1)
	{
		for(int j=0;j<week;j++)
		{
			System.out.print("\t");
		}
	}
	System.out.printf("%2d\t",i);
	week++;
	if(week>6)
	{
		week=0;
		System.out.println();

