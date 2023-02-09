package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);
		Scanner sc = new Scanner(System.in);
		int data = 0;
		int count = 0; // 카운트 변수 선언!!
		while (true) { // true 를 쓰면 무한루프
			System.out.print("생각한 정답은? ");
			count++; // 답안 시도 할때마다 +1 씩 오름
			data = sc.nextInt();
			if (data == target) {
				System.out.println("정답입니다!!");
				System.out.println("프로그램을 종료합니다.");
				System.out.println("전체 시도 횟수는 " + count);
				break; // 완료가 되면 멈춰야 하기 때문에 원하는 위치에 꼭 break 를 걸어야함!!.
			} else {
				System.out.println("오답입니다!!");
				System.out.println("다시 시도해보세요");
				// data 가 target 보다 크면 "너무 커요!!"
				// data 가 target 보다 작으면 "너무 작아요!!"
				if (data>target) {
					System.out.println("너무커요!!");
				} else {
					System.out.println("너무 작아요!!");
				}
			} 
		}
		sc.close();
		
		
	}

}
