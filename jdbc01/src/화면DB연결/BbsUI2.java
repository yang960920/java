package ȭ��DB����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BbsUI2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("���� �Խ��� ȭ��");
		f.setSize(850, 480);
		
		JLabel l1 = new JLabel("<<<< �Խ��� �۾��� ȭ�� >>>>");
		JLabel l2 = new JLabel("�Խ��� ��ȣ");
		JLabel l3 = new JLabel("�Խ��� ����");
		JLabel l4 = new JLabel("�Խ��� ����");
		JLabel l5 = new JLabel("�Խ��� �۾���");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("�Խ��� �۾��� ó��");
		JButton b2 = new JButton("�Խ��� ����� ó��");
		JButton b3 = new JButton("�Խ��� �� �� ó��");
		JButton b4 = new JButton("�Խ��� �� �� ó��");
		
		//f�� ���� �ִ� ��ҵ��� add�� �ٿ��־���ϴµ�,
		//���̴� ������� ���帣���� �ٿ��ְ� ����.
		//���帣���� �ٿ��ִ� ��ǰ�� �ʿ�
		FlowLayout flow = new FlowLayout();
		
		//��Ʈ�� �����ϱ� ���� font��ǰ �ʿ� 
		Font font = new Font("�ü�", Font.BOLD, 40);
		
		//////////// �ʿ��� ��ǰ(��ü)�� ram�� ������ ����, �غ� �� ///////
		///������ �����غ���. ///
		f.setLayout(flow);
		
		f.add(l1);
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(l5); f.add(t4);
		f.add(b1); f.add(b2);
		f.add(b3); f.add(b4);
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		t1.setBackground(Color.yellow);
		t1.setForeground(Color.red);
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.red);
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.red);
		t4.setBackground(Color.yellow);
		t4.setForeground(Color.red);
		
		b1.setBackground(Color.pink); //����
		b1.setForeground(Color.blue); //���ڻ� 
		b2.setBackground(Color.pink);
		b2.setForeground(Color.blue);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.blue);
		b4.setBackground(Color.pink);
		b4.setForeground(Color.blue);
		
		f.getContentPane().setBackground(Color.pink);
		//�� ������~~~~~
		f.setVisible(true);

	}

}