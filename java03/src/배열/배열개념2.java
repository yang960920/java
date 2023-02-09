package 배열;

public class 배열개념2 {

	public static void main(String[] args) {
		// 여러개의 데이터를 램에 저장해두고 cpu가 접근하여 사용하고
		// 싶은 경우 사용하는 부품
		// 1. 값을 이미 알고 있는 경우
		int [] week = {1,2,3,4,5,6,7};
		System.out.println(week[0]);
		System.out.println(week[1]);
		System.out.println(week.length);
		
		week[2] = 10;
		System.out.println("week의 세번째 값은 " + week[2]);
		
		week[4] = 12;
		System.out.println("week의 다섯번째 값은 " +week[4]);
		
		//2. 값을 모르고있다면 --> 먼저 저장공간을 만들어두고
		// 나중에 값을 넣는 경우
		int[] tour = new int[4];
		tour[0] = 20;
		tour[2] = 30;
		System.out.println("tour 첫번째 값은 " + tour[0]);
		System.out.println("tour 세번째 값은 " + tour[2]);
		System.out.println("tour의 변수 갯수는 " + tour.length);
	}

}
