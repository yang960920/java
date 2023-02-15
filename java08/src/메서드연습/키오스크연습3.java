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

public class Å°¿À½ºÅ©¿¬½À3 {

	static int count1;
	static int count2; // ±è¹ä
	static int count3; // ¶óººÀÌ
	static int count4; // ½ºÆó¼ÈÁ¤½Ä
	
	final static int PRICE = 5000;
	final static int PRICE1 = 5000;
	final static int PRICE2 = 6000;
	final static int PRICE3 = 7500;
	
	public static void main(String[] args) {
		
			JFrame f = new JFrame();
			f.setSize(800, 700);
			f.setTitle("±è¹ä¸¸±¹");
			f.getContentPane().setBackground(Color.white);
			
			FlowLayout flow = new FlowLayout();
			f.setLayout(flow);
			Font font = new Font("±¼¸²" , 1 , 30);
			
			JLabel l1 = new JLabel("°¹¼ö");
			l1.setFont(font);
			JLabel count = new JLabel("°³");
			count.setFont(font);
			JLabel img = new JLabel();
			ImageIcon icon = new ImageIcon("½ºÅ©¸°¼¦_20230215_052331.png");
			img.setIcon(icon);
			JLabel total = new JLabel("ÀüÃ¼ ±Ý¾×Àº : " );
			total.setFont(font);
			
			JButton b1 = new JButton("±è¹ä");
			b1.setFont(font);
			b1.setBorderPainted(false);
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ImageIcon icon = new ImageIcon("±è¹ä.png");
					img.setIcon(icon);
					count1++;
					count.setText(count1+"°³");
					total.setText("ÀüÃ¼ ±Ý¾×Àº : " +count1*PRICE + "¿ø ÀÔ´Ï´Ù.");
					count2++;
					f.setTitle("±è¹ä: " + count2 + "°³, ¶óººÀÌ: " + count3 + "°³, ½ºÆó¼ÈÁ¤½Ä: " + count4 + "°³");
					int total2 = (count2 * PRICE1) + (count3 * PRICE2) + (count4 * PRICE3);
					total.setText("°áÁ¦±Ý¾× " + total2 + "¿ø");
				}
			});
			
			JButton b2 = new JButton("¶óººÀÌ");
			b2.setFont(font);
			b2.setBorderPainted(false);
			
			b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ImageIcon icon = new ImageIcon("¶óººÀÌ.png");
					img.setIcon(icon);
					count1++;
					count.setText(count1+"°³");
					total.setText("ÀüÃ¼ ±Ý¾×Àº : " +count1*PRICE + "¿ø ÀÔ´Ï´Ù.");
					count3++;
					f.setTitle("±è¹ä: " + count2 + "°³, ¶óººÀÌ: " + count3 + "°³, ½ºÆó¼ÈÁ¤½Ä: " + count4 + "°³");
					int total2 = (count2 * PRICE1) + (count3 * PRICE2) + (count4 * PRICE3);
					total.setText("°áÁ¦±Ý¾× " + total2 + "¿ø");
				}
			});
			
			JButton b3 = new JButton("½ºÆó¼ÈÁ¤½Ä");
			b3.setFont(font);
			b3.setBorderPainted(false);
			
			b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ImageIcon icon = new ImageIcon("½ºÆó¼ÈÁ¤½Ä.png");
					img.setIcon(icon);
					count1++;
					count.setText(count1+"°³");
					total.setText("ÀüÃ¼ ±Ý¾×Àº : " +count1*PRICE + "¿ø ÀÔ´Ï´Ù.");
					count4++;
					f.setTitle("±è¹ä: " + count2 + "°³, ¶óººÀÌ: " + count3 + "°³, ½ºÆó¼ÈÁ¤½Ä: " + count4 + "°³");
					int total2 = (count2 * PRICE1) + (count3 * PRICE2) + (count4 * PRICE3);
					total.setText("°áÁ¦±Ý¾× " + total2 + "¿ø");
					
				}
			});
			
			
			
			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(l1);
			f.add(count);
			f.add(img);
			f.add(total);
			
			
			
			
			f.setVisible(true);
	}

}
