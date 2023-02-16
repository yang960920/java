package 스태틱;

public class 나의일기 {

	
	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 8,"운연역");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day2 = new Day("주변산책", 1,"장아산");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day3 = new Day("시험요약정리", 2,"말도안돼");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		// 총 12개 다이나믹 생성 , 멤버변수 ==> 객체생성 할때마다 다이나믹하게
		// 무더기영역(heap)에 생긴 변수
		// 인스턴스 변수라고 부른다~
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
	}

}
