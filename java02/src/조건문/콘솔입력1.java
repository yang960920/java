package 조건문;

import java.util.Scanner;

public class 콘솔입력1 {

	public static void main(String[] args) {
		// Scanner 부품 사용
		// 콘솔에서 자바 문서로 정보를 가져오는 부품이다.
		// 자바 문서에서 콘솔로는 갈수 없는 통로를 강물 (=stream)이라고도 부른다
		// 한쪽으로만 흐름.
		Scanner sc = new Scanner(System.in); // system.in 은 컴퓨터에서 키보드로 입력받겠다.
		// Stream은 내가 닫아주지않으면 계속 가지고 있게됨.
		// Stream을 반드시 닫아주자
		
		System.out.print("요일 입력 : 주중 1) 주말 2)");
		int data = sc.nextInt(); // String을 Int 로 바꿔주는 기능을 한다.
		if (data == 1) {
			System.out.println("열심히 일하자");
		} else {
			System.out.println("푹 쉬자~");
		}
		
		System.out.print("주말에 뭐할까 ?");
		String data2 = sc.next(); //단어 문자열이므로 String
		System.out.println("나는 주말에 "+data2+ "를 할거야. ");
		
		
		sc.close();

	}

}
