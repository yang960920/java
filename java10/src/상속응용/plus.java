package �������;

public class plus extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println(i +"��° ��" + i);
		}
	}
	
}
