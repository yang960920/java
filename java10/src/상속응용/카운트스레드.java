package �������;

public class ī��Ʈ������ extends Thread {
	@Override
	public void run() {
		for (int i = 500; i > 0 ; i--) {
			System.out.println("ī��Ʈ >>" + i);
			//cpu���� ������ ���� �ð� ���� �˷��ݽô�!!
			//thread�� ��� ��� �� ����
			//cpu �� �ܺ� �ڿ��Դϴ�.
			//�ڹٰ� �ܺ��ڿ��� �����Ҷ��� ��û �����ϴ�! ��� ��Ȳ����
			//���࿡ ������ ����� ��� ������ ���� �ڵ带 �ݵ�� ���־���Ѵ�
			try {
				Thread.sleep(2000); // ��ǻ�Ϳ��� �ð��� 1000�� ���־���� ��� 2�� ������Ŵ!
			} catch (Exception e) {
				System.out.println("cpu ���� ���� ����.");
			}
		}
	}
}
