package �迭;

public class �迭���� {

	public static void main(String[] args) {
		// �������� �����͸� ���� �����صΰ� cpu�� �����Ͽ� ����ϰ�
		// ���� ��� ����ϴ� ��ǰ
		// 1. ���� �̹� �˰� �ִ� ���
		int[] jumsu = {10, 20 , 30 , 40}; // length ��� ������ �ڵ����� ���� �� ����� ���� �־���.
		System.out.println(jumsu);
		System.out.println(jumsu[0]); // ù��° ��
		System.out.println(jumsu[1]); // �ι�° ��
		System.out.println(jumsu[2]); // ����° ��
		System.out.println(jumsu[3]); // �׹�° ��
		System.out.println("��ü���� " +jumsu.length); // �� �ּҰ� ����Ű�� length ������ ����Ʈ�غ�����
	
		jumsu[0] = 100; // ù��° ������ 100�� ��������. 10<-- 100
		System.out.println(jumsu[0]);
		
		//2. ���� �𸣰��ִٸ� --> ���� ��������� �����ΰ�
		// ���߿� ���� �ִ� ���
		int[] jumsu2 = new int[4];
		jumsu2[0] = 200;
		System.out.println(jumsu2[0]);
	}

}
