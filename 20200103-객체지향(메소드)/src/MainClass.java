// 조립
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setName("홍길동");
		s1.setKor(89);
		s1.setEng(80);
		s1.setMath(90);
		Student s2=new Student();
		s2.setName("심청이");
		s2.setKor(56);
		s2.setEng(70);
		s2.setMath(89);
		Student s3=new Student();
		s3.setName("이순신");
		s3.setKor(92);
		s3.setEng(83);
		s3.setMath(84);
		
		StudentSystem ss=new StudentSystem();
		/*
		 * s1.setTotal(ss.totalData(s1.getKor(), s1.getEng(), s1.getMath()));
		 * s1.setAvg(ss.avgData(s1.getTotal())); s1.setScore(ss.scoreData(s1.getAvg()));
		 */
		ss.hakjumData(s1);
		ss.hakjumData(s2);
		ss.hakjumData(s3);
		
		System.out.println("===========결과============");
		System.out.println("이름:"+s1.getName());
		System.out.println("국어:"+s1.getKor());
		System.out.println("영어:"+s1.getEng());
		System.out.println("수학:"+s1.getMath());
		System.out.println("총합:"+s1.getTotal());
		System.out.println("평균:"+s1.getAvg());
		System.out.println("점수:"+s1.getScore());
		
		/*
		 * s2.setTotal(ss.totalData(s2.getKor(),
		 * s2.getEng(), s2.getMath())); s2.setAvg(ss.avgData(s2.getTotal()));
		 * s2.setScore(ss.scoreData(s2.getAvg()));
		 */
		
		System.out.println("===========결과============");
		System.out.println("이름:"+s2.getName());
		System.out.println("국어:"+s2.getKor());
		System.out.println("영어:"+s2.getEng());
		System.out.println("수학:"+s2.getMath());
		System.out.println("총합:"+s2.getTotal());
		System.out.println("평균:"+s2.getAvg());
		System.out.println("점수:"+s2.getScore());
		
		/*
		 * s3.setTotal(ss.totalData(s3.getKor(),
		 * s3.getEng(), s3.getMath())); s3.setAvg(ss.avgData(s3.getTotal()));
		 * s3.setScore(ss.scoreData(s3.getAvg()));
		 */
		
		System.out.println("===========결과============");
		System.out.println("이름:"+s1.getName());
		System.out.println("국어:"+s1.getKor());
		System.out.println("영어:"+s1.getEng());
		System.out.println("수학:"+s1.getMath());
		System.out.println("총합:"+s1.getTotal());
		System.out.println("평균:"+s1.getAvg());
		System.out.println("점수:"+s1.getScore());
	}

}
