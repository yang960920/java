package �޼��忬��;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ű����ũ����3 {

	static int count1;
	static int count2; // ���
	static int count3; // ����
	static int count4; // ���������
	
	final static int PRICE = 5000;
	final static int PRICE1 = 5000;
	final static int PRICE2 = 6000;
	final static int PRICE3 = 7500;
	
	public static void main(String[] args) {
		
			JFrame f = new JFrame();
			f.setSize(800, 700);
			f.setTitle("��丸��");
			f.getContentPane().setBackground(Color.white);
			
			FlowLayout flow = new FlowLayout();
			f.setLayout(flow);
			Font font = new Font("����" , 1 , 30);
			
			JLabel l1 = new JLabel("����");
			l1.setFont(font);
			JLabel count = new JLabel("��");
			count.setFont(font);
			JLabel img = new JLabel();
			ImageIcon icon = new ImageIcon("��ũ����_20230215_052331.png");
			img.setIcon(icon);
			JLabel total = new JLabel("��ü �ݾ��� : " );
			total.setFont(font);
			
			JButton b1 = new JButton("���");
			b1.setFont(font);
			b1.setBorderPainted(false);
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ImageIcon icon = new ImageIcon("���.png");
					img.setIcon(icon);
					count1++;
					count.setText(count1+"��");
					total.setText("��ü �ݾ��� : " +count1*PRICE + "�� �Դϴ�.");
					count2++;
					f.setTitle("���: " + count2 + "��, ����: " + count3 + "��, ���������: " + count4 + "��");
					int total2 = (count2 * PRICE1) + (count3 * PRICE2) + (count4 * PRICE3);
					total.setText("�����ݾ� " + total2 + "��");
				}
			});
			
			JButton b2 = new JButton("����");
			b2.setFont(font);
			b2.setBorderPainted(false);
			
			b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ImageIcon icon = new ImageIcon("����.png");
					img.setIcon(icon);
					count1++;
					count.setText(count1+"��");
					total.setText("��ü �ݾ��� : " +count1*PRICE + "�� �Դϴ�.");
					count3++;
					f.setTitle("���: " + count2 + "��, ����: " + count3 + "��, ���������: " + count4 + "��");
					int total2 = (count2 * PRICE1) + (count3 * PRICE2) + (count4 * PRICE3);
					total.setText("�����ݾ� " + total2 + "��");
				}
			});
			
			JButton b3 = new JButton("���������");
			b3.setFont(font);
			b3.setBorderPainted(false);
			
			b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ImageIcon icon = new ImageIcon("���������.png");
					img.setIcon(icon);
					count1++;
					count.setText(count1+"��");
					total.setText("��ü �ݾ��� : " +count1*PRICE + "�� �Դϴ�.");
					count4++;
					f.setTitle("���: " + count2 + "��, ����: " + count3 + "��, ���������: " + count4 + "��");
					int total2 = (count2 * PRICE1) + (count3 * PRICE2) + (count4 * PRICE3);
					total.setText("�����ݾ� " + total2 + "��");
					
				}
			});
			
			
			
			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(l1);
			f.add(count);
			f.add(img);
			f.add(total);
			
			
			
			
			f.setVisible(true);
	}

}
