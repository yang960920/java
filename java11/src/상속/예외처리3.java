package 상속;

public class 예외처리3 {

	public static void main(String[] args) {
		// 아래 코드를 분석해보고 , 문제가 생길 여지가 있는 코드가
		// 에러가 발생했을 때 실행을 제외시켜버리고
		// 프로그램이 중단 되지 않도록 해보세요!!
		int[] num = new int[3];
		try {
			num[3] = 2; // 문제가 발생할 여지가 있는 코드!!
		} catch (Exception e) {
			System.out.println("문제 발생 이멀전씨!!");
		}
		System.out.println("하지만 난 발생했죠? " + num.length);
	}
}
