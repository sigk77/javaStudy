
public class 문제66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double numOfApples = 123;
        //사과의 개수
     double sizeOfBucket = 10;
        //바구니의 크기
     double numOfBucket = Math.ceil(numOfApples/sizeOfBucket);
        //모든 사과를 담는데 필요한 바구니의 수
     
     System.out.println("필요한 바구니의 수 : "+numOfBucket);
	}

}
