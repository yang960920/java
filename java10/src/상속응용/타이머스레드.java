package �������;

import java.util.Date;

public class Ÿ�̸ӽ����� extends Thread {
	@Override
	public void run() {
		for (int i = 1000; i > 0 ; i--) {
			Date date = new Date();
			
			System.out.println("Ÿ�̸�  >>" + date);
			//cpu���� ������ ���� �ð� ���� �˷��ݽô�!!
			//thread�� ��� ��� �� ����
			//cpu �� �ܺ� �ڿ��Դϴ�.
			//�ڹٰ� �ܺ��ڿ��� �����Ҷ��� ��û �����ϴ�! ��� ��Ȳ����
			//���࿡ ������ ����� ��� ������ ���� �ڵ带 �ݵ�� ���־���Ѵ�
			try {
				Thread.sleep(1000); // ��ǻ�Ϳ��� �ð��� 1000�� ���־���� ��� 1�� ������Ŵ!
			} catch (Exception e) {
				System.out.println("cpu ���� ���� ����.");
			}
		}
	}
}
