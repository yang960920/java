package 배열복습;

public class 이차원배열프린트 {

	public static void main(String[] args) {
		// 배열을 만들때 이미 값을 알고 있는경우
		int[][] n1 = {
			 //j 0 1 2   //i
				{1,2,3}, //0
				{4,5,6,7}  //1
		};
		System.out.println(n1.length); // 2차원 배열의 length(행), 2개
		System.out.println(n1[1][2]);
						   // 행   열
		for (int i = 0; i < n1.length; i++) { // 행
			for (int j = 0; j < n1[i].length; j++) { // 한 행을 다 찍기 위함 (열)
				System.out.println(n1[i][j]);
			}
		}
		
		
		// 배열을 만들때 아직 값을 모르고 있는경우 , 공간을 먼저 만들어준다.
		int[][] n2 = new int[2][3]; // 1차원의 수와 2차원의 수가 같다면
									// int[][] 변수명 = new int[길이][길이2] 길이2를 적을수있다. 		
	}

}
