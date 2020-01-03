class Data{
	String title;
	static String poster;

	{
		title="aaa";
	}
	
	static
	{
		poster="1.png";
	}
	
	public Data() {
		title="bbb";
		poster="2.png";
	}
	/// 마지막에 생성자가 읽히므로 초기화블럭이 의미가 없어짐
	
	
//	public Data()
//	{
//		title="홍길동전";
//		poster="hong.png";
//		
//	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1=new Data();
		System.out.println(d1.title);
		System.out.println(d1.poster);
		
		Data d2=new Data();
		System.out.println(d2.title);
		System.out.println(d2.poster);   
		/// 매번 할때마다 불러와야함 호출 한번에 할 수 있는 방법은? => 초기화블록 5줄에서~12줄까지의 내용 참조
		/// 매번 할때마다 변경해야하는건 생성자가 날 수 있음
	}

}
