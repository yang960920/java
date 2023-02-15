package 메서드연습;

public class 계산기 {

	public void 더하기(int x,int y) { // 더하기 (2,3)
		
		System.out.println("더하기 기능 처리 방법 내용....~");
		System.out.println(x+y);
		// return 을 쓰려면 void 가 없어야함!! 중요!
	}
	public void 곱하기(int q , int w , int e) {
		System.out.println("곱하기 기능 내용~~");
		System.out.println(q*w*e);
	}
	public int 빼기(int x , int y) {
		System.out.println("빼기 기능 내용~~");
		return x - y;
	}
}
