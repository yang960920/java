package 상속응용;

public class 산책스레드 extends Thread {
	@Override
	public void run() {
		
		for (int i = 0; i < 10000; i++) {
		
			System.out.println(i+"번째 밖에 안됐어 산책가자!!! ");
			try {
				Thread.sleep(1000); // 컴퓨터에선 시간을 1000배 해주어야함 고로 1초 지연시킴!
			} catch (Exception e) {
				System.out.println("동동이 열받아버림.");
			}
		}
	}
}
