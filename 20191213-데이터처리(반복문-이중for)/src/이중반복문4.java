/*
 *    ������ ���
 */
public class ���߹ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=9;i++)
        {
        	for(int j=2;j<=9;j++)
        	{
        		System.out.printf("%2d *%2d=%2d\t",j,i,j*i);
        	}
        	System.out.println();
        }
        System.out.println("\nfor~while=========");
        
        for(int i=1;i<=9;i++)
        {
        	int j=2;
        	while(j<=9)
        	{
        		System.out.printf("%2d *%2d=%2d\t",j,i,j*i);
        		j++;
        	}
        	System.out.println();
        }
	}

}
