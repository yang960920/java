package 배열응용;

public class 여러개의배열사용하기1 {

	public static void main(String[] args) {
		//여러개의 배열을 사용하고 싶은경우 사용
		//같은 인덱스 위치에 쓰시오
		// ex) 아버지의 대한 정보는 전부 모든배열에서 0번에 넣자.
		
		String[] 식구 = {"아버지","어머니","형","나"};
		int[] age = {58,59,29,26};
		double[] height = {177.7,164.5,181.8,172.4};
		//컨트롤 쉬프트 f : 코드 자동 정렬
		
		System.out.println("이름\t나이\t키");
		System.out.println("=======================");		
		for (int i = 0; i < height.length; i++) {
			System.out.println(식구[i] + "\t" + age[i] + "\t" + height[i]);
		}
		
	}

}
