/*
 *    while => while(true) : 무한루프
 *    for   => for(;;)     : 무한루프
 *    
 *    반복문을 제어
 *    ========
 *      continue => 특정내용을 제외
 *      break    => 반복문을 종료
 *      
 *      1~10 ==> 7 9
 *      
 *      for(int i=1;i<=10;i++)
 *      {
 *         if(i==7||i==9)
 *         continue;
 *         
 *         if(i==9) <-- 이 문장은 수행 안함
 *           break; 
 *      }
 */
import java.util.Scanner;
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // while ==> 1~(사용자 입력값)까지의 짝수의 합, 홀수의 합, 총합을 구해서 출력
		Scanner scan=new Scanner(System.in);
		int i=1,sum1=0,sum2=0,total=0;
	    System.out.println("정수 입력");
		int user=scan.nextInt();
		while(i<=user)
		{
			total+=i;
			if(i%2==0)
				sum1+=i;
			else
				sum2+=i;
			i++;
			
		}
		System.out.println("합:"+total);
		System.out.println("짝수:"+sum1);
		System.out.println("홀수:"+sum2);
	}

}
