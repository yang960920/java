package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"영국","일본","캐나다"},
				{"호주","미국","아일랜드"},
				{"제주도","브라질","이탈리아"}
				
			}; //전체를 프린트
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.println(s[i][j]);
			}
		}
	}

}
