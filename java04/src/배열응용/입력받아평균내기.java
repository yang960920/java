package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균내기 {

	public static void main(String[] args) {
		// 입력을 여러번 여러개 받아서
		// 저장공간에 넣고 싶을 때 == > 배열을 사용하자
		// 1. 배열을 만들어주세요.
		int[] jumsu = new int[5]; // [인덱스] 만큼 입력을 받아보자
		int sum = 0;
		int sum1 = 0;
		
		// 배열에 값을 넣을때는 index 가 필요 == > i 가 있는 for문 사용해야함
		// 입력된 값이 없으므로 아직은 for-each 문 사용 불가
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자를 입력해주세요.");
			// data 가 정수가 아니므로 정수로 바꿔 주어야함
			// 숫자로 변환한  값의 배열을 해당 인덱스에 값으로 넣어야한다.
			jumsu[i] = Integer.parseInt(data); 
		} 
		
		for (int x : jumsu) {
			System.out.print(x + " ");
			sum = sum + x ;
			if (x >= 300) {
				sum1 = sum1 + x; // sum+= x; 같은 코드
				
			}
		}
		System.out.println();
		System.out.println("전체의 합계는 " + sum);
		System.out.println("전체의 평균은 " + (sum/5));
		// 평균내기 더 나은 코드
		// ==>double avg = (double)sum / jumsu.length;
		// 		System.out.println("전체의 평균은 " + avg);
		System.out.println("300이상 숫자의 합은 " + sum1);
		
	}

}
