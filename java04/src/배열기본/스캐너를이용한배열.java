package �迭�⺻;

import java.util.Scanner;

public class ��ĳ�ʸ��̿��ѹ迭 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] jumsu = new int[5];
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("������ �Է�>> ");
			jumsu[i]= sc.nextInt();
		}
		System.out.println("ù��° ���� ����° ���� ���� " + (jumsu[0]+jumsu[2]));
		
		System.out.println();
		String[] data = new String[3];
		for (int i = 0; i < data.length; i++) {
			System.out.print("����ϴ� ����? ");
			data[i] = sc.next();
		}
		System.out.println(data[0] + " ���ٴ� " + data[1]);
		sc.close();
	}

}
