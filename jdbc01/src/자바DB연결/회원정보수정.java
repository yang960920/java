package �ڹ�DB����;

import java.util.Scanner;

public class ȸ���������� {

	public static void main(String[] args) {
	
		//�Է��غ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("id/tel������ �Է��ϼ���.");
		
		String id = sc.next();
		String tel = sc.next();
		
		MemberDAO2 dao = new MemberDAO2();
		dao.update(id, tel);
	}

}