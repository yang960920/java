package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		// 여러개의 데이터를 램에 저장해두고 cpu가 접근하여 사용하고
		// 싶은 경우 사용하는 부품
		// 1. 값을 이미 알고 있는 경우
		int[] jumsu = {10, 20 , 30 , 40}; // length 라는 변수를 자동으로 만들어서 총 몇개인지 값을 넣어줌.
		System.out.println(jumsu);
		System.out.println(jumsu[0]); // 첫번째 값
		System.out.println(jumsu[1]); // 두번째 값
		System.out.println(jumsu[2]); // 세번째 값
		System.out.println(jumsu[3]); // 네번째 값
		System.out.println("전체갯수 " +jumsu.length); // 이 주소가 가르키는 length 변수를 프린트해보세요
	
		jumsu[0] = 100; // 첫번째 값으로 100을 넣으세요. 10<-- 100
		System.out.println(jumsu[0]);
		
		//2. 값을 모르고있다면 --> 먼저 저장공간을 만들어두고
		// 나중에 값을 넣는 경우
		int[] jumsu2 = new int[4];
		jumsu2[0] = 200;
		System.out.println(jumsu2[0]);
	}

}
