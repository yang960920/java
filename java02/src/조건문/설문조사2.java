package ���ǹ�;

import javax.swing.JOptionPane;

public class ��������2 {

	public static void main(String[] args) {
		int ������ = 0;
		int BTS = 0;
		int ������ = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("�����ϴ� ������? 1)������ 2)BTS 3)������");
			switch (data) {
			case "1":
				������++;
				break;
			case "2":
				BTS++;
				break;
			case "3":
				������++;
				break;	
			default:
				JOptionPane.showMessageDialog(null, "1,2,3���߿� �����ϼ���");
				i--;
				break;
			} //switch
		} // for
		System.out.println("�������� �����ϴ� ����� " + ������ + "�� �Դϴ�.");
		System.out.println("BTS�� �����ϴ� ����� " + BTS + "�� �Դϴ�.");
		System.out.println("�������� �����ϴ� ����� " + ������ + "�� �Դϴ�.");
	}

}
