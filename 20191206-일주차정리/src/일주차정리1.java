/*
 *  ���� : �Ѱ��� �����͸� ����
 *  
 *   1. ���� ����
 *   2. ����� ���ÿ� ���� �Է� 
 *   
 *   ==========
 *   ������ ������ �� ��
 *   int kor;
 *   int eng;
 *   int math;
 *   
 *   =====> int kor, eng,math;
 *   
 *   �ʱⰪ
 *   int kor=100;
 *   int eng=100;
 *   int math=100;
 *   
 *   =====> int kor=100,eng=100,math=100;
 *   
 *   int kor,eng,math;
 *   kor=eng=math=100;
 *   
 */
// ������==> �ǹ̸� �ο�
public class ����������1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor,eng,math;
        kor=eng=math=100;
        
        System.out.println("kor="+kor);
        System.out.println("eng="+eng);
        System.out.println("math="+math);
        
        String first_name="ȫ"; // firstName
        String last_name="�浿";
        
        System.out.println("�̸�:"+first_name+last_name);
        // ���ڿ� ����
        /*
         *  1. Ŭ������ ==> �빮�� ����
         *  2. �޼ҵ��,������ ==> �ҹ��� ����   firstName (��Ÿ����)
         *  3. ��� ==> ��ü �빮��
         *  4. �鿩����
         */
	}

}
