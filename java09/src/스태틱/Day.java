package ����ƽ;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum;

	public Day(String doing, int time, String location) {
		// new �� ��ǰ�� ����� ��  (��ü����)
		// ��ü������ ������ �� ó���ϰ� ���� ������ ������
		// ������ �޼��峻���� ���ּ���.
		// ��ü�����Ҷ� ������ �޼��尡 �ڵ�ȣ��Ǳ� ������ ������ ó������.
		count++;
		sum = sum+time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}
		@Override
		public String toString() {
			return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
		}
	}