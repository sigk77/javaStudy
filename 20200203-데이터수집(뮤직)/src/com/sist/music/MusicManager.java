package com.sist.music;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
// /watch?v=Nso7yIr8QVM
public class MusicManager {
	public ArrayList<MusicVO> musicAllData()
	{
		ArrayList<MusicVO> list=new ArrayList<MusicVO>();
		try
		{
			/*
			 * 	private String title;
	private String singer;
	private String album;
	private String poster;
	private int idcrement;
	private String state;
	private String key;
			 */
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
			System.out.println(sdf.format(date));
			int rank=1;
			
			MusicDAO dao=new MusicDAO();
			for(int i=1;i<=4;i++)
			{
				try
				{
					Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd="+sdf.format(date)+"&hh=10&rtm=Y&pg="+i).get();
					//System.out.println(doc.toString());
					/*<tr class="list" songid="87752744">
                                <td class="check"><input type="checkbox" class="select-check" title="FRIENDS" /></td>
                                <td class="number">151
                                        
                                    <span class="rank">
                                        
                                            
                                            
                                            
                                                <span class="rank"><span
                                                        class="rank-down">1<span class="hide">�ϰ�</span></span></span>
                                            
                                            
                                        
                                    </span>
                                </td>
                                <td><a href="#" class="cover" onclick="fnViewAlbumLayer('81031556');return false;"><span class="mask"></span><img src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/081/031/556/81031556_1524793395076_1_140x140.JPG" onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" alt="Speak Your Mind (Deluxe)" /></a></td>
                                <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo('87752744');return false;">�� ���� ���� ������</a></td>
                                <td class="info">
                                    
                                    
                                    <a href="#" class="title ellipsis" title="���" onclick="fnPlaySong('87752744','1');return false;">
                   
                                                FRIENDS</a>

                                        <a href="#" class="artist ellipsis" onclick="fnViewArtist('80619304');return false;">Marshmello & Anne-Marie</a>
                                        
                                        <i class="bar">|</i>
                                        <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('81031556');return false;">Speak Your Mind (Deluxe)</a>
                                </td>
					 */
					Elements title=doc.select("tr.list td.info a.title");
					Elements singer=doc.select("tr.list td.info a.artist");
					Elements album=doc.select("tr.list td.info a.albumtitle");
					Elements poster=doc.select("tr.list td a.cover img");
					Elements temp=doc.select("tr.list span.rank");
					
					for(int j=0;j<title.size();j++)
					{
						System.out.println("����:"+rank);
						System.out.println("����:"+title.get(j).text());
						System.out.println("����:"+singer.get(j).text());
						System.out.println("�ٹ�:"+album.get(j).text());
						System.out.println("�̹���:"+poster.get(j).attr("src"));
						//System.out.println("��Ÿ:"+temp.get(j).text());
						String s=temp.get(j).text();
						String ss=s.replaceAll("[^��-�R]","");
						String idcrement="";
						String state="";
						if(ss.equals("���"))
						{
							idcrement=s.replaceAll("[^0-9]", "");
							state=ss;
						}
						else if(ss.equals("�ϰ�"))
						{
							idcrement=s.replaceAll("[^0-9]", ""); // [^0-9] [^A-Za-z] [^��-�R] ^[0-9] '%0%'
							/*
							 *  ip
							 *   => 0~225.0~225.0~225.0~225
							 *      211    238    142   181
							 *      127.0.0.1
							 *      19.
							 *      
							 *      [0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}
							 */
							state=ss;
						}
						else
						{
							idcrement="0";
							state="����";
						}
						System.out.println("����:"+state);
						System.out.println("���氪:"+idcrement);
						//System.out.println("������Ű:"+youtubekeyData(title.get(j).text()));
						// 20�ϰ�
						System.out.println("=====================================");
						MusicVO vo=new MusicVO();
						vo.setRank(rank);
						vo.setTitle(title.get(j).text());
						vo.setSinger(singer.get(j).text());
						vo.setAlbum(album.get(j).text());
						vo.setPoster(poster.get(j).attr("src"));
						vo.setState(state);
						vo.setIdcrement(Integer.parseInt(idcrement));
						vo.setKey(youtubekeyData(title.get(j).text()));
						list.add(vo);
						dao.musicInsert(vo);
						rank++;
					}
//					Elements idcreElements=doc.select("tr.list");
//					Elements state=doc.select("tr.list");			
				}catch(Exception ex) {}
			}
		}catch(Exception ex) {}
		return list;
	}
	public String youtubekeyData(String title)
	{
		String key="";
		try
		{
			/// watch?v=   ����ǥ �����ϹǷ� \\�������� �ΰ� �ֱ�
			Document doc=Jsoup.connect("https://www.youtube.com/results?search_query="+title).get();
			Pattern p=Pattern.compile("/watch\\?v=[^��-�R]+"); // $ ^ \\. \\? \\|
			Matcher m=p.matcher(doc.toString());
			while(m.find())
			{
				String temp=m.group();
				key=temp.substring(temp.indexOf("=")+1,temp.indexOf("\""));
				break;
				//System.out.println(temp);
			}
		}catch(Exception ex) {}
		return key;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicManager m=new MusicManager();
		MusicDAO dao=new MusicDAO();
		ArrayList<MusicVO> list=m.musicAllData();
//		for(MusicVO vo:list)
//		{
//			dao.musicInsert(vo);
//		}
		System.out.println("Oracle Save End");
		//m.youtube...
	}

}
