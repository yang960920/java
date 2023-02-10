package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		String[] names = {"홍길동","이순신","뉴진스","방탄","블랙핑크"};
		int[] term1 = { 77, 66, 88, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		int count = 0;
		int count2 = 0;
		
		
		
		for (int i = 0; i < term2.length; i++) {
			if ( term1[i] < term2[i]) {
				count++;
			} else if ( term1[i] == term2[i]){
				count2++;
			}
			if (term2[i] == 100 ) {
				System.out.println("만점 학생의 이름은 " +names[i]+"\t" + i +"번 이다" );
			}
		}//for문
		
		
		System.out.println("2학기 성적이 오른 학생은 " + count);
		System.out.println("성적이 동일한 학생은 " + count2);
		
		int sum = 0;
		for (int x : term1) {
			sum = (sum + x)/names.length;
		}
		int sum2 = 0;
		for (int x : term2) {
			sum2 = (sum2 + x)/names.length;
		}if (sum > sum2) {
			System.out.println("학기 중 더 높은 평균은 1학기이다.");
		}else {
			System.out.println("학기 중 더 높은 평균은 2학기이다.");
		}
		
	}

}
