package �迭����;

public class �ݼ�������Ȯ�� {

	public static void main(String[] args) {
		int[] n1 = { 44, 66, 77, 22, 11 };
		int[] n2 = { 33, 55, 77, 22, 40 };
		
		int count = 0;
		int count2 = 0;
		
		for (int i = 0; i < n2.length; i++) {
			if (n1[i]== n2[i]) {
				count++;
			} else  {
				count2++;
			}
		}
		System.out.println("������ �Ȱ��� �л� ���� " + count + "�� �̴�.");
		System.out.println("������ �ٸ� �л� ���� " + count2 + "�� �̴�.");
		
	}

}
