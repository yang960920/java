package ����ƽ;

public class �����ϱ� {

	
	public static void main(String[] args) {
		Day day1 = new Day("�ڹٰ���", 8,"���");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day2 = new Day("�ֺ���å", 1,"��ƻ�");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day3 = new Day("����������", 2,"�����ȵ�");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		// �� 12�� ���̳��� ���� , ������� ==> ��ü���� �Ҷ����� ���̳����ϰ�
		// �����⿵��(heap)�� ���� ����
		// �ν��Ͻ� ������� �θ���~
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
	}

}
