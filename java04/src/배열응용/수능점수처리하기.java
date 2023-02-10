package 배열응용;

import java.util.Random;

public class 수능점수처리하기 {

	public static void main(String[] args) {
		int[] jumsu = new int[10000];
		int count = 0;
		int count2 = 0;	
		
		Random r = new Random(42);
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451);
			if (jumsu[i] == 450) {
				count++;
			} else if (jumsu[i] == 0) {
				count2++;
			}
		}
		for (int x : jumsu) {
			System.out.println(x);
		}
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x;
		}
		double avg = (double)sum/jumsu.length;

		int avgPlusMinus =0; // 선언! 할때 자바는 변수를 반드시 만들어줘야한다!!
		// 250 <= avg <= 350, avg 가 300인 경우 이 연산은 불가능함
		// avg-50 <= x <= avg+50 를 구해야함
		// == >avg-50 <= x && x <= avg+50
		for (int x : jumsu) {
			if ((avg-50 <= x) && (x <= avg+50)) {
				avgPlusMinus++;
			}
		}
		// 점수의 상위 30%의 평균을 구하기
		
		System.out.println("올해 수능의 만점자 수는 " + count + "명 이다.");
		System.out.println("올해 수능의 영점자 수는 " + count2 + "명 이다.");
		System.out.println("올해 수능의 평균은 " + avg);
		System.out.println("평균 보다 -+ 50점인 학생의 수는 " +avgPlusMinus+ "명 이다.");
	}

}
