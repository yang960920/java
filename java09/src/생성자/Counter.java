package 생성자;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	
	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(300, 300);
		Font font = new Font("궁서",1,150);
		JLabel num = new JLabel("0");
		num.setFont(font);
		
		JButton b1 = new JButton("1더하기");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				num.setText(count + "");
			}
		});
		JButton b2 = new JButton("0으로 초기화");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				num.setText(count+"");
				
			}
		});
		JButton b3 = new JButton("1빼기");
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				num.setText(count+"");
			}
		});
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(num);
		
		
		
		
		f.setVisible(true);
	}

}
