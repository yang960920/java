package �������;

import java.util.Random;

public class �ζǹ�ȣ������ {

	public static void main(String[] args) {
		// �ƹ����̳� �߻���Ű�� ��ǰ ==> Random
		Random r = new Random(); 
		// Random r = new Random(���� (=seed��))
		// ��¥ ������ ���� ������ִ� ��ǰ.
		for (int i = 0; i < 6; i++) {
			System.out.println("�ζǹ�ȣ : " + r.nextInt(45)); // 0~9 �� ���´�
		}
		
		
		
	}

}
