package �迭;
public class �迭�ٷ�⿹�� {
	//�ڵ� ���� ==> ��Ʈ�� + ����Ʈ + f
	public static void main(String[] args) {
		int[] x = new int[10]; // legnth: 10
		// index�� 0���� ����, ������ ��ġ�� �ε����� 10���� ����.
		// 0~9
		System.out.println(x.length);
		x[0] = 10;
		x[1] = 20;
		for (int i = 0; i < 10; i++) {
			System.out.print(x[i] + " ");
		}
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
		System.out.println();
		// �츮������ ������ char[]�� ����, ����Ʈ
		char[] gender = { '��', '��', '��', '��' };
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		// �츮������ �̸��� String[]�� ����, ����Ʈ
		String[] names = { "ȫ�浿", "��浿", "ȫ���", "ȫ����" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		// �츮������ �÷��� double[]�� ����, ����Ʈ
		double[] eyes = { 1.0, 0.5, 0.9, 1.5 };
		for (int i = 0; i < eyes.length; i++) {
			System.out.print(eyes[i] + " ");
		}
		System.out.println();
		// �츮������ ������ �Ծ����� boolean[]�� ����, ����Ʈ
		boolean[] food = { true, true, false, true };
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		
		String[] s = new String[3];
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
}