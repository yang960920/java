package 복습;

import javax.print.attribute.standard.JobSheets;

public class 배열만들기 {

	public static void main(String[] args) {
		// 1. 배열 만들기 - 이미 값을 알고 있는 경우
		String[] hobby = {"run","book","swim","walk"};
		// hobby 는 기본형변수 (문자1개, 정수 , 실수 ,논리형) 이 아니고 참조형변수
		// 참조형 변수는 주소가 들어있음
		// 변수명[] 괄호 안엔 인덱스라는 값이 들어감.
		System.out.println(hobby);
		System.out.println("0: " + hobby[0]);
		System.out.println("1: " + hobby[1]);
		System.out.println(hobby.length);
		//hobby.length 에서 . 은 접근 연산자로써 hobby에 있는 length를 알려줘 라는뜻
		System.out.println(hobby[3]);
		System.out.println(hobby[hobby.length - 1]);
		//for문은 c타입 언어가 대부분
		for (int i = 0; i < hobby.length; i++) {
			// i ==> index 의 역할 , 0 ,1 ,2 로 기본적으로 인덱스는 1씩 증가함
			System.out.println(i+": " + hobby[i]);
		}
		// hobby.length -1 은 length 의 위치는 항상 맨 마지막 이기 때문에
		// 마지막에서 하나 전의 것을 프린트 해라 라는 뜻으로
		// hobby[3] = hobby[hobby.length -1] 똑같은 뜻이다.
		
		// for-each 문 : 알아서 처음부터 index를 1씩 증가하면서 
		// 하나씩 꺼내준다.
		// for (String 변수 : 기존변수명)
		
		//출력용!!
		for (String x : hobby) {
			System.out.println(x);
		}
		
		
		// 2. 배열 만들기 - 값을 모르고 있는 경우, 공간부터 만들어두자.
		String[] job = new String[5];
		System.out.println(job);
		job[0] = "백엔드 프로그래머";
		job[1] = "카페 주인";
		System.out.println(job[0]);
		System.out.println(job[1]);
		System.out.println();
		for (int i = 0; i < job.length; i++) {
			System.out.println(i+": " + job[i]);
		}
	}

}
