package ¸Þ¼­µå¿¬½À;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Å°¿À½ºÅ©¿¬½À2 {
	
	static int coffee1;
	static int berry1;
	static int mango1;
	
	
	static int count2; // 0À¸·Î ÀÚµ¿ ÃÊ±âÈ­, Àü¿ªº¯¼ö
	final static int PRICE = 5000; // final Àº º¯°æ ºÒ°¡, »ó¼ö
	final static int PRICE2 = 6000; // final Àº º¯°æ ºÒ°¡, »ó¼ö
	final static int PRICE3 = 7000; // final Àº º¯°æ ºÒ°¡, »ó¼ö
	// »ó¼öº¯¼ö¸¦ ¾µ ¶§´Â Àßº¸ÀÌ¶ó°í º¯¼ö¸íÀ» ¸ðµÎ ´ë¹®ÀÚ·Î ¾²´Â°ÍÀ» ±ÇÀå!!
	
	
	public static void main(String[] args) {

		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.white);
		f.setSize(700, 700);
		f.setTitle("µ¹Ã¼¶ó¶¼ : " + coffee1 + "ÀÜ µþ±â½§ : " + berry1 + "ÀÜ ¸Á°í½§ : " + mango1 + "ÀÜ");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("±Ã¼­",1,40);
		Font font2 = new Font("±Ã¼­",1,30);
		
		
		ImageIcon icon = new ImageIcon("3.png");
		JLabel l1 = new JLabel("°¹¼ö");
		l1.setFont(font);
		JLabel image = new JLabel();
		image.setIcon(icon);
		JLabel total = new JLabel("°áÁ¦ ±Ý¾×Àº : " );
		total.setFont(font);
		
		JLabel count = new JLabel(count2+"°³");
		count.setFont(font);
		
		JButton coffee = new JButton("µ¹Ã¼¶ó¶¼");
		coffee.setFont(font2);
		coffee.setBackground(Color.magenta);
		coffee.setBorderPainted(false);
		coffee.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("3.png");
				image.setIcon(icon);
				count2++;
				coffee1++;
				count.setText(count2+"°³");
				total.setText("°áÁ¦±Ý¾× " + (mango1*PRICE3)+ (berry1*PRICE2)+ (coffee1*PRICE) + "¿ø");
				f.setTitle("µ¹Ã¼¶ó¶¼ : " + coffee1 + "ÀÜ µþ±â½§ : " + berry1 + "ÀÜ ¸Á°í½§ : " + mango1 + "ÀÜ");
			}
		});

		JButton berry = new JButton("µþ±â½§");
		berry.setFont(font2);
		berry.setBackground(Color.pink);
		berry.setBorderPainted(false);
		berry.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("1.png");
				image.setIcon(icon);
				count2++;
				berry1++;
				count.setText(count2+"°³");
				total.setText("°áÁ¦±Ý¾× " + (mango1*PRICE3)+ (berry1*PRICE2)+ (coffee1*PRICE) + "¿ø");
				f.setTitle("µ¹Ã¼¶ó¶¼ : " + coffee1 + "ÀÜ µþ±â½§ : " + berry1 + "ÀÜ ¸Á°í½§ : " + mango1 + "ÀÜ");
				
			}
		});
		JButton mango = new JButton("¸Á°í½§");
		mango.setFont(font2);
		mango.setBackground(Color.yellow);
		mango.setBorderPainted(false);
		mango.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("2.png");
				image.setIcon(icon);
				count2++;
				mango1++;
				count.setText(count2+"°³");
				total.setText("°áÁ¦±Ý¾× " + (mango1*PRICE3)+ (berry1*PRICE2)+ (coffee1*PRICE) + "¿ø");
				f.setTitle("µ¹Ã¼¶ó¶¼ : " + coffee1 + "ÀÜ µþ±â½§ : " + berry1 + "ÀÜ ¸Á°í½§ : " + mango1 + "ÀÜ");
			}
		});
		
		
		
		f.add(coffee);
		f.add(berry);
		f.add(mango);
		f.add(l1);
		f.add(count);
		f.add(image);
		f.add(total);
		
		
		
		f.setVisible(true);
	}
}
