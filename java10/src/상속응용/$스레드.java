package 상속응용;

public class $스레드 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i+"번쨰 $");
		}
	}
}
