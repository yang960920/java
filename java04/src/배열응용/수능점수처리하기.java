package �迭����;

import java.util.Random;

public class ��������ó���ϱ� {

	public static void main(String[] args) {
		int[] jumsu = new int[10000];
		int count = 0;
		int count2 = 0;	
		
		Random r = new Random(42);
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451);
			if (jumsu[i] == 450) {
				count++;
			} else if (jumsu[i] == 0) {
				count2++;
			}
		}
		for (int x : jumsu) {
			System.out.println(x);
		}
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x;
		}
		double avg = (double)sum/jumsu.length;

		int avgPlusMinus =0; // ����! �Ҷ� �ڹٴ� ������ �ݵ�� ���������Ѵ�!!
		// 250 <= avg <= 350, avg �� 300�� ��� �� ������ �Ұ�����
		// avg-50 <= x <= avg+50 �� ���ؾ���
		// == >avg-50 <= x && x <= avg+50
		for (int x : jumsu) {
			if ((avg-50 <= x) && (x <= avg+50)) {
				avgPlusMinus++;
			}
		}
		// ������ ���� 30%�� ����� ���ϱ�
		
		System.out.println("���� ������ ������ ���� " + count + "�� �̴�.");
		System.out.println("���� ������ ������ ���� " + count2 + "�� �̴�.");
		System.out.println("���� ������ ����� " + avg);
		System.out.println("��� ���� -+ 50���� �л��� ���� " +avgPlusMinus+ "�� �̴�.");
	}

}
