class Board{
	public void write() {
		System.out.println("Board:write(): 글쓰기");
	}
	public void content() {
		System.out.println("Board:content(): 내용보기");
	}
	public void update() {
		System.out.println("Board:update(): 수정하기");
	}
	public void list() {
		System.out.println("Board:list(): 목록 출력");
	}
	public void find() {
		System.out.println("Board:find(): 찾기");
	}
	public void delete() {
		System.out.println("Board:delete(): 삭제");
	}
}
// 변경이 가능
/*
 * 	 내용 수정 : 오버라이딩
 * 	================	원형을 그대로 가지고 온다
 * 	 1) 상속을 받는다
 * 	 2) 메소드명이 동일
 * 	 3) 매개변수가 동일
 * 	 4) 리턴형이 동일
 * 	 5) 확장은 가능, 축소는 불가능하다
 * 		(접근지정어)
 * 		private < default <protected < public
 * 		
 * 		class A
 * 		{
 * 			void display(){}
 * 		}
 * 		class B extends A
 * 		{
 * 			void display(){}  (가능)
 * 			protected void display(){} (가능)
 * 			public void display(){} (가능)
 * 			private void display(){} (불가능)
 * 		}
 */
class GalleryBoard extends Board{
	public void update() {
		System.out.println("GalleryBoard:write(): 글쓰기+이미지 업로드");
	}
	public void list() {
		System.out.println("GalleryBoard:list(): 목록 출력+이미지를 출력");
	}
}
class DataBoard extends Board{

	@Override
	public void write() {
		System.out.println("DataBoard:write(): 글쓰기 + 파일 업로드");
	}

	@Override
	public void content() {
		System.out.println("DataBoard:write(): 글쓰기 + 파일 다운로드");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * GalleryBoard gb=new GalleryBoard(); gb.list(); gb.write(); gb.content();
		 * gb.update(); gb.delete(); gb.find();
		 * 
		 * DataBoard db=new DataBoard(); db.list(); db.write(); db.content();
		 * db.update(); db.delete(); db.find();
		 */
		Board gb=new GalleryBoard();
		gb.list();
		gb.write();
		gb.content();
		gb.update();
		gb.delete();
		gb.find();
		
		gb=new DataBoard();
		
		gb.list();
		gb.write();
		gb.content();
		gb.update();
		gb.delete();
		gb.find();
	}

}
