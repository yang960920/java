package 배열기본;

//Random 의 위치는 java 폴더 아래 util 아래 있어요!
//라는 뜻을 가진게 import 다 위치설명
import java.util.Random;

public class 많은양만들어보기 {

	public static void main(String[] args) {
		int jumsu[] = new int[999];
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		System.out.println("===================");
		
		Random r = new Random();
//		int data = r.nextInt(4)+1; // 0~3 ==> 1~4
//		System.out.println(data);
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(4) + 1;
		}
		for (int x : jumsu) {
			System.out.println(x);
		}
	}

}
