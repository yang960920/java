package ���ǹ�;

import java.util.Scanner;

public class �ܼ��Է�3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("id >> ");
//		String id = sc.next();
//		System.out.print("pw >> ");
//		String pw = sc.next();
//		
//		if (id.equals("root") && pw.equals("1234") ) {
//			System.out.println("�α��� ����~!");
//		} else {
//			System.out.println("�α��� ����!");
//		}
		
		System.out.print("��� ���� ���� >> ");
		int apple = sc.nextInt();
		System.out.print("���  �Ѱ��� ���� >> ");
		int apple1 = sc.nextInt();
		System.out.print("���� ���� ���� >> ");
		int sb = sc.nextInt();
		System.out.print("����  �Ѱ��� ���� >> ");
		int sb1 = sc.nextInt();
		int result = (apple*apple1) + (sb*sb1);
		
		System.out.println("��� ���� ������ " + (apple*apple1) + "�� �Դϴ�.");
		System.out.println("��� ���� ������ " + (sb*sb1) + "�� �Դϴ�.");
		System.out.println("��ü ���� ������ " + result + "�� �Դϴ�.");
		sc.close();

	}

}
