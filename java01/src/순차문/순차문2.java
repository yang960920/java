package 순차문;

// 부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// 기본 순차문 == 입력 --> 처리 --> 출력
		// 입력 -> 부품사용 , 망치같은 언제나 바로 사용할수있는것!! 사용해보자!
		// 다이얼 로그 곳에서 입력한 값은 컴퓨터는 무조건 String으로 인식!!
		String data1 = JOptionPane.showInputDialog("정수를 입력하시오-1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하시오-2");
		
		// 처리 -> 숫자 더하기 연산 (+연산자이용)
		// String 으로 int 로 변경해주어야함
		int data11 = Integer.parseInt(data1); // 문자를 정수로 바꾸는 역할  "200" => 200
		int data22 = Integer.parseInt(data2); // 타입은 바꾼 형태인 정수(int)로 입력
		
		double data33 = Double.parseDouble(data1);
		double data44 = Double.parseDouble(data2);
		
		int result = data11 + data22; // 결과는 정수 이기 때문에 int
		double result2 = data33 + data44; // 결과는 실수 이기 때문에 double
		
		// 출력 -> 모니터 화면에 보이고 싶음.
		System.out.println(result);
		System.out.println(result2);

	}

}
