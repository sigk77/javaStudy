// if���๮���� ����
/*
 *    if(���ǹ�)
 *      ���๮��1 =====> if�� �Ҽӹ���
 *      ���๮��2 =====> if�� ������ ���� ���� => true/false�� ���þ��� ������ ���๮��
 *    => �ڹٿ��� ��� ����� {}�� ���� ��� �� ���常 ����
 *    
 *   if(���ǹ�)
 *   {
 *       ���๮��1    ==> ������
 *   }
 *   ���๮�� 2
 *      
 *   => ������ , ����ȭ (�����丵) , ���̱׷��̼� (Spring ==> SpringBoot)
 *   
 *     abc() ==> plus()
 *     def() ==> minus()
 *     
 */
public class ���_���ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=20;
        // �������� ���๮���� ���ÿ� ���� �Ҷ� ����ϴ� ���ǹ�
        if(num%2==0)
        {
        	int b=100;
        	System.out.println("b�� "+b+"�Դϴ�");
        	System.out.println(num+"��(��) ¦���Դϴ�");
            System.out.println("���α׷� ����");
            b++;
        }    
        int b=100;
        System.out.println(b);
        ////System.out.println(b); ==> {}�ȿ����� ����ϴ� ���� ��������
        
        // ++a , a++ , a+=5 , a=a+1
        int c=10;
        c++;
        c++;
        c++;
        c++;
        c++;
       System.out.println("c="+c);
       
        int d=10;
        d+=5;
        System.out.println("d="+d);
	}

}






