package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 1. 프레임을 만들어 보세요.
		JFrame f = new JFrame();
		
		
		// 2. 프레임 설정해보세요.
		// 레이아웃 부품 설정하지 않겠습니다 null
		f.setSize(1000, 800);
		f.setLayout(null);
		// 3. 버튼을 넣을 배열을 만들어보세요.
		Color[] colors = {Color.red,Color.blue,Color.green,Color.gray,Color.yellow}; 
		JButton[] buttons = new JButton[500];
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			// 4. 버튼을 500개 만들어서 배열에 넣어주세요.
			buttons[i] = new JButton("버튼" + i );
			buttons[i].setBounds(r.nextInt(800),r.nextInt(900),100,50);
			buttons[i].setBackground(colors[r.nextInt(5)]);
			// 5. 배열에 있는 버튼을 꺼내서 위치를 지정 후 , f에 붙여주세요.
			// 심화-1)) 버튼 색을 몇 가지 지정해서 임의로 설정 , 힌트 ==> Color배열
			// 심화-2)) f에 배경색을 넣어보세요.
			f.add(buttons[i]);
		}


		f.getContentPane().setBackground(Color.yellow); // 배경색 넣는 것
		
		f.setVisible(true);
	}

}
