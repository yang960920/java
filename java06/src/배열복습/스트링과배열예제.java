package 배열복습;

public class 스트링과배열예제 {

	public static void main(String[] args) {
		String num = "   011-245-1234    ";
		String num2 = num.trim();
		System.out.println(num2);
		String[] num3 = num2.split("-");
		for (int i = 0; i < num3.length; i++) {
			if (num3[0].equals("011")) {
				System.out.println("SK 사용자시군요");
			}else if (num3[0].equals("019")) {
				System.out.println("LG 사용자시군요");
			}else {
				System.out.println("Apple 사용자시군요");
			}
		}
		
		if (num3[1].length() >= 4) {
			System.out.println("최신폰");
		}else {
			System.out.println("올드폰");
		}
		
		int total = num3[0].length() + num3[1].length() + num3[2].length();
		//for 문을 이용해서 적어도 가능~!!
		System.out.println(total);
		if (total >=10) {
			System.out.println("유효한 전화번호");
		}else {
			System.out.println("유효하지않은 전화번호");
			
		}
		int total2 = 0;
		for (int i = 0; i < num3.length; i++) {
			total2 = total2 + num3[i].length();
		}
		System.out.println(total2);
	}

}
