package ���;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame{

	
	
	public static void main(String[] args) {
		CarGame f  = new CarGame();

	}

	public CarGame() {
		setTitle("���� �ڵ��� ���ְ���");
		setSize(1000, 600);
		
		setLayout(null);
	
	
		MyThread car1 = new MyThread("1.png" , 100 , 0);
		MyThread car2 = new MyThread("2.png" , 100 , 150);
		MyThread car3 = new MyThread("3.png" , 100 , 300);
		
		car1.start();
		car2.start();
		car3.start();
		
		
		setVisible(true);
	}
	public class MyThread extends Thread{
		
		int x,y;
		JLabel label; // MyThread ���� run ���� ������ ��� �ϹǷ� ���������� ����!!
		
		public MyThread(String file , int x , int y) {
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
			// ���ÿ� �����ϰ� ���� ����!!
			// ��� �����尡 ���������� �����̰� ����.
			// ȭ�鿡�� ���������� �����̴� ���� x�� �÷��ִ� ��.!!
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
