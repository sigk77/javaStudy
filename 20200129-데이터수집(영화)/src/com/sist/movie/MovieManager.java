package com.sist.movie;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
/*
 * <div class="info_tit">
			<em class="ico_movie ico_15rating">15세이상관람가</em>
		<a href="/moviedb/main?movieId=122091" class="name_movie #title">남산의 부장들</a>
    </div>
    
    
    try
    {
    	for(;;;;)
    	{
    		try
    		{
    		
    		}catch(Exception e){} 증가식
    	}
    }catch(Exception e){}
 */

public class MovieManager {
	public ArrayList<MovieVO> movieListData()
	{
		ArrayList<MovieVO> list=new ArrayList<MovieVO>();
		try
		{
			/*
			 * 	<div class="a">
			 *    <p>aaaa</p>
			 *    <a href="bbb">bbb</a>
			 *  </div>
			 *  
			 *  div.a p  => text()  ========> aaaa
			 *  div.a a	 => attr("href")  ====> bbb
			 *  div.a 	 => text()  ==> aaaa bbb
			 *  			html()  <p>aaaa</p>
			 *  					<a href="bbb">bbb</a>
			 */
			MovieDAO dao=new MovieDAO();
			//for(int i=1;i<=3;i++)
			{
				Document doc=Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get();
				Elements link=doc.select("div.info_tit a"); // a태그가 20개를 모아놓고 시작
				for(int j=0;j<link.size();j++)  // 20번 돌려줌
				{
					try {
					Element elem=link.get(j);
					//System.out.println((i+1)+"-"+elem.attr("href"));
					String mLink="https://movie.daum.net"+elem.attr("href");
					// /moviedb/main?movieId=122091
					Document doc2=Jsoup.connect(mLink).get();
					//System.out.println(doc2);
/*
 * 	private String title;
	private double score;
	private String genre;
	private String regdate;
	private String time;
	private String grade;
	private String director;
	private String actor;
	private String story;
 */
					Element title=doc2.selectFirst("div.subject_movie strong.tit_movie");
					System.out.println(title.text());
					Element score=doc2.selectFirst("div.subject_movie em.emph_grade");
					System.out.println(score.text());
					Element genre=doc2.select("dl.list_movie dd.txt_main").get(0);
					System.out.println(genre.text());
					Element regdate=doc2.select("dl.list_movie dd.txt_main").get(1);  //태크가 동일하면 get(0~
					System.out.println(regdate.text());
					Element time=doc2.select("dl.list_movie dd").get(3);
					System.out.println(time.text());
					
					String temp=time.ownText();
					StringTokenizer st=new StringTokenizer(temp,",");
					String strTime=st.nextToken();
					String strGrade=st.nextToken().trim();
					
					System.out.println(strTime);
					System.out.println(strGrade);
					
					Element director=doc2.select("dl.list_movie dd.type_ellipsis").get(0);
					System.out.println(director.text());
					Element actor=doc2.select("dl.list_movie dd.type_ellipsis").get(1);
					System.out.println(actor.text());
					Element story=doc2.selectFirst("div.desc_movie p");
					System.out.println(story.text());	
					
					MovieVO vo=new MovieVO();
					vo.setTitle(title.text());
					vo.setScore(Double.parseDouble(score.text()));
					vo.setGrade(strGrade);
					vo.setTime(strTime);
					vo.setActor(actor.text());
					vo.setDirector(director.text());
					vo.setGenre(genre.text());
					vo.setRegdate(regdate.text());
					vo.setStory(story.text());
					
					dao.movieInsert(vo);
									
			     	}catch(Exception ex) {}
				}
			}
			System.out.println("DataBase Insert end");
		}catch(Exception ex) {}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieManager m=new MovieManager();
		m.movieListData();
	}

}
