package ����;

public class ���ǹ� {

	public static void main(String[] args) {
		
		int target = 77; // ���ڸ��߱⸦ �غ��ô�.
		int me = 77; // ���� ���� 88
		
		// ������ ���ϴ� �ڵ尡 ��.
		// ����� ������ ���� (true / false)
		if (target == me) { // ������ true �̸�
			System.out.println("�����Դϴ�.");
			
		} else { // ������ ���ǵ��� ��� false
			System.out.println("�����Դϴ�!");
		}
		// if ���� ��ü break ����� �ִ�
		// ������ ������ �� ��ü������ ����

		
		// String target2 = "�ζ�";
		String you = "�ų�";
		switch (you) { // switch ���� ��ü ���� ����� �����Ƿ� ���ϴ� ��ġ�� break �� �ؾ���!
		case "�ζ�":
			System.out.println("�����̴�!!!");
			break;
		case "�ų�": case "����": case "������":
			System.out.println("�����̴�!!!");
			break;
		// default �� ���� ������ �� �ƴҶ� �����
		// �ʿ� ������ ������ ����!!
		default:
			System.out.println("����!!");
			break;
		}
		
	}

}
