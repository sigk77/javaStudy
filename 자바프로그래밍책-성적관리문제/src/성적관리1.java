import java.util.Scanner;

public class ��������1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=3;
		
		int kors[]=new int[max];
		int engs[]=new int[max];
		int maths[]=new int[max];
		
		int index=0;
			
		
		EXIT:while(true) {
			MainMenu menu = �޴��Է�();
			switch(menu) {
			case PRINT:
				�������(kors,engs,maths,index);
				break;
			case INPUT:
				�����Է�(kors,engs,maths,index);
				break;
			case END:
				break EXIT;
			dedault:
				break;
			}
		}
	}

	public static �����Է�(int[] kors,int[] engs,int[] maths,int index) {
			
		}
	public static �������(int[] kors,int[] engs,int[] maths,int index) {
			
		}
	public static MainMenu �޴��Է�() {
        Scanner scan=new Scanner(System.in);
        
        	MainMenu menu;
        
        	System.out.println("������������������������������������������������");
        	System.out.println("��      ���� ���ϴ� ���α׷�       ��");
        	System.out.println("������������������������������������������������");
        	System.out.println("1.�� �Է�");
        	System.out.println("2.��� ����");
        	System.out.println("3.����");
        	System.out.println("����>_");
        	menu = scan.nextInt();
		return null;
		
	}

}
