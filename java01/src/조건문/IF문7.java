package ���ǹ�;

import javax.swing.JOptionPane;

public class IF��7 {

	public static void main(String[] args) {
		String ssn = "pass";
		if (ssn.equals("pass")) {
			System.out.println("��������");
		} else {
			System.out.println("��������");
		}
		
		String ssn1 = "���";
				if (ssn1.equals("�����")) {
					System.out.println("�߱������ΰ�����");
				} else if (ssn1.equals("���")){
					System.out.println("�н������ΰ�����");
				} else if (ssn1.equals("ȸ")) {
					System.out.println("Ƚ�����ΰ�����");
				} else {
					System.out.println("�׳� �ȸԾ��");
				}
		String d1 = JOptionPane.showInputDialog("������ �Է��Ͻÿ� -1");
		String d2 = JOptionPane.showInputDialog("������ �Է��Ͻÿ� -2");
		
		// String ������ = JOptionPane.showInputDialog ("������")
		// ��ȣ ���� ���� ���� �׸��� String �� �±��� ���
		// ������ �ν��ؾ� �ϹǷ� int ������2 = Integer.parseInt(������) �� �ݵ�� �ʿ�
		int d11 = Integer.parseInt(d1);
		int d22 = Integer.parseInt(d2);
		
		if (d11 > d22) {
			System.out.println(d11 + "�� �� Ů�ϴ�");
		} else if (d11 < d22){
			System.out.println(d22 + "�� �� Ů�ϴ�");
		} else {
			System.out.println("�� ���� �����ϴ�");
		}
		
		String no = "A100EX";
				
			char num = no.charAt(0);
//		if (num == 'A') {
//			System.out.println("��ȹ��");
//		} else if (num == 'B'){
//			System.out.println("�ѹ���");
//		} else if (num == 'C'){
//			System.out.println("���ߺ�");
//		} else {
//			System.out.println("�ش�μ�����");
//		}
		switch (num) {
		case 'A':
			System.out.println("��ȹ��");
			break;
		case 'B':
			System.out.println("�ѹ���");
		case 'C':
			System.out.println("���ߺ�");
		default:
			System.out.println("�ش�μ�����");
			break;
		}
	}
}