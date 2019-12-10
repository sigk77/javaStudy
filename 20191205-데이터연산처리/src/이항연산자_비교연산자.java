/*
 *  값 표현
 *  char ==> ''
 *  int ==> 10(10진법) , 010(8진법) , 0x12(16진법) , 0b1010101(2진법)
 *  long ==> 10L , 10l
 *  float ==> 10.5F , 10.5f
 *  boolean => true , false
 *  string => ""
 *  
 *  비교연산자 => 결괏값(boolean) : true,false
 *  =======
 *    1) == 같다  6==7 (false)  6==6 (true)
 *    2) != 같지않다 6!=7 (true)  6!=6(false)
 *    3) < 작다 6<5 (false) 6<7 (false)
 *    4) > 크다 6>5 (ture) 6>7 (false)
 *    5) <= 작거나 같다 6<=6(true)
 *                  ====
 *                  6<6 || 6==6 ==> || (한쪽이 true=> true)
 *    6) >= 크거나 같다 6>=6 (true)
 *    ============================ if,while,for에서 주로 사용
 *        ** if => 조건문 , while, for => 반복문
 */
import java.util.Scanner;
public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean b1=10==11;
        System.out.println("b1="+b1);
        
        b1=10!=11;
        System.out.println("b1="+b1);
        
        b1=10<11;
        System.out.println("b1="+b1);
        
        b1=10>11;
        System.out.println("b1="+b1);
        // char => 모든 연산에서 정수로 변경
        b1=65<='A';// => 65<=65
        System.out.println("b1="+b1);
        
        b1=65>='B';
        System.out.println("b1="+b1);
        
        // char => 번호  ==> ASC (아스키코드)
        System.out.println((int)'A'); // 65
        System.out.println((int)'0'); // 48  '1' => 49
        System.out.println((int)'a'); // 97
        
        // 두개의 정수를 받아서 큰값을 출력
        
        Scanner scan=new Scanner(System.in);
        // new => 메모리에 저장 , 생성자 => 초기값 부여
        /*
         *   scan.netxInt()   ==> int
         *   scan.nextDouble() ==> double
         *   scan.next()       ==> String
         *   scan.nextBoolean() ==> boolean
         *   ==> char(X)
         */
        // 1. 받아서 저장할 변수
        int num1,num2;
        System.out.print("첫번째 정수 입력:");
        // 입력을 하고 => enter ==> num1에 저장
        num1=scan.nextInt();
        
        System.out.println("두번째 정수 입력:");
        num2=scan.nextInt();
        
        int result=num1<num2?num2:num1;
        
        System.out.println("큰값은 "+result+"입니다");
        
        
        
	}

}
