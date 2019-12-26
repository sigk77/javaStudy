import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * 		menber (
 * 		  	id
 * 		  	pwd
 * 		  	name
 * 			sex
 * 			birth
 * 			addr
 * 			tel...
 * 		)
 * 
 * 		����
 * 			{
 * 				id
 * 				title theater date time inwon seat
 * 			}
 * 
 */
class Category{
	int cateno; //cno
	String poster;
	String title;
	String subTitle;
	String link;
}
/*
 * �ּ�	���� ���ֽ� �̵��̵� 1063-6
��ȭ��ȣ	064-726-5242
���� ����	ȸ / ����
���ݴ�	����-2����
����	������������
�����ð�	11:00 - 15:00
����	ȭ
�޴�	
�Ϻ굿 (��)
16,000��
��ȸ�� (��)
10,500��
��ī�� (��)
10,500��
���ε��ε� (��)
26,000��
������ī����
9,800��
 */
class Food{
	int cateno;
	String[] poster=new String[4];
	String title;
	double score;
	String addr;
	String tel;
	String type;
	String price;
	String packing;
	String time;
	String menu;
	int goot;
	int soso;
	int bad;
}
/*
 * 
 * 
 */
public class FoodMain {
	Category[] foodCategoryData() throws Exception
	{
		Category[] cate=new Category[12];
		Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
		Elements title=doc.select("div.info_inner_wrap span.title");
		Elements poster=doc.select("ul.list=toplist-slider img");
		Elements sub=doc.select("div.info_inner_wrap p.desc");
		Elements link=doc.select("ul.list=toplist-slider a");
		for(int i=0;i<12;i++)
		{
			Category g=new Category();
			g.cateno=i+1;
			g.title=title.get(i).text();
			g.subTitle=sub.get(i).text();
			g.poster=poster.get(i).attr("data=lazy");
			g.link=link.get(i).attr("href");
			cate[i]=g;
		}
		return cate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
