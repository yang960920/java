package �������;

import java.util.Random;
import java.util.Scanner;

public class ������߱���� {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);
		Scanner sc = new Scanner(System.in);
		int data = 0;
		int count = 0; // ī��Ʈ ���� ����!!
		while (true) { // true �� ���� ���ѷ���
			System.out.print("������ ������? ");
			count++; // ��� �õ� �Ҷ����� +1 �� ����
			data = sc.nextInt();
			if (data == target) {
				System.out.println("�����Դϴ�!!");
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println("��ü �õ� Ƚ���� " + count);
				break; // �Ϸᰡ �Ǹ� ����� �ϱ� ������ ���ϴ� ��ġ�� �� break �� �ɾ����!!.
			} else {
				System.out.println("�����Դϴ�!!");
				System.out.println("�ٽ� �õ��غ�����");
				// data �� target ���� ũ�� "�ʹ� Ŀ��!!"
				// data �� target ���� ������ "�ʹ� �۾ƿ�!!"
				if (data>target) {
					System.out.println("�ʹ�Ŀ��!!");
				} else {
					System.out.println("�ʹ� �۾ƿ�!!");
				}
			} 
		}
		sc.close();
		
		
	}

}
