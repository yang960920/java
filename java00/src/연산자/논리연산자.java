package 연산자;

public class 논리연산자 {
	
	public static void main(String[] args) {
//		기본형은 연산자(기호)를 이용해서 비교가능 ??
//		기본형 데이터는 비교연산자를 가지고 비교가능!!!
//		기본형 데이터가 아니면 비교 연산자를 가지고 비교 불가능!!!!
		int id = 1111;
		int id2 = 2222;
		
		int pw = 3333;
		int pw2 = 3333;
		
		System.out.println(id == id2); //false
		System.out.println(pw == pw2); // true
//		&&, and조건 , 두 조건이 모두 맞아야 맞다 라고 판단
//		로그인 처리!!
		System.out.println(id == id2 && pw == pw2);

		int mem1 = 111;
		int mem2 = 223;
		
//		|| , or 조건 , 조건 중에서 하나만 맞으면 맞다라고 판단한다.
		System.out.println(mem1 == 111 || mem2 == 222);
	}
}
