import java.util.Scanner;

// ���� �Է� => 1,2,3,4
public class ���_���ǹ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���
        final int UP=1;
        final int DOWN=2;
        final int LEFT=3;
        final int RIGHT=4;
        
        int x=0,y=800;
        Scanner scan=new Scanner(System.in);
        System.out.print("Ű���� �Է�(��:1,�Ʒ�:2,����:3,������:4):");
        int input=scan.nextInt();
        
        if(input==UP)
        {
        	System.out.println("�������� �ö󰣴�!!");
        	y-=5;
        }
        if(input==DOWN)
        {
        	System.out.println("�Ʒ������� ��������!!");
        	y+=5;
        }
        if(input==LEFT)
        {
        	System.out.println("�������� ����!!");
        	x-=5;
        }
        if(input==RIGHT)
        {
        	System.out.println("���������� ����!!");
        	x+=5;
        }
	}

}
