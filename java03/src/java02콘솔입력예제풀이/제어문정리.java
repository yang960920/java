package java02�ܼ��Է¿���Ǯ��;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ������� {

	public static void main(String[] args) {
//		Scanner������ּ���.!
//		1.id�� pw�� �Է��ؼ� id�� root�̰�, pw�� 1234�̸� �α��� ����!
//		  �ƴϸ� �α��� ����!
//		  ==> String�� ==�� �Ұ���. equals() ���ؾ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("id�Է�>> ");
		String id = sc.next(); //String�Է�
		System.out.print("pw�Է�>> ");
		String pw = sc.next(); //String�Է�
		//������ �������� ��� ==> ��������(����1 && ����2), ||
		if (id.equals("root") && pw.equals("1234") ) {
			JOptionPane.showMessageDialog(null, "�α��� ����");
		} else {
			JOptionPane.showMessageDialog(null, "�α��� ����");
		}
		
//		2. ��� ���� ����, ��� �� ���� �����Է�
//		   ���� ���� ����, ���� �� ���� �����Է�
//		   ������ ���� ���
//		   ��� ���� ������ 5500���Դϴ�.
//		   �� ���� ������ 4500���Դϴ�.
//		   ��ü ���� ������ 10000���Դϴ�.
//		System.out.print("��� ���� ����>> ");
//		int aCount = sc.nextInt(); //String --> int
//		System.out.print("��� �� ���� �����Է�>> ");
//		int aPrice = sc.nextInt(); //String --> int
//		System.out.print("���� ���� ����>> ");
//		int bCount = sc.nextInt(); //String --> int
//		System.out.print("���� �� ���� �����Է�>> ");
//		int bPrice = sc.nextInt(); //String --> int
//		
//		int aTotal = aCount * aPrice;
//		int bTotal = bCount * bPrice;
//		int total = aTotal + bTotal;
//		
//		System.out.println("��� ���� �ݾ��� " + aTotal + "��");
//		System.out.println("���� ���� �ݾ��� " + bTotal + "��");
//		System.out.println("��ü ���� �ݾ��� " + total + "��");
		
		
//		3. ��ȭ����
//		   - ���۰�, ���ᰪ �Է�
//		   ���۰����� ���ᰪ���� ��� ���ؼ� ���
//		System.out.print("���۰� >> ");
//		int start = sc.nextInt();
//		System.out.print("���ᰪ>> ");
//		int end = sc.nextInt();
//		
//		int sum = 0;
//		for (int i = start; i <= end; i++) {
//			sum = sum + i;
//		}
//		System.out.println("���� ���� ���� " + sum);
		
//		4. ��ȭ����
//		   - ���۰�, ���ᰪ, ������ �Է�
//		     ���۰����� ���ᰪ���� ��������ŭ �����ϸ鼭 ����. ���� ���� ���
//		     ���� ���� 100�� ������ ���α׷� ����
//		System.out.print("���۰�>> ");
//		int start = sc.nextInt();
//		System.out.print("���ᰪ>> ");
//		int end = sc.nextInt();
//		System.out.print("������>> ");
//		int jump = sc.nextInt();
//		
//		int sum = 0;
//		for (int i = start; i < end; i = i+jump) {
//			sum = sum + i;
//			if (sum >= 100) {
//				System.exit(0);
//			}
//		}
//		System.out.println("���� ���� ���� " + sum);
		sc.close();
	}

}
