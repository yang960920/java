package �ֽ������ý���;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ�2 {
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
		
			Elements List = doc.select("span.blind");
			System.out.println(List.size());
			System.out.println(List);
			for (int i = 0; i < List.size(); i++) {
				System.out.println(i + " :" + List.get(i));
			}
			
			
			System.out.println(List.get(12));
			Element tag2 = List.get(12);
			String today = tag2.text();
			System.out.println("���簡��? "+today);
			
			
			
			
			
			Element tag3 = List.get(16);
			String today2 = tag3.text();
			System.out.println("�ְ���? "+today2);
			
			
			
			
			Element tag4 = List.get(20);
			String today3 = tag4.text();
			System.out.println("��������? "+today3);
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}