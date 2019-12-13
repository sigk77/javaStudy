import java.util.Scanner;
public class 오목판 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scan=new Scanner(System.in);
		System.out.println("오목의 위치를 입력해 주세요.(x축,가로)");
		int i1=scan.nextInt();
		System.out.println("오목의 위치를 입력해 주세요.(y축,세로)");
		int x1=scan.nextInt();
		
		for(int x=0;x<15;x++)
        {
        	for(int i=0;i<30;i++)
        	{
        		if(i==i1-1&&x==x1-1)
        			System.out.printf("%c",'○');
        		else if(i==0&&x==0)
        			System.out.printf("%c",'┌');
        		else if(i==29&&x==0)
        		    System.out.printf("%c",'┐');
        		else if(i==0&&x==14)
            		System.out.printf("%c",'└');
        		else if(i==29&&x==14)
            		System.out.printf("%c",'┘');
        		else if(i>=1&&i<=28&&x==0)
        			System.out.printf("%c",'┬');
        		else if(i>=1&&i<=28&&x==14)
        			System.out.printf("%c",'┴');
        		else if(i==0&&x<=13&&x>=1)
            		System.out.printf("%c",'├');
        		else if(i==29&&x<=13&&x>=1)
            		System.out.printf("%c",'┤');
        		else
        			System.out.printf("%c",'╂');
        	}
        	System.out.println();
        	
        }

	}

}
