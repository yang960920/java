package 조건문;

import javax.swing.JOptionPane;

public class 설문조사 {

	public static void main(String[] args) {
		int full = 0;
		int nofull = 0;
		
		for (int i = 0; i < 10; i++) {
		String data = JOptionPane.showInputDialog("배부르니? 1)배부름 2)안배부름");
		if (data.equals("1")) {
//			full = full + 1 ; 이것과 full++ 이 똑같은 것으로
//			full 에 1을 더해라 라는 코드
//			혹여 2 씩 증가하고 싶다면 위의 full = full +2 ; 만 가능하다!!!
			full++;
		} else if (data.equals("2")){
			nofull++;
			} //else 끝나는자리
		} // for 끝나는 자리
		System.out.println("배부른 사람 몇명? " + full + "명");
		System.out.println("안배부른 사람 몇명? " + nofull + "명");
	}

}
