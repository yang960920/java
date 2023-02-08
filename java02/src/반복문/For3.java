package 반복문;

public class For3 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print("커피*");
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.println("커피*우유");
		}
		for (int i = 0; i < 3; i++) {
			System.out.println((i+1) +" : 짱!"); // 앞에서 부터 계산되니 (i+1) 는 안해도 된다.
		}
	}

}
