package 배열심화;



import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 다차원배월사용 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		Font font = new Font("궁서" , 2, 20);
		f.setSize(500, 500);
		String like [] = {"음악","음식","운동"};
		String list [][] = {
				{"hype boy","마라탕","숨쉬기"},
				{"ditto","떡볶이","살아있기"},
				{"나의 아이와 바다","라면","움직이기"}
		};
		JTable table = new JTable(list,like);
		JScrollPane name = new JScrollPane(table);
		
		table.setBackground(Color.pink);
		table.setFont(font);
		
		f.add(name);
		f.setVisible(true);

	}

}
