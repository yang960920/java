package �ֽ������ý���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ���̹��ֽ������ý��� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 600);
		f.getContentPane().setBackground(Color.yellow);
		f.setLayout(new FlowLayout());
		Font font = new Font("�ü�" , Font.BOLD , 50);

		JLabel label = new JLabel("CODE");
		label.setFont(font);
		
		JTextField text = new JTextField(7);
		text.setFont(font);
		
		JButton b1 = new JButton("�Ｚ����");
		JButton b2 = new JButton("ī ī ��");
		JButton b3 = new JButton("�� �� ��");
		JButton b4 = new JButton("ũ�Ѹ�����");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		b1.setBackground(Color.green);
		b2.setBackground(Color.pink);
		b3.setBackground(Color.blue);
		b4.setBackground(Color.white);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				���̹�����ũ�Ѹ�3 c = new ���̹�����ũ�Ѹ�3();
				c.naver("005930");
				text.setText("005930");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				���̹�����ũ�Ѹ�3 c = new ���̹�����ũ�Ѹ�3();
				c.naver("035720");
				text.setText("035720");
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				���̹�����ũ�Ѹ�3 c = new ���̹�����ũ�Ѹ�3();
				c.naver("035420");
				text.setText("035420");
			}
		});
		
		
		
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.add(text);
		f.add(b4);
		
		
		
		f.setVisible(true);
	}

}
