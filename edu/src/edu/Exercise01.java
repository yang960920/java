package edu;

public class Exercise01 {

	public static void main(String[] args) {
		//1. ���� ���¹�ȣ�� ������ account ������ �����մϴ� . ���¹�ȣ�� "01-123-456" �Դϴ�
		String account = "01-123-456";
		//2. �ܾ��� ������ balance ������ �����մϴ�. �ʱⰪ�� 0�Դϴ�.
		int balance = 0;
		//3. �Աݾ��� ������ deposit ������ �����մϴ�. �ʱⰪ�� 0�Դϴ�.
		int deposit = 0;
		//4. ��ݾ��� ������ withdraw ������ �����մϴ�. �ʱⰪ�� 0�Դϴ�
		int withdraw = 0;
		//5. ���� ������ ����� rate ������ �����մϴ�. ������ 3.3 �Դϴ�.
		double rate = 3.3;
		//6. ���� �ݾ��� ������ interest ������ �����մϴ�. �ʱⰪ�� 0.0 �Դϴ�
		double interest = 0.0;
		//7. deposit ������ �Ա��� 500,000������ �����մϴ�.
		deposit = 500000;
		//8. �ܾ��� ����մϴ� (balance = balance + deposit)
		balance += deposit;
		//9. withdraw ������ ����� 200,000���� �����մϴ�.
		withdraw = 200000;
		//10. �ܾ��� ����մϴ� (balance = balance - withdraw)
		balance -= withdraw;
		//11. ���� ����� �մϴ� (interest = balance*rate)
		interest = (balance*rate)/100;
		//12. ���� �ܾ��� ����մϴ�
		System.out.println("���� ���� �ܾ��� " + (balance+interest) +"�� �Դϴ�.");
	
	}
	
}
