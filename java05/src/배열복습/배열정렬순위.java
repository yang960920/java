package �迭����;

import java.util.Arrays;
import java.util.Random;


public class �迭���ļ��� {

	public static void main(String[] args) {
		// ������ �� ���� Arrays
		Random r = new Random(42); // ���尪 (seed)
		
		int[] jumsu = new int[10000];
		
		// for �� ==> �Է¿�, ��¿�, iȰ�� ����
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000)+1; // 1~1000 �� ���� 
		}
		// �˾Ƽ� ��ġ���� �Ű� �ָ鼭 �ϳ��� ���� ���� �����̴�
		// for - each ��  == > ��¿� ����
		for (int x : jumsu) {
			System.out.println(x);
		}
		// �������� (������ -- > ū�� ��) , �������� (ū�� --> ������ ��)
		Arrays.sort(jumsu);
		//sort(jumsu) ==> jumsu�� �ٲ����� (������ �ı� ������� ������)
		//�ı��� �Լ�
		
//		String n = JOptionPane.showInputDialog("���ڸ� �Է�");
//		int n2 = Integer.parseInt(n);
		// parseInt(n) ==> RAM �� ����� n �� ����Ȱ� �ƴ�! (���� ���ı� n�� ������)
		// ���ı��� �Լ� ==> ��ȣ���� ���ı��� �Լ��� �� �� ��ȣ��
		
		
		
		// ���� �� ���
		System.out.println("-----------------------");
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		// ������ , �ִ밪 , �ּҰ��� ����Ʈ!
		System.out.println("�ּҰ� :" + jumsu[0]);
		System.out.println("�ִ밪 :" + jumsu[jumsu.length-1]);
		
		//���� 30% , �ο� 3000��, ���� �������� 3000���� �����´� (����)
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 = sum30 + jumsu[i];
		}
		System.out.println("����30%��� : " + (sum30/3000.0));
		
		int sum70 = 0;
		for (int i = 0; i < 3000; i++) {
			sum70 = sum70+jumsu[i];
		}
		System.out.println("����30% ��� : "+(sum70/3000.0));
		String result = Arrays.toString(jumsu); // ���ı��� , String ���� ������� 
		System.out.println(result);
		
		
	}

}
