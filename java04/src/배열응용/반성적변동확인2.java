package 배열응용;

import java.util.Random;

public class 반성적변동확인2 {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] n1 = new int[10000];
		int[] n2 = new int[10000];
		int count3 = 0;
		int count4 = 0;

		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
			if (n1[i] < n2[i]) {
				count3++;
			} else if (n1[i] > n2[i]) {
				count4++;
			}

		}

		int count = 0;
		int count2 = 0;

		for (int i = 0; i < n2.length; i++) {
			if (n1[i] == n2[i]) {
				count++;
			} else {
				count2++;
			}
		}
		System.out.println("성적이 똑같은 학생 수는 " + count + "명 이다.");
		System.out.println("성적이 다른 학생 수는 " + count2 + "명 이다.");
		System.out.println("2학기 성적이 더 좋은 학생은 총 " + count3);
		System.out.println("1학기 성적이 더 좋은 학생은 총 " + count4);

	}

}
