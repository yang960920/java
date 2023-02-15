package �޼��忬��;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class �����̿��߾� {

	static int index = 2; // ���� ��ġ 2���� ��������.
	
	public static void main(String[] args) {
		String[] age = {"3����","5����","1��","1��2����","����"};
		String[] img = {"3����.jpg","5����.jpg","1��.jpg","1��2����.jpg","����.jpg"};
		double[] weight = {3.8 , 10.3 , 20.5 , 28.6 , 35.2};
		
		JFrame f = new JFrame();
		f.setSize(1500, 1000);
		f.getContentPane().setBackground(Color.yellow);
		Font font = new Font("Fixedsys" , 1 ,30);
		
		// ��ġ ��ü(=��ǰ)�� �ٲپ����� ������ ��� ���̾ƿ��� ����ϵ��� ���õ�����.
		JLabel top = new JLabel("�������� : " +age[0]);
		top.setFont(font);
		f.add(top, BorderLayout.NORTH); //BorderLayout.(��������) ������ ���⿡ ���´�.
		top.setHorizontalAlignment(0);
		
		JLabel center = new JLabel();
		ImageIcon icon = new ImageIcon("3����.jpg");
		center.setFont(font);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);
		
		// ���� double ���������� () �ȿ� String�� ������ ������ �־��ָ� () ���� ������ String ���� �ڵ� ��ȯ
		// String.valueOf() : int,double, ... => String �� ��ȯ
		// interger.parse() : double,String, ... => int �� ��ȯ
		// Double.parse() : int,String, .. => double �� ��ȯ
		
		JLabel under = new JLabel("������ �����Դ� : "+weight[0]);
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH);
		under.setHorizontalAlignment(0);
		
		JButton left = new JButton("<<");
		left.setFont(font);
		f.add(left, BorderLayout.WEST);
		left.setBackground(Color.black);
		left.setForeground(Color.white);
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					top.setText(age[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(weight[index - 1] + "");
					index = index - 1; // (=index--; , index-=;)
				}else {
					JOptionPane.showMessageDialog(f, "���Ⱑ ���� ���Դϴ�.");
				}
			}
		});
		
		JButton right = new JButton(">>");
		right.setFont(font);
		f.add(right, BorderLayout.EAST);
		right.setBackground(Color.black);
		right.setForeground(Color.white);
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < 4) {
					top.setText(age[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(weight[index + 1] + "");
					index = index + 1; // (=index--; , index-=;)
				} else {
					JOptionPane.showMessageDialog(f, "���Ⱑ ������ ���Դϴ�.");
				}
			}
		});
		
		
		
		
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
