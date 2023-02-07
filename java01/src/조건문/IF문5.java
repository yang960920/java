package 조건문;

public class IF문5 {

	public static void main(String[] args) {
		String ssn = "2055111"; // 주민 번호 뒷자리!
				
				//String 은 기본형 데이터가 아니여서 명령어(함수)를 사용해야함.
				// 명령어는 .equals() 이다
				if (ssn.equals("2055111")) {
					System.out.println("동일한 지역에서 태어나셨군요!!");
				} else {
					System.out.println("동일한 지역에서 태어나신게 아니군요!!!");
				}
				
		char gender = ssn.charAt(0); // 첫번째 자리에 있는 문자 하나 추출
		switch (gender) {
		case '1': case '3':
			System.out.println("남자시군요!");
			break;
		case '2': case '4':
			System.out.println("여자시군요!");
			break;
		}
	
	}
}
