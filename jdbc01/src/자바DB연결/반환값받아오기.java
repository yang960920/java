package �ڹ�DB����;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

public class ��ȯ���޾ƿ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		��ȯ������ re = new ��ȯ������(); //�޼��� 12��
		re.add2(); // �Ҳ�! ��ȯ���� ���� void
		
		int result1 = re.add(200, 100); // int 300
		System.out.println(result1); // ���Ѱ��� ����Ʈ!!
		
		double result2 = re.add(33.2, 100);
		System.out.println(result2);
		
		String result3 = re.add("����", "õ��");
		System.out.println(result3);
		
		String result4 = re.add(1, "�� õ��");
		System.out.println(result4);
		
		int[] result5 = re.add();
		System.out.println(result5);
		
		Date result6 = re.getDate(); 
		//�������� ���� ����Ͻú��ʿ���
		System.out.println(result6.getMinutes());
		System.out.println(result6.getSeconds());
		//���� 0: �Ͽ���, 1: ������, 2: ȭ����
		System.out.println(result6.getDay());
		//==> ������ ���� ���� ����Ʈ �Ұ�!!
	    //==> result6.getMinutes()�� ������ �־ ����Ʈ ����!
		  
		int result7 = re.getHour();
		System.out.println(result7 + "�� �Դϴ�. ������.");
		  
		int result8 = re.getRandom2();
		System.out.println("������ ������ " + result8);
		  
		ArrayList result9 = re.getList();
		System.out.println(result9.get(0) + " " + result9.get(1));
		result9.set(0, "����"); //0�� �ε����� �� ���ķ� ����  
		System.out.println(result9);
		  
		HashSet result10 = re.getSet();
	 System.out.println(result10);
		


	}

}
