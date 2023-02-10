package 배열기본;

import java.util.Scanner;

public class 스캐너를이용한배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] jumsu = new int[5];
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("정수를 입력>> ");
			jumsu[i]= sc.nextInt();
		}
		System.out.println("첫번째 값과 세번째 값의 합은 " + (jumsu[0]+jumsu[2]));
		
		System.out.println();
		String[] data = new String[3];
		for (int i = 0; i < data.length; i++) {
			System.out.print("사용하는 언어는? ");
			data[i] = sc.next();
		}
		System.out.println(data[0] + " 보다는 " + data[1]);
		sc.close();
	}

}
