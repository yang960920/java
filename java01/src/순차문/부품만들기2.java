package 순차문;

import java.awt.Color;
// import 가 자동으로 채워지지 않는 경우
// 컨트롤 + 쉬프트 + o(영문)
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class 부품만들기2 {

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
		f.setSize(450, 150);
		// 물 흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야함.
		// FlowLayout 변수명 = new FlowLayout();
		FlowLayout flow = new FlowLayout();
		
		// f 에 물흐르듯이 배치해주는 부품을 쓰겠다라고 조립(설정)
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("나는 버튼1");
		
		JButton b2 = new JButton();
		b2.setText("나는 버튼2");
		
		// 글씨를 넣고 싶을땐 JLabel 변수명 = new JLabel();
		JLabel text1 = new JLabel();
		text1.setText("아이디");
		
		JLabel text2 = new JLabel();
		text2.setText("패스워드");
		
		// 글씨 넣는 빈칸을 만드는 법
		// JTextField 변수명 = new JTextField(글자수 제한 숫자로 넣는다)
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		// 글자 크기 글씨체 같은 스타일을 설정 가능! (글자체 , 진하기 , 크기)
		Font font = new Font("궁서", 1, 20);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);
		
		b1.setBackground(Color.red); //배경색
		b1.setForeground(Color.white); //버튼의 위색, 글자색
		b2.setBackground(Color.red); //배경색
		b2.setForeground(Color.white); //버튼의 위색, 글자색
		input1.setBackground(Color.red); //배경색
		input1.setForeground(Color.white); //버튼의 위색, 글자색
		input2.setBackground(Color.red); //배경색
		input2.setForeground(Color.white); //버튼의 위색, 글자색
		
		// 꼭 다운로드 받은 이미지는 해당 프로젝트 안에 넣어줘야 인식한다
		// ImageIcon 변수명 = new ImageIcon("파일명");
		ImageIcon icon = new ImageIcon("다운로드 (1).jpg");
		ImageIcon icon2 = new ImageIcon("다운로드 (2).jpg");
		
		b1.setIcon(icon);
		b2.setIcon(icon2);
		
		// f 창에
		// b1 이라는 변수를 넣어라!!
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		//보여주는 것은 맨 끝으로!!!
		f.setVisible(true);
	}

}
