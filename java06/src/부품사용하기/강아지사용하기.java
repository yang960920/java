package ��ǰ����ϱ�;

import ��ǰ�����.������;

public class ����������ϱ� {

	public static void main(String[] args) {
		// ��ȭ�⸦ ����� ����!! 2���� ������.
		������ d1 = new ������();
		d1.species = "goldenretriever";
		d1.size = "Big";
		d1.���ٵ��();
		System.out.println("d1�� �� : " +d1.species);
		System.out.println("d1�� ũ�� : " +d1.size);
		
		������ d2 = new ������();
		d2.species = "Pomeranian";
		d2.size = "Small";
		d2.�������ִ�();
		System.out.println("d2�� �� : " +d2.species);
		System.out.println("d2�� ũ�� : " +d2.size );
	}

}
