package �ֽ������ý���;

import org.jsoup.Connection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ� {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://www.naver.com");
		System.out.println("1 : ��Ʈ��ũ ���� ����."+ con);
		
		Document doc = null; // ���ú��� �ʱ�ȭ ! ��������!!
		try {
			doc = con.get();
			Elements list = doc.select(".nav");//<a class = "nav">
			System.out.println(list.size());
			//System.out.println(list);
			
			for (int i = 0; i < list.size(); i++) {
				Element tag1 = list.get(i); // tag ����
				//System.out.println(tag1);
				String text1 = tag1.text();
				// <a class = "nav"> ����</a> => �±׻����� �ؽ�Ʈ ����
				System.out.println(text1);
				//Ŭ������ nav �� �±׸� �� ������ �ͼ�
				//ArrayList�� ��ӹ��� Elements �� �ڵ����� �־��ش�.
				//[Element, Element, Element(tag)]
			}
		} catch (Exception e) {
			e.printStackTrace();
		} // html �ڵ带 �� ������ �ͼ� doc ������ �־� ����
//		System.out.println(doc);
	}

}
