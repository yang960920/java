package 조건문;

import javax.swing.JOptionPane;

public class IF문7 {

	public static void main(String[] args) {
		String ssn = "pass";
		if (ssn.equals("pass")) {
			System.out.println("들어오세요");
		} else {
			System.out.println("나가세요");
		}
		
		String ssn1 = "라면";
				if (ssn1.equals("자장면")) {
					System.out.println("중국집으로가세요");
				} else if (ssn1.equals("라면")){
					System.out.println("분식집으로가세요");
				} else if (ssn1.equals("회")) {
					System.out.println("횟집으로가세요");
				} else {
					System.out.println("그냥 안먹어요");
				}
		String d1 = JOptionPane.showInputDialog("정수를 입력하시오 -1");
		String d2 = JOptionPane.showInputDialog("정수를 입력하시오 -2");
		
		// String 변수명 = JOptionPane.showInputDialog ("정수값")
		// 괄호 안의 값이 정수 그리고 String 이 태그일 경우
		// 정수를 인식해야 하므로 int 변수명2 = Integer.parseInt(변수명) 이 반드시 필요
		int d11 = Integer.parseInt(d1);
		int d22 = Integer.parseInt(d2);
		
		if (d11 > d22) {
			System.out.println(d11 + "이 더 큽니다");
		} else if (d11 < d22){
			System.out.println(d22 + "이 더 큽니다");
		} else {
			System.out.println("두 수는 같습니다");
		}
		
		String no = "A100EX";
				
			char num = no.charAt(0);
//		if (num == 'A') {
//			System.out.println("기획부");
//		} else if (num == 'B'){
//			System.out.println("총무부");
//		} else if (num == 'C'){
//			System.out.println("개발부");
//		} else {
//			System.out.println("해당부서없음");
//		}
		switch (num) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
		case 'C':
			System.out.println("개발부");
		default:
			System.out.println("해당부서없음");
			break;
		}
	}
}