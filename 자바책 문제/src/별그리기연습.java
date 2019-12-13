/*
 *      *
 *     ***
 *    *****
 *   *******
 *   
 *   1 1 3
 *   2 2 2
 *   3 3 1
 *   4 4 0
 *   
 */
public class 별그리기연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=0;i<5;i++)
        {
        	for(int x=0;x<=3-i;x++)
        	{
        		System.out.print(" ");
        		//System.out.print("i="+i+",x="+x);
        	}
        	for(int j=0;j<=i;j++)
        	{
        		System.out.print("*");
    			//System.out.print("i="+i+",j="+j);
        	}
        	for(int j=0;j<i;j++)
        	{
        		System.out.print("*");
    			//System.out.print("i="+i+",j="+j);
        	}
        	System.out.println();
        }
	}

}
