package ���;

public class ����ó��3 {

	public static void main(String[] args) {
		// �Ʒ� �ڵ带 �м��غ��� , ������ ���� ������ �ִ� �ڵ尡
		// ������ �߻����� �� ������ ���ܽ��ѹ�����
		// ���α׷��� �ߴ� ���� �ʵ��� �غ�����!!
		int[] num = new int[3];
		try {
			num[3] = 2; // ������ �߻��� ������ �ִ� �ڵ�!!
		} catch (Exception e) {
			System.out.println("���� �߻� �̸�����!!");
		}
		System.out.println("������ �� �߻�����? " + num.length);
	}
}
