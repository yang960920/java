package 상속응용;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PC상황표 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		카운트스레드 count = new 카운트스레드();
		타이머스레드 timer = new 타이머스레드();
		이미지스레드 image = new 이미지스레드();
		FlowLayout flow = new FlowLayout();
		Font font = new Font("굴림" , Font.BOLD , 30);
		JLabel l1 = new JLabel();
		l1.setFont(font);
		JLabel l2 = new JLabel();
		l2.setFont(font);
		JLabel img = new JLabel();
		JLabel time = new JLabel();
		
		time.setFont(font);
		
		
		
		count.start();
		timer.start();
		image.start();
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
