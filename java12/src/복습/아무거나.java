package ����;

import java.util.ArrayList;

import javax.swing.JButton;

public class �ƹ��ų� {

	public static void main(String[] args) {
		// �ε���, ����, ���� ������ ����!
		
		ArrayList list = new ArrayList();
		
		list.add("ȫ�浿"); // object <-- String (�ڵ����� ����ȯ �����ش�!!)
		list.add(100); // object <-- Integer(����Ŭ����) <-����ڽ� - int(�⺻��)
		list.add(11.22); // object <-- Double(����Ŭ����, ����Ŭ����) <- ����ڽ�- double(�⺻��)
		list.add(new JButton()); // object <-- JButton 
		// Integer <-- ����ڽ� -- int
		//		   --> �����ڽ� -->
		String name =(String)list.get(0); // ��������!! ���������� ����!! ��������ȯ()������.����()
		// String <- Object ��������ȯ
		int age = (Integer)list.get(1);
		// int < - Integer <- Object , �����ڽ� , ��������ȯ
		
	}

}
