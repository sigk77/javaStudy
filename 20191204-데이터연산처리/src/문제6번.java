
public class ����6�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int numOfApples = 123;
        //����� ����
     int sizeOfBucket = 10;
        //�ٱ����� ũ��
     int numOfBucket = ((numOfApples/sizeOfBucket)+(numOfApples%sizeOfBucket==0?0:1));
        //��� ����� ��µ� �ʿ��� �ٱ����� ��
     
     System.out.println("�ʿ��� �ٱ����� �� : "+numOfBucket);
	}

}
