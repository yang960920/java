package ���ǹ�;

import javax.swing.JOptionPane;

public class �������� {

	public static void main(String[] args) {
		int full = 0;
		int nofull = 0;
		
		for (int i = 0; i < 10; i++) {
		String data = JOptionPane.showInputDialog("��θ���? 1)��θ� 2)�ȹ�θ�");
		if (data.equals("1")) {
//			full = full + 1 ; �̰Ͱ� full++ �� �Ȱ��� ������
//			full �� 1�� ���ض� ��� �ڵ�
//			Ȥ�� 2 �� �����ϰ� �ʹٸ� ���� full = full +2 ; �� �����ϴ�!!!
			full++;
		} else if (data.equals("2")){
			nofull++;
			} //else �������ڸ�
		} // for ������ �ڸ�
		System.out.println("��θ� ��� ���? " + full + "��");
		System.out.println("�ȹ�θ� ��� ���? " + nofull + "��");
	}

}
