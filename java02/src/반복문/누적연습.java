package �ݺ���;

import javax.swing.JOptionPane;

public class �������� {

	public static void main(String[] args) {
		// iu = iu+1;
		// sum = sun+i
		
		// ���� ����
		int sum = 0; // 0�� �ִ°��� ������ �ʱ�ȭ�� �ݵ�� �ʿ��ϴ�.
		for (int i = 1; i <= 10000; i++) { //500500
			sum = sum + i; // sum�� i�� ���ϰ� �ٽ� sum�� �װ� �����϶�!
//			System.out.println("��������� �� " + sum);
		}
		System.out.println("��ü�� ���� " + sum);
		
		// ���� ����
		String sum2 = ""; // String�� �ʱⰪ�� "" , null �̴�.
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("���� ���� �� �Է�");
			sum2 = sum2 + data +" ";
		}
		System.out.println(sum2);
	}

}
