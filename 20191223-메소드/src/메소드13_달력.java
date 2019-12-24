import java.util.Calendar;
import java.util.Scanner;

public class �޼ҵ�13_�޷� {
	//��,�� �Է¹ޱ�
	static int setYear()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ��� :");
		int year = scan.nextInt(); 
		return year;
	}
	static int setMonth()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� :");
		int month = scan.nextInt(); 
		return month;
	}
	
	
	
	// 1������ ���ϱ��ϱ�
	static int getWeek(int year, int month)
	{
		//1������ ������ ���Ѵ�
				// ���⵵�� 12/31 => ����
				int total = (year-1)*365+(year/4)-(year/100)+(year/400);
				// ����
				int[] lastDay = {31,28,31,30,31,30, 
						 		 31,31,30,31,30,31};
				if((year%4==0 && year%100 != 0 )||(year%400==0))
				{
					lastDay[1] = 29;
				}
				else 
					lastDay[1] = 28;
				
				for(int i=0; i<month-1; i++)
				{
					total += lastDay[i];
				}
				// +1
				total++; // ������ 1����
				
				int week = total%7;
				
			return week;
		
	}
	// �޷� ���
	static void datePrint(int week, int month)
	{
		char[] strWeek = {'��','��','ȭ','��','��','��','��'};
		int[] lastDay = {31,28,31,30,31,30, 
		 		 31,31,30,31,30,31};

		for(int i=0; i<strWeek.length; i++)
		{
			System.out.print(strWeek[i] + "\t");
		}
		
		System.out.println();
		for(int i=1; i<=lastDay[month-1]; i++)
		{
			if(i==1)
			{
				for(int j=0; j<week; j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week > 6)
			{
				week = 0;
				System.out.println();
			}
		}
	}
	//���
	static void today(int year, int month)
	{
		char[] strWeek = {'��','��','ȭ','��','��','��','��'};
		Calendar cal = Calendar.getInstance();
		int y = cal.get(cal.YEAR);
		int m = cal.get(cal.MONTH)+1;
		int d = cal.get(cal.DATE);
		int w = cal.get(cal.DAY_OF_WEEK);
		System.out.println("====== " + y+"�⵵"+m+"��"+d+"��"+strWeek[w-1]+"���� ======");
		System.out.println(year+"�⵵ "+ month+"��");
	}

	//����
	static void process()
	{
		int year = setYear();
		int month = setMonth();
		today(year,month);
		
		int week = getWeek(year, month);
		datePrint(week, month);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
	}

}