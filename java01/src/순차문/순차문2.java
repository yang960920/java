package ������;

// ��ǰ�� �ִ� ��ġ�� �˷��ִ� ����
import javax.swing.JOptionPane;

public class ������2 {

	public static void main(String[] args) {
		// �⺻ ������ == �Է� --> ó�� --> ���
		// �Է� -> ��ǰ��� , ��ġ���� ������ �ٷ� ����Ҽ��ִ°�!! ����غ���!
		// ���̾� �α� ������ �Է��� ���� ��ǻ�ʹ� ������ String���� �ν�!!
		String data1 = JOptionPane.showInputDialog("������ �Է��Ͻÿ�-1");
		String data2 = JOptionPane.showInputDialog("������ �Է��Ͻÿ�-2");
		
		// ó�� -> ���� ���ϱ� ���� (+�������̿�)
		// String ���� int �� �������־����
		int data11 = Integer.parseInt(data1); // ���ڸ� ������ �ٲٴ� ����  "200" => 200
		int data22 = Integer.parseInt(data2); // Ÿ���� �ٲ� ������ ����(int)�� �Է�
		
		double data33 = Double.parseDouble(data1);
		double data44 = Double.parseDouble(data2);
		
		int result = data11 + data22; // ����� ���� �̱� ������ int
		double result2 = data33 + data44; // ����� �Ǽ� �̱� ������ double
		
		// ��� -> ����� ȭ�鿡 ���̰� ����.
		System.out.println(result);
		System.out.println(result2);

	}

}
