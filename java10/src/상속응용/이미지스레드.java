package �������;

public class �̹��������� extends Thread {
	@Override
	public void run() {
		String[] images = {
				"1.png","2.png","3.png",
				"1.png","2.png","3.png",
				"1.png","2.png","3.png",
				"1.png","2.png","3.png",
				"1.png","2.png","3.png",
				"1.png","2.png","3.png",
				"1.png","2.png","3.png",
				"1.png","2.png","3.png",
				"1.png","2.png","3.png",
				"1.png","2.png","3.png",
				"1.png","2.png","3.png",
				"1.png","2.png","3.png",
				"1.png","2.png","3.png",
				"1.png","2.png","3.png",
				"1.png","2.png","3.png"
				};
		for (int i = 0; i < images.length; i++)  {
			
			System.out.println("�̹���  >>" + images[i]);
			//cpu���� ������ ���� �ð� ���� �˷��ݽô�!!
			//thread�� ��� ��� �� ����
			//cpu �� �ܺ� �ڿ��Դϴ�.
			//�ڹٰ� �ܺ��ڿ��� �����Ҷ��� ��û �����ϴ�! ��� ��Ȳ����
			//���࿡ ������ ����� ��� ������ ���� �ڵ带 �ݵ�� ���־���Ѵ�
			try {
				Thread.sleep(5000); // ��ǻ�Ϳ��� �ð��� 1000�� ���־���� ��� 1�� ������Ŵ!
			} catch (Exception e) {
				System.out.println("cpu ���� ���� ����.");
			}
		}
	}
}
