import java.util.regex.Pattern;

public class 메소드5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기";
		// 문자 갯수 ==> 공백도 포함
		System.out.println("문자의 갯수"+data.length());
		System.out.println("버섯단어의 갯수:");
//		int count=0;
//		Pattern p=Pattern.compile("버섯");
//	    while(m.find());
		int n=data.indexOf("!");
				char[] m = null;
				System.out.println(m);
		
		String fData=data.substring(0,data.indexOf("1"));
		System.out.println(fData);
		String lData=data.substring(data.indexOf("1")+1);
		System.out.println(lData);
		
		int a=10;
		int b=20;
		double d=10.5;
		// 102010.5 ==> 번호 ==> 201912231 , 201912223
		String sss=a+"+"+b+""+d;
		System.out.println(sss);
		sss=String.valueOf(a)+String.valueOf(b)+String.valueOf(d);
		System.out.println(sss);
		
	}

}
