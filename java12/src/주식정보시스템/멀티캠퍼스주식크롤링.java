package �ֽ������ý���;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ��Ƽķ�۽��ֽ�ũ�Ѹ� {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=067280");
		
		Document doc = null;
		try {
			doc = con.get();
			
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
			System.out.println("��Ƽ ķ�۽��� ���簡��? "+today);
			
			
			
			
			
			Element tag3 = List.get(16);
			String today2 = tag3.text();
			System.out.println("��Ƽ ķ�۽��� �ְ���? "+today2);
			
			
			
			
			Element tag4 = List.get(20);
			String today3 = tag4.text();
			System.out.println("��Ƽ ķ�۽��� ��������? "+today3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
