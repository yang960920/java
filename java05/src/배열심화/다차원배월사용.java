package �迭��ȭ;



import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ������������ {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		Font font = new Font("�ü�" , 2, 20);
		f.setSize(500, 500);
		String like [] = {"����","����","�"};
		String list [][] = {
				{"hype boy","������","������"},
				{"ditto","������","����ֱ�"},
				{"���� ���̿� �ٴ�","���","�����̱�"}
		};
		JTable table = new JTable(list,like);
		JScrollPane name = new JScrollPane(table);
		
		table.setBackground(Color.pink);
		table.setFont(font);
		
		f.add(name);
		f.setVisible(true);

	}

}
