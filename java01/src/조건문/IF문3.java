package ���ǹ�;

public class IF��3 {

	public static void main(String[] args) {
		//������ ������ �϶�
		int myNum = 99;
		
		if (myNum >=80) {
			System.out.println("�ֿ��");
		} else if (myNum >=70){
			System.out.println("���");
		} else if (myNum >= 60) {
			System.out.println("����");
		} else {
			System.out.println("�̴�");
		}
		
		int myTour = 10; // ���� ���� Ƚ��
//		if (myTour == 10) {
//			System.out.println("VVIP");
//		} else if (myTour == 6){
//			System.out.println("VIP");
//		} else {
//			System.out.println("Normal");
//		}
		switch (myTour) { // switch ���� ���ϴ� ������ ���߷��� break �� �� �������!!
		case 10:
			System.out.println("VVip");
			break;
		case 6:
			System.out.println("Vip");
			break;
		default:
			System.out.println("Normal");
			break;
		}
	}
}
