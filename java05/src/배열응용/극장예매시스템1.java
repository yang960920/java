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

public class ���忹�Žý���1 {
	static int count = 0;
	static boolean flag = false;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JLabel result = new JLabel("������̴°�");
		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2Cording", 1 , 40);
		f.setSize(1000,1000);
		f.setLayout(flow);
		f.setTitle("���忹�Žý���");
		f.add(result);
		f.getContentPane().setBackground(Color.green);
		JButton[] buttons = new JButton[100];
		
		int[] seat = new int[buttons.length]; // {0,0,0,0,0,0,0,0,0}
		// �� �ڸ��� ����� ���� 0 �̸� ���� ������ �ȵƴ�
		// ���� �Ǹ� 1�� �ٲ߽ô�!
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + ""); // String.valueOF(0);
			buttons[i].setFont(font);
			f.add(buttons[i]);
			
			// ��ư�� �׼� ����� �߰��غ��ô�! add
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// Ŭ�������� ��� ó������ �ڵ����ָ� ��
					// e.getActionCommand(); Ŭ���� ��ư�� ���ڸ� �ֿܼ� ��������
					String text = e.getActionCommand();
					System.out.println(text);
//					int index = Integer.parseInt(text);
					int no = Integer.parseInt(text);
					//�̹� �ش� �¼� ��ȣ�� 1�� ����Ǿ� �ִ��� Ȯ���ϰ�, 1�� �ƴϸ� ���డ��!!
					
					if (seat[no] == 1) { // �̹� ���� �Ǿ� 1�� �������. ����Ұ�
						result.setText("����Ұ�");
						result.setForeground(Color.blue);
					}else { // ���� ������ �ȵǾ 0�� �������. ���� ����
						seat[no] = 1; // �����¼��� 1 �� ����!
						result.setText(text + "�� ���� �Ϸ�!");
						buttons[no].setBackground(Color.red);
//						buttons[no].setEnabled(false); 
						}
//					if (flag) {
//						seat[index] = 0;
//						JOptionPane.showMessageDialog(f, index+"�� ���� ��ҿϷ�.");
//						flag = false;
//					}else {
//						seat[index] = 1;
//						JOptionPane.showMessageDialog(f, index+"�� �����.");
//						flag = true;
//					}
					
				}
			});
		}
		result.setForeground(Color.red);
		result.setFont(font);
		
		JButton total = new JButton("��ü ���� ����");
		total.setBackground(Color.blue);
		total.setForeground(Color.white);
		total.setFont(font);
		f.add(total);
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Ŭ������ �� ���� �ֱ�
				// �迭�� ��� 1���� ��� ������
				// ��ȭ ���ź� ����� 1���� ���� �ݾ� ����Ʈ
				int count = 0;
				String seatNo = "";
				for (int i = 0; i < seat.length; i++) {
					if (seat[i]==1 ) {
						count++;
						seatNo = seatNo + " " + i;
					}
				}
				JOptionPane.showMessageDialog(f, (count * 10000) + "�� �����Ͻø� �˴ϴ�.");
				JOptionPane.showMessageDialog(f, "������ �¼���ȣ�� " + seatNo );
			}
		});
		
		
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setVisible(true);
	}

}
