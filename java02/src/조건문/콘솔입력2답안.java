package ���ǹ�;

import java.util.Scanner;

public class �ܼ��Է�2��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� >> ");
		String name = sc.next();
		System.out.print("���� �Է�>> ");
		int age = sc.nextInt();
		System.out.print("Ű �Է�>> ");
		double height = sc.nextDouble();
		System.out.print("������ �Է�>> ");
		double weight = sc.nextDouble();
		System.out.print("������ �Ծ�����(true/false)>> ");
		boolean food = sc.nextBoolean();
		System.out.print("������ ��ǥ�� ");
		sc.nextLine();
		String life = sc.nextLine();
		
		System.out.println("=====================");
		System.out.println("�� �̸��� "+ name);
		System.out.println("�� ���� ���̴� "+ (age+1));
		System.out.println("�� ���� Ű�� "+ (height+10));
		System.out.println("�� ���� �����Դ� "+ (weight-10));
		if (food) {
			System.out.println("�谡 �θ��ðڱ���");
		}else {
			System.out.println("�谡 �����ðڱ���");
		}
		System.out.println("������ ��ǥ�� " + life);
		sc.close();
	}

}
