import java.util.Calendar;
import java.util.Scanner;

public class �޼ҵ�8 {
	static void strWeek()
	{
		int strWeek[] = new int[7];
		char[] strWeek1={'��','��','ȭ','��','��','��','��'};
		Calendar cal=Calendar.getInstance();
		int y=cal.get(cal.YEAR);
		int m=cal.get(cal.MONTH);
		int d=cal.get(cal.DATE);
		int w=cal.get(cal.DAY_OF_WEEK);
		System.out.println("====== "+y+"�⵵ "+m+"�� "+d+"�� "
				+strWeek[w-1]+"���� ========");
	}
	// �⵵ , ��
	
	// ����
	
	// �޷� ���

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char[] strWeek={'��','��','ȭ','��','��','��','��'};
			Calendar cal=Calendar.getInstance();
			int y=cal.get(cal.YEAR);
			int m=cal.get(cal.MONTH);
			int d=cal.get(cal.DATE);
			int w=cal.get(cal.DAY_OF_WEEK);
			System.out.println("====== "+y+"�⵵ "+m+"�� "+d+"�� "
					+strWeek[w-1]+"���� ========");
			Scanner scan=new Scanner(System.in);
			System.out.println("�⵵ �Է�:");
			int year=scan.nextInt();
			
			System.out.println("�� �Է�:");
			int month=scan.nextInt();	
			System.out.println(year+"�⵵"+month+"��");
			System.out.println("\n");
			
			for(int i=0;i<7;i++)
			{
				System.out.print(strWeek[i]+"\t");
			}
			
			// 1������ ������ ���Ѵ�
			// ���⵵�� 12/31 => ����
			int total=(year-1)*365
					  +(year-1)/4
					  -(year-1)/100
					  +(year-1)/400;
			// ����
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
			// +1 ====> %7 ===> ������ ���Ѵ�
			total++; // �� ���� 1����
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


	}
