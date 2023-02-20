package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또문제3 {

	public static void main(String[] args) {
		Random r = new Random(100);
		HashSet lotto = new HashSet();
		
		for (int i = 0; i < 6; i++) {
			lotto.add(r.nextInt(45)+1);
		}
		System.out.println(lotto.size());
		System.out.println(lotto);
		
	}

}
