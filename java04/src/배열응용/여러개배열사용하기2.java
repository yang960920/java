package �迭����;

public class �������迭����ϱ�2 {

	public static void main(String[] args) {
		String[] names = {"ȫ�浿","�̼���","������","��ź","����ũ"};
		int[] term1 = { 77, 66, 88, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		int count = 0;
		int count2 = 0;
		
		
		
		for (int i = 0; i < term2.length; i++) {
			if ( term1[i] < term2[i]) {
				count++;
			} else if ( term1[i] == term2[i]){
				count2++;
			}
			if (term2[i] == 100 ) {
				System.out.println("���� �л��� �̸��� " +names[i]+"\t" + i +"�� �̴�" );
			}
		}//for��
		
		
		System.out.println("2�б� ������ ���� �л��� " + count);
		System.out.println("������ ������ �л��� " + count2);
		
		int sum = 0;
		for (int x : term1) {
			sum = (sum + x)/names.length;
		}
		int sum2 = 0;
		for (int x : term2) {
			sum2 = (sum2 + x)/names.length;
		}if (sum > sum2) {
			System.out.println("�б� �� �� ���� ����� 1�б��̴�.");
		}else {
			System.out.println("�б� �� �� ���� ����� 2�б��̴�.");
		}
		
	}

}
