/*
 *    while => while(true) : ���ѷ���
 *    for   => for(;;)     : ���ѷ���
 *    
 *    �ݺ����� ����
 *    ========
 *      continue => Ư�������� ����
 *      break    => �ݺ����� ����
 *      
 *      1~10 ==> 7 9
 *      
 *      for(int i=1;i<=10;i++)
 *      {
 *         if(i==7||i==9)
 *         continue;
 *         
 *         if(i==9) <-- �� ������ ���� ����
 *           break; 
 *      }
 */
import java.util.Scanner;
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // while ==> 1~(����� �Է°�)������ ¦���� ��, Ȧ���� ��, ������ ���ؼ� ���
		Scanner scan=new Scanner(System.in);
		int i=1,sum1=0,sum2=0,total=0;
	    System.out.println("���� �Է�");
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
		System.out.println("��:"+total);
		System.out.println("¦��:"+sum1);
		System.out.println("Ȧ��:"+sum2);
	}

}
