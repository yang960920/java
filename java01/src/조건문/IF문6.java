package ���ǹ�;

import java.time.Year;
import java.util.Date;

import javax.naming.spi.DirStateFactory.Result;

public class IF��6 {

	public static void main(String[] args) {
		{
		
		Date date = new Date();
		
		int year = date.getYear() + 1900;
	
		if (year >= 2000) {
			System.out.println("�з��Ͼ� ����ñ���!");
		} else {
			System.out.println("�з��Ͼ� ���밡 �ƴϽñ���!");
		}
		
		int day = date.getDay(); // day�� ���� 0 : �Ͽ���  1 : ������ 6: �����
		switch (day) {
		case 6: case 0:
			System.out.println("��~~~~~��");
			break;

		default:
			System.out.println("������~~~ ��������");
			break;
		}
		
		int month = date.getMonth() + 1;
		switch (month) {
		case 2:
			System.out.println("28�ϱ���");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30�ϱ���");
		default:
			System.out.println("31�ϱ���");
			break;
		}
		
		
		}
	}
}