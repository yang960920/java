package �迭��ȭ;

public class �迭��������2 {

	public static void main(String[] args) {
		String ����� [] = {"����","����","����","��ǻ��","ȸȭ"};
		int[] jumsu1 = {44,66,22,99,100};
		int[] jumsu2 = jumsu1.clone();
		int count = 0;
		int count2 = 0;
		System.out.println(jumsu1 == jumsu2);
		jumsu2[0] = 22;
		jumsu2[2] = 88;
		
		for (int i = 0; i < jumsu2.length; i++) {
			System.out.print(jumsu1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < jumsu2.length; i++) {
			System.out.print(jumsu2[i] + " ");
		}
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu1[i] == jumsu2[i]) {
				count++;
			}else if (jumsu1[i] < jumsu2[i]) {
				count2++;
				System.out.println();
				System.out.println("������ ���� ������? " + �����[i]);
			}
		}
		System.out.println();
		System.out.println("������ ���� ���� " + count);
		System.out.println("����� ���� ���� " + count2);
	}

}
