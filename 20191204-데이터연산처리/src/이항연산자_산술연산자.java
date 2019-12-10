/*
 *     산술연산자 (+ , - , * , / , %) : 다른 데이터형을 사용했을 경우
 *        1) int 이하 데이터형(bytem,short,char) => 연산처리=>int
 *           byte  + byte => int
 *           char  + byte => int
 *           short + byte + char => int
 *           
 *           short+char+int+double => double => String
 *           ""+77 ==> "77"
 *           ""+7.5 ==> "7.5"
 *           ""+true => "true"
 */
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //byte b=127;
        //byte c=10;
        //byte d=(byte)(b+c); // byte d=b+c면 오류남
        //System.out.println("d="+d);
        byte b=(byte)300;
        System.out.println("b"+b);
        System.out.println(Integer.toBinaryString(300));
        /*
         *  300 
         *    1     00101100
         *            32 8 4  ==> 44
         */
       int a=10+20*3;
	}

}
