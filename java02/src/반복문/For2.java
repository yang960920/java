package �ݺ���;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		for (; ;) {// ���� ���� (�ݺ�) ���� ��ǰ���δ� while(true)�� �ִ�.
			System.out.println("�߾��� ����");
			String data = JOptionPane.showInputDialog("�����ұ��? y�� �Է�");
					// �����ڴ� �⺻ �����͸� �� ����
					// String ��ǰ�� �ٸ� ����� ����� �����־����
					// ������.equals()
					if (data.equals("y")) {
						System.out.println("�ȳ���������!!!");
						break;
						// if�� ��ü ���� ����� �����Ƿ�
						// �ش� break �� for�� ���� ��ǰ�̴�!
					} 
		}
	}

}
