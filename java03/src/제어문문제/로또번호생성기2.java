package �������;

import java.util.Random;

public class �ζǹ�ȣ������2 {

	public static void main(String[] args) {
		// �ƹ����̳� �߻���Ű�� ��ǰ ==> Random
		Random r = new Random(); 
		// Random r = new Random(���� (=seed��))
		// ��¥ ������ ���� ������ִ� ��ǰ.
//		for (int i = 0; i < 6; i++) {
//		System.out.println("�ζǹ�ȣ : " + (r.nextInt(45) + 1)); //0~9 �� ���´�
		
		for (int i = 0; i < 6; i++) {
			System.out.println("������ : " + (r.nextInt(9)+2));
		}
		
		System.out.println();
		for (int i = 0; i < 6; i++) {
			System.out.println("������ : " + (r.nextInt(28)+3));
		}
		
		
	}

}
