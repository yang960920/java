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

public class Ű����ũ���� {
	
	static int count2; // 0���� �ڵ� �ʱ�ȭ, ��������
	final static int PRICE = 5000; // final �� ���� �Ұ�, ���
	// ��������� �� ���� �ߺ��̶�� �������� ��� �빮�ڷ� ���°��� ����!!
	
	
	public static void main(String[] args) {

		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.white);
		f.setSize(700, 700);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("�ü�",1,40);
		Font font2 = new Font("�ü�",1,30);
		
		
		ImageIcon icon = new ImageIcon("3.png");
		JLabel l1 = new JLabel("����");
		l1.setFont(font);
		JLabel image = new JLabel();
		image.setIcon(icon);
		JLabel total = new JLabel("���� �ݾ��� : " );
		total.setFont(font);
		
		JLabel count = new JLabel(count2+"��");
		count.setFont(font);
		
		JButton coffee = new JButton("��ü��");
		coffee.setFont(font2);
		coffee.setBackground(Color.magenta);
		coffee.setBorderPainted(false);
		coffee.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("3.png");
				image.setIcon(icon);
				count2++;
				count.setText(count2+"��");
				total.setText("�����ݾ� " + (count2*PRICE) + "��");
			}
		});

		JButton berry = new JButton("���⽧");
		berry.setFont(font2);
		berry.setBackground(Color.pink);
		berry.setBorderPainted(false);
		berry.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("1.png");
				image.setIcon(icon);
				count2++;
				count.setText(count2+"��");
				total.setText("�����ݾ� " + (count2*PRICE) + "��");
				
			}
		});
		JButton mango = new JButton("����");
		mango.setFont(font2);
		mango.setBackground(Color.yellow);
		mango.setBorderPainted(false);
		mango.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("2.png");
				image.setIcon(icon);
				count2++;		
				count.setText(count2+"��");
				total.setText("�����ݾ� " + (count2*PRICE) + "��");
			}
		});
		
		
		
		f.add(coffee);
		f.add(berry);
		f.add(mango);
		f.add(l1);
		f.add(count);
		f.add(image);
		f.add(total);
		
		
		
		f.setVisible(true);
	}
}
