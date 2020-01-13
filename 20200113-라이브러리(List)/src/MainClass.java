import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new LinkedList<String>(); // 제네릭스
							// ArrayList , Vector , LinkedList
		// interface      // 구현된 클래스
		// String[] List
		// 저장 add()
		list.add("홍길동");// 0
		list.add("심청이");// 2  ==> 이순신
		list.add("박문수");// 3
		
		// 중간에 저장
		list.add(1,"춘향이");// 1
		
		// 출력 ==> for-each (배열,컬렉션) => web
		int i=0;
		for(String name:list)
		{
			System.out.println(name+":"+i);
			i++;
		}
		
		// 수정
		list.set(2, "이순신");	
		System.out.println("==============");
		i=0;
		for(String name:list)
		{
			System.out.println(name+":"+i);
			i++;
		}
		
		
		// 삭제
		list.remove(1);
		System.out.println("==============");
		i=0;
		for(String name:list)
		{
			System.out.println(name+":"+i);
			i++;
		}
		
		// 데이터 저장된 갯수
		System.out.println("==============");
		System.out.println("저장된 갯수:"+list.size());
	}

}
