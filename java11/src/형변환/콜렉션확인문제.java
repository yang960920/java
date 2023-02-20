package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class 콜렉션확인문제 {

	public static void main(String[] args) {
//		LinkedList list = new LinkedList();
//		list.add("미국");
//		list.add("홍콩");
//		list.add("일본");
//		list.add("체코");
//		list.add("프랑스");
//		for (int i = 0; i <= list.size()+1; i++) {
//			list.remove();
//			System.out.println("내가 아직 안간 곳은" + list);
//		}
		HashSet tour = new HashSet();
		tour.add("일본");
		tour.add("한국");
		tour.add("중국");
		tour.add("싱가폴");
		tour.add("미국");
		System.out.println(tour);
		
		
		HashMap home = new HashMap();
		
		home.put("안방", "TV");
		home.put("거실", "쇼파");
		home.put("부엌", "냉장고");
		home.put("현관", "신발");
		System.out.println("2-1 답은 " + home);
		System.out.println("2-2 답은 " + home.get("현관"));
		home.put("거실", "책상");
		System.out.println("2-3 답은 "+ home);
		
		ArrayList list2 = new ArrayList();
		
		list2.add("복습하기");
		list2.add("동동이산책");
		list2.add("운동하기");
		list2.add("밥먹기");
		list2.add("잠자기");
		
		System.out.println(list2);
		System.out.println("첫번째 할 일은 "+list2.get(0) + " 마지막 할 일은 " + list2.get(list2.size()-1) );
		list2.set(1, "청소");
		System.out.println("3-3번 답은 " + list2);
		
	
		
	}

}
