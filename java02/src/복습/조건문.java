package 복습;

public class 조건문 {

	public static void main(String[] args) {
		
		int target = 77; // 숫자맞추기를 해봅시다.
		int me = 77; // 나의 답은 88
		
		// 조건은 비교하는 코드가 들어감.
		// 결과가 무조건 논리형 (true / false)
		if (target == me) { // 조건이 true 이면
			System.out.println("정답입니다.");
			
		} else { // 나머지 조건들일 경우 false
			System.out.println("오답입니다!");
		}
		// if 문은 자체 break 기능이 있다
		// 조건을 만족할 시 자체적으로 멈춤

		
		// String target2 = "로또";
		String you = "신나";
		switch (you) { // switch 문은 자체 멈춤 기능이 없으므로 원하는 위치에 break 를 해야함!
		case "로또":
			System.out.println("정답이다!!!");
			break;
		case "신나": case "놀자": case "나가자":
			System.out.println("오답이다!!!");
			break;
		// default 는 위의 조건이 다 아닐때 사용함
		// 필요 없을시 지워도 무방!!
		default:
			System.out.println("고만해!!");
			break;
		}
		
	}

}
