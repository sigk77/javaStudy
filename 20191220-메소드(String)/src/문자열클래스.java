// String : ¹®ÀÚ¿­À» Á¦¾î
/*
 *  java.lang => import¸¦ »ı·«ÇÒ ¼ö ÀÖ´Ù
 *  ¹®ÀÚ¿­À» ÀúÀåÇÏ´Â ¹æ¹ı
 *  	1) String º¯¼ö¸í = "Hello Java";
 *  	2) String º¯¼ö¸í = new String("Hello Java");// °°Àº ¹®ÀÚ¿­ => º°µµ·Î ÀúÀå
 *  					====
 *  					»õ·Î¿î ¸Ş¸ğ¸®¿¡ ÀúÀå
 *  
 *  String¿¡¼­ Á¦°øÇÏ´Â ±â´É
 *  	1) equals : ÀúÀåµÈ ¹®ÀÚ¿­ °°ÀºÁö ¿©ºÎ È®ÀÎ (true/false)
 *  		ID , PWD ==> ·Î±×ÀÎ (´ë¼Ò¹®ÀÚ ±¸ºĞ)
 *  		¹®ÀÚ¿­Àº (==)À» »ç¿ëÇÏ¸é ¾ÈµÈ´Ù 
 *  
 *  		String s="Hello";
 *  		String s1="Hello";
 *  		String s2=new String("Hello")
 *  		if(s==s1) true
 *  		if(s==s2) false
 *  		if(s.equals(s2)) true
 *  
 *  		=> ¿øÇü
 *  			boolean equals(String data)
 *  	2) substring : ¹®ÀÚ¿­À» ÀÚ¸¦ ¶§
 *  		String s="0123456789";
 *  		substring(3) => "3456789"
 *  		String  s="112ºĞ,15¼¼ÀÌ»ó°ü¶÷°¡"
 *  		String(0,3) => "112"
 *  				===
 *  				end-1  == 012
 *  		substring(int start)
 *  		substrign(int start, int end)
 *  		
 *  	3) length : ¹®ÀÚ¿­ °¹¼ö
 *  		String s="Hello È«±æµ¿";
 *  	4) trim
 *  		String s="Hello Java          ";
 *  			=> s.trim).length
 *  	5) startsWith,endsWith
 *  		startsWith("ÀÚ¹Ù")
 *  	6) indexOf,lastIndexOf
 *  		¹®ÀÚÀÇ À§Ä¡(indexOf:¾Õ¿¡¼­,lastIndexOf:µÚ¿¡¼­)
 *  		String s="Hello Java";
 *  				  0123456789
 *  		s.indexOf('a') ==> 7
 *  		s.lastIndexOf('a') ==> 9  aaa.java
 *  	7) split
 *  		String s="ÀÌº´Çå, ÇÏÁ¤¿ì, ¸¶µ¿¼®, ÀüÇıÁø, ¼öÁö";
 *  		ÄŞ¸¶ º°·Î Â©¶ó¼­ ¹è¿­·Î ÀúÀåÇØ ÁÜ
 *  		String[] names=s.split(",")
 *  		Á¤±Ô½Ä
 *  		====
 *  			211.238.142.181
 *  			211.238.142.180
 *  			211.238.142.1
 *  			211.238.142.23
 *  			211.238.142.0
 *  			211.238.1.1
 *  			[0-9]{1,3}\\.[0-9]{1,3}......
 *  	8) toUpperCase,toLowerCase
 *  		´ë¹®ÀÚ º¯È¯         ¼Ò¹®ÀÚº¯È¯
 *  		String s="Hello";
 *  		s.toUpperCase() ==> HELLO
 *  		s.toLowerCase() ==> hello
 *  	9) replace , replaceAll ==> Á¤±Ô½Ä
 *  				 String s="113ºĞ"
 *  				 s.replaceALL("[^0-9]","") ==> 113  (¼ıÀÚ¸¦ Á¦¿ÜÇÑ ³ª¸ÓÁö Áö¿ì±â)
 *  				 s.replaceALL("^[0-9]","")  (¼ıÀÚ·Î ½ÃÀÛÇÏ´Â ´Ü¾î Ã£±â)
 *  				 s.replaceALL("[0-9]$","")  (¼ıÀÚ·Î ³¡³ª´Â ´Ü¾î Ã£±â)
 *  				 s.replaceALL("[^°¡-ÆR]","") ÇÑ±Û»©°í ´Ù »èÁ¦
 *  				 s.replaceALL("[^A-Za-z]","") ¿µ¹®»©°í ´Ù »èÁ¦
 *  				  Â¥+
 *  	   =======
 *  	   º¯°æ ==> String s="Hello Java"
 *  			s.replace('a','b') ==> Hello java
 *  	10) contains() : Æ÷ÇÔµÈ ¹®ÀÚ¸¦ Ã£´Â °æ¿ì 
 */
import java.util.Scanner;
public class ¹®ÀÚ¿­Å¬·¡½º {
	
	static String[] autoComplate(String data)
	{
		String[] ss= {
					"ÀÚ¹Ù¿Í JPS","ÀÚ¹Ù ÇÁ·Î±×·¡¹Ö","½ºÇÁ¸µ 5","AJax¿Í JSP","¸®´ö½º¿Í ¸®¾×Æ®",
					"ÀÚ¹Ù ¿À¶óÅ¬","MVC ±¸Á¶","ÄÚÆ²¸°°ú ¾Èµå·ÎÀÌµå",
					"ÄÚÆ²¸° ÇÁ·Î±×·¥","½ºÇÁ¸µ µ¥ÀÌÅÍ",
					"È¥ÀÚ ¹è¿ì´Â ÀÚ¹Ù","Áö´ÉÇü À¥ ÇÁ·Î±×·¥","À¥ ÇÁ·Î±×·¥","ÀÚ¹Ù À¥ ÇÁ·Î±×·¥",
					"¿À¶óÅ¬ ÀÚ¹Ù"
		};
		String[] findData=new String[10];
		int j=0;
		for(int i=0;i<ss.length;i++)
		{
			//if(ss[i].startsWith(data))    //°Ë»öÇÑ ±ÛÀÚ·Î ½ÃÀÛµÇ´Â °Í Ã£±â
			if(ss[i].contains(data))        //°Ë»öÇÑ ±ÛÀÚ°¡ Æ÷ÇÔµÇ´Â °Í Ã£À½
			{
				findData[j]=ss[i];
				j++;
			}
		}
		return findData;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("°Ë»ö¾î ÀÔ·Â:");
		String data=scan.next();
		
		String[] fd=autoComplate(data);
		for(int i=0;i<fd.length;i++)
		{
			if(fd[i]!=null)
			{
				System.out.println(fd[i]);
			}
		}
		 		
	}

}
