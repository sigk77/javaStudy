// 1,2 => ���� �߻� => Ȧ(1),¦(2)
import java.util.Scanner;
public class ���׿�����_�񱳿�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math.random() => 0.0~0.99 => 0.0~1.999 => 0~1
        int com=(int)(Math.random()*2+1); // 1~2
        Scanner scan=new Scanner(System.in);
        System.out.print("�Է�(Ȧ,¦):");
        String input=scan.next();
        
        String result=com%2==0?"¦":"Ȧ";
        
        String dap=input.equals(result)?"����":"����";
        
        System.out.println("com="+com);
        System.out.println("dap="+dap);
        
        
	}

}
