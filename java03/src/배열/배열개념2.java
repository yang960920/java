package �迭;

public class �迭����2 {

	public static void main(String[] args) {
		// �������� �����͸� ���� �����صΰ� cpu�� �����Ͽ� ����ϰ�
		// ���� ��� ����ϴ� ��ǰ
		// 1. ���� �̹� �˰� �ִ� ���
		int [] week = {1,2,3,4,5,6,7};
		System.out.println(week[0]);
		System.out.println(week[1]);
		System.out.println(week.length);
		
		week[2] = 10;
		System.out.println("week�� ����° ���� " + week[2]);
		
		week[4] = 12;
		System.out.println("week�� �ټ���° ���� " +week[4]);
		
		//2. ���� �𸣰��ִٸ� --> ���� ��������� �����ΰ�
		// ���߿� ���� �ִ� ���
		int[] tour = new int[4];
		tour[0] = 20;
		tour[2] = 30;
		System.out.println("tour ù��° ���� " + tour[0]);
		System.out.println("tour ����° ���� " + tour[2]);
		System.out.println("tour�� ���� ������ " + tour.length);
	}

}
