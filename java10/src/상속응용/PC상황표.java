package �������;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PC��Ȳǥ {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		ī��Ʈ������ count = new ī��Ʈ������();
		Ÿ�̸ӽ����� timer = new Ÿ�̸ӽ�����();
		�̹��������� image = new �̹���������();
		FlowLayout flow = new FlowLayout();
		Font font = new Font("����" , Font.BOLD , 30);
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
