
// ? :
// (���ǹ�?��1:��2) => ��(React => ���׿�����)���� ���� ���� 
// ����(true)  => ��1
// ����(false) => ��2
/*
 *      <%
 *          int sex=1;
 *          if(sex==1)
 *          {
 *       %>
 *           ����
 *       <%
 *           }
 *           else
 *           {
 *        %>
 *           ����
 *        <%
 *           }
 *        %>
 *        =======================
 *        <%
 *             sex==1?"����":"����"
 *        %>
 */
import java.util.Scanner;

/* 
 *  ����,����,���� ������ �Է¹޾Ƽ� ��� => ����� 60�̻��̸� pass , nopass
 *  
 *  // ���̸� �Է� ==> 15���̻��̸� (��ȭ��������) / ���� (��ȭ�����Ұ�)
 *  // �¼� => 1 2 3 4 5 => 1,2,4 => �¼����� �Ұ��� , 3,5 => �¼����Ű���
 */
public class ���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("���� ����:"); // ���� int kor=scan.nextInt();
		int kor = scan.nextInt();
		System.out.print("���� ����:");
		int eng = scan.nextInt();
		System.out.print("���� ����:");
		int math = scan.nextInt();

		int avg = (kor + eng + math) / 3;

		String result = avg >= 60 ? "pass" : "NonPass";

		System.out.println("���:" + result);

		System.out.print("����:");
		int age = scan.nextInt();

		String result1 = age >= 15 ? "��ȭ��������" : "��ȭ�����Ұ�";
		System.out.println("��:" + result1);

		System.out.print("�¼���ȣ(1~5):");
		int num = scan.nextInt();

		String re = num == 3 || num == 5 ? "�¼����Ű���" : "�¼����� �Ұ���";
		System.out.println("���ſ���:" + re);
	}
}
