package 형변환;

import java.util.LinkedList;

public class 시험일정순서 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("국어");
		list.add("수학");
		list.add("영어");
		list.add("컴퓨터");
		System.out.println(list);
		
		System.out.println("=========================");
		
		
		for (int i = 0; i <= list.size(); i++) {
			list.remove();
			System.out.println((i+1)+"일차 시험본 후 남은 과목은" + list);
		}
	}

}
