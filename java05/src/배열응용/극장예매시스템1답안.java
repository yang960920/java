package �迭����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ���忹�Žý���1��� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("���忹�Žý���");
		f.setSize(800, 800);
		f.getContentPane().setBackground(Color.green);
		// ��ġ���ִ� ��ǰ-FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);// �߰��� ������� f�� �ٴ´�.

		// ��ư �迭 ���� ���� ���� ���� �迭 ����
		JButton[] btn = new JButton[200];
		// �ݺ��ؼ� �迭�� ��ư ����� �־��ּ���.
		// �ݺ��ؼ� f�� add���ּ���.
		Font font = new Font("�ü�", Font.BOLD, 20);

		JLabel result = new JLabel("��� ���̴� ��");
		result.setForeground(Color.red);
		result.setFont(font);

		// ���� ���θ� �����ϴ� �迭�� ������ݽô�.!!
		int[] seat = new int[btn.length]; // {1,0,0,0,0,0,0,0,0,0}
		// �� �ڸ��� ����� ���� 0�̸� ���� ����ȵǾ���. ����Ǹ� 1�� �ٲ�!

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);

			// ��ư�� �׼Ǳ�� add�غ���.
			// 1) �׼� ��� �߰�
			// 2) Ŭ������ �� � ��ǰ�� ������� ��ǰ ����
			// 3) Ŭ������ �� ��� ó������ �ڵ����ָ� ��.
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// Ŭ������ �� ��� ó������ �ڵ����ָ� ��.
					// e.getActionCommand(); Ŭ���� ��ư�� ���ڸ� ������ ����.
					String text = e.getActionCommand(); // "0"
					System.out.println(text);
					int no = Integer.parseInt(text); // "0" --> 0
					// �̹� �ش� �¼���ȣ�� 1�� ����Ǿ��ִ��� Ȯ���ϰ�, 1�� �ƴϸ� ���డ��!!
					//seat["0"] X ==> seat[0]
					
					if (seat[no] == 1) { // �̹� ����Ǿ� 1�� �������. ����Ұ�
						result.setText("����Ұ�");
						result.setForeground(Color.blue);
					} else { // ���� ������ �ȵǾ 0�� �������. ���డ��
						seat[no] = 1; // �����¼��� 1�� ����!
						result.setText(text + "�� ����Ϸ�.");
						btn[no].setBackground(Color.red);
						btn[no].setEnabled(false);
					}
				}
			});
		}

		f.add(result);

		JButton total = new JButton("��ü ���� ����");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);

		f.add(total);

		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Ŭ������ �� ���� �ֱ�
				// �迭�ȿ� ����� ���� 1���� üũ�ؼ� ī��Ʈ
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count++;
					} // if
				} // for
				JOptionPane.showMessageDialog(f, (count * 10000) + "�� �����Ͻø� �˴ϴ�.");
				// ��ȭ���ź� 1��� 1����, �����ݾ� ���
			}
		});
		// �� ���� �־�� ��.
		f.setVisible(true);
	}
}