/*
 *   && => ����ó��
 *   || => ����ó��
 *   
 *   ��������
 *     (����) && (����) : �����ȿ� �ִ� ���
 *       => score>=90 && score<=100
 *     (����) || (����) : ���� �ۿ� �ִ� ��� (����ó��)
 *       => score<= || score>100
 *       
 *       id�� password
 *       
 *       id=="" && pwd=1234
 *       !(id!="" || pwd!="")
 *     
 *    ===========================
 *                   &&    ||
 *    ===========================
 *    true true     true  true
 *    ===========================
 *    true false    false true
 *    ===========================
 *    false true    false true
 *    ===========================
 *    false false   false false
 *    ===========================
 *    
 *    *** ȿ���� ����
 *    && => ���� => false => �������� ���꿡�� ����
 *    || => ���� => true  => �������� ���꿡�� ����
 */
public class ���׿�����_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���ĺ��� �����Ŀ� �ҹ��� , �빮�� ����
		char c='A'; // 'a'
		// �빮�ڸ� �ҹ��� ==> �ҹ��� ==>�빮�� ����
		char result=(c>=65 && c<=86)?(char)(c+32):(char)(c-32);
		System.out.println(c+"��(��) "+result);
	}

}
