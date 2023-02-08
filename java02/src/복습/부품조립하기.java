package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		// 1. 자주 써서 RAM 에 언제든 사용할 수 있도록 준비되어있음. => 망치
		// 부품명.기능()
		
		// 2. 쓸때마다 제공되는 틀을 이용해서 찍어내어 여러개 만들어 => 벽돌 
		// RAM에 저장해두고 사용함.
		// JFrame 변수명 = new JFrame();
		
		JFrame f = new JFrame();
		f.setSize(340, 400);
		
		
		JLabel l = new JLabel(); // 윗글자
		l.setText("당신이 생각한 숫자를 입력하시오");
		
		
		JTextField text = new JTextField(10);
		
		
		JButton b = new JButton(); // 버튼
		
		
		
		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2Coding", 1 , 20); // 각각 폰트를 적용하려면 원하는 만큼 부품을 추가
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
		b.setText("숫자 맞추기");
		b.setForeground(Color.black);
		b.setBackground(Color.yellow);
		l.setFont(font);
		l.setForeground(Color.black);
		
		
		// 변수명.setvisible(true); 는 제일 마지막에 넣어야함!!!
		f.setVisible(true);
	}

}
