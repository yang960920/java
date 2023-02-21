package 주식정보시스템;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 멀티캠퍼스주식크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=067280");
		
		Document doc = null;
		try {
			doc = con.get();
			
			Elements codeList = doc.select(".code"); 
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println("코드는 " + code);
		
			Elements List = doc.select("span.blind");
			System.out.println(List.size());
			System.out.println(List);
			for (int i = 0; i < List.size(); i++) {
				System.out.println(i + " :" + List.get(i));
			}
			
			
			System.out.println(List.get(12));
			Element tag2 = List.get(12);
			String today = tag2.text();
			System.out.println("멀티 캠퍼스의 현재가는? "+today);
			
			
			
			
			
			Element tag3 = List.get(16);
			String today2 = tag3.text();
			System.out.println("멀티 캠퍼스의 최고가는? "+today2);
			
			
			
			
			Element tag4 = List.get(20);
			String today3 = tag4.text();
			System.out.println("멀티 캠퍼스의 최저가는? "+today3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
