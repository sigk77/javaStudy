package 데이터저장;
/*
 *     이름, 국어, 영어, 수학 점수를 저장한 후
 *     이름,국어,영어,수학,총점,평균을 출력
 */
public class 변수문제 {
	
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 데이터 저장
		String name="용희";
	    int kor=60,eng=70,math=40;
	    int total=kor+eng+math;
	    // 처리
	    // 출력
	    System.out.print("이름:"+name+"\n");
	    System.out.print("국어:"+kor+"\n");
	    System.out.print("영어:"+eng+"\n");
	    System.out.println("수학:"+math);
	    System.out.println("총점:"+total);
	    // 정수/정수=정수 이므로 3.0으로...
	    System.out.printf("평균:%.2f",(kor+eng+math)/3.0);
	}

}
