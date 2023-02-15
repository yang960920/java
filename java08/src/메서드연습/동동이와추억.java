package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 동동이와추억 {

	static int index = 2; // 현재 위치 2부터 시작했음.
	
	public static void main(String[] args) {
		String[] age = {"3개월","5개월","1년","1년2개월","현재"};
		String[] img = {"3개월.jpg","5개월.jpg","1년.jpg","1년2개월.jpg","현재.jpg"};
		double[] weight = {3.8 , 10.3 , 20.5 , 28.6 , 35.2};
		
		JFrame f = new JFrame();
		f.setSize(1500, 1000);
		f.getContentPane().setBackground(Color.yellow);
		Font font = new Font("Fixedsys" , 1 ,30);
		
		// 배치 객체(=부품)를 바꾸어주지 않으면 경계 레이아웃을 사용하도록 셋팅돼있음.
		JLabel top = new JLabel("말괄량이 : " +age[0]);
		top.setFont(font);
		f.add(top, BorderLayout.NORTH); //BorderLayout.(동서남북) 설정한 방향에 나온다.
		top.setHorizontalAlignment(0);
		
		JLabel center = new JLabel();
		ImageIcon icon = new ImageIcon("3개월.jpg");
		center.setFont(font);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);
		
		// 원래 double 변수이지만 () 안에 String을 포함한 변수를 넣어주면 () 안은 무조건 String 으로 자동 변환
		// String.valueOf() : int,double, ... => String 로 변환
		// interger.parse() : double,String, ... => int 로 변환
		// Double.parse() : int,String, .. => double 로 변환
		
		JLabel under = new JLabel("동동이 몸무게는 : "+weight[0]);
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH);
		under.setHorizontalAlignment(0);
		
		JButton left = new JButton("<<");
		left.setFont(font);
		f.add(left, BorderLayout.WEST);
		left.setBackground(Color.black);
		left.setForeground(Color.white);
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					top.setText(age[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(weight[index - 1] + "");
					index = index - 1; // (=index--; , index-=;)
				}else {
					JOptionPane.showMessageDialog(f, "여기가 왼쪽 끝입니다.");
				}
			}
		});
		
		JButton right = new JButton(">>");
		right.setFont(font);
		f.add(right, BorderLayout.EAST);
		right.setBackground(Color.black);
		right.setForeground(Color.white);
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < 4) {
					top.setText(age[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(weight[index + 1] + "");
					index = index + 1; // (=index--; , index-=;)
				} else {
					JOptionPane.showMessageDialog(f, "여기가 오른쪽 끝입니다.");
				}
			}
		});
		
		
		
		
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
