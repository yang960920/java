package �ݺ���;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class �¼����� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);;
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// �ݺ��ϰ� ���� �κ��� �巡�� �� ��
		// ������ Ŭ�� �ϰ� Surround with �� ���콺�� �θ�
		// for ���� ����
		for (int i = 0; i < 100; i++) {
			JButton b = new JButton("���� ��ư");
			f.add(b);
		}
		f.setVisible(true);
	
	
	}

}
