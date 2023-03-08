package ȭ��DB����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import �ڹ�DB����.MemberDAO2;

public class MemberUI3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("���� ȸ������ ȭ��");
		f.setSize(650, 500);
		
		JLabel l1 = new JLabel("<<<< ȸ������ȭ�� >>>>");
		JLabel l2 = new JLabel("���̵�");
		JLabel l3 = new JLabel("�н�����");
		JLabel l4 = new JLabel("�� ��");
		JLabel l5 = new JLabel("��ȭ��ȣ");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("ȸ������ ó��");
		JButton b2 = new JButton("ȸ��Ż�� ó��");
		JButton b3 = new JButton("ȸ������ ó��");
		JButton b4 = new JButton("ȸ���˻� ó��");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ȸ������ó��");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText(); // ""
				if (id.equals("")) { // �⺻�� 4������ == �����ڸ� ��밡���ϴ�~
					JOptionPane.showMessageDialog(f, "id�� �ʼ��Է� �׸��Դϴ�");
				}
				
				MemberDAO3 dao = new MemberDAO3();
				// 1. ������ ������ּ���.
				MemberVO bag = new MemberVO();
				// 2. ���濡 ������ �־��ּ���.
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				// 3. ������ ����ִ� ������ ��������.
				int result = dao.insert(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "ȸ������ ����!!" +"\n ============"+ "\n���̵� : " + id 
							+ " \n�н������ : " + pw + " \n�̸��� : " + name
							+ " \n��ȭ��ȣ�� : " + tel);
				}else {
					JOptionPane.showMessageDialog(f, "ȸ������ ����!! ���Է����ּ���.");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
				}
			}//action
		});//b1
		
		// Ż����
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ȸ������ó��");
				String id = t1.getText();
				
				MemberDAO3 dao = new MemberDAO3();
				int result = dao.delete(id);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "Ż�𼺰�");
					t1.setText("");
				}else {
					JOptionPane.showMessageDialog(f, "Ż�� ����!!, id �� Ȯ�����ּ���");
					t1.setText("");
				}
			}//action
		});//b1
		
		//�������
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ȸ������ó��");
				String id = t1.getText();
				String tel = t4.getText(); // ""
				
				MemberDAO3 dao = new MemberDAO3();
				MemberVO bag = new MemberVO();
				
				bag.setTel(tel);
				bag.setId(id);
				
				int result = dao.update(bag);;
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "��������");
				}else {
					JOptionPane.showMessageDialog(f, "���� ����!!, id �� Ȯ�����ּ���");
				}
			}//action
		});//b1
		
		
		
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
		t1.setForeground(Color.blue);
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.blue);
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.blue);
		t4.setBackground(Color.yellow);
		t4.setForeground(Color.blue);
		
		b1.setBackground(Color.pink); //����
		b1.setForeground(Color.red); //���ڻ� 
		b2.setBackground(Color.pink);
		b2.setForeground(Color.red);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.red);
		b4.setBackground(Color.pink);
		b4.setForeground(Color.red);
		
		f.getContentPane().setBackground(Color.green);
		
		//�� ������~~~~~
		f.setVisible(true);

	}

}