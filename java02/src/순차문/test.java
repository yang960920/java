package ������;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class test {

	public static void main(String[] args) {
		//�ʿ��� ��ǰ 10�� = > RAM �� ��ǰ�� ����� �־����.
		// JFrame , ImageIcon, JLabel
		JFrame f = new JFrame();
		f.setSize(250, 350);
		ImageIcon icon = new ImageIcon("011.jpg");
		
		JLabel label1 = new JLabel();
		label1.setIcon(icon);
		
		JLabel label2 = new JLabel();
		label2.setText("����1");
		JLabel label3 = new JLabel();
		label3.setText("����2");

		
		// JTextField
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		// Font, FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("����", 1, 20);

		// JButton
		JButton b = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		b.setText("+");
		b2.setText("-");
		b3.setText("*");
		b4.setText("/");
	
		label2.setForeground(Color.blue);
		label3.setForeground(Color.blue);
		b.setForeground(Color.white);
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);
		b4.setForeground(Color.white);
		b.setBackground(Color.blue);
		b2.setBackground(Color.blue);
		b3.setBackground(Color.blue);
		b4.setBackground(Color.blue);
		
		text1.setFont(font);
		text2.setFont(font);
		label2.setFont(font);
		label3.setFont(font);
		b.setFont(font);
		
		f.add(label1);
		f.add(label2);
		f.add(text1);
		f.add(label3);
		f.add(text2);
		f.add(b);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// text1 �� �ִ� ���ڸ� �����Ͷ�! 
				String s1 = text1.getText(); //"333"
				String s2 = text2.getText(); //"222"
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 + n2 ;
				
				// JFrame ������ = new JFrame();
				// ���� �������� ��� JFrame ���� result ����� �־�� ��� ��
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// text1 �� �ִ� ���ڸ� �����Ͷ�! 
				String s3 = text1.getText(); //"333"
				String s4 = text2.getText(); //"222"
				int n3 = Integer.parseInt(s3);
				int n4 = Integer.parseInt(s4);
				int result = n3 - n4 ;
				
				// JFrame ������ = new JFrame();
				// ���� �������� ��� JFrame ���� result ����� �־�� ��� ��
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// text1 �� �ִ� ���ڸ� �����Ͷ�! 
				String s5 = text1.getText(); //"333"
				String s6 = text2.getText(); //"222"
				int n5 = Integer.parseInt(s5);
				int n6 = Integer.parseInt(s6);
				int result = n5 * n6 ;
				
				// JFrame ������ = new JFrame();
				// ���� �������� ��� JFrame ���� result ����� �־�� ��� ��
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// text1 �� �ִ� ���ڸ� �����Ͷ�! 
				String s7 = text1.getText(); //"333"
				String s8 = text2.getText(); //"222"
				int n7 = Integer.parseInt(s7);
				int n8 = Integer.parseInt(s8);
				// ������� �Ǽ��� �߻��Ҽ� �����Ƿ�
				double result = n7 /(double) n8 ;
				
				// JFrame ������ = new JFrame();
				// ���� �������� ��� JFrame ���� result ����� �־�� ��� ��
				JOptionPane.showMessageDialog(f, String.format("%.3f", result));
				// ���� ����� �Ҽ��� 3�ڸ� ��� ���������
				//String.format("%.3f", result) �� �ϸ�ȴ�.
			}
		});
		
		
		
		
		// ���� �ִ� ������ �״�� �������� �������**
		f.setVisible(true);
	}

}
