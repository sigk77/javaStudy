public class 문제풀기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int money=65430;
    
     int 만원=money/10000;
     int 천원=(money%10000)/1000;
     int 백원=(money%1000)/100;
     int 십원=(money%100)/10;
     
     System.out.println("만원 = "+만원);
     System.out.println("천원 = "+천원);
     System.out.println("백원 = "+백원);
     System.out.println("십원 = "+십원);
	}

}
