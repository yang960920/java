package �迭��ȭ;

public class �迭�������� {

	public static void main(String[] args) {
		int[] num3 = {100,200,300};
//		int[] num4 = num3; // ���� ���� , �ּҰ� ����
		int[] num4 = num3.clone(); // ���� ����� �ּҰ� ����Ű�� ���� ����
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num4 == num3); // �ּҰ� �������� ���Ѵ�~!
		
		num3[0] = 999;
		for (int i = 0; i < num4.length; i++) {
			System.out.print(num4[i]+ " " );
		}
		System.out.println();
		for (int i = 0; i < num3.length; i++) {
			System.out.print(num3[i]+ " " );
		}
			

	}

}
