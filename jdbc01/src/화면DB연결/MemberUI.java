package ȭ��DB����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemberUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("���� ȸ������ ȭ��");
		f.setSize(450, 500);
		f.setLayout(new FlowLayout());
		Font font = new Font("�ü�" , Font.BOLD , 30);
		Font font2 = new Font("����" , Font.BOLD , 50);
		JLabel id = new JLabel();
		JLabel pw = new JLabel();
		JLabel name = new JLabel();
		JLabel tel = new JLabel();
		JLabel top = new JLabel();
		
		ImageIcon icon = new ImageIcon("11.jpg");
		
		
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		
		b1.setText("ȸ������ ó��");
		b2.setText("ȸ��Ż�� ó��");
		b3.setText("ȸ������ ó��");
		b4.setText("ȸ���˻� ó��");
		id.setText("���̵�");
		pw.setText("�н�����");
		name.setText("�̸�");
		tel.setText("��ȭ��ȣ");
		
		top.setIcon(icon);
		
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		b4.setFont(font2);
		id.setFont(font);
		pw.setFont(font);
		name.setFont(font);
		tel.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		
		top.setBackground(Color.white);
		f.getContentPane().setBackground(Color.green);
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		
		
		
		f.add(top);
		f.add(id);
		f.add(t1);
		f.add(pw);
		f.add(t2);
		f.add(name);
		f.add(t3);
		f.add(tel);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		
		
		
		f.setVisible(true);
	}

}
