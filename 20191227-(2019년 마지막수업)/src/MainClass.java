/*
 * 		�ڹ� (Ŭ������ ������)==> �� ���� , ������ ������ ���� ���
 * 		�Ѱ��� ���Ͽ��� ���
 * 		=============
 * 		class A
 * 		class B
 * 		class C
 * 		public class B
 * 		==============�����: B.java (public Ŭ������ �Ѱ��� ����)
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
	// ���� �� �� �ִ� ����
}// News��������



// ������ 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� => ������ ����
		// �޸� �����
		News n1=new News();
		n1.title="\"8��° 1��\"..'��λ�', 450���� ����..'õ��' ���� ù�� 14�� ���� 2�� [����]";
		n1.content="[OSEN=�ϼ��� ����] ��ȭ '��λ�'�� ��ź���� �̾� ��ȭ�� ������ ���� ������ ���װ�, 'õ��: �ϴÿ� ���´�'�� ù�� 2���� ������   �ڽ����ǽ� �ǵ��� �� �ٲ����.";
		n1.author="OSEN";
		n1.regdate="19.12.27";
		
		News n2=new News();
		n2.title="'��������'ó�� ���� '����'ó�� ���� �� '�����'�� [2019 ��ȭ���]";
		n2.content="2019�⿡�� �ѱ���ȭ 2�� �׸��� ��ȭ 3���� õ�� ������ �����ϸ� 5���� õ�� ��ȭ�� ź���ߴ�.";
		n2.author="��Ÿ����";
		n2.regdate="19.12.27";
		
		// n1=new News(); //int a=10; a=20;
		
		// ���
		/*
		 * 	 int a=10;
		 * 
		 */
		System.out.println(n1.title);
		System.out.println(n2.title);
		
	}

}
