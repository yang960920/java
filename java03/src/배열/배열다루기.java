package �迭;

public class �迭�ٷ�� {

	public static void main(String[] args) {
		int x[] = new int[10]; //length : 10
		//index �� 0 ���� ����, ������ ��ġ�� �ε����� length �� 10���� ����.
		System.out.println(x.length);
		x[0] = 10;
		x[1] = 20;
		
		for (int i = 0; i < 10; i++) {
			System.out.print(x[i] + " ");
		}
		
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
	}

}
