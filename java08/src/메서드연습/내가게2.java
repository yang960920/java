package �޼��忬��;

public class ������2 {

	public static void main(String[] args) {
		����2 cal2 = new ����2();
		int result1 = cal2.add(300, 200);
		double result2 = cal2.add(300, 22.2);
		double result3 = cal2.add(11.1, 22.2);
		String result4 = cal2.add("���� ���� ��ÿ� ", 1);
		System.out.println(result1 - 1000);
		System.out.println(result2 - 1000);
		System.out.println(result3 - 1000);
		System.out.println(result4 + "�ʹ� �ʾ�!!");
		System.out.println(result1+result2);
	}

}
