package 제어문문제;

import java.util.Scanner;

public class 인기투표시스템 {
	// 누적 시키는 변수는 반복문 안에 넣을 경우 계속 0으로 리셋 된다.
	// 고로 반복문 밖에 모든 변수를 설정해야한다!!

	public static void main(String[] args) {
		int iu = 0;
		int bts = 0;
		int jin = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("인기 투표 시스템");
		System.out.println("============");
		while (true) {
			System.out.println("1)아이유 2)방탄 3)뉴진스 4)종료");
			System.out.print("번호 선택 >>");
		int choice = sc.nextInt();
		if (choice == 4) {
			System.out.println("시스템을 종료합니다.");
			System.out.println("--------------");
			System.out.println("아이유 " + iu + "표");
			System.out.println("방탄 " + bts + "표");
			System.out.println("뉴진스 " + jin + "표");
			System.out.println("--------------");
			break;
		} if (choice == 1) {
			iu++;
		} else if (choice == 2){
			bts++;
		} else if (choice == 3) {
			jin++;
		} else {
			System.out.println("없는 번호입니다.");
			System.out.println("다시 선택하세요.");
		}
		} // while 문
		sc.close();
	}

}
