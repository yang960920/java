package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형다형성 {

	public static void main(String[] args) {
		// 클래스 다형성 == 참조형 다형성
		// 상속!! 관계일때만 형변환이 가능!!
		
		ArrayList list = new ArrayList();
		
		list.add("홍길동"); // Object < - String
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
		b.setText("나는버튼");
	}

}
