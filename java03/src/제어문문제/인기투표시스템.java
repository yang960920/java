package �������;

import java.util.Scanner;

public class �α���ǥ�ý��� {
	// ���� ��Ű�� ������ �ݺ��� �ȿ� ���� ��� ��� 0���� ���� �ȴ�.
	// ��� �ݺ��� �ۿ� ��� ������ �����ؾ��Ѵ�!!

	public static void main(String[] args) {
		int iu = 0;
		int bts = 0;
		int jin = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�α� ��ǥ �ý���");
		System.out.println("============");
		while (true) {
			System.out.println("1)������ 2)��ź 3)������ 4)����");
			System.out.print("��ȣ ���� >>");
		int choice = sc.nextInt();
		if (choice == 4) {
			System.out.println("�ý����� �����մϴ�.");
			System.out.println("--------------");
			System.out.println("������ " + iu + "ǥ");
			System.out.println("��ź " + bts + "ǥ");
			System.out.println("������ " + jin + "ǥ");
			System.out.println("--------------");
			break;
		} if (choice == 1) {
			iu++;
		} else if (choice == 2){
			bts++;
		} else if (choice == 3) {
			jin++;
		} else {
			System.out.println("���� ��ȣ�Դϴ�.");
			System.out.println("�ٽ� �����ϼ���.");
		}
		} // while ��
		sc.close();
	}

}
