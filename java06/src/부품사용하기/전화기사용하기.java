package ��ǰ����ϱ�;

import ��ǰ�����.��ȭ��;

public class ��ȭ�����ϱ� {

	public static void main(String[] args) {
		// ��ȭ�⸦ ����� ����!! 2���� ������.
		��ȭ�� p1 = new ��ȭ��();
		p1.price = 1000;
		p1.shape = "����";
		p1.���ͳ��ϴ�();
		System.out.println("p1�� ���� : " +p1.price);
		System.out.println("p1�� ��� : " +p1.shape);
		
		��ȭ�� p2 = new ��ȭ��();
		p2.price = 2000;
		p2.shape = "�׸�";
		p2.ī���ϴ�();
		System.out.println("p2�� ���� : " +p2.price);
		System.out.println("p2�� ��� : " +p2.shape);
	}

}
