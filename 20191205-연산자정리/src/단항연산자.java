/*
 *        
 */
public class 단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=a++;// a=11,b=10
        int c=++a;// a=12,c=12
        // a=12, b=10, c=12
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        
        char ch='A';
        System.out.println(++ch);// 증가 => 출력 ch++ 면 A 출력
        // char ch=ch+1
        
        int i=10;
        //       i+1    i+1               i+1  i+1   i-1
        int j=i++ + i++ + ++i + ++i + i++ + i++ + i-- + --i;
        //    10    11     13    14   14    15    16    14   
        System.out.println(j);
        
        int x=10;
        int y=9;
        
        boolean bCheck=(x<y)&&(++y==x);
        //boolean bCheck=(x<y)||(++y==x); 이면 오른쪽도 계산하게 되므로 y값이 1증가함
        
        System.out.println(bCheck);
        System.out.println("x="+x);
        System.out.println("y="+y);
        
        // 증감 연산자 ==> 반복문
        
        // ! => 부정연산자 => boolean => 조건문을 만들때
        //boolean bCheck=!((x<y)||(++y==x)); 결과 반대값
        // 3,5 123678 => !(seat==3||seat==5) => not(오라클에서)
	}

}
