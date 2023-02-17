package 상속응용;

public class 카운트스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 500; i > 0 ; i--) {
			System.out.println("카운트 >>" + i);
			//cpu에게 스레드 쉬는 시간 텀을 알려줍시다!!
			//thread를 잠깐 재울 수 있음
			//cpu 는 외부 자원입니다.
			//자바가 외부자원을 연결할때는 엄청 위험하다! 라는 상황으로
			//만약에 문제가 생기면 어떻게 할지에 대해 코드를 반드시 해주어야한다
			try {
				Thread.sleep(2000); // 컴퓨터에선 시간을 1000배 해주어야함 고로 2초 지연시킴!
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
