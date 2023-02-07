package 변수;

import java.util.jar.Attributes.Name;

public class 변수선언확인문제 {
	
	public static void main(String[] args) {
		int num = 105;
		double num2 = 172.3;
		char c = '굳';
		boolean d = true;
//		기본데이타X ==> 너무 많이 쓰기 때문에 기본형처럼 기본형데이터 처럼 사용 가능!!
		String name = "양현준"; //여러 글자를 쓸때는 ""
		// 스트링 , 실 !!
		System.out.println("정수 값은 " + num + " 입니다");
		System.out.println("실수 값은 " + num2 + " 입니다");
		System.out.println("문자1개 값은 " + c + " 입니다");
		System.out.println("부울렌 값은 " + d + " 입니다");
		System.out.println("나의 이름은  " + name + " 입니다");
		
//		int name = 정수
//		double name = 실수
	}
}
