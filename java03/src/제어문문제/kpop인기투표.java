package �������;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class kpop�α���ǥ {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(540, 1400);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("D2Coding", 1 , 20);
		Font font2 = new Font("D2Coding", 1 , 30);
		
		JLabel text = new JLabel();
		text.setText("K-pop �α� ��ǥ");
		text.setFont(font2);
		
		JLabel text1 = new JLabel();
		text1.setText("1.������ - ���� ���̿� �ٴ�");
		text1.setFont(font);
//		JLabel text2 = new JLabel();
//		text2.setFont(font);
//		text2.setForeground(Color.pink);
		JTextField text2 = new JTextField(10);
		text2.setFont(font);
		text2.setForeground(Color.pink);
		
		JLabel text3 = new JLabel();
		text3.setText("2.���ι̽����� - DM");
		text3.setFont(font);
//		JLabel text4 = new JLabel();
		JTextField text4 = new JTextField(10);
		text4.setFont(font);
		text4.setForeground(Color.pink);
		
		JLabel text5 = new JLabel();
		text5.setText("3.�̿��� - ��ģ�Ҹ�");
		text5.setFont(font);
//		JLabel text6 = new JLabel();
		JTextField text6 = new JTextField(10);
		text6.setForeground(Color.pink);
		text6.setFont(font);
		
		ImageIcon icon = new ImageIcon("iu.png");
		ImageIcon icon2 = new ImageIcon("fm.png");
		ImageIcon icon3 = new ImageIcon("ye.png");
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		
		b1.setIcon(icon);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		
		f.add(text);
		f.add(b1);
		f.add(text1);
		f.add(text2);
		
		f.add(b2);
		f.add(text3);
		f.add(text4);
		
		f.add(b3);
		f.add(text5);
		f.add(text6);
		
		
		// ��ư�� �׼� ����� �߰��Ҷ���
		// 1. �׼� ��� �߰����ּ��� b1.addActionListener
		// 2. ��ư�� Ŭ�������� � ��ǰ�� ó���Ұ���
		// ==> new ActionListener()
		// 3. ��ư�� Ŭ������ �� ó�� ������ �ڵ�
		// @Override
		//		public void actionPerformed(ActionEvent e) {
		//			//ó���� ������ ��
		//		}
		b1.addActionListener(new ActionListener() {
			int iu = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ư�� Ŭ������ �� ó�� ������ �ڵ�
				iu++;
				text2.setText(iu + "ǥ");
				
			}
		}); // b1.add ��
		b2.addActionListener(new ActionListener() {
			int fm = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				fm++;
				text4.setText(fm + "ǥ");
				
			}
		});
		b3.addActionListener(new ActionListener() {
			int ye = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				ye++;
				text6.setText(ye + "ǥ");
		
			}
		});
		

		f.setVisible(true);
	}

}
