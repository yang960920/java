package 자바DB연결;

import java.util.Scanner;

public class 게시판글삭제하기 {

	public static void main(String[] args) {
	
		//입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("탈퇴할 NO를 입력하세요.");
		
		int NO = sc.nextInt();
		
		BBSDAO dao = new BBSDAO();
		dao.delete(NO);
	}

}