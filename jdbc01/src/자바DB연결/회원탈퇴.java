package �ڹ�DB����;

import java.util.Scanner;

public class ȸ��Ż�� {

	public static void main(String[] args) {
	
		//�Է��غ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("Ż���� id�� �Է��ϼ���.");
		
		String id = sc.next();
		
		MemberDAO2 dao = new MemberDAO2();
		dao.delete(id);
	}

}