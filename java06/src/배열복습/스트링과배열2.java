package �迭����;

public class ��Ʈ�����迭2 {

	public static void main(String[] args) {
		// ��Ʈ���� �Ϻθ� ����, Ȯ�λ���ϴ� �޼���
		String s = "���� ���α׷�������";
		String s2 ="��¥!!";
		System.out.println(s+s2);
		System.out.println(s.concat(s2)); // String
		System.out.println(s.charAt(0));
		char c = s.charAt(0); // �ѹ��ڸ� �����ϹǷ� char�� ����
		System.out.println(s.endsWith("��")); // ����� true false �Ƿ� boolean �� ����
		boolean result = s.endsWith("��");
		String result2 = s.substring(3); // �ε��� 3���� ������ ������ �ض�! ==> ���α׷�������
		String result3 = s.substring(3,8); // �ε��� 3���� 7������ ������ �ض�! ==> ���α׷���
		boolean result4 = s.contains(s2); // ����� true false �Ƿ� boolean �� ����
		int index = s.lastIndexOf("��"); // 8��°
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		s= s.replace("��", "��"); // ���ı��Լ� cpu ������ ������
		System.out.println(s);
		
	}

}
