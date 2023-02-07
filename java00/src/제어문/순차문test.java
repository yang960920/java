package 제어문;

import javax.swing.JOptionPane;

public class 순차문test {

	public static void main(String[] args) {
//		프로그램을 어떤 순서대로 짜야할까?
//		입력 : 데이터를 가지고 오는 것 !
//		처리 : 특정한 작업을 수행합니다
//		출력 : 처리한 내용을 보여주세요!
//		자바는 자주 사용하는 부품은 대문자로 바로 쓸수 있어요!
//		입력(input)
		String exercise = JOptionPane.showInputDialog("당신의 운동은?");
		String days = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");
		
//		처리
		String result= days + "에 저는 " + exercise + "를 합니다.";
		
//		출력
		System.out.println(result);
	}

}
