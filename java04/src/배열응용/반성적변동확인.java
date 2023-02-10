package 배열응용;

public class 반성적변동확인 {

	public static void main(String[] args) {
		int[] n1 = { 44, 66, 77, 22, 11 };
		int[] n2 = { 33, 55, 77, 22, 40 };
		
		int count = 0;
		int count2 = 0;
		
		for (int i = 0; i < n2.length; i++) {
			if (n1[i]== n2[i]) {
				count++;
			} else  {
				count2++;
			}
		}
		System.out.println("성적이 똑같은 학생 수는 " + count + "명 이다.");
		System.out.println("성적이 다른 학생 수는 " + count2 + "명 이다.");
		
	}

}
