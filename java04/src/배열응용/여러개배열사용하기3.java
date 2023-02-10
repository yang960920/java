package 배열응용;

import java.util.Scanner;

public class 여러개배열사용하기3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tour = new String[3];
		String[] tour2 = new String[3];
		int count = 0;
		for (int i = 0; i < tour2.length; i++) {
			System.out.print("작년에 가고 싶었던 곳은? ");
			tour[i] = sc.next();
		}
		for (int i = 0; i < tour2.length; i++) {
			System.out.print("올해에 가고 싶었던 곳은? ");
			tour2[i] = sc.next();
		} 
		for (int i = 0; i < tour2.length; i++) {
			System.out.println(tour[i]+ " " + tour2[i] );
		}
		for (int i = 0; i < tour2.length; i++) {
			if (tour[i].equals(tour2[i]) ) {
				count++;
			}
		}
		System.out.println("작년과 올해 가고싶은 곳이 동일한 곳은 " + count + "곳 입니다.");
		
		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("작년에 가고 싶었던 곳은? ");
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("올해에 가고 싶었던 곳은? ");
//			sc.next();
//		}
		
	}

}
