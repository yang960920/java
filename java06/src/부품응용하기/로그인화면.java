package 부품응용하기;

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

public class 로그인화면 {

	public static void main(String[] args) {
		// jframe , imageicon , imagelabel
		JFrame f = new JFrame();
		f.setSize(300, 600);
		f.setTitle("나의 일기장");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("D2Cording" , 1 , 30);
		
		
		
		JLabel top = new JLabel();
		JLabel id = new JLabel("아 이 디: ");
		JLabel pw = new JLabel("비밀번호: ");
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
		// 로그인 버튼 reset 버튼
		// font , flowlayout
		
		//1)버튼에 액션 기능을 add
		//2)클릭 했을때 어떤 반응이 (부품) 나올지 new 로 만들어주세요
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String id2 = idtext.getText();
				String pw2 = pwtext.getText();
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					// 일기장쓰기 부품의 open()기능을 쓰자!
					일기장쓰기 diary = new 일기장쓰기();
					diary.open();
					f.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
					idtext.setText("");
					pwtext.setText("");
				}
			}
		});
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// reset을 눌렀을때 idText, pwText 에 공백을 넣어라!
				JOptionPane.showMessageDialog(f, "리셋됐습니다!");
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
