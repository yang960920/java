package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class kpop인기투표 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(540, 1400);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("D2Coding", 1 , 20);
		Font font2 = new Font("D2Coding", 1 , 30);
		
		JLabel text = new JLabel();
		text.setText("K-pop 인기 투표");
		text.setFont(font2);
		
		JLabel text1 = new JLabel();
		text1.setText("1.아이유 - 나의 아이와 바다");
		text1.setFont(font);
//		JLabel text2 = new JLabel();
//		text2.setFont(font);
//		text2.setForeground(Color.pink);
		JTextField text2 = new JTextField(10);
		text2.setFont(font);
		text2.setForeground(Color.pink);
		
		JLabel text3 = new JLabel();
		text3.setText("2.프로미스나인 - DM");
		text3.setFont(font);
//		JLabel text4 = new JLabel();
		JTextField text4 = new JTextField(10);
		text4.setFont(font);
		text4.setForeground(Color.pink);
		
		JLabel text5 = new JLabel();
		text5.setText("3.이예준 - 미친소리");
		text5.setFont(font);
//		JLabel text6 = new JLabel();
		JTextField text6 = new JTextField(10);
		text6.setForeground(Color.pink);
		text6.setFont(font);
		
		ImageIcon icon = new ImageIcon("iu.png");
		ImageIcon icon2 = new ImageIcon("fm.png");
		ImageIcon icon3 = new ImageIcon("ye.png");
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		
		b1.setIcon(icon);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		
		f.add(text);
		f.add(b1);
		f.add(text1);
		f.add(text2);
		
		f.add(b2);
		f.add(text3);
		f.add(text4);
		
		f.add(b3);
		f.add(text5);
		f.add(text6);
		
		
		// 버튼에 액션 기능을 추가할때는
		// 1. 액션 기능 추가해주세요 b1.addActionListener
		// 2. 버튼을 클릭했을때 어떤 부품이 처리할건지
		// ==> new ActionListener()
		// 3. 버튼을 클릭했을 때 처리 내용을 코딩
		// @Override
		//		public void actionPerformed(ActionEvent e) {
		//			//처리할 내용을 씀
		//		}
		b1.addActionListener(new ActionListener() {
			int iu = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 처리 내용을 코딩
				iu++;
				text2.setText(iu + "표");
				
			}
		}); // b1.add 문
		b2.addActionListener(new ActionListener() {
			int fm = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				fm++;
				text4.setText(fm + "표");
				
			}
		});
		b3.addActionListener(new ActionListener() {
			int ye = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				ye++;
				text6.setText(ye + "표");
		
			}
		});
		

		f.setVisible(true);
	}

}
