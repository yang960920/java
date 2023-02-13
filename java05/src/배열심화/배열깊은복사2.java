package 배열심화;

public class 배열깊은복사2 {

	public static void main(String[] args) {
		String 과목명 [] = {"국어","영어","수학","컴퓨터","회화"};
		int[] jumsu1 = {44,66,22,99,100};
		int[] jumsu2 = jumsu1.clone();
		int count = 0;
		int count2 = 0;
		System.out.println(jumsu1 == jumsu2);
		jumsu2[0] = 22;
		jumsu2[2] = 88;
		
		for (int i = 0; i < jumsu2.length; i++) {
			System.out.print(jumsu1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < jumsu2.length; i++) {
			System.out.print(jumsu2[i] + " ");
		}
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu1[i] == jumsu2[i]) {
				count++;
			}else if (jumsu1[i] < jumsu2[i]) {
				count2++;
				System.out.println();
				System.out.println("성적이 오른 과목은? " + 과목명[i]);
			}
		}
		System.out.println();
		System.out.println("동일한 성적 수는 " + count);
		System.out.println("상승한 성적 수는 " + count2);
	}

}
