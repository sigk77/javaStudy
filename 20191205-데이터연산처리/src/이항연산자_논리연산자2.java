/*
 *   형변환(boolean은 제외) (int)"10" integer.parseInt("10")
 *                       (String)10 String.vaul
 *   ====
 *    Up    c>='A' => c>=65
 *    Down  int => char
 *          (char)65
 *          double => int
 *          (int)10.5
 *          
 *          char,short,byte ==> 연산(int)
 *          
 *          (double)10
 *          
 *          byte<char,short<int<long<float<double
 *          
 *          
 *          && || !  ==> 논리 (true/false)
 *          => if
 */
public class 이항연산자_논리연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 결과값 => boolean
		boolean b1=(6<7) && (7==7); // true
		//          true     true   ==>  &&
		System.out.println("b1="+b1);
		
		b1=(6>7) && (7==7); // false
		System.out.println("b1="+b1);
		
		b1=(6>7) || (7==7); //true
		System.out.println("b1="+b1);
		
		b1=(6<7) || (7==7); //true
		System.out.println("b1"+b1);
		
		b1=(6>7) || (7!=7); //false
		System.out.println("b1="+b1);
		//true true (&&)
		//true (||)
	}

}
