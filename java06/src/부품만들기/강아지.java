package 부품만들기;

public class 강아지 {
	// 성질 : 멤버변수(가격,모양)
	// public은 아무데서나(다른패키지에서도) 접근 가능 설정 (접근제어자)
	public String species; // 멤버 변수는 자동으로 초기화해서 쓰레기 값이 없다!! (0)
	public String size; // 기본형이 아닌 경우들은 null로 초기화 돼있음
	// 동작 : 멤버메서드(=함수), 동적인 기능을 수행한다.
	//		인터넷하다, 카톡하다.
	public void 쓰다듬다() {
		// 기능 처리하는 방법을 나열
		System.out.println("꼬리를 흔든다.");
		System.out.println("귀찮아서 피한다.");
	}
	public void 간식을주다() {
		System.out.println("앉는다.");
		System.out.println("달려든다.");
	}
}
