// 100���� 999���� 7�� ��� ����, 4�� ��� �ƴ� ���� ���
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	int i = 100;
    	int x=0;
    	int y=0;
    while(i<=999)
    {
		if(i%7==0)
    		x++;
    	if(i%4!=0)
    		y++;    	
        i++;
    }
    	System.out.printf("100���� 999���� 7�� ����� ������ %d���Դϴ�.",x);
    	System.out.printf("100���� 99���� 4�� ����� �ƴ� ������ %d���Դϴ�.",y);
	}
}
