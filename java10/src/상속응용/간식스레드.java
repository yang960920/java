package �������;

public class ���Ľ����� extends Thread {
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
		for (int i = 0; i < images.length; i++) {
			System.out.println(i + "�����ּ���");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("ħ�� �� �����������!");
			}
		}
	}
}
