package 반복문;

class 반복안에서스킵 {

	public static void main(String[] args) {
		// 1번부터 10번까지 데이터 중에서 짝수만 프린트
		for (int i = 1; i <= 10; i++) {
			
			if (i == 8) {
//				break; // for 문 종료 , for문 아래에 있는 내용이 이어서 실행!!
				System.exit(0); // 여기서 모든 내용을 그만 실행해라! 0 : 정상종료
				// 0이 아닌 다른 값을 넣어주면 : 비정상종료
			}
			
			if (i%2 != 0) { //홀수 !! (!=)는 ~가 아니면 이라는뜻!!
							//짝수 !! ==> 2로 나눠서 나머지가 0이면 짝수다 i%2 == 0
				continue; // 이번 i 만 for 문 안에 있는 내용을 실행하지 말고 다음으로 넘어가라!
			}
			System.out.println(i);
		}
		System.out.println("휴~~ for문 끝났다~");
	}

}
