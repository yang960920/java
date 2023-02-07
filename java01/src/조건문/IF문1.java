package 조건문;

public class IF문1 {

	public static void main(String[] args) {
		int x = 0;
		// 비교 연산자 ( == , != , > , >= ,< , <=) 
		// 로 비교할수 있는것은 기본형 데이터만 가능!!
		if (x == 0) { // 조건을 쓸때는 비교하는 것으로 쓰고 결과는 무조건 true/false
			System.out.println("내가 실행되겠지요?");
			// true
		} else { //false 일때 처리하고 싶은 내용을 쓰면 됨
			System.out.println("나는 조건이 맞지 않을때 실행돼요");
		}
		if (x == 1) {
			System.out.println("나는 실행될까?");
			// false
		}
	}

}
