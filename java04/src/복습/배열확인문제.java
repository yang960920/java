package 복습;

public class 배열확인문제 {

	public static void main(String[] args) {
		String[] tour = {"일본","홍콩","미국","호주","캐나다"};
		for (String x : tour) {
			System.out.println("내가 좋아하는 여행지는 " + x);
		}
		char[] color = {'r','b','p','y','g'};
		for (char c : color) {
			System.out.println("내가 좋아하는 색은 " + c);
		}
		double[] key = {178.2,182.4,165.4,166.1,162.8};
		for (double d : key) {
			System.out.println("내가 좋아하는 연예인의 키는 " + d);
		}
	}

}
