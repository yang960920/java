package ������;

// ��ǰ�� �ִ� ��ġ�� �˷��ִ� ����
import javax.swing.JOptionPane;

public class ������1 {

	public static void main(String[] args) {
		// �⺻ ������ == �Է� --> ó�� --> ���
		// �Է� -> ��ǰ��� , ��ġ���� ������ �ٷ� ����Ҽ��ִ°�!! ����غ���!
		String data1 = JOptionPane.showInputDialog("����� ��̴�?");
		String data2 = JOptionPane.showInputDialog("�����Ͻó���?");
		
		// ó�� -> ���ڿ��� (+�������̿�)
		// �������� �����Ͱ� �ϳ��� String �̸� ����� ������ String
		String result = data1 + " " + data2; // ����� String �̱� ������
		
		// ��� -> ����� ȭ�鿡 ���̰� ����.
		System.out.println(result);

	}

}
