import java.util.Scanner;

// 5개의 정수를 입력받아서 => 5개 정수를 출력하고 ==> 합,평균
public class 배열7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] num=new int[5];
		int total=0;
		double avg=0.0;
		for(int i=0;i<num.length;i++)
		{
			System.out.println(i+1+"번째 정수 입력");
			num[i]=scan.nextInt();
		}
//		total=num[0]+num[1]+num[2]+num[3]+num[4];
//		avg=total/5;
		// 10 20 30 40
		for(int score:num)
		{
			System.out.println(score);
			total+=score;
		}
		
		avg=total/(double) num.length;
		
		System.out.println("합"+total);
		System.out.printf("평균:%.2f\n",avg);
	}

}
