package ������;

import java.awt.Color;
// import �� �ڵ����� ä������ �ʴ� ���
// ��Ʈ�� + ����Ʈ + o(����)
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class ��ǰ�����2 {

	public static void main(String[] args) {
		// ���� ������� �ʴ� ��ǰ�� �����ô�.
		//Ʋ!! �� �־ �� Ʋ�� ������ �� �ʿ��� ��ǰ�� ����� CPU�� ����!
		// new : Ʋ�� ������ ���� ���
		// new JFrame()�� JFrame �̶�� Ʋ�� �̿��ؼ� ��ǰ�� ����!
		// �ش� ��ǰ�� RAM �� �����ؾ��ϴ� JFrame �� ���������
		// JFrame ������ = new JFrame() ��� Ʋ�� �������Ѵ�.
		// ���� �� JFrame �� �����Ѵٴ� �ǹ�
		JFrame f =new JFrame();
		// f â�� ����� ���� �Ϸ���
		// f.setSize (����,����) �� ǥ�õ�
		f.setSize(450, 150);
		// �� �帣���� ������� ��ġ���ִ� ��ǰ�� ���� �����ؼ� ������ ���ƾ���.
		// FlowLayout ������ = new FlowLayout();
		FlowLayout flow = new FlowLayout();
		
		// f �� ���帣���� ��ġ���ִ� ��ǰ�� ���ڴٶ�� ����(����)
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("���� ��ư1");
		
		JButton b2 = new JButton();
		b2.setText("���� ��ư2");
		
		// �۾��� �ְ� ������ JLabel ������ = new JLabel();
		JLabel text1 = new JLabel();
		text1.setText("���̵�");
		
		JLabel text2 = new JLabel();
		text2.setText("�н�����");
		
		// �۾� �ִ� ��ĭ�� ����� ��
		// JTextField ������ = new JTextField(���ڼ� ���� ���ڷ� �ִ´�)
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		// ���� ũ�� �۾�ü ���� ��Ÿ���� ���� ����! (����ü , ���ϱ� , ũ��)
		Font font = new Font("�ü�", 1, 20);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);
		
		b1.setBackground(Color.red); //����
		b1.setForeground(Color.white); //��ư�� ����, ���ڻ�
		b2.setBackground(Color.red); //����
		b2.setForeground(Color.white); //��ư�� ����, ���ڻ�
		input1.setBackground(Color.red); //����
		input1.setForeground(Color.white); //��ư�� ����, ���ڻ�
		input2.setBackground(Color.red); //����
		input2.setForeground(Color.white); //��ư�� ����, ���ڻ�
		
		// �� �ٿ�ε� ���� �̹����� �ش� ������Ʈ �ȿ� �־���� �ν��Ѵ�
		// ImageIcon ������ = new ImageIcon("���ϸ�");
		ImageIcon icon = new ImageIcon("�ٿ�ε� (1).jpg");
		ImageIcon icon2 = new ImageIcon("�ٿ�ε� (2).jpg");
		
		b1.setIcon(icon);
		b2.setIcon(icon2);
		
		// f â��
		// b1 �̶�� ������ �־��!!
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		//�����ִ� ���� �� ������!!!
		f.setVisible(true);
	}

}
