package ����ȯ;

import java.util.ArrayList;

public class �÷����׽�Ʈ {

	public static void main(String[] args) {
		// ���� ���� �����͸� �ٷ�� ��ǰ���� �ݷ��� (collection)
		// ==> ������ ����
		// ==> ���� ���� �����͵鵵 Ư¡�� �ְ� , �� Ư¡�� ����
		//	       �ݷ����� ������ ����
		// ==> �迭 + ������ ���� + Ÿ�� �ƹ��ų� ���� �� �ִ� ArrayList
		
		ArrayList list = new ArrayList();
		list.add("ȫ�浿");
		list.add(100);
		list.add(11.2);
		list.add(true);
		// toString() �����ǵ��־ ����Ű�� ������ ����Ʈ �ǰ� �ȴ�.
		
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		// �߰��� ���Ե� ����
		list.add(0, "��浿");
		System.out.println(list.get(0));
		
		list.remove(0); // == > �ı�? ���ı�? --- �ı��Լ�
		// �ı��Լ� : ������ �ı����ѹ����� �Լ� (������ ����, RAM�� �ִ� �����Ͱ� �����)
		// ���ı��Լ� : ������ �ı������ʴ� �Լ� (Ram�� �ִ� �����Ͱ� ������ ����)
		
		
		System.out.println(list.get(0));
		
		//����
		list.set(0, "���浿"); // -- �ı��Լ�
		System.out.println(list);
		
		
		// index �� ��ġ Ȯ���� ���� �Լ�
		int list2 = list.indexOf(true);
		System.out.println(list2);
		
		//���Կ��� Ȯ��
		boolean result = list.contains(11.2);
		System.out.println(result);
	}

}
