package ����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ��ǰ�����ϱ� {

	public static void main(String[] args) {
		// 1. ���� �Ἥ RAM �� ������ ����� �� �ֵ��� �غ�Ǿ�����. => ��ġ
		// ��ǰ��.���()
		
		// 2. �������� �����Ǵ� Ʋ�� �̿��ؼ� ���� ������ ����� => ���� 
		// RAM�� �����صΰ� �����.
		// JFrame ������ = new JFrame();
		
		JFrame f = new JFrame();
		f.setSize(340, 400);
		
		
		JLabel l = new JLabel(); // ������
		l.setText("����� ������ ���ڸ� �Է��Ͻÿ�");
		
		
		JTextField text = new JTextField(10);
		
		
		JButton b = new JButton(); // ��ư
		
		
		
		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2Coding", 1 , 20); // ���� ��Ʈ�� �����Ϸ��� ���ϴ� ��ŭ ��ǰ�� �߰�
		Font font2 = new Font("D2Coding", 1 , 30);
		
		f.setLayout(flow);
		f.add(l);	
		f.add(text);	
		f.add(b);
		f.getContentPane().setBackground(Color.green);
		text.setBackground(Color.pink);
		text.setForeground(Color.blue);
		text.setFont(font2);
		b.setFont(font2);
		b.setText("���� ���߱�");
		b.setForeground(Color.black);
		b.setBackground(Color.yellow);
		l.setFont(font);
		l.setForeground(Color.black);
		
		
		// ������.setvisible(true); �� ���� �������� �־����!!!
		f.setVisible(true);
	}

}
