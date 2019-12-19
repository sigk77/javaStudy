
public class 오전문제1_1218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=0;
//		int sum=0;
//		int add=0;
//		for(i=0;i<=10;i++)
//		{
//			add+=i;
//			sum+=(add+i);
//		}
//		System.out.println(sum);
			
		
//		int i=0;
//		int sum=0;
//		for(i=0;i<=10;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.println(j+" ");
//				sum+=j;
//			}
//			System.out.println();
//	   }
//		System.out.println("sum="+sum);
//		
		int sum=0;
		int i=1;
		for(;;)
		{
			if(sum>100)
			{
				if(i%2==0)
					sum-=i;
				else
					sum+=i;	
				if(sum>100)break;
			}		
		}
		System.out.println("sum="+sum);
	}
	
	
		

}
