package ���;

public class ����ó�� {

	public static void main(String[] args) {
		// ������ �� ������ �߻��ؼ� ���α׷��� ���ߴ� ���� ���� ���� ��.
		System.out.println("1. ���� ����Ʈ �� �ž�!!");
		try {
			// ������ �߻��� �� ���� �ڵ带 �־��ش�.
			System.out.println("2. ���� �߻� �ڵ� >> " + 10 / 0);
		} catch (Exception e) {
			// ������ �߻� ���� �� ���α׷��� �ߴ���������, ��� ó���� ������ �ڵ�.
			System.out.println("���� �߻���.");
			System.out.println(e.getMessage());
		}
		System.out.println("3. ���� ���� ����Ʈ�� �ɱ��??");
	}
}
