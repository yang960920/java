package ����ȯ;

import java.util.ArrayList;

import javax.swing.JButton;

public class ������������ {

	public static void main(String[] args) {
		// Ŭ���� ������ == ������ ������
		// ���!! �����϶��� ����ȯ�� ����!!
		
		ArrayList list = new ArrayList();
		
		list.add("ȫ�浿"); // Object < - String
		list.add(100) ;// Object < - Integer
		list.add(11.22); // Object < - Double
		list.add(new JButton()); // Object < - JButton
		
		String name = (String)list.get(0);
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		
		int age = (Integer)list.get(1);
		System.out.println(age+1);
		
		double jumsu = (double)list.get(2);
		System.out.println(jumsu+1);
		
		JButton b = (JButton)list.get(3);
		b.setText("���¹�ư");
	}

}
