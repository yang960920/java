package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장쓰기 {
	// 멤버변수 = 안써도됨!
	// 멤버메서드
	public void open() {
		//jframe 화면이 보이게 하자!! 기능을 정의하도록함.
//		System.out.println("화면이 open될거에요");
		JFrame f = new JFrame();
		f.setSize(300, 600);
		f.setTitle("일기장쓰기");
		f.getContentPane().setBackground(Color.yellow);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("D2Cording" , 1 , 30);
		
		JLabel l1 = new JLabel("오늘의 날짜");
		JLabel l2 = new JLabel("오늘의 제목");
		JLabel l3 = new JLabel("오늘의 내용");
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
	
		
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		JTextArea text3 = new JTextArea(5,10);
		text1.setFont(font);
		text1.setForeground(Color.blue);
		
		text2.setFont(font);
		text2.setForeground(Color.blue);
		
		text3.setFont(font);
		text3.setForeground(Color.blue);
		JButton b1 = new JButton();
		b1.setText("파일에 일기 저장");
		b1.setFont(font);
		b1.setBackground(Color.red);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 날짜,제목,내용 입력한 것 가지고 오세요.
				String day = text1.getText();
				String title = text2.getText();
				String content = text3.getText();
				JOptionPane.showMessageDialog(f, day + " " + title + " " + content
						+" " + "해당 내용이 저장이 완료됐습니다!");
				//파일도 만들어주고 , 자바프로그램과 file간에 연결통로(강물,Stream)을
				//만들어준다
				//외부에 있는 파일 , 네트워크나 cpu 등을 자바에서 연결할 때는
				//아주 위험한 상황이라고 식!!
				//이렇게 위험한 상황에서 만약 문제가 발생하면 어떻게 처리할지를 반드시 써줘야함
				try {
					FileWriter file = new FileWriter(day + ".txt");
					file.write(day+"\n");
					file.write(title+"\n");
					file.write(content+"\n");
					file.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("Warning : 파일로 저장하는 중 문제가 생김!!!");
				}
			}
		});
		
		
		f.add(l1);
		f.add(text1);
		f.add(l2);
		f.add(text2);
		f.add(l3);
		f.add(text3);
		f.add(b1);
		
		
		
		f.setVisible(true);
	}
}
