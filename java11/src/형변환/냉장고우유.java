package ����ȯ;

import java.util.LinkedList;

public class �������� {

	public static void main(String[] args) {
		// Queue ����� , ���� ���� ���(element) �� ���� ���� (delete).
		LinkedList milk = new LinkedList();
		
		milk.add("���� ���� ����");
		milk.add("���� �̽��� ����");
		milk.add("���� �� �̽��� ����");
		
		for (int i = 0; i < milk.size(); i++) {
			milk.remove();
			System.out.println(milk);
		}
	
	
	}

}
