/*
 *   // ����ó��,�ڵ��׽�Ʈ => 2for
 *   // break : �ݺ��� �ߴ��� ��
 *   for(int i=1;1<=10,i++)
 *   {
 *       if(i==5)
 *          break;
 *         System.out.println(O
 *   // continuce " Ư���κ��� ������ ��
 *   }    continue
 *      for(int i=1;1<=10,i++)
 *   {
 *       if(i==5)
 *          break;
 *         System.out.println(i);
 */
public class ���߹ݺ���3 {

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
	          continue;//==> ���⼭ ����
	          System.out.println(i);
	    }

	}

}
