/*
 *   // 정보처리,코딩테스트 => 2for
 *   // break : 반복을 중단할 때
 *   for(int i=1;1<=10,i++)
 *   {
 *       if(i==5)
 *          break;
 *         System.out.println(O
 *   // continuce " 특정부분을 제외할 때
 *   }    continue
 *      for(int i=1;1<=10,i++)
 *   {
 *       if(i==5)
 *          break;
 *         System.out.println(i);
 */
public class 이중반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       for(int i=1;i<=10;i++)
	    {
	        if(i==5)
	           break;
	          System.out.println(i);
	    }
		System.out.println("====== continue =====");
		
		
	       for(int i=1;i<=10;i++)
	    {
	    	 //if(i==5 || i==7)
	        if(i%2!=0)
	          continue;//==> 여기서 종료
	          System.out.println(i);
	    }

	}

}
