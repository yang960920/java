package 상속응용;

public class 동동이가원하는것 {

	public static void main(String[] args) {
		산책스레드 s1 = new 산책스레드();
		간식스레드 s2 = new 간식스레드();
		목욕스레드 s3 = new 목욕스레드();

		s1.start();
		s2.start();
		s3.start();
		
		
	}

}
