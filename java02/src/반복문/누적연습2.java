package �ݺ���;

import javax.swing.JOptionPane;

public class ��������2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 5; i <= 300; i++) {
			if (i%5==0 ) {
				sum = sum + i;
			}
		}
		System.out.println("��ü ���� ���� "+ sum);
		
		String sum2 = "";
		for (int i = 0; i < 4; i++) {
			String data = JOptionPane.showInputDialog("�԰� ���� ���� �Է�");
			sum2 = sum2 + data + "�� ";
		}
		System.out.println("�԰� ���� ������ " + sum2);
	}

}
