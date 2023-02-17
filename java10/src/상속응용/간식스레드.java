package 상속응용;

public class 간식스레드 extends Thread {
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
			System.out.println(i + "간식주세요");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("침대 다 물어뜯어버린다!");
			}
		}
	}
}
