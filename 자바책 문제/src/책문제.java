import java.util.Scanner;
public class 책문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=0,num2=0; //시작값 , 끝값
        int sum=0;
        Scanner scan=new Scanner(System.in);
        
        int menu=0;
        EXIT:while(true) {
        	System.out.println("┌──────────────────────┐");
        	System.out.println("│      합을 구하는 프로그램       │");
        	System.out.println("└──────────────────────┘");
        	System.out.println("1.값 입력");
        	System.out.println("2.결과 보기");
        	System.out.println("3.종료");
        	System.out.println("선택>_");
        	menu = scan.nextInt();
        	
        	switch(menu){
        	case 1:
            	System.out.println("┌──────────────────────┐");
            	System.out.println("│      1.  값 입력                 │");
            	System.out.println("└──────────────────────┘");
            	System.out.println("처음숫자:");
            	num1 = scan.nextInt();
            	System.out.println("두번째 숫자");
            	num2 = scan.nextInt();
            	if(num1>=num2)
            	{
            		System.out.println("다시 입력하세요");
            		continue;
            	}
            	else
            	{
            		break;
            	}
        	case 2:
            	System.out.println("┌──────────────────────┐");
            	System.out.println("│       2. 결과 보기              │");
            	System.out.println("└──────────────────────┘");
            	int sum1=0;
            	int n=num2-num1+1;
            	sum1=n*(num1+num2)/2;
            	System.out.printf("%d에서 %d까지의 모든 수의 합은 %d입니다.\n",num1,num2,sum1);
            	
        	}
        	}
        }
	}


