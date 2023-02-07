package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 부품만들기1 {

	public static void main(String[] args) {
		// 자주 사용하지 않는 부품을 만들어봅시다.
		//틀!! 이 있어서 그 틀을 가지고 찍어서 필요한 부품을 만들어 CPU가 조립!
		// new : 틀을 가지고 찍어낼때 사용
		// new JFrame()는 JFrame 이라는 틀을 이용해서 부품을 찍어내라!
		// 해당 부품을 RAM 에 저장해야하니 JFrame 을 사용했으니
		// JFrame 변수명 = new JFrame() 라는 틀로 만들어야한다.
		// 변수 명에 JFrame 을 저장한다는 의미
		JFrame f =new JFrame();
		// f 창의 사이즈를 설정 하려면
		// f.setSize (가로,세로) 로 표시됨
		f.setSize(300, 300);
		
		// 버튼을 만든다 JButton
		// 버튼을 새로 만드는 것이므로 new
		// JButton 변수명 = new JButton() 기본틀
		// 변수명을 가진 버튼을 만들어라!
		JButton b1 = new JButton();
		b1.setText("나는 버튼1");
		
		// f 창에
		// b1 이라는 변수를 넣어라!!
		f.add(b1);
		
		//보여주는 것은 맨 끝으로!!!
		f.setVisible(true);
	}

}
