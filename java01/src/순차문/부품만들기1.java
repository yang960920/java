package ������;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ǰ�����1 {

	public static void main(String[] args) {
		// ���� ������� �ʴ� ��ǰ�� �����ô�.
		//Ʋ!! �� �־ �� Ʋ�� ������ �� �ʿ��� ��ǰ�� ����� CPU�� ����!
		// new : Ʋ�� ������ ���� ���
		// new JFrame()�� JFrame �̶�� Ʋ�� �̿��ؼ� ��ǰ�� ����!
		// �ش� ��ǰ�� RAM �� �����ؾ��ϴ� JFrame �� ���������
		// JFrame ������ = new JFrame() ��� Ʋ�� �������Ѵ�.
		// ���� �� JFrame �� �����Ѵٴ� �ǹ�
		JFrame f =new JFrame();
		// f â�� ����� ���� �Ϸ���
		// f.setSize (����,����) �� ǥ�õ�
		f.setSize(300, 300);
		
		// ��ư�� ����� JButton
		// ��ư�� ���� ����� ���̹Ƿ� new
		// JButton ������ = new JButton() �⺻Ʋ
		// �������� ���� ��ư�� ������!
		JButton b1 = new JButton();
		b1.setText("���� ��ư1");
		
		// f â��
		// b1 �̶�� ������ �־��!!
		f.add(b1);
		
		//�����ִ� ���� �� ������!!!
		f.setVisible(true);
	}

}
