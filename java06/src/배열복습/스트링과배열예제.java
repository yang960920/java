package �迭����;

public class ��Ʈ�����迭���� {

	public static void main(String[] args) {
		String num = "   011-245-1234    ";
		String num2 = num.trim();
		System.out.println(num2);
		String[] num3 = num2.split("-");
		for (int i = 0; i < num3.length; i++) {
			if (num3[0].equals("011")) {
				System.out.println("SK ����ڽñ���");
			}else if (num3[0].equals("019")) {
				System.out.println("LG ����ڽñ���");
			}else {
				System.out.println("Apple ����ڽñ���");
			}
		}
		
		if (num3[1].length() >= 4) {
			System.out.println("�ֽ���");
		}else {
			System.out.println("�õ���");
		}
		
		int total = num3[0].length() + num3[1].length() + num3[2].length();
		//for ���� �̿��ؼ� ��� ����~!!
		System.out.println(total);
		if (total >=10) {
			System.out.println("��ȿ�� ��ȭ��ȣ");
		}else {
			System.out.println("��ȿ�������� ��ȭ��ȣ");
			
		}
		int total2 = 0;
		for (int i = 0; i < num3.length; i++) {
			total2 = total2 + num3[i].length();
		}
		System.out.println(total2);
	}

}
