package �ڹ�DB����;

import java.util.Scanner;

public class �Խ��Ǳۻ����ϱ� {

	public static void main(String[] args) {
	
		//�Է��غ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("Ż���� NO�� �Է��ϼ���.");
		
		int NO = sc.nextInt();
		
		BBSDAO dao = new BBSDAO();
		dao.delete(NO);
	}

}