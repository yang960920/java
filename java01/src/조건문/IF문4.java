package ���ǹ�;

import java.util.Date;

public class IF��4 {

	public static void main(String[] args) {
		//date - ����Ͻú���, jave.util.date
		
		Date date = new Date();
		
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		System.out.println(date.getYear() + 1900);
		System.out.println(date.getMonth() +1);
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		// �±� ���� ��� ���� �׾��� ������
		// ���� �±׸� ������� �ÿ� ����� �������� ���� ���� �±װ� ������ ��� ���� �����.
		int hour = date.getHours();
//		int hour = 15;
		
		if (hour < 11) {
			System.out.println("�¸��");
		} else if (hour < 14){
			System.out.println("�¿����ʹ�");
		} else if (hour < 20){
			System.out.println("���̺��");
		} else {
			System.out.println("�³���");
		}
		
		// date ��ǰ�� �������� ������ ������ �׻� + 1 ���ؾ��Ѵ�.
		int month = date.getMonth() +1 ;
		System.out.println(month);
		switch (month) {
		case 3: case 4: case 5:
			 System.out.println("��");
			break;
		case 6: case 7: case 8:
			 System.out.println("����");
			break;
		case 9: case 10: case 11:
			 System.out.println("����");
			break;
		
		default:
			System.out.println("�ܿ�");
			break;
		}
		
		
		
	}
}
