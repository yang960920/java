package 조건문;

import java.util.Scanner;

public class 콘솔입력2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("나에 대한 정보");
//		System.out.print("나의 이름은? >>");
//		String data = sc.next();
//		System.out.print("나의 나이는? >>");
//		int data2 = sc.nextInt();
//		System.out.print("나의 취미는? >>");
//		String data3 = sc.next();
//		System.out.println("내 이름은 " + data + "이고 내 나이는 " + data2 + "살 이고 내 취미는 " + data3 + "이다.");
		
		System.out.print("내 이름은?");
		String data = sc.next();
		System.out.print("내 키는?");
		double data2 = sc.nextDouble();
		System.out.print("내 몸무게는?");
		double data3 = sc.nextDouble();
		System.out.print("저녁을 먹었나요?");
		Boolean data4 = sc.nextBoolean();
		System.out.print("나의 좌우명은?");
		sc.nextLine();
		String life = sc.nextLine();
		
		System.out.println(
				"내 이름은 " + data + "입니다. 내 내년 키는" + (data2+11) + " 입니다. "
						+ "내 내년 몸무게는 " + (data3-10) + "입니다. "
						+"나는 저녁을 " + data4 + "했습니다. "
						+"나의 좌우명은 " + life + " 입니다!!");
		
		sc.close();
	}

}
