package ����ȯ;

import java.util.LinkedList;

public class ������������ {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("��ǻ��");
		System.out.println(list);
		
		System.out.println("=========================");
		
		
		for (int i = 0; i <= list.size(); i++) {
			list.remove();
			System.out.println((i+1)+"���� ���躻 �� ���� ������" + list);
		}
	}

}
