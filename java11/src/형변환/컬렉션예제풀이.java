package ����ȯ;

import java.util.ArrayList;

public class �÷��ǿ���Ǯ�� {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("�ڽ�Ű");
		list.add("�۽�Ű"); //1
		list.add("�轺Ű");
		list.add("����Ű");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "��: " + list.get(i));
		}
		System.out.println(list.contains("�迬��"));
		System.out.println(list.size());
		
		ArrayList list2 = new ArrayList();
		list2.add("�̽�Ű");
		list2.add("�ڽ�Ű"); 
		list2.add("�罺Ű");
		list.addAll(list2); //�ı����Լ�
		System.out.println(list);
		
		System.out.println(list2.isEmpty()); //false
		list2.clear(); //list ���� ��ü ����!!
		System.out.println(list2);
		
	}

}
