import java.util.Scanner;

// 5���� ������ �Է¹޾Ƽ� => 5�� ������ ����ϰ� ==> ��,���
public class �迭7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] num=new int[5];
		int total=0;
		double avg=0.0;
		for(int i=0;i<num.length;i++)
		{
			System.out.println(i+1+"��° ���� �Է�");
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
		
		System.out.println("��"+total);
		System.out.printf("���:%.2f\n",avg);
	}

}
