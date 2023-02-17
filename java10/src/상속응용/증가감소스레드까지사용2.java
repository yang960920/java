package 상속응용;

public class 증가감소스레드까지사용2 {
	
	public static void main(String[] args) {
		plus p1 = new plus();
		mius m1 = new mius();
		감소스레드 감소 = new 감소스레드();
		증가스레드 증가 = new 증가스레드();
		
		
		감소.start();
		증가.start();
		p1.start();
		m1.start();

	
	
	}
	
}
