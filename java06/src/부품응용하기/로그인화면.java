package ��ǰ�����ϱ�;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class �α���ȭ�� {

	public static void main(String[] args) {
		// jframe , imageicon , imagelabel
		JFrame f = new JFrame();
		f.setSize(300, 600);
		f.setTitle("���� �ϱ���");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("D2Cording" , 1 , 30);
		
		
		
		JLabel top = new JLabel();
		JLabel id = new JLabel("�� �� ��: ");
		JLabel pw = new JLabel("��й�ȣ: ");
		id.setFont(font);
		pw.setFont(font);
		f.getContentPane().setBackground(Color.yellow);
		
		
		ImageIcon icon1 = new ImageIcon("2.png");
		ImageIcon icon2 = new ImageIcon("ok.png");
		ImageIcon icon3 = new ImageIcon("reset.png");
		top.setIcon(icon1);
		
		JTextField idtext = new JTextField(10);
		JTextField pwtext = new JTextField(10);
		idtext.setFont(font);
		pwtext.setFont(font);
		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);
		login.setBackground(Color.yellow);
		reset.setBackground(Color.yellow);
		login.setBorderPainted(false);
		reset.setBorderPainted(false);
		//idlabel , pwlabel , idtextfield , pwtextfield
		// �α��� ��ư reset ��ư
		// font , flowlayout
		
		//1)��ư�� �׼� ����� add
		//2)Ŭ�� ������ � ������ (��ǰ) ������ new �� ������ּ���
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String id2 = idtext.getText();
				String pw2 = pwtext.getText();
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "�α��� ����");
					// �ϱ��徲�� ��ǰ�� open()����� ����!
					�ϱ��徲�� diary = new �ϱ��徲��();
					diary.open();
					f.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(f, "�α��� ����");
					idtext.setText("");
					pwtext.setText("");
				}
			}
		});
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// reset�� �������� idText, pwText �� ������ �־��!
				JOptionPane.showMessageDialog(f, "���µƽ��ϴ�!");
				idtext.setText("");
				pwtext.setText("");
				
			}
		});
		
		
		f.add(top);
		f.add(id);
		f.add(idtext);
		f.add(pw);
		f.add(pwtext);
		f.add(login);
		f.add(reset);
		
		
		
		
		
		
		f.setVisible(true);

	}

}
