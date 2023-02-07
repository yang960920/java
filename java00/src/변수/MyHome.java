package 변수;

public class MyHome {

	public static void main(String[] args) {
		int myAge = 100;
		//전화 번호랑 주민번호
//		절대로 값을 변하게 하지 말아줘!! 값을 설정
		String myTel = "01079409609";
//		자릿수가 의미가 있는지 체크 (의미가 있으면 int 의미가 없으면 String 로 엮는다
		String ssn ="960920";
		
//		final 을 넣으면 절대로 값이 변하지 않는다.
//		상수변수 ==> final , 변수명을 다 대분자로!!
		final double PI = 3.14;
//		PI = 334.1; 두개를 이런식으로 나열하는건 불가능하다
	}

}
