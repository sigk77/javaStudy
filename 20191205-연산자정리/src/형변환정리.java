/*
 *   자동 형변환  
 *     => int + double = double
 *        ===
 *        double로 변환
 *        
 *     => char + int = int
 *        ====
 *        int로 변환
 *        
 *     => char c='A';
 *        c>='A' && c<='Z'
 *           ===       ===
 *            65       90   ===> char는 모든 연산=>int변경
 *     =======================       
 *     => byte+byte = int
 *     => short+short = int
 *     => char+char = int
 *     ========================
 *     
 *   강제 형변환 : cast 연산자
 *   ========= down
 *     int ==> char
 *      ==> int a=65 ==> char b=(char)a;
 *      ==> char c=65;
 *      ==> int a=10.7;(X)
 *      ==> float f=10.7;(X)
 *     double ==> int
 *     
 */
public class 형변환정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char c=65;
     System.out.println(c);
     float f=10;
     System.out.println(f);
     double d='A';
     System.out.println(d);
	}

}
