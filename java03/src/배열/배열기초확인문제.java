package �迭;

public class �迭����Ȯ�ι��� {

	public static void main(String[] args) {
		int x[] = new int[5];
		System.out.println(x.length);
		
		x[0] = 100;
		System.out.println("3������ " + x[0]);
		
		x[4] = 500;
		System.out.println("4������ " + x[4]);

		x[2] = 200;
		System.out.println("5������ " + x[2]);
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]+ " " );
		}
		for (int i = 0; i < x.length; i++) {
			System.out.println(i + ": " + x[i]);
		}
		
	}

}
