package �迭����;

import java.util.Random;

public class �迭�� {

	public static void main(String[] args) {
		// �Է� : ���� ���� ������� (�迭 , 2��)
		// �迭 �ϳ���  990���� ������� �ʿ�
		//	���� ������ ������� ���� (990+1+1) * 2 
		//		�������� �����͸� �Է� (Random)
		//		�ݺ������� �迭 ��ġ(�ε���)�� �ű�鼭 �����͸� ����.
		int[] ����� = new int[9900];
		int[] ����� = new int[9900];
//		System.out.println(�����.length);
//		System.out.println(�����.length);
//		System.out.println(�����);
//		System.out.println(�����);
		Random r = new Random(); // ���� ���� �������ִ� ��¥�����̴�. (�õ尪�� ������)
		for (int i = 0; i < �����.length; i++) {
			�����[i] = r.nextInt(4) + 1; // 0~3 �ΰ��� +1 �ؼ� ==> 1~4
			�����[i] = r.nextInt(4) + 1; // 0~3 �ΰ��� +1 �ؼ� ==> 1~4
		}
		System.out.println("��ȣ : "+ "\t" +"���"+"\t\t"+"����");
		for (int i = 0; i < �����.length; i++) {
			System.out.println(i+"\t" + �����[i] + "\t <->\t" + �����[i]);
		}
		
		//ó��
		//�ι迭�� ���� �ε����� ���� ������ ��!!
		//�����ϸ� 1���� ȹ��
		int jumsu =0;
		for (int i = 0; i < �����.length; i++) {
			if (�����[i] == �����[i]) {
				jumsu++;
			}
		}
		//���
		System.out.println("���� ������ " + jumsu +"��");
	}

}
