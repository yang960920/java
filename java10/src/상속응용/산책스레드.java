package �������;

public class ��å������ extends Thread {
	@Override
	public void run() {
		
		for (int i = 0; i < 10000; i++) {
		
			System.out.println(i+"��° �ۿ� �ȵƾ� ��å����!!! ");
			try {
				Thread.sleep(1000); // ��ǻ�Ϳ��� �ð��� 1000�� ���־���� ��� 1�� ������Ŵ!
			} catch (Exception e) {
				System.out.println("������ ���޾ƹ���.");
			}
		}
	}
}
