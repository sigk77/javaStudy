// 1,2 => ³­¼ö ¹ß»ý => È¦(1),Â¦(2)
import java.util.Scanner;
public class ÀÌÇ×¿¬»êÀÚ_ºñ±³¿¬»êÀÚ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math.random() => 0.0~0.99 => 0.0~1.999 => 0~1
        int com=(int)(Math.random()*2+1); // 1~2
        Scanner scan=new Scanner(System.in);
        System.out.print("ÀÔ·Â(È¦,Â¦):");
        String input=scan.next();
        
        String result=com%2==0?"Â¦":"È¦";
        
        String dap=input.equals(result)?"Á¤´ä":"¿À´ä";
        
        System.out.println("com="+com);
        System.out.println("dap="+dap);
        
        
	}

}
