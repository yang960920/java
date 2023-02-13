package 배열복습;

import java.util.Arrays;
import java.util.Random;


public class 배열정렬순위 {

	public static void main(String[] args) {
		// 정렬을 할 때는 Arrays
		Random r = new Random(42); // 씨드값 (seed)
		
		int[] jumsu = new int[10000];
		
		// for 문 ==> 입력용, 출력용, i활용 가능
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000)+1; // 1~1000 을 설정 
		}
		// 알아서 위치값을 옮겨 주면서 하나씩 꺼내 오는 문법이다
		// for - each 문  == > 출력용 문법
		for (int x : jumsu) {
			System.out.println(x);
		}
		// 오름차순 (작은것 -- > 큰것 순) , 내림차순 (큰것 --> 작은것 순)
		Arrays.sort(jumsu);
		//sort(jumsu) ==> jumsu가 바뀌어버림 (원본이 파괴 순서대로 정리됨)
		//파괴형 함수
		
//		String n = JOptionPane.showInputDialog("숫자를 입력");
//		int n2 = Integer.parseInt(n);
		// parseInt(n) ==> RAM 에 저장된 n 이 변경된건 아님! (원본 비파괴 n는 유지됨)
		// 비파괴형 함수 ==> 선호도는 비파괴형 함수가 좀 더 선호됨
		
		
		
		// 정렬 후 출력
		System.out.println("-----------------------");
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		// 정렬후 , 최대값 , 최소값을 프린트!
		System.out.println("최소값 :" + jumsu[0]);
		System.out.println("최대값 :" + jumsu[jumsu.length-1]);
		
		//상위 30% , 인원 3000명, 높은 점수부터 3000개를 가져온다 (추출)
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 = sum30 + jumsu[i];
		}
		System.out.println("상위30%평균 : " + (sum30/3000.0));
		
		int sum70 = 0;
		for (int i = 0; i < 3000; i++) {
			sum70 = sum70+jumsu[i];
		}
		System.out.println("하위30% 평균 : "+(sum70/3000.0));
		String result = Arrays.toString(jumsu); // 비파괴형 , String 으로 만들어줌 
		System.out.println(result);
		
		
	}

}
