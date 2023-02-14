package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		// 전화기를 만들어 보자!! 2개를 만들어보자.
		강아지 d1 = new 강아지();
		d1.species = "goldenretriever";
		d1.size = "Big";
		d1.쓰다듬다();
		System.out.println("d1의 종 : " +d1.species);
		System.out.println("d1의 크기 : " +d1.size);
		
		강아지 d2 = new 강아지();
		d2.species = "Pomeranian";
		d2.size = "Small";
		d2.간식을주다();
		System.out.println("d2의 종 : " +d2.species);
		System.out.println("d2의 크기 : " +d2.size );
	}

}
