package ���;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import ���.�޷�����ľ�.My���;

public class �޷�����ľ� extends JFrame{

	public static void main(String[] args) {
		new �޷�����ľ�();

	}
	public �޷�����ľ�() {
		setTitle("������� �޸���");
		setSize(1000, 600);
		
		setLayout(null);
	
	
		My��� car1 = new My���("4.png" , 100 , 150);
		My��� car2 = new My���("5.png" , 100 , 300);

		
		car1.start();
		car2.start();

		
		
		setVisible(true);
	}
	
	public class My��� extends Thread{
		
		int x,y;
		JLabel label;
		
		
		public  My���(String file , int x , int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 100, 100); // jframe �� ���� ��ġ ����
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
