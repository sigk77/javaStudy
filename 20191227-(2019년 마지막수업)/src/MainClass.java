/*
 * 		자바 (클래스가 여러개)==> 한 파일 , 별도로 파일을 만들어서 사용
 * 		한개의 파일에서 사용
 * 		=============
 * 		class A
 * 		class B
 * 		class C
 * 		public class B
 * 		==============저장명: B.java (public 클래스는 한개만 존재)
 * 		class A
 * 		class B
 * 		========
 */
class News{
	String title;
	String content;
	String author;
	String regdate;
	//static String site;
	// 선언만 할 수 있는 영역
}// News데이터형



// 조립기 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 저장 => 통으로 저장
		// 메모리 만들기
		News n1=new News();
		n1.title="\"8일째 1위\"..'백두산', 450만명 돌파..'천문' 개봉 첫날 14만 흥행 2위 [종합]";
		n1.content="[OSEN=하수정 기자] 영화 '백두산'이 성탄절에 이어 문화의 날에도 흥행 정상을 지켰고, '천문: 하늘에 묻는다'가 첫날 2위에 오르며   박스오피스 판도가 또 바뀌었다.";
		n1.author="OSEN";
		n1.regdate="19.12.27";
		
		News n2=new News();
		n2.title="'극한직업'처럼 웃고 '벌새'처럼 훨훨 난 '기생충'① [2019 영화결산]";
		n2.content="2019년에는 한국영화 2편 그리고 외화 3편이 천만 관객을 돌파하며 5편의 천만 영화가 탄생했다.";
		n2.author="스타뉴스";
		n2.regdate="19.12.27";
		
		// n1=new News(); //int a=10; a=20;
		
		// 출력
		/*
		 * 	 int a=10;
		 * 
		 */
		System.out.println(n1.title);
		System.out.println(n2.title);
		
	}

}
