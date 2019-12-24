// year를 입력 받아서 => 윤년여부 확인
// int 0,1 => boolean
/*
 * 	네트워크
 * 	  LOGIN|id|pwd => 로그인
 */
// void
public class 메소드3 {
	static void isYear(int year)
	{
		if((year%4==0 && year%100!=0)||(year%400==0))
			System.out.println(year+"년도는 윤년입니다");
		else
			System.out.println(year+"년도는 윤년이 아닙니다");
	}
	static boolean isYear2(int year)
	{
		if((year%4==0 && year%100!=0)||(year%400==0))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2019;
		isYear(year);
		boolean bCheck=isYear2(year);
		if(bCheck)
			System.out.println("윤년입니다");
		else
			System.out.println("윤년이 아닙니다");
	}

}
