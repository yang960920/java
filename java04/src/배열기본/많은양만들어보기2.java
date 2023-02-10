package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		int[] jumsu2 = new int[1000];
		int count = 0;
		int sum = 0;
		Random r = new Random();
	
		
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19)+2;
		}
		for (int x : jumsu2) {
			System.out.println(x);
			if (x >= 15) {
				count++; // count ==> 조건이 맞을경우 1씩 올라감
				sum = sum + x; // 15이상 총합을 구할경우!
			}
		}
		System.out.println("15이상의 갯수는 총 " + count);
		System.out.println("15이상의  총합 " + sum);
	}

}
