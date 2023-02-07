package 확인문제;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
//		입력
		String days = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String play = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");

//	 	처리
		String Result = "오늘은 " + days + "에 수업 후 나는 " + play + " 할 예정";

//		출력
		System.out.println(Result);
		
	}

}
