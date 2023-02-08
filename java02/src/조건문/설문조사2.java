package 조건문;

import javax.swing.JOptionPane;

public class 설문조사2 {

	public static void main(String[] args) {
		int 아이유 = 0;
		int BTS = 0;
		int 뉴진스 = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("좋아하는 가수는? 1)아이유 2)BTS 3)뉴진스");
			switch (data) {
			case "1":
				아이유++;
				break;
			case "2":
				BTS++;
				break;
			case "3":
				뉴진스++;
				break;	
			default:
				JOptionPane.showMessageDialog(null, "1,2,3번중에 선택하세요");
				i--;
				break;
			} //switch
		} // for
		System.out.println("아이유를 좋아하는 사람은 " + 아이유 + "명 입니다.");
		System.out.println("BTS를 좋아하는 사람은 " + BTS + "명 입니다.");
		System.out.println("뉴진스를 좋아하는 사람은 " + 뉴진스 + "명 입니다.");
	}

}
