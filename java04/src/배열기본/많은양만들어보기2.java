package �迭�⺻;

import java.util.Random;

public class �����縸����2 {

	public static void main(String[] args) {
		int[] jumsu2 = new int[1000];
		int count = 0;
		int sum = 0;
		Random r = new Random();
	
		
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19)+2;
		}
		for (int x : jumsu2) {
			System.out.println(x);
			if (x >= 15) {
				count++; // count ==> ������ ������� 1�� �ö�
				sum = sum + x; // 15�̻� ������ ���Ұ��!
			}
		}
		System.out.println("15�̻��� ������ �� " + count);
		System.out.println("15�̻���  ���� " + sum);
	}

}
