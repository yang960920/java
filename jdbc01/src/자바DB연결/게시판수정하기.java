package �ڹ�DB����;

import java.util.Scanner;

public class �Խ��Ǽ����ϱ� {

	public static void main(String[] args) {
	
		//�Է��غ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("no/content������ �Է��ϼ���.");
		
		int NO = sc.nextInt();
		String content = sc.next();
		
		BBSDAO dao = new BBSDAO();
		dao.update(NO, content);
	}

}