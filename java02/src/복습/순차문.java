package 복습;

//JOptionpane이 javax 폴더 아래 swing 폴더 아래에 있음을 알려줌.
//위치를 알려주는 역할 (import ~~)
import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력 --> 처리 --> 출력
		// 두개의 숫자를 입력을 받아서 처리해서 출력
		// 프로그래밍은 손으로 치는 값은 모두 다 String 으로 취급 (문자열)
		// RAM 에 저장 공간을 만드는 것을 == > 선언
		// 선언 할때 RAM에 저장공간인 변수가 만들어진다.
		// 데이터타입  변수명
		// 입력!!
		String b1 = JOptionPane.showInputDialog("숫자를 입력-1");
		String b2 = JOptionPane.showInputDialog("숫자를 입력-2");
		
		// 처리 !!
		// 정수로 바꾸어서 처리를 하고싶다
		// 프로그래머가 정수로 바꾸는 부품을 써서 처리해야함
		// Integer.parseInt(변수명);
		// 정수 처리된 값을 RAM 에 저장해줘야 하므로
		// int 변수명2 = Integer.parseInt(변수명);
		int b11 = Integer.parseInt(b1);
		int b22 = Integer.parseInt(b2);
		
		// 출력
		// 자바언어에서 정수와 정수의 연산 결과는 무조건 정수로만 나온다!!
		// 소수점이 나오더라도 결과는 소수점을 자른 정수만 나온다
		// 자바언어는 하나라도 실수로 처리를 해주면 결과는 무조건 실수!!
//		System.out.println((double)b11/b22);
		System.out.printf("%.3f",(double)b11/b22);
		// 콘솔에 찍을때만 가능한 방법으로
		// System.out.printf("%.원하는자릿수f",변수명/변수명);
		// f 는 실수이기 때문에 들어가는것!
		
	}

}
