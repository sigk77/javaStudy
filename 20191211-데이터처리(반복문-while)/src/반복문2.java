// A~Z => 
// 
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char eng='A';
//		int i=1;
//				while(i<=26)
//				{
//					System.out.print(eng++ +"\t");
//					if(i%5==0)
//						System.out.println();
//					i++;
//				}
//				char eng='A';
//		char eng='A';   // ���� �ٲ������� ��ҹ��� ��ü ����
//		char eng1='f';
//		int i=1;
//				while(i<=26)
//				{
//					if(i>=5&&i<=10)
//					{
//					    System.out.print(eng1++ +"\t");
//					    i++;
//					}
//					else
//					{
//						System.out.print(eng++ +"\t");
//						i++;
//					}
//					if(i%5==0)
//						System.out.println();
//				}

				
		int i=1;
		char c='A';
		boolean bCheck=true;
		while(i<=26)
		{
			if(bCheck==true)
				System.out.print(c+"\t");
			else
				System.out.print((char)(c+32)+"\t");
			if(i%5==0)
			{
				System.out.println();
				bCheck=!bCheck;
			}
			i++;
			c++;
			}
		}
				
	}

