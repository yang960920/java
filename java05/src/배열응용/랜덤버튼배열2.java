package �迭����;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ������ư�迭2 {

	public static void main(String[] args) {
		// 1. �������� ����� ������.
		JFrame f = new JFrame();
		
		
		// 2. ������ �����غ�����.
		// ���̾ƿ� ��ǰ �������� �ʰڽ��ϴ� null
		f.setSize(1000, 800);
		f.setLayout(null);
		// 3. ��ư�� ���� �迭�� ��������.
		Color[] colors = {Color.red,Color.blue,Color.green,Color.gray,Color.yellow}; 
		JButton[] buttons = new JButton[500];
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			// 4. ��ư�� 500�� ���� �迭�� �־��ּ���.
			buttons[i] = new JButton("��ư" + i );
			buttons[i].setBounds(r.nextInt(800),r.nextInt(900),100,50);
			buttons[i].setBackground(colors[r.nextInt(5)]);
			// 5. �迭�� �ִ� ��ư�� ������ ��ġ�� ���� �� , f�� �ٿ��ּ���.
			// ��ȭ-1)) ��ư ���� �� ���� �����ؼ� ���Ƿ� ���� , ��Ʈ ==> Color�迭
			// ��ȭ-2)) f�� ������ �־����.
			f.add(buttons[i]);
		}


		f.getContentPane().setBackground(Color.yellow); // ���� �ִ� ��
		
		f.setVisible(true);
	}

}
