package ����ȯ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class �ݷ���Ȯ�ι��� {

	public static void main(String[] args) {
//		LinkedList list = new LinkedList();
//		list.add("�̱�");
//		list.add("ȫ��");
//		list.add("�Ϻ�");
//		list.add("ü��");
//		list.add("������");
//		for (int i = 0; i <= list.size()+1; i++) {
//			list.remove();
//			System.out.println("���� ���� �Ȱ� ����" + list);
//		}
		HashSet tour = new HashSet();
		tour.add("�Ϻ�");
		tour.add("�ѱ�");
		tour.add("�߱�");
		tour.add("�̰���");
		tour.add("�̱�");
		System.out.println(tour);
		
		
		HashMap home = new HashMap();
		
		home.put("�ȹ�", "TV");
		home.put("�Ž�", "����");
		home.put("�ξ�", "�����");
		home.put("����", "�Ź�");
		System.out.println("2-1 ���� " + home);
		System.out.println("2-2 ���� " + home.get("����"));
		home.put("�Ž�", "å��");
		System.out.println("2-3 ���� "+ home);
		
		ArrayList list2 = new ArrayList();
		
		list2.add("�����ϱ�");
		list2.add("�����̻�å");
		list2.add("��ϱ�");
		list2.add("��Ա�");
		list2.add("���ڱ�");
		
		System.out.println(list2);
		System.out.println("ù��° �� ���� "+list2.get(0) + " ������ �� ���� " + list2.get(list2.size()-1) );
		list2.set(1, "û��");
		System.out.println("3-3�� ���� " + list2);
		
	
		
	}

}
