/*
 * 		1. �������� �ʱ�ȭ
 * 		  = ������
 * 		  = setter
 */


class Music{
	private int mno;
	private String title;
	private String singer;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public Music(int mno, String title, String singer) {
		super();
		this.mno = mno;
		this.title = title;
		this.singer = singer;
	}
	
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music music=new Music(100,"Blueming","������");
		// ����
		/*
		 * music.setMno(100); music.setTitle("Blueming"); music.setSinger("������");
		 */
		
		// �б�
		System.out.println(music.getMno());
		System.out.println(music.getTitle());
		System.out.println(music.getSinger());
		
		
		
		}

}
