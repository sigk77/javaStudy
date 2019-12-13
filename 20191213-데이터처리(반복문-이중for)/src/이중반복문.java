/*
 *    형식-순서)
 *             1     2 ↑==> false
 *                       8
 *              i   i<=5 i++
 *        for(초기값;조건식;증가식) ==> 1차
 *        {         ↓ true
 *                  1   2 ↑ ==> false ====> 1차 for 줄 수
 *                           4
 *                 i=1 j<=5 j++
 *            for(초기값;조건식;증가식) ==> 2차 ====> 실제 출력
 *            {         ↓ true
 *                    3
 *                 실행문장(2차 for) ==> 2차 증가식
 *            }
 *                5
 *            실행문장(1차 for) ====> 1차 for 증가식
 *        }
 *        
 *        *****
 *        *****
 *        *****
 *        *****
 *        
 *        1####
 *        #2###
 *        ##3##
 *        ###4#
 *        ####5
 *        
 *        *
 *        **
 *        ***
 *        ****
 *        *****  j<=i의 조건변경
 *        
 *        i   j
 *        줄수   별표
 *        1    1
 *        2    2
 *        3    3
 *        4    4
 *        5    5
 *        
 *        *****
 *        ****
 *        ***
 *        **
 *        *
 *        
 *        i  j
 *        1  5
 *        2  4
 *        3  3
 *        4  2
 *        5  1     i+j=6  => j=6-i
 *        
 *        *
 *       ** 
 *      ***
 *     ****
 *    *****   
 *        i   j   k     ==> i=k ==> k=i
 *       줄수    공백  별표
 *        1   4   1
 *        2   3   2
 *        3   2   3
 *        4   1   4
 *        5   0   5
 *          i+j=5  ==> j=5-i
 *          
 *    *****
 *     ****
 *      ***
 *       **
 *        *
 *       i  j  k     ==> i+k=6 ==> k=6-i
 *      줄수 공백 별표      
 *        1 0 5
 *        2 1 4
 *        3 2 3
 *        4 3 2
 *        5 4 1
 *             j=i-1
 *             
 *       *******
 *         ***
 *          *     위에 세번 
 *         ***    밑에 두번 으로 따로 for문
 *       *******
 *       
 *       *   *
 *       *   *
 *       ** **
 *       *****
 *       ** **
 *       *   *
 *       *   *
 *       
 *         *
 *        ***
 *       *****
 *        ***
 *         *
 *         
 *      =====================
 *      2*1=2 3*1=2 4*1=4 ----- 9*1=9
 *      
 *      2*9=18                  9*9=81
 */
public class 이중반복문 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=6-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%2d*%2d=%2d\t",j,i,j*i);
			}
			System.out.println();
		}



	}
}
