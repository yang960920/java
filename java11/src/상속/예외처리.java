package 상속;

public class 예외처리 {

	public static void main(String[] args) {
		// 실행할 때 에러가 발생해서 프로그램이 멈추는 것을 막기 위한 것.
		System.out.println("1. 나는 프린트 될 거야!!");
		try {
			// 에러가 발생할 것 같은 코드를 넣어준다.
			System.out.println("2. 문제 발생 코드 >> " + 10 / 0);
		} catch (Exception e) {
			// 에러가 발생 했을 때 프로그램을 중단하지말고, 어떻게 처리를 해줄지 코딩.
			System.out.println("에러 발생함.");
			System.out.println(e.getMessage());
		}
		System.out.println("3. 나는 과연 프린트가 될까요??");
	}
}
