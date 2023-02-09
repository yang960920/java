package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		int x[] = new int[10]; //length : 10
		//index 는 0 부터 시작, 마지막 위치의 인덱스는 length 는 10보다 작음.
		System.out.println(x.length);
		x[0] = 10;
		x[1] = 20;
		
		for (int i = 0; i < 10; i++) {
			System.out.print(x[i] + " ");
		}
		
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
	}

}
