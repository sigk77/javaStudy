import java.util.regex.Pattern;

public class �޼ҵ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="�������� ���� ���� ���� ���! �����̹���������ͱ��� �����";
		// ���� ���� ==> ���鵵 ����
		System.out.println("������ ����"+data.length());
		System.out.println("�����ܾ��� ����:");
//		int count=0;
//		Pattern p=Pattern.compile("����");
//	    while(m.find());
		int n=data.indexOf("!");
				char[] m = null;
				System.out.println(m);
		
		String fData=data.substring(0,data.indexOf("1"));
		System.out.println(fData);
		String lData=data.substring(data.indexOf("1")+1);
		System.out.println(lData);
		
		int a=10;
		int b=20;
		double d=10.5;
		// 102010.5 ==> ��ȣ ==> 201912231 , 201912223
		String sss=a+"+"+b+""+d;
		System.out.println(sss);
		sss=String.valueOf(a)+String.valueOf(b)+String.valueOf(d);
		System.out.println(sss);
		
	}

}
