package �迭����;

public class ��Ʈ�����迭1 {

	public static void main(String[] args) {
		String s = "����,����,����";
		// ��Ʈ���� ����ִ� ���ڿ��� �и���Ű�� ������ split(����)
		// �и��� ����� �迭�� ��.
		String[] s2 = s.split(",");
		System.out.println(s2.length);
		System.out.println(s2[0]);
		String ss ="���� ���� ����";
		String[] s22 = ss.split(" ");
		System.out.println(s22[2]);
		
		String s3 = "         ȫ�浿"; //4
		System.out.println(s3.trim()); // ������ ©����
		String s4 = s3.trim();
		System.out.println(s4.length());
		
		String s5 = s3.replace("   ", "");
		System.out.println(s5.length());
		
		String s6 = "ȫ�浿"; // ������ ���� �ϳ��ϳ��� �и��ϰ� ������ ȫ,��,��
		char[] s7 = s6.toCharArray();
		System.out.println(s7[0]);
		System.out.println(s7[1]);
		System.out.println(s7[2]);
	}

}
