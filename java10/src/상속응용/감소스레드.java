package �������;

// ���ÿ� �����Ű�� ���� ��ǰ�� Thread �� ����� �ּ���!
//Thread Ŭ���� ����ϸ� �ٷ� �������


public class ���ҽ����� extends Thread{//run()
	@Override
	public void run() {
		for (int i = 100; i > 0; i--) {
			System.out.println("����>> " + i);
		}
	}
}
