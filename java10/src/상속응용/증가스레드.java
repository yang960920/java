package �������;

// ���ÿ� �����Ű�� ���� ��ǰ�� Thread �� ����� �ּ���!
//Thread Ŭ���� ����ϸ� �ٷ� �������


public class ���������� extends Thread{//run()
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("����>> " + i);
		}
	}
}
