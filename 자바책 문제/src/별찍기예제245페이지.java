public class 별찍기예제245페이지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int y=0;y<11;y++) 
		{
			for(int x=0;x<20;x++)
			    if(y<6)
			    {
			    	if(x==y)
			    	    System.out.print("☆");
			    	else
				        System.out.print("○");
			    }
			    else
			    {
			    	if(y==10-x)
			    	    System.out.print("☆");		
			    	else
				        System.out.print("○");
			    }
		System.out.println();
		}
	}
}

