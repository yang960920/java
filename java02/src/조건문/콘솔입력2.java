package ���ǹ�;

import java.util.Scanner;

public class �ܼ��Է�2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("���� ���� ����");
//		System.out.print("���� �̸���? >>");
//		String data = sc.next();
//		System.out.print("���� ���̴�? >>");
//		int data2 = sc.nextInt();
//		System.out.print("���� ��̴�? >>");
//		String data3 = sc.next();
//		System.out.println("�� �̸��� " + data + "�̰� �� ���̴� " + data2 + "�� �̰� �� ��̴� " + data3 + "�̴�.");
		
		System.out.print("�� �̸���?");
		String data = sc.next();
		System.out.print("�� Ű��?");
		double data2 = sc.nextDouble();
		System.out.print("�� �����Դ�?");
		double data3 = sc.nextDouble();
		System.out.print("������ �Ծ�����?");
		Boolean data4 = sc.nextBoolean();
		System.out.print("���� �¿����?");
		sc.nextLine();
		String life = sc.nextLine();
		
		System.out.println(
				"�� �̸��� " + data + "�Դϴ�. �� ���� Ű��" + (data2+11) + " �Դϴ�. "
						+ "�� ���� �����Դ� " + (data3-10) + "�Դϴ�. "
						+"���� ������ " + data4 + "�߽��ϴ�. "
						+"���� �¿���� " + life + " �Դϴ�!!");
		
		sc.close();
	}

}
