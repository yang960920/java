package 제어문문제;

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

public class 회원가입만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		
		FlowLayout flow = new FlowLayout();
		ImageIcon icon = new ImageIcon("2.png");
		Font font = new Font("궁서" , 1 , 20);
		f.setLayout(flow);
		
		Label text1 = new Label();
		text1.setText("아이디 입력");
		Label text2 = new Label();
		text2.setText("패스워드 입력");
		Label text3 = new Label();
		text3.setText("이름 입력");
		Label text4 = new Label();
		text4.setText("전화번호 입력");
		
		JTextField id = new JTextField(10);
		JTextField pw = new JTextField(10);
		JTextField name = new JTextField(10);
		JTextField tel = new JTextField(10);
		
		JButton b1 = new JButton();
		b1.setText("회원가입처리");

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
				JOptionPane.showMessageDialog(f,"아이디 : " + id1 + " 패스워드 : " + pw1 );

			}
		});
		
		
		
		f.setVisible(true);
	}

}
