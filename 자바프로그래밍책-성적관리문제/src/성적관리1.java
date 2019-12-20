import java.util.Scanner;

public class 성적관리1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=3;
		
		int kors[]=new int[max];
		int engs[]=new int[max];
		int maths[]=new int[max];
		
		int index=0;
			
		
		EXIT:while(true) {
			MainMenu menu = 메뉴입력();
			switch(menu) {
			case PRINT:
				성적출력(kors,engs,maths,index);
				break;
			case INPUT:
				성적입력(kors,engs,maths,index);
				break;
			case END:
				break EXIT;
			dedault:
				break;
			}
		}
	}

	public static 성적입력(int[] kors,int[] engs,int[] maths,int index) {
			
		}
	public static 성적출력(int[] kors,int[] engs,int[] maths,int index) {
			
		}
	public static MainMenu 메뉴입력() {
        Scanner scan=new Scanner(System.in);
        
        	MainMenu menu;
        
        	System.out.println("┌──────────────────────┐");
        	System.out.println("│      합을 구하는 프로그램       │");
        	System.out.println("└──────────────────────┘");
        	System.out.println("1.값 입력");
        	System.out.println("2.결과 보기");
        	System.out.println("3.종료");
        	System.out.println("선택>_");
        	menu = scan.nextInt();
		return null;
		
	}

}
