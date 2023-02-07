package 조건문;

public class IF문3 {

	public static void main(String[] args) {
		//조건이 여러개 일때
		int myNum = 99;
		
		if (myNum >=80) {
			System.out.println("최우수");
		} else if (myNum >=70){
			System.out.println("우수");
		} else if (myNum >= 60) {
			System.out.println("보통");
		} else {
			System.out.println("미달");
		}
		
		int myTour = 10; // 올해 여행 횟수
//		if (myTour == 10) {
//			System.out.println("VVIP");
//		} else if (myTour == 6){
//			System.out.println("VIP");
//		} else {
//			System.out.println("Normal");
//		}
		switch (myTour) { // switch 문은 원하는 값에서 멈추려면 break 를 꼭 써줘야함!!
		case 10:
			System.out.println("VVip");
			break;
		case 6:
			System.out.println("Vip");
			break;
		default:
			System.out.println("Normal");
			break;
		}
	}
}
