package 데이터저장;
/*
 *  이름, 성별, 나이, 주소, 전화번호, 이메일=> 존재(true),비존재(false)
 */
public class 변수문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String name="김용희";
    char sex='남';
    int age=31;
    String add="경기도";
    String tel="010-4720-2325";
    boolean email=true;
    //자료
    //출력
    System.out.println("이름:"+name);
    System.out.println("성별:"+sex);
    System.out.println("나이:"+age);
    System.out.println("주소:"+add);
    System.out.println("전화번호:"+tel);
    System.out.println("이메일여부:"+email);
	}

}
