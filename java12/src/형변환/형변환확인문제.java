package ����ȯ;

import java.util.ArrayList;

public class ����ȯȮ�ι��� {

	public static void main(String[] args) {
		
		ArrayList me = new ArrayList();
		
		me.add(1000); // Object < - Integer (��ĳ����) < -(����ڽ�)int
		me.add(189.1); // Object < - Double (��ĳ����) < - double
		me.add(false);	// Object < - Boolean (��ĳ����) < - boolean
		me.add('��');	// Object < - Character (��ĳ����) < - char
		
		// ArrayList �� toString()�� ������ ���ִµ�
		// list ��� ������ ������ list �� ����Ʈ �ϸ� �ּ�!!! �� ����Ʈ
		// toString()�� �������� ������ �ּҰ� ����Ű�� ������ String ���� ������ֵ��� ������
		// list �� ���� �ּҴ�� String���� ���� ������ ���
		
		
		
		System.out.println(me);
		
		
		int money = (Integer)me.get(0); // Object -> Integer (�ٿ�ĳ����) (�����ڽ�)-> int
		System.out.println(money + 2000);
		
		double key = (double)me.get(1); // Object -> double (�ٿ�ĳ����)
		System.out.println(key+10);
		
		boolean food = (boolean)me.get(2);
		if (food) {
			System.out.println("��ҷ���");
		}else {
			System.out.println("����Ŀ�");
		}
		
		char gender = (char)me.get(3);
		
		if (gender == '��') {
			System.out.println("�ֹ� ��ȣ�� 1,3 �̿���");
		}else {
			System.out.println("�ֹ� ��ȣ�� 2,4 ����");
		}
		
	
		
		
	}

}
