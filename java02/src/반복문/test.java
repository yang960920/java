package �ݺ���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(400, 300);
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
		
		f.setVisible(true);
		
	}

}
