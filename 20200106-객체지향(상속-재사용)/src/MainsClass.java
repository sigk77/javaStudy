/*
 * 		객체 지향
 * 		1) 캡슐화
 * 		  1.접근지정어
 * 		  ============================================================
 * 					자신의 클래스    같은 폴더(패키지)   다른 폴더(패키지)   모든 클래스
 * 		  ============================================================
 * 		  private		o			x			x			   x
 *        ============================================================
 *        default		o			o			x			   x
 *        ============================================================
 *        protected		o			o			x,o			   x
 *        									  상속이 있는 경우
 *        ============================================================
 *        public		o			o			o			   o
 *        ============================================================
 *        
 *        => 클래스  : public class className : 부품 => 연결해서 사용
 *        => 변수	  :	private int a; => 데이터 보호
 *        => 메소드  : 메소드를 통해서 클래스와 클래스를 연결 
 *        			public 리턴형 메소드명() {}
 *        => 생성자  : 연결 => 메모리 할당
 *        			public 클래스명() {}
 *        => 변수는 은닉화 하고 => 메소드를 통해서 접근하는 방식
 *        	===================================== getter/setter
 *        
 *     	2) 재사용 기법
 *     		1. 상속 (is-a) : 기존의 클래스의 모든 내용을 받아서 재정의해서 사용
 *     					   => 자바는 단일 상속만 지원한다
 *     						   public class MuyWindow extends JFrame
 *     												  =======
 *     												    상속 기호(확장한 클래스)
 *     						   public class MyWindow extends JFrame,JPanel(X)
 *     					   => 상속은 모든 내용(변수,메소드,생성자)을 받아서 확장
 *     							*** 예외 : 생성자 , static(사용은 가능)
 *     		2. 포함 (has-a) :
 *     						public class MyWindow
 *     						{
 *     							JFrame f=new JFrame();
 *     						}
 *     				=> 기능변경 , 기능 추가 , 데이터 추가가 있는 경우에 상속
 *     				=> 있는 그대로 기능 사용 => 포함
 *     		3. 상속시	(클래스 비교)
 *     		  => 상속을 내리는 클래스가 크다
 *     		  => 형변환이 존재
 *     		  => ~이다라는 과정이 성립
 *     
 *     		    인간
 *     		   ↑
 *     		=======
 *     		│	  │
 *     	      남자         여자
 *     	
 *     	남자 max=new 남자()     ==> 남자는 남자다
 *     	여자 woman=new 여자();	 ==> 여자는 여자다
 *     	
 *     		인간 human=new 남자() ==> 남자는 인간이다
 *     		인간 human=new 여자() ==> 여자는 인간이다
 *     	
 *     		남자 man=new 인간() ==> 인간은 남자다 (X)
 *     			맞게 쓰려면 남자 man=(남자)new 인간() 으로 형변환 시켜주면 가능
 *     		남자man=new 여자() ==> 여자는 남자다(X)
 *     
 *     
 *     
 *    남자 클래스와  여자 클래스는 서로 연관이 없고 상위클래스인 인간에게 상속받고 있는 것뿐 
 *    모두 최상위 클래스인 Object의 상속을 받고 있음(기본적으로 표기는 생략되어있음)
 *    다른 데이터형을 배열로 다 모으려면 Object로 하면 가능( Object[] arr= {1,2,3,10.5,"aaa",'A'};)
 *    하지만 받아올 때 다 형변환 해야하기 때문에 가급적 사용 X (가급적 같은 데이터형으로 모으기)
 *     int a=(int)arr[0]; ((int)형변환필요)
 *    
 */
import java.util.*;
public class MainsClass {

	public static void main(String[] args) {
		
		class Human
		{
			String name;
			int age;
			
			public Human() {
				System.out.println("Human() Call...");
			}
		}
		
		/* 
		 *	상위 클래스(상속을 내리는 클래스) : super클래스, 부모클래스, Base클래스
		 *	 하위 클래스(상속을 받는 클래스) : sub클래스 , 자식클래스, 파생클래스
		 *
		 *	=> 기존 클래스의 모든 내용을 가지고 와서 확장하는 내용
		 *	=> 자바의 클래스는 Object상속을 가지고 있다 (Object: 자바의 최상위 클래스)
		 *	=> static,생성자는 상속을 할 수 없다
		 *	=> 목적은 중복된 코딩을 방지
		 *	       재사용을 목적으로 만든 기능
		 *
		 *	=> 상속을 내리는 클래스가 항상 크다
		 */
		
		
		class Sawon extends Human
		{
			/*
			 * String name;
			 * int age;
			 * 
			 */
			String dept;
			String loc;
			
			public Sawon() {
				System.out.println("Sawon() Call...");
			}
		}
		
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();    
		// 꺽새 보는순간 데이터형을 다 바꾸는(제네릭스) 했다고 생각하면 됌
		list.add("홍길동");
		
		String name=(String)list.get(0);
		
		Sawon s=new Sawon();
		s.age=30;
		s.name="홍길동";
		s.loc="서울";
		s.dept="개발부";
		
		System.out.println("이름: "+s.name);
		System.out.println("나이: "+s.age);
		System.out.println("지역: "+s.loc);
		System.out.println("부서: "+s.dept);

	}

}
