package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		
		// 입력해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("NO / title / content / writer 순서대로 입력하시오.");
		int NO = sc.nextInt();
		String title = sc.next();
		String content = sc.next();
		String writer = sc.next();
		BBSDAO dao = new BBSDAO();
		dao.insert(NO,title,content,writer);
	}

}
