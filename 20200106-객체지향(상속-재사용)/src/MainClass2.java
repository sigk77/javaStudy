class Board{
	public void write() {
		System.out.println("Board:write(): �۾���");
	}
	public void content() {
		System.out.println("Board:content(): ���뺸��");
	}
	public void update() {
		System.out.println("Board:update(): �����ϱ�");
	}
	public void list() {
		System.out.println("Board:list(): ��� ���");
	}
	public void find() {
		System.out.println("Board:find(): ã��");
	}
	public void delete() {
		System.out.println("Board:delete(): ����");
	}
}
// ������ ����
/*
 * 	 ���� ���� : �������̵�
 * 	================	������ �״�� ������ �´�
 * 	 1) ����� �޴´�
 * 	 2) �޼ҵ���� ����
 * 	 3) �Ű������� ����
 * 	 4) �������� ����
 * 	 5) Ȯ���� ����, ��Ҵ� �Ұ����ϴ�
 * 		(����������)
 * 		private < default <protected < public
 * 		
 * 		class A
 * 		{
 * 
 * 			void display(){}
 * 		}
 * 		class B extends A
 * 		{
 * 			void display(){}  (����)
 * 			protected void display(){} (����)
 * 			public void display(){} (����)
 * 			private void display(){} (�Ұ���)
 * 		}
 */
class GalleryBoard extends Board{
	public void update() {
		System.out.println("GalleryBoard:write(): �۾���+�̹��� ���ε�");
	}
	public void list() {
		System.out.println("GalleryBoard:list(): ��� ���+�̹����� ���");
	}
}
class DataBoard extends Board{

	@Override
	public void write() {
		System.out.println("DataBoard:write(): �۾��� + ���� ���ε�");
	}
	public void write(int a)
	{
		System.out.println("");
	}

	@Override
	public void content() {
		System.out.println("DataBoard:write(): �۾��� + ���� �ٿ�ε�");
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
		// gb�� ������ �ִ� �޼ҵ常
		/*
		 * 
		 * 	������
		 * 	====
		 * 	����Ŭ���� ������ 
		 */
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
		
		/*
		 * 	���� Ŭ������ ����Ŭ������ ����
		 * 
		 * 	Borard gb=new DataBoard() => ����� �޼ҵ常 ȣ���� ���� 
		 * 	  int a         int b,a
		 * 	============================= ����� �޴� ���
		 * 	=> ���� Ŭ������ ���� Ŭ������ �߰��� �޼ҵ峪 ������ ������ �Ұ���
		 * 	=> ���� : Ŭ���� Ÿ�� 
		 * 	=> �޼ҵ�	: ������
		 */
	}

}
