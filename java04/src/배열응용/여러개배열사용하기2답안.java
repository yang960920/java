package �迭����;

public class �������迭����ϱ�2��� {

	public static void main(String[] args) {
		String[] names = { "ȫ�浿", "�̼���", "������", "��ź", "����ũ" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		// 1. 2�б⼺���� ���� �л� ���??
		// 2. 1�б�,2�б� ������ ������ �л� ���?
		int count2 = 0; // 2�б�
		int count12 = 0; // ����
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count12++;
			} else if (term1[i] < term2[i]) {
				count2++;
			} // if
		} // for

		System.out.println(" 2�б⼺���� ���� �л� ���?? " + count2 + "��");
		System.out.println(" 1�б�,2�б� ������ ������ �л� ���?? " + count12 + "��");

		// 3. 2�б� �л� �� ����(100) �� �л��� �̸��� �ε��� ��ȣ��?
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("���� �л��� �ε��� ��ȣ�� " + i);
				System.out.println("���� �л��� �̸��� " + names[i]);
			} // if
		} // for

		// 4. 1�б� ������ ��հ� 2�б� ������ ��� �� ���� �� ���ҳ���??
		int sumTerm1 = 0;
		int sumTerm2 = 0;

		for (int i = 0; i < term2.length; i++) {
			sumTerm1 = sumTerm1 + term1[i];
			sumTerm2 = sumTerm2 + term2[i];
		} // for
		double avgTerm1 = (double) sumTerm1 / term1.length;
		double avgTerm2 = (double) sumTerm2 / term2.length;
		if (avgTerm1 > avgTerm2) {
			System.out.println("1�б� ����� �� ���ҽ��ϴ�.");
		} else if (avgTerm1 < avgTerm2) {
			System.out.println("2�б� ����� �� ���ҽ��ϴ�.");
		} else {
			System.out.println("1�б� 2�б� �����մϴ�.");
		}
		
		// 5. ��ȭ) �������� 1�б� ����, 2�б� ������?
		for (int i = 0; i < term2.length; i++) {
			if(names[i].equals("������")) {
				System.out.println("�������� ��ġ�� " + i);
				System.out.println(	"�������� 1�б� ������ " + term1[i] + 
									", 2�б� ������ " + term2[i]);
			}
		}
	}
}
