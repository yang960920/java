package �ֽ������ý���;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ� {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://comic.naver.com/index");
		
		Document doc = null; //���ú��� �ʱ�ȭ! ��������!
		try {
			doc = con.get();
			Elements list = doc.select(".menu a"); //<a class="nav">
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(tag.text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} //html�ڵ带 �� ������ �ͼ� doc������ �־����.
	}
}