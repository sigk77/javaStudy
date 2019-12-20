// 1~45 => 난수 발생 => 중복없는 6개 발생
/*
 *  배열 ==> 6개
 *  
 *  for(6횟수)
 *  {
 *  	while(중복)
 *  	{
 *  		난수 발생
 *  		배열에 저장된 데이터와 난수 (같다)
 *  	{
 *  
 *  	배열 저장
 *  }
 */
public class 메소드4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 저장 공간 
		int[] com=new int[6];
		//난수
		int su=0;
		//비교 => 중복 
		boolean bCheck=false;
		
		for(int i=0;i<6;i++)
		{
			bCheck=true;
			while(bCheck)
			{
				su=(int)(Math.random()*45)+1;
				bCheck=false;
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			//배열에 저장
			com[i]=su;
			// Math.random()
			// 0.0~0.99*45
			// (int) 0~44
			// => +1 ===> 1~45
		}
		
		// 출력
		for(int i:com) // 저장된 데이터를 한개씩 읽어온다 (for-each)
		{
			System.out.print(i+" ");
		}
	}

}
