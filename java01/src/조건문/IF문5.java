package ���ǹ�;

public class IF��5 {

	public static void main(String[] args) {
		String ssn = "2055111"; // �ֹ� ��ȣ ���ڸ�!
				
				//String �� �⺻�� �����Ͱ� �ƴϿ��� ��ɾ�(�Լ�)�� ����ؾ���.
				// ��ɾ�� .equals() �̴�
				if (ssn.equals("2055111")) {
					System.out.println("������ �������� �¾�̱���!!");
				} else {
					System.out.println("������ �������� �¾�Ű� �ƴϱ���!!!");
				}
				
		char gender = ssn.charAt(0); // ù��° �ڸ��� �ִ� ���� �ϳ� ����
		switch (gender) {
		case '1': case '3':
			System.out.println("���ڽñ���!");
			break;
		case '2': case '4':
			System.out.println("���ڽñ���!");
			break;
		}
	
	}
}
