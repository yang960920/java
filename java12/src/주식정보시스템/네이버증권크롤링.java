package �ֽ������ý���;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ� {
//ũ�Ѹ��� ���ͳ� ����(html)�� �� �޾ƿͼ�,
//html������ �м�(parser, �Ľ�!)�� �ؼ� ���� ���ϴ� ������ �����ϴ� ��.
	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		
		Document doc = null; //���ú��� �ʱ�ȭ! ��������!
		try {
			doc = con.get(); // html �ڵ带 �� ������´�.
			// Elements �� jsoup ���� ArrayList �� ����� �������ִ�.
			
			
			
			//select("a") : tag <a>
			//select(".code") : <a class="code">
			//select("#userId") : <a id="userId">
			Elements codeList = doc.select(".code"); 
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println("�ڵ�� " + code);
			
			//sptxt sp_txt9
			Elements textList = doc.select(".sptxt.sp_txt9"); 
			System.out.println(textList.size());
			
			Element tag2 = textList.get(0);
			String text1 = tag2.text();
			System.out.println("text1 " + text1);
			
			//sptxt.sp_txt10 ==> [tag,tag,tag ..] (ArrayList)
			Elements textList2 = doc.select(".sptxt.sp_txt10"); 
			System.out.println(textList2.size());
			
			Element tag3 = textList2.get(0);
			String text2 = tag3.text();
			System.out.println("text2 " + text2);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}