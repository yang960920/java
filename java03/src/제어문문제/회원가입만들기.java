package �������;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ȸ�����Ը���� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		
		FlowLayout flow = new FlowLayout();
		ImageIcon icon = new ImageIcon("2.png");
		Font font = new Font("�ü�" , 1 , 20);
		f.setLayout(flow);
		
		Label text1 = new Label();
		text1.setText("���̵� �Է�");
		Label text2 = new Label();
		text2.setText("�н����� �Է�");
		Label text3 = new Label();
		text3.setText("�̸� �Է�");
		Label text4 = new Label();
		text4.setText("��ȭ��ȣ �Է�");
		
		JTextField id = new JTextField(10);
		JTextField pw = new JTextField(10);
		JTextField name = new JTextField(10);
		JTextField tel = new JTextField(10);
		
		JButton b1 = new JButton();
		b1.setText("ȸ������ó��");

		b1.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		id.setFont(font);
		pw.setFont(font);
		name.setFont(font);
		tel.setFont(font);
		
		f.add(text1);
		f.add(id);
		f.add(text2);
		f.add(pw);
		f.add(text3);
		f.add(name);
		f.add(text4);
		f.add(tel);
		f.add(b1);

		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id1 = id.getText();
				String pw1 = pw.getText();
				String name1 = name.getText();
				String tel1 = tel.getText();
				JOptionPane.showMessageDialog(f,"���̵� : " + id1 + " �н����� : " + pw1 );

			}
		});
		
		
		
		f.setVisible(true);
	}

}
