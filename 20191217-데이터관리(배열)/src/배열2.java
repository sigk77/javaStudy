/*
 *	�ߺ��� ���� ����
 * 	=> �迭
 * 	==========
 *  ======
 *  ���� �߻� ==>
 *  ======
 *  
 *  ======
 *  => ���
 *     for()
 *     {
 *     	   for()
 *     	   {
 *     	   }
 *     }
 *     for()
 *     {
 *     		do{
 *     		}while
 *     }
 *     for()
 *     {
 *     		while()
 *     		{
 *     		}
 *     }
 *     while()
 *     {
 *     		for()
 *     		{
 *     		}
 *     }
 *     ���...
 *     
 *     for => while => do~while ==> 8
 *    
 */
public class �迭2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[9];
		int su=0; // ���� �߻��� ����
		boolean bCheck=false;// �ߺ����θ� Ȯ��
		
		for(int i=0;i<com.length;i++)
		{
			bCheck=true;
			//==================
			/* 
			 * 		com[0]=9
			 * 		com[1]=8
			 * 		com[2]=8
			 */
			while(bCheck)// for(;;) for���� true,false�� ���� �� ����, while���� ����
			{
				//���� �߻�
				su=(int)(Math.random()*9)+1;
				bCheck=false;
				//�ߺ����� Ȯ��
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			//==================
			com[i]=su;
			//���
		}
			for(int i1:com)
			{
			System.out.print(i1+" ");
			}
		}
	}

