package ����ȯ;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class �׷�������ȯ {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		// FlowLayout flow = new // FlowLayout();
		f.setLayout(new FlowLayout());
		
		
		
		
		
		f.add(new JLabel("���� ��"));
		f.add(new JButton("���¹�ư"));
		f.add(new JTextField(10));
		
		
		
		
		
		
		
		f.setVisible(true);		
	}

}
