/*
 *	중복이 없는 난수
 * 	=> 배열
 * 	==========
 *  ======
 *  난수 발생 ==>
 *  ======
 *  
 *  ======
 *  => 제어문
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
 *     등등...
 *     
 *     for => while => do~while ==> 8
 *    
 */
public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[9];
		int su=0; // 난수 발생시 저장
		boolean bCheck=false;// 중복여부를 확인
		
		for(int i=0;i<com.length;i++)
		{
			bCheck=true;
			//==================
			/* 
			 * 		com[0]=9
			 * 		com[1]=8
			 * 		com[2]=8
			 */
			while(bCheck)// for(;;) for문은 true,false를 보낼 수 없음, while문만 가능
			{
				//난수 발생
				su=(int)(Math.random()*9)+1;
				bCheck=false;
				//중복여부 확인
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
			//출력
		}
			for(int i1:com)
			{
			System.out.print(i1+" ");
			}
		}
	}

