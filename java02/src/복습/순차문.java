package ����;

//JOptionpane�� javax ���� �Ʒ� swing ���� �Ʒ��� ������ �˷���.
//��ġ�� �˷��ִ� ���� (import ~~)
import javax.swing.JOptionPane;

public class ������ {

	public static void main(String[] args) {
		// �Է� --> ó�� --> ���
		// �ΰ��� ���ڸ� �Է��� �޾Ƽ� ó���ؼ� ���
		// ���α׷����� ������ ġ�� ���� ��� �� String ���� ��� (���ڿ�)
		// RAM �� ���� ������ ����� ���� == > ����
		// ���� �Ҷ� RAM�� ��������� ������ ���������.
		// ������Ÿ��  ������
		// �Է�!!
		String b1 = JOptionPane.showInputDialog("���ڸ� �Է�-1");
		String b2 = JOptionPane.showInputDialog("���ڸ� �Է�-2");
		
		// ó�� !!
		// ������ �ٲپ ó���� �ϰ�ʹ�
		// ���α׷��Ӱ� ������ �ٲٴ� ��ǰ�� �Ἥ ó���ؾ���
		// Integer.parseInt(������);
		// ���� ó���� ���� RAM �� ��������� �ϹǷ�
		// int ������2 = Integer.parseInt(������);
		int b11 = Integer.parseInt(b1);
		int b22 = Integer.parseInt(b2);
		
		// ���
		// �ڹپ��� ������ ������ ���� ����� ������ �����θ� ���´�!!
		// �Ҽ����� �������� ����� �Ҽ����� �ڸ� ������ ���´�
		// �ڹپ��� �ϳ��� �Ǽ��� ó���� ���ָ� ����� ������ �Ǽ�!!
//		System.out.println((double)b11/b22);
		System.out.printf("%.3f",(double)b11/b22);
		// �ֿܼ� �������� ������ �������
		// System.out.printf("%.���ϴ��ڸ���f",������/������);
		// f �� �Ǽ��̱� ������ ���°�!
		
	}

}
