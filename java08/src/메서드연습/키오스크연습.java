package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 키오스크연습 {
	
	static int count2; // 0으로 자동 초기화, 전역변수
	final static int PRICE = 5000; // final 은 변경 불가, 상수
	// 상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로 쓰는것을 권장!!
	
	
	public static void main(String[] args) {

		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.white);
		f.setSize(700, 700);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("궁서",1,40);
		Font font2 = new Font("궁서",1,30);
		
		
		ImageIcon icon = new ImageIcon("3.png");
		JLabel l1 = new JLabel("갯수");
		l1.setFont(font);
		JLabel image = new JLabel();
		image.setIcon(icon);
		JLabel total = new JLabel("결제 금액은 : " );
		total.setFont(font);
		
		JLabel count = new JLabel(count2+"개");
		count.setFont(font);
		
		JButton coffee = new JButton("돌체라떼");
		coffee.setFont(font2);
		coffee.setBackground(Color.magenta);
		coffee.setBorderPainted(false);
		coffee.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("3.png");
				image.setIcon(icon);
				count2++;
				count.setText(count2+"개");
				total.setText("결제금액 " + (count2*PRICE) + "원");
			}
		});

		JButton berry = new JButton("딸기쉑");
		berry.setFont(font2);
		berry.setBackground(Color.pink);
		berry.setBorderPainted(false);
		berry.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("1.png");
				image.setIcon(icon);
				count2++;
				count.setText(count2+"개");
				total.setText("결제금액 " + (count2*PRICE) + "원");
				
			}
		});
		JButton mango = new JButton("망고쉑");
		mango.setFont(font2);
		mango.setBackground(Color.yellow);
		mango.setBorderPainted(false);
		mango.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("2.png");
				image.setIcon(icon);
				count2++;		
				count.setText(count2+"개");
				total.setText("결제금액 " + (count2*PRICE) + "원");
			}
		});
		
		
		
		f.add(coffee);
		f.add(berry);
		f.add(mango);
		f.add(l1);
		f.add(count);
		f.add(image);
		f.add(total);
		
		
		
		f.setVisible(true);
	}
}
