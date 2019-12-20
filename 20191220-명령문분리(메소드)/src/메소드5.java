
public class 메소드5 {
	//난수 발생
	//중복여부
	static int[] getRand()
	{
	int[] com=new int[6];
	//비교 => 중복 
	int su=0;
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
	return com;
	}
	//출력
	static void print(int[] com)
	{
		for(int i:com) // 저장된 데이터를 한개씩 읽어온다 (for-each)
		{
			System.out.print(i+" ");
		}
	}
	//조합
	static void process()
	{
		int[] com=getRand();
		print(com);
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
