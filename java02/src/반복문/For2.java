package 반복문;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		for (; ;) {// 무한 루프 (반복) 같은 부품으로는 while(true)가 있다.
			System.out.println("잘쓰지 않음");
			String data = JOptionPane.showInputDialog("종료할까요? y를 입력");
					// 연산자는 기본 데이터만 비교 가능
					// String 부품은 다른 기능을 사용해 비교해주어야함
					// 변수명.equals()
					if (data.equals("y")) {
						System.out.println("안녕히가세요!!!");
						break;
						// if는 자체 멈춤 기능이 있으므로
						// 해당 break 는 for의 멈춤 부품이다!
					} 
		}
	}

}
