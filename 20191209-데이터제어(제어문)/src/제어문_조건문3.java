// ���ĺ� => ���� => �빮��,�ҹ��� 
public class ���_���ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char alpha='ȫ';
        // ���� , �Ⱓ ==> &&
        // ������ => char�� ��� ������ �Ǹ� ==> ������ȯ (�ڵ� ����ȯ)
        if(alpha>='A' && alpha<='Z')
        	System.out.println(alpha+"��(��) �빮���Դϴ�");
        else if(alpha>='a' && alpha<='z')
        	System.out.println(alpha+"��(��) �ҹ����Դϴ�");
        else
        	System.out.println(alpha+"��(��) ���ĺ��� �ƴϴ�");

	}

}
