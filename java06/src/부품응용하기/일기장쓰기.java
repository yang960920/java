package ��ǰ�����ϱ�;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class �ϱ��徲�� {
	// ������� = �Ƚᵵ��!
	// ����޼���
	public void open() {
		//jframe ȭ���� ���̰� ����!! ����� �����ϵ�����.
//		System.out.println("ȭ���� open�ɰſ���");
		JFrame f = new JFrame();
		f.setSize(300, 600);
		f.setTitle("�ϱ��徲��");
		f.getContentPane().setBackground(Color.yellow);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("D2Cording" , 1 , 30);
		
		JLabel l1 = new JLabel("������ ��¥");
		JLabel l2 = new JLabel("������ ����");
		JLabel l3 = new JLabel("������ ����");
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
	
		
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		JTextArea text3 = new JTextArea(5,10);
		text1.setFont(font);
		text1.setForeground(Color.blue);
		
		text2.setFont(font);
		text2.setForeground(Color.blue);
		
		text3.setFont(font);
		text3.setForeground(Color.blue);
		JButton b1 = new JButton();
		b1.setText("���Ͽ� �ϱ� ����");
		b1.setFont(font);
		b1.setBackground(Color.red);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��¥,����,���� �Է��� �� ������ ������.
				String day = text1.getText();
				String title = text2.getText();
				String content = text3.getText();
				JOptionPane.showMessageDialog(f, day + " " + title + " " + content
						+" " + "�ش� ������ ������ �Ϸ�ƽ��ϴ�!");
				//���ϵ� ������ְ� , �ڹ����α׷��� file���� �������(����,Stream)��
				//������ش�
				//�ܺο� �ִ� ���� , ��Ʈ��ũ�� cpu ���� �ڹٿ��� ������ ����
				//���� ������ ��Ȳ�̶�� ��!!
				//�̷��� ������ ��Ȳ���� ���� ������ �߻��ϸ� ��� ó�������� �ݵ�� �������
				try {
					FileWriter file = new FileWriter(day + ".txt");
					file.write(day+"\n");
					file.write(title+"\n");
					file.write(content+"\n");
					file.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("Warning : ���Ϸ� �����ϴ� �� ������ ����!!!");
				}
			}
		});
		
		
		f.add(l1);
		f.add(text1);
		f.add(l2);
		f.add(text2);
		f.add(l3);
		f.add(text3);
		f.add(b1);
		
		
		
		f.setVisible(true);
	}
}
