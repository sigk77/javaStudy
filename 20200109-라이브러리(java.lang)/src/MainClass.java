/*
 * 	�ڹٿ��� �����ϴ� ���̺귯��
 *  => �ڹ� 
 * 		1) ����� ����
 * 		2) ���̺귯��
 * 		=========== 1)+2) ==> ����
 * 		�ڹ� ����
 * 		=======
 * 		java.lang : import�� �����ʰ� ���
 * 			= String : ���ڿ��� ���õ� Ŭ����
 * 			  	1) equals : ���ڿ� ��
 * 			   	2) trim() : �¿��� ��������
 * 				3) indexOf() , lastIndexOf()
 * 				4) length() 
 * 				5) startsWith,endsWith
 * 				6) subString()
 * 				7) split()
 * 				8) valueOf() : ��� �����͸� ���ڿ��� ����
 * 			= System : ���� , �Է���� , GC
 * 				1) gc :�������÷����� ���� �θ�
 * 				2) exit
 * 			= Object : ��� Ŭ������ ����Ŭ����
 * 				1) clone() : ����
 * 				2) finalize() : �Ҹ���
 * 			= Math : ����
 * 				1) random()
 * 				2) ceil()
 * 			= StringBuffer
 * 				1) toString()
 * 				2) append() : ���ڿ� ����
 * 			= Thread
 * 		java.util : �����ϰ� ����� �� �ִ� Ŭ������ ����
 * 			= Scanner(X)
 * 			= StringTokenizer
 * 			= Collection(�迭)
 * 			= ArrayList , Vector , LinkdList , Map : �ڷᱸ��
 * 		      =========                        ===
 * 			    �ڷᱸ�� : �޸� ���� ���� 
 * 		java.io
 * 			= Reader , writer (2byte)
 * 			= InputStream , OutputStream (1byte)
 * 			= File
 * 			= ObjectInputStream , objectOutputStream
 * 		java.net
 * 			= Socket
 * 			= URL
 */
class My
{
	public My() {
		System.out.println("My ������ �Լ� ȣ�� (��ü ����)");
	}
	public void display() {
		System.out.println("My:display() call...");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("��ü �Ҹ�");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My m=new My(); // ����
		//Ȱ��
		m.display();
		//�Ҹ�
		m=null;
		System.gc();//�޸� �Ҹ�
		
		// A a=new A()
		   
	}

}
