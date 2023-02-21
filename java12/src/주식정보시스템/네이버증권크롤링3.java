package 주식정보시스템;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링3 {
//크롤링은 인터넷 문서(html)를 다 받아와서,
//html문서를 분석(parser, 파싱!)을 해서 내가 원하는 정보를 추출하는 것.
	public  void naver(String code2) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code2);
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con.get(); // html 코드를 다 가지고온다.
			// Elements 가 jsoup 에선 ArrayList 의 기능을 가지고있다.
			
			//select("a") : tag <a>
			//select(".code") : <a class="code">
			//select("#userId") : <a id="userId">
			Elements codeList = doc.select(".code"); 
//			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println("코드는 " + code);
		
			Elements List = doc.select("span.blind");
//			System.out.println(List.size());
//			System.out.println(List);
			
			
//			System.out.println(List.get(12));
			Element tag2 = List.get(12);
			String today = tag2.text();
			System.out.println("현재가는? "+today);
			
			
			
			
			
			Element tag3 = List.get(16);
			String today2 = tag3.text();
			System.out.println("최고가는? "+today2);
			
			
			
			
			Element tag4 = List.get(20);
			String today3 = tag4.text();
			System.out.println("최저가는? "+today3);
			
			
			
			
			FileWriter file = new FileWriter(code2 + ".txt");
			file.write(code2 + "\n");
			file.write(today + "\n");
			file.write(today2 + "\n");
			file.write(today3 + "\n");
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}