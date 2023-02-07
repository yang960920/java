package 조건문;

import java.util.Date;

public class IF문4 {

	public static void main(String[] args) {
		//date - 년월일시분초, jave.util.date
		
		Date date = new Date();
		
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		System.out.println(date.getYear() + 1900);
		System.out.println(date.getMonth() +1);
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		// 태그 명에서 가운데 줄이 그어진 이유는
		// 예전 태그를 사용했을 시에 생기는 현상으로 보다 나은 태그가 있으면 가운데 줄이 생긴다.
		int hour = date.getHours();
//		int hour = 15;
		
		if (hour < 11) {
			System.out.println("굿모닝");
		} else if (hour < 14){
			System.out.println("굿에프터눈");
		} else if (hour < 20){
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}
		
		// date 부품은 음력으로 나오기 때문에 항상 + 1 을해야한다.
		int month = date.getMonth() +1 ;
		System.out.println(month);
		switch (month) {
		case 3: case 4: case 5:
			 System.out.println("봄");
			break;
		case 6: case 7: case 8:
			 System.out.println("여름");
			break;
		case 9: case 10: case 11:
			 System.out.println("가을");
			break;
		
		default:
			System.out.println("겨울");
			break;
		}
		
		
		
	}
}
