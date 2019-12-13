// 100부터 999까지 7의 배수 갯수, 4의 배수 아닌 갯수 출력
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	int i = 100;
    	int x=0;
    	int y=0;
    while(i<=999)
    {
		if(i%7==0)
    		x++;
    	if(i%4!=0)
    		y++;    	
        i++;
    }
    	System.out.printf("100부터 999까지 7의 배수의 갯수는 %d개입니다.",x);
    	System.out.printf("100부터 99까지 4의 배수가 아닌 갯수는 %d개입니다.",y);
	}
}
