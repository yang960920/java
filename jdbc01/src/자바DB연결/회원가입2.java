package �ڹ�DB����;

import java.util.Scanner;

public class ȸ������2 {

	public static void main(String[] args) {
		
		// �Է��غ���
		Scanner sc = new Scanner(System.in);
		System.out.println("id / pw / name / tel ������� �Է��Ͻÿ�.");
		String id = sc.next();
		String pw = sc.next();
		String name = sc.next();
		String tel = sc.next();
		MemberDAO2 dao = new MemberDAO2();
		dao.insert(id,pw,name,tel);
	}

}
