
public class 달력숫자출력이중for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1;
        for(int i=0;i<=4;i++)
        {
    		int j=c;
        	for(int x=1;x<=7;x++)
        	{
        		System.out.print(j);
        		j++;		
        	}
    		System.out.println();
    		c+=7;	
        }
	}

}
