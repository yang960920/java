package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class test {

	public static void main(String[] args) {
		//필요한 부품 10개 = > RAM 에 부품을 만들어 넣어놓자.
		// JFrame , ImageIcon, JLabel
		JFrame f = new JFrame();
		f.setSize(250, 350);
		ImageIcon icon = new ImageIcon("011.jpg");
		
		JLabel label1 = new JLabel();
		label1.setIcon(icon);
		
		JLabel label2 = new JLabel();
		label2.setText("숫자1");
		JLabel label3 = new JLabel();
		label3.setText("숫자2");

		
		// JTextField
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		// Font, FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("굴림", 1, 20);

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
		// 위에 있는 설정을 그대로 프레임을 보여줘라***
		f.setVisible(true);
	}

}
