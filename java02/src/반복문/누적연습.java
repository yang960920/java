package 반복문;

import javax.swing.JOptionPane;

public class 누적연습 {

	public static void main(String[] args) {
		// iu = iu+1;
		// sum = sun+i
		
		// 숫자 누적
		int sum = 0; // 0을 넣는것이 변수의 초기화로 반드시 필요하다.
		for (int i = 1; i <= 10000; i++) { //500500
			sum = sum + i; // sum에 i를 더하고 다시 sum에 그걸 대입하라!
//			System.out.println("현재까지의 합 " + sum);
		}
		System.out.println("전체의 합은 " + sum);
		
		// 글자 누적
		String sum2 = ""; // String의 초기값은 "" , null 이다.
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("가고 싶은 곳 입력");
			sum2 = sum2 + data +" ";
		}
		System.out.println(sum2);
	}

}
