package 조건문;

import java.util.Scanner;

public class 콘솔입력3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("id >> ");
//		String id = sc.next();
//		System.out.print("pw >> ");
//		String pw = sc.next();
//		
//		if (id.equals("root") && pw.equals("1234") ) {
//			System.out.println("로그인 성공~!");
//		} else {
//			System.out.println("로그인 실패!");
//		}
		
		System.out.print("사과 구매 갯수 >> ");
		int apple = sc.nextInt();
		System.out.print("사과  한개당 가격 >> ");
		int apple1 = sc.nextInt();
		System.out.print("딸기 구매 갯수 >> ");
		int sb = sc.nextInt();
		System.out.print("딸기  한개당 가격 >> ");
		int sb1 = sc.nextInt();
		int result = (apple*apple1) + (sb*sb1);
		
		System.out.println("사과 구매 가격은 " + (apple*apple1) + "원 입니다.");
		System.out.println("사과 구매 가격은 " + (sb*sb1) + "원 입니다.");
		System.out.println("전체 구매 가격은 " + result + "원 입니다.");
		sc.close();

	}

}
