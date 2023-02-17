package 상속응용;

public class 목욕스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i +"번째 도전 목욕하자 동동아!");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("동동이가 도망친다.");
			}
		}
	}
}
