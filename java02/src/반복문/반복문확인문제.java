package �ݺ���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class �ݺ���Ȯ�ι��� {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(200, 300);
		Font font = new Font("D2Coding", 1 , 20);
		
		JButton b1 = new JButton();
		b1.setText("��10��");
		JButton b2 = new JButton();
		b2.setText("Ŀ��5��");
		JButton b3 = new JButton();
		b3.setText("Ŀ��*����3");
		JButton b4 = new JButton();
		b4.setText("1:¯!");

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
		
		// 1. ��ư���ٰ� �׼� ����� �߰��ϰڴ� ����
		// 2. Ŭ�� �׼��� ������ � ��ǰ�� �׼�ó���� ��� ���� �ڵ����ָ� ��
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Ŭ������ �� ó�� ������ ���⿡ ���ּ���!!
				System.out.println("b1�� Ŭ������");
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Ŭ������ �� ó�� ������ ���⿡ ���ּ���!!
				System.out.println();
				System.out.println("b2�� Ŭ������");
				System.out.println();
				for (int i = 0; i < 5; i++) {
					System.out.print("Ŀ��*");
				}
			}
		});
		b3.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// Ŭ������ �� ó�� ������ ���⿡ ���ּ���!!
				System.out.println();
				System.out.println("b3�� Ŭ������");
				System.out.println();
				for (int i = 0; i < 3; i++) {
					System.out.println("Ŀ��*����");
				}
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Ŭ������ �� ó�� ������ ���⿡ ���ּ���!!
				System.out.println("b4�� Ŭ������");
				for (int i = 0; i < 3; i++) {
					System.out.println((i+1) +" : ¯!"); // �տ��� ���� ���Ǵ� (i+1) �� ���ص� �ȴ�.
				}
			}
		});
		
		
		
		f.setVisible(true);
		
	}

}
