package ���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import ����ȯ.��Ӱ����Ѱ�;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ������׷��� extends JFrame {
	// add(), setSize() ,,,,,,..
	JLabel count, image, time; // �������� ����!

	public static void main(String[] args) {
		������׷��� f = new ������׷���(); // ---1
		// ��ü������ Ŭ���� �̸��� ������ �޼��带 �ڵ�ȣ��
		// ==> ������ �޼���!!�� �ڵ�ȣ��
	}

	public ������׷���() { // --2
		setTitle("�� ������ �׷���");
		setSize(700, 350);
		getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		Font font = new Font("�ü�", Font.BOLD, 30);
		count = new JLabel("ī����");
		ImageIcon icon = new ImageIcon("1.png");
		image = new JLabel(icon);
		time = new JLabel("�ú���");
		count.setFont(font);
		time.setFont(font);
		add(count);
		add(image);
		add(time);

		// ������ ��ü 3�� ���� start!!���Ѻ���.!!
		Ÿ�̸ӽ�����2 time2 = new Ÿ�̸ӽ�����2();
		�̹���������2 image2 = new �̹���������2();
		ī��Ʈ������2 count2 = new ī��Ʈ������2();

		count2.start();
		image2.start();
		time2.start();

		setVisible(true);
	}

	// ����Ŭ����(inner class)==> �������� ������ �������� ���!
	//
	public class ī��Ʈ������2 extends Thread { // run()

		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("ī��Ʈ>> " + i);
				// cpu���� ������ ���� �ð� ���� �˷��ݽô�.!!
				// thread�� ��� ��� �� ����.
				// cpu�� �ܺ��ڿ��Դϴ�.
				// �ڹٰ� �ܺ��ڿ��� ������ ���� ��û! ������!!!��� ��Ȳ���� �ν�!!
				// ���࿡ ������ �����, ��� ������ �ڵ带 �ݵ�� ���־�� �ؤ���.
				try {
					Thread.sleep(2000); // 2�������!
				} catch (Exception e) {
					System.out.println("cpu ���� ���� ����.");
				}
			}
		}
	}

	public class Ÿ�̸ӽ�����2 extends Thread {

		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				Date date = new Date();
				time.setText(date + "");
				try {
					Thread.sleep(1000); // 1�������!
				} catch (Exception e) {
					System.out.println("cpu ���� ���� ����.");
				}
			}
		}
	}

	public class �̹���������2 extends Thread {

		@Override
		public void run() {
			String[] images = { "1.png", "2.png", "3.png", "4.png", "5.png", "1.png", "2.png", "3.png", "4.png",
					"5.png", "1.png", "2.png", "3.png", "4.png", "5.png", "1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 0; i < images.length; i++) {
				ImageIcon icon = new ImageIcon(images[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000); // 5�������! //ms(�и�������)
				} catch (Exception e) {
					System.out.println("cpu ���� ���� ����.");
				}
			}
		}
	}

} // class
