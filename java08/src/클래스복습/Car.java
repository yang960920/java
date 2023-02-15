package 클래스복습;

public class Car {
	
		// 성질 : 변수로 구현,멤버변수
		String color; // 변수는 선언된 위치가 생존의 위치!
		
		// Class {} 안의 변수는 전체영역에서 사용가능하다!!
		// ==> 이를 ' 전역변수 ' (=Global 변수) 자동 초기화
		// 자동초기화 시! 기본형이 아니므로 참조형은 모두 null로 초기화
	
	
		// 동작 : 기능, 멤버메서드, 함수(메서드, 방법)
		public void run() { // 메서드(방법) ==> run 이라는 기능이 어떤 방법으로 달릴지를 정해주자
							// 방법을 써주는 곳 ==> 메서드(method),기능을정의한다
			System.out.println("부릉부릉 달리다!!");
		}
		public void up() {
			System.out.println("비싼 휘발유를 먹으며!! 미친듯이 속도UP!!");
		}
	
}
