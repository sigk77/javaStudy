import java.util.Scanner;

/*
 * 	3���� �л� ==> ����,����,���� ������ �Է¹޾Ƽ� => ���
 * ========================================
 * 80	80	80	240	80.0
 * 90 	90	90	270	90.0
 * 70	70	70	210 21
 */
public class �迭8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] rank=new char[5];

	    for(int i=0;i<3;i++)
	    {
	    	System.out.println("����  ����");
	    	kor[i]=scan.nextInt();
	    	System.out.println("���� ����");
	    	eng[i]=scan.nextInt();
	    	System.out.println("���� ����");
	    	math[i]=scan.nextInt();
	    	
	    	total[i]=kor[i]+eng[i]+math[i];
	    	avg[i]=(int) (total[i]/3.0);
	    	
	    	switch((int)avg[i]/10) // ����,����,���ڿ�,�Ǽ�(X)
	    	{
	    	case 10:
	    	case 9:
	    		rank[i]='A';
	    		break;
	    	case 8:
	    		rank[i]='B';
	    		break;
	    	case 7:
	    		rank[i]='C';
	    		break;
	    	case 6:
	    		rank[i]='D';
	    		break;
	    	default:
	    		rank[i]='F';
	
	    }
	   
	    
	    //���
	    for(int i1=0;i1<3;i1++)
	    {
	    	System.out.println(kor[i1]+" "+
	    eng[i1]+" "+math[i1]+" "+total[i1]+" "+avg[i1]);
	    }

	}

}
