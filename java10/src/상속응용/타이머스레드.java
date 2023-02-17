package 상속응용;

import java.util.Date;

public class 타이머스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 1000; i > 0 ; i--) {
			Date date = new Date();
			
			System.out.println("타이머  >>" + date);
			//cpu에게 스레드 쉬는 시간 텀을 알려줍시다!!
			//thread를 잠깐 재울 수 있음
			//cpu 는 외부 자원입니다.
			//자바가 외부자원을 연결할때는 엄청 위험하다! 라는 상황으로
			//만약에 문제가 생기면 어떻게 할지에 대해 코드를 반드시 해주어야한다
			try {
				Thread.sleep(1000); // 컴퓨터에선 시간을 1000배 해주어야함 고로 1초 지연시킴!
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
