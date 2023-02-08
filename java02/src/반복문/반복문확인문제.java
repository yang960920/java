package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 반복문확인문제 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(200, 300);
		Font font = new Font("D2Coding", 1 , 20);
		
		JButton b1 = new JButton();
		b1.setText("별10개");
		JButton b2 = new JButton();
		b2.setText("커피5개");
		JButton b3 = new JButton();
		b3.setText("커피*우유3");
		JButton b4 = new JButton();
		b4.setText("1:짱!");

		FlowLayout flow = new FlowLayout();
		
		f.setLayout(flow);
		f.add(b1);
		f.getContentPane().setBackground(Color.green);
		b1.setBackground(Color.pink);
		b2.setBackground(Color.cyan);
		b3.setBackground(Color.pink);
		b4.setBackground(Color.cyan);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		// 1. 버튼에다가 액션 기능을 추가하겠다 선언
		// 2. 클릭 액션이 있을때 어떤 부품이 액션처리를 어떻게 할지 코딩해주면 됨
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!!
				System.out.println("b1을 클릭했음");
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!!
				System.out.println();
				System.out.println("b2을 클릭했음");
				System.out.println();
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
			}
		});
		b3.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!!
				System.out.println();
				System.out.println("b3을 클릭했음");
				System.out.println();
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!!
				System.out.println("b4을 클릭했음");
				for (int i = 0; i < 3; i++) {
					System.out.println((i+1) +" : 짱!"); // 앞에서 부터 계산되니 (i+1) 는 안해도 된다.
				}
			}
		});
		
		
		
		f.setVisible(true);
		
	}

}
