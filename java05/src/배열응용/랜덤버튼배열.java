package �迭����;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ������ư�迭 {

	public static void main(String[] args) {
		// �迭���� �⺻���� ���� ���� �ƴϰ�, �������� ����
		// ����, �Ǽ�, ����1, �� (�⺻��) 
		// ==> �⺻���� ������ ���� ����
		
		// String, JButton, ...(������)
		// ==> �������� ������ �ּҰ� ����!!!
		
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		
		//��ư 200�� �� �迭�� ������.
		JButton[] buttons = new JButton[200];
		//					{jbutton0,jbutton1,jbutton2....}
		//��ư 200���� ����� �迭�� ��������.
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("��ư" + i);
		}
		
		Random r = new Random();
		// ��ġ�� �����ؼ� �־� ���ô�!
		f.setLayout(null); // ��ġ�� �ڵ����� ��°� ���� �ʰڴ�!! (null)
		for (int i = 0; i < buttons.length; i++) {
			//null ==> �����ؼ� ���� ��ǰ�� �ּҰ� ���� ����.
			//ù��° ��ư�� ���� 00 , ���� 500,��ġ , ũ�� 100x50
			int x = r.nextInt(800);			
			int y = r.nextInt(700);			
			buttons[i].setBounds(x, y, 100, 50);
			// buttons[i].setBounds(r.nextInt(800) , r.nextInt(700), 100, 50);
			// x , y ������ ������ �ʰ� ���� �־��൵ �ȴ�!
			
			
			
			//		buttons[1].setBounds(600, 600, 100, 50);
			f.add(buttons[i]);
		}
		
		
		
//		f.add(buttons[1]);
		
		f.setVisible(true);
	}

}
