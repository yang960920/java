package ���;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class MyThread extends Thread{
	
	int x,y;
	JLabel label; // MyThread ���� run ���� ������ ��� �ϹǷ� ���������� ����!!
	
	public MyThread(String file , int x , int y) {
		this.x = x;
		this.y = y;
		ImageIcon icon = new ImageIcon(file);
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(x, y, 100, 200); // jframe �� ���� ��ġ ����

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
