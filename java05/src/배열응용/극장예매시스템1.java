package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {
	static int count = 0;
	static boolean flag = false;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JLabel result = new JLabel("결과보이는곳");
		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2Cording", 1 , 40);
		f.setSize(1000,1000);
		f.setLayout(flow);
		f.setTitle("극장예매시스템");
		f.add(result);
		f.getContentPane().setBackground(Color.green);
		JButton[] buttons = new JButton[100];
		
		int[] seat = new int[buttons.length]; // {0,0,0,0,0,0,0,0,0}
		// 각 자리에 저장된 값이 0 이면 아직 예약이 안됐다
		// 예약 되면 1로 바꿉시다!
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + ""); // String.valueOF(0);
			buttons[i].setFont(font);
			f.add(buttons[i]);
			
			// 버튼에 액션 기능을 추가해봅시다! add
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을때 어떻게 처리할지 코딩해주면 됨
					// e.getActionCommand(); 클릭한 버튼의 글자를 콘솔에 가져와줌
					String text = e.getActionCommand();
					System.out.println(text);
//					int index = Integer.parseInt(text);
					int no = Integer.parseInt(text);
					//이미 해당 좌석 번호가 1로 저장되어 있는지 확인하고, 1이 아니면 예약가능!!
					
					if (seat[no] == 1) { // 이미 예약 되어 1이 들어있음. 예약불가
						result.setText("예약불가");
						result.setForeground(Color.blue);
					}else { // 아직 예약이 안되어서 0이 들어있음. 예약 가능
						seat[no] = 1; // 예약좌석은 1 로 변경!
						result.setText(text + "번 예약 완료!");
						buttons[no].setBackground(Color.red);
//						buttons[no].setEnabled(false); 
						}
//					if (flag) {
//						seat[index] = 0;
//						JOptionPane.showMessageDialog(f, index+"번 예약 취소완료.");
//						flag = false;
//					}else {
//						seat[index] = 1;
//						JOptionPane.showMessageDialog(f, index+"번 예약됨.");
//						flag = true;
//					}
					
				}
			});
		}
		result.setForeground(Color.red);
		result.setFont(font);
		
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.white);
		total.setFont(font);
		f.add(total);
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열에 몇개가 1인지 세어서 더해줌
				// 영화 예매비 한장당 1만원 결제 금액 프린트
				int count = 0;
				String seatNo = "";
				for (int i = 0; i < seat.length; i++) {
					if (seat[i]==1 ) {
						count++;
						seatNo = seatNo + " " + i;
					}
				}
				JOptionPane.showMessageDialog(f, (count * 10000) + "원 결제하시면 됩니다.");
				JOptionPane.showMessageDialog(f, "예매한 좌석번호는 " + seatNo );
			}
		});
		
		
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setVisible(true);
	}

}
