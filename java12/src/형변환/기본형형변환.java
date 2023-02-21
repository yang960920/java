package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		byte b1 = 100; // 1바이트, -128~127 까지의 숫자를 쓸수있음.
		int i1 = 200; // 4바이트 , -21억~21억
		
		i1 = b1; // 큰 <-- 작 자동으로 형변환(자동형변환)
		
		b1 = (byte)i1; // 작 <-- 큰		
		
		// double (큰, 10.0) < - int (작 , 10) 10.0 이나 10이나 같으므로 실수가 정수를 포함한다.
		double d1 = i1; //(자동형변환)
		i1 = (int)d1; // 강제형변환
		
		
		
		
	}

}
