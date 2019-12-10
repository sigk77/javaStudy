package 데이터저장;

public class 만개의레시피 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name="Travel HEY";
     String title="\"집내없이 삶기, 고기만 먹어도 맛있고 김치랑 먹어도 맛있는 수육\"";
     String sub_title="야들야들하고 잡내없이 삶는 팁";
     int inwon=4;
     int time=40;
     String 대상="아무나";
     /*
      *    1) " 출력 => \"  => 인용부호
      *    2) 다음줄 출력 => \n => new Line
      *    3) 일정 간격 => \t => tab
      */
     System.out.println("쉐프명:"+name);
     System.out.println("레시피 제목:"+title);
     System.out.println("부제목:"+sub_title);
     System.out.print("인원:"+inwon+"명\t");
     System.out.print("조리시간:"+time+"분\t");
     System.out.print("대상:"+대상+"\t");
     
	}

}
