package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import 상속.달려라춘식아.My춘식;

public class 달려라춘식아 extends JFrame{

	public static void main(String[] args) {
		new 달려라춘식아();

	}
	public 달려라춘식아() {
		setTitle("춘식이의 달리기");
		setSize(1000, 600);
		
		setLayout(null);
	
	
		My춘식 car1 = new My춘식("4.png" , 100 , 150);
		My춘식 car2 = new My춘식("5.png" , 100 , 300);

		
		car1.start();
		car2.start();

		
		
		setVisible(true);
	}
	
	public class My춘식 extends Thread{
		
		int x,y;
		JLabel label;
		
		
		public  My춘식(String file , int x , int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 100, 100); // jframe 에 붙은 위치 지정
			add(label);
		}
		
		
		@Override
		public void run() {
			
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50); // 0~49
				x = x + move; // 100+45
				label.setBounds(x, y, 100, 100);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace(); 
			
		}
	}
	}
	}
	
}
