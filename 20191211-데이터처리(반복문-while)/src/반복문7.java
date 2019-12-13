import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Scanner;
public class 반복문7 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("검색어 입력:");
		String fd=scan.next();
		
	int k=1;
	while(k<=4)
	{
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20191211&hh=15&rtm=Y&pg=2").get();
        //System.out.println(doc);
		Elements title=doc.select("td.info a.title");
		Elements singer=doc.select("td.info a.artist");
        int i=0;
        while(i<title.size())
        {
        	String data=title.get(i).text();
//        	if(data.contains(fd))
//        	{
        	System.out.println(data);
        	System.out.println(singer.get(i).text());
        	System.out.println("========================");
//        	}
        	i++;
        }
      k++;
	}
   }

}
