package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		
		ArrayList me = new ArrayList();
		
		me.add(1000); // Object < - Integer (업캐스팅) < -(오토박싱)int
		me.add(189.1); // Object < - Double (업캐스팅) < - double
		me.add(false);	// Object < - Boolean (업캐스팅) < - boolean
		me.add('남');	// Object < - Character (업캐스팅) < - char
		
		// ArrayList 는 toString()가 재정의 해주는데
		// list 라는 참초형 때문에 list 를 프린트 하면 주소!!! 가 프린트
		// toString()이 재정의한 내용은 주소가 가르키는 값들을 String 으로 만들어주도록 정의함
		// list 를 찍어보면 주소대신 String으로 만든 내용이 출력
		
		
		
		System.out.println(me);
		
		
		int money = (Integer)me.get(0); // Object -> Integer (다운캐스팅) (오토언박싱)-> int
		System.out.println(money + 2000);
		
		double key = (double)me.get(1); // Object -> double (다운캐스팅)
		System.out.println(key+10);
		
		boolean food = (boolean)me.get(2);
		if (food) {
			System.out.println("배불러요");
		}else {
			System.out.println("배고파요");
		}
		
		char gender = (char)me.get(3);
		
		if (gender == '남') {
			System.out.println("주민 번호는 1,3 이에요");
		}else {
			System.out.println("주민 번호는 2,4 에요");
		}
		
	
		
		
	}

}
