package �迭����;

import java.util.Scanner;

public class �������迭����ϱ�3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tour = new String[3];
		String[] tour2 = new String[3];
		int count = 0;
		for (int i = 0; i < tour2.length; i++) {
			System.out.print("�۳⿡ ���� �;��� ����? ");
			tour[i] = sc.next();
		}
		for (int i = 0; i < tour2.length; i++) {
			System.out.print("���ؿ� ���� �;��� ����? ");
			tour2[i] = sc.next();
		} 
		for (int i = 0; i < tour2.length; i++) {
			System.out.println(tour[i]+ " " + tour2[i] );
		}
		for (int i = 0; i < tour2.length; i++) {
			if (tour[i].equals(tour2[i]) ) {
				count++;
			}
		}
		System.out.println("�۳�� ���� ������� ���� ������ ���� " + count + "�� �Դϴ�.");
		
		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("�۳⿡ ���� �;��� ����? ");
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("���ؿ� ���� �;��� ����? ");
//			sc.next();
//		}
		
	}

}
