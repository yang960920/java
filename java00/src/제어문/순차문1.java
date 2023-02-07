package 제어문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
//		프로그램을 어떤 순서대로 짜야할까?
//		입력 : 데이터를 가지고 오는 것 !
//		처리 : 특정한 작업을 수행합니다
//		출력 : 처리한 내용을 보여주세요!
//		자바는 자주 사용하는 부품은 대문자로 바로 쓸수 있어요!
//		입력(input)
		String name = JOptionPane.showInputDialog("당신의 이름은?");
		
//		처리
		String result= "나의 이름은 " + name + "입니다.";
		
//		출력
		System.out.println(result);
	}

}
