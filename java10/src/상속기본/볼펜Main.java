package 상속기본;

public class 볼펜Main {

	public static void main(String[] args) {
		볼펜 vol = new 볼펜();
		vol.company = "다이소";
		vol.price = 2000;
		vol.두께 = 6.8;
		vol.사다();
		vol.글을쓰다();
		System.out.println(vol.company);
		System.out.println(vol.price);
		System.out.println(vol.두께);
	}

}
