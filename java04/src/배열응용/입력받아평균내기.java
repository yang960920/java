package �迭����;

import javax.swing.JOptionPane;

public class �Է¹޾���ճ��� {

	public static void main(String[] args) {
		// �Է��� ������ ������ �޾Ƽ�
		// ��������� �ְ� ���� �� == > �迭�� �������
		// 1. �迭�� ������ּ���.
		int[] jumsu = new int[5]; // [�ε���] ��ŭ �Է��� �޾ƺ���
		int sum = 0;
		int sum1 = 0;
		
		// �迭�� ���� �������� index �� �ʿ� == > i �� �ִ� for�� ����ؾ���
		// �Էµ� ���� �����Ƿ� ������ for-each �� ��� �Ұ�
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("���ڸ� �Է����ּ���.");
			// data �� ������ �ƴϹǷ� ������ �ٲ� �־����
			// ���ڷ� ��ȯ��  ���� �迭�� �ش� �ε����� ������ �־���Ѵ�.
			jumsu[i] = Integer.parseInt(data); 
		} 
		
		for (int x : jumsu) {
			System.out.print(x + " ");
			sum = sum + x ;
			if (x >= 300) {
				sum1 = sum1 + x; // sum+= x; ���� �ڵ�
				
			}
		}
		System.out.println();
		System.out.println("��ü�� �հ�� " + sum);
		System.out.println("��ü�� ����� " + (sum/5));
		// ��ճ��� �� ���� �ڵ�
		// ==>double avg = (double)sum / jumsu.length;
		// 		System.out.println("��ü�� ����� " + avg);
		System.out.println("300�̻� ������ ���� " + sum1);
		
	}

}
