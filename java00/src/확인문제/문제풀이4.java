package 확인문제;

import javax.swing.JOptionPane;

public class 문제풀이4 {

	public static void main(String[] args) {
	
		int how = 2;
		
		String hobby = JOptionPane.showInputDialog("당신의 취미는 무엇입니까?");
		
		System.out.println("나는 일주일에 " + how + "번 " + hobby + "를 합니다." );
	}

}
