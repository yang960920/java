package ���ǹ�;

import java.util.Scanner;

public class �ܼ��Է�1 {

	public static void main(String[] args) {
		// Scanner ��ǰ ���
		// �ֿܼ��� �ڹ� ������ ������ �������� ��ǰ�̴�.
		// �ڹ� �������� �ַܼδ� ���� ���� ��θ� ���� (=stream)�̶�� �θ���
		// �������θ� �帧.
		Scanner sc = new Scanner(System.in); // system.in �� ��ǻ�Ϳ��� Ű����� �Է¹ްڴ�.
		// Stream�� ���� �ݾ����������� ��� ������ �ְԵ�.
		// Stream�� �ݵ�� �ݾ�����
		
		System.out.print("���� �Է� : ���� 1) �ָ� 2)");
		int data = sc.nextInt(); // String�� Int �� �ٲ��ִ� ����� �Ѵ�.
		if (data == 1) {
			System.out.println("������ ������");
		} else {
			System.out.println("ǫ ����~");
		}
		
		System.out.print("�ָ��� ���ұ� ?");
		String data2 = sc.next(); //�ܾ� ���ڿ��̹Ƿ� String
		System.out.println("���� �ָ��� "+data2+ "�� �Ұž�. ");
		
		
		sc.close();

	}

}
