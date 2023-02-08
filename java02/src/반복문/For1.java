package 반복문;

public class For1 {

	public static void main(String[] args) {
		// 3번 반복
		// for 문은 한 지역 {} 이 끝나면
		// 다른 for 문에서의 지역은
		// 같은 변수명 i 를 쓰더라도 무방하다.
		// 지역변수(local) if도 지역변수
		// for (초기값 , 조건식(연산자) , 증감식(카운트하는것))
		for (int i = 0; i < 3; i++) {
			// i = 0 i<3 (true) , 처리 , i++
			System.out.println(i + "  내가3번반복");
		}
		for (int i = 0; i < 100; i++) {
			System.out.println("내가 반복 2 " + i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("내가반복3 "+ (i+1) + "번째 실행중");
		}
		
	}

}
