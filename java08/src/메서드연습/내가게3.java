package �޼��忬��;

public class ������3 {

	public static void main(String[] args) {
			����3 cal3 = new ����3();
			int price =7000;
			int count1 = 5; // ������ �� �մԼ�
			int count2 = 4; // ���Ŀ� �� �մԼ�
			
		System.out.println(Math.PI);	
		System.out.println(Math.ceil(3.334)); // ������ �ø�	
		System.out.println(Math.floor(3.334));	// ������ ����
		System.out.println(Math.round(3.334));	// �ݿø�
		System.out.println(Math.round(3.534));	// �ݿø�!
		System.out.println(Math.sqrt(100)); // ��Ʈ
		System.out.println(Math.max(100, 200)); // (x,y) ���� ���� �� ũ��!?
		System.out.println(Math.min(100, 200)); // (x,y) ���� ���� �� �۴�!?
		
		
		
			
		int result1 = cal3.add( count1 , count2);
		System.out.println("���� �� �մ��� �� ���� : "+ result1 + "�� �Դϴ�.");
		
		int result2 = cal3.minus(count1, count2);
		System.out.println("�մ� �� ���̴� : "+ result2 + "�� �Դϴ�.");
		
		int result3 = cal3.multi(count1, price);	
		System.out.println("���� ���� �ݾ��� : "+ result3 + "�� �Դϴ�.");
			
		int result4 = cal3.multi(count2, price);	
		System.out.println("���� ���� �ݾ��� : "+ result4 + "�� �Դϴ�.");
	
		int result5 = cal3.add(result3, result4);	
		System.out.println("���� �Ϸ� �� ���� �ݾ��� : "+ result5 + "�� �Դϴ�.");
		
		int result6 = cal3.div(result5 , 9);
		System.out.println("1�δ� ���� �ݾ��� : " + result6 + "�� �Դϴ�.");
	
	
	}

}
