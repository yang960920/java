package 반복문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 좌석예매 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);;
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// 반복하고 싶은 부분을 드래그 한 후
		// 오른쪽 클릭 하고 Surround with 에 마우스를 두면
		// for 문이 나옴
		for (int i = 0; i < 100; i++) {
			JButton b = new JButton("나는 버튼");
			f.add(b);
		}
		f.setVisible(true);
	
	
	}

}
