package �ڹ�DB����;

import java.util.Scanner;

public class �Խ��Ǳ۾��� {

	public static void main(String[] args) {
		
		// �Է��غ���
		Scanner sc = new Scanner(System.in);
		System.out.println("NO / title / content / writer ������� �Է��Ͻÿ�.");
		int NO = sc.nextInt();
		String title = sc.next();
		String content = sc.next();
		String writer = sc.next();
		BBSDAO dao = new BBSDAO();
		dao.insert(NO,title,content,writer);
	}

}
