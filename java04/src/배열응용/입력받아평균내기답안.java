package �迭����;

import javax.swing.JOptionPane;

public class �Է¹޾���ճ����� {

	public static void main(String[] args) {
		// �Է��� ������ ������ �޾Ƽ�
		// ��������� �ְ� ���� �� ==> �迭�� ���!!
		//1. �迭�� ������ּ���.
		int[] jumsu = new int[5];
		
		//�迭�� ���� ���� ���� index�� �ʿ� ==> i�� �ִ� for�� ����ؾ���.
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("���� �Է�");
			//���ڷ� ��ȯ�� ���� �迭�� �ش� �ε����� ������ ����.
			jumsu[i] = Integer.parseInt(data);
		}
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		//jumsu[0] ==> jumsu������ ����ִ� �ּҰ� ����Ű�� 0�� �ε��� ����
		//0???? ==? ��ġ��, �ε���
		
		//1. ��ü �հ豸�ؼ�, ��ձ��غ�����.
		//==> ��� = �հ� / ��ü����
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x; // sum += x;
		}
		System.out.println("��ü�հ�: " + sum);
		double avg = (double)sum / jumsu.length;
		System.out.println("��ü���: " + avg);
		
		//2. 300�̻�Ǵ� ���ڸ� ã�Ƽ�, �հ踦 ���غ�����.
		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if(jumsu[i] >= 300) {
				sum2 = sum2 + jumsu[i];
			}
		}
		System.out.println("300�̻� �Ǵ� �հ�: " + sum2);
		
		//3. ��ȭ����, 300�̻� �Ǵ� ��ġ�� index�� ����Ʈ
		//==> �ش� �ε����� ���� 300�̻����� ���� üũ --> i�� ����Ʈ
		for (int i = 0; i < jumsu.length; i++) {
			if(jumsu[i] >= 300) {
				//Ư���� index�� �ִ� ���� 300�̻��� ��ġ�� ����Ʈ�غ�����.
				System.out.println("300�� ���� ����� �ε��� : " + i);
			}
		}

	}

}
