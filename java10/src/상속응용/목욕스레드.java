package �������;

public class ��彺���� extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i +"��° ���� ������� ������!");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("�����̰� ����ģ��.");
			}
		}
	}
}
