
public class �޼ҵ�5 {
	//���� �߻�
	//�ߺ�����
	static int[] getRand()
	{
	int[] com=new int[6];
	//�� => �ߺ� 
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
		//�迭�� ����
		com[i]=su;
		// Math.random()
		// 0.0~0.99*45
		// (int) 0~44
		// => +1 ===> 1~45
		}
	return com;
	}
	//���
	static void print(int[] com)
	{
		for(int i:com) // ����� �����͸� �Ѱ��� �о�´� (for-each)
		{
			System.out.print(i+" ");
		}
	}
	//����
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
