package ������;

// ��ǰ�� �ִ� ��ġ�� �˷��ִ� ����
import javax.swing.JOptionPane;

public class ������test {

	public static void main(String[] args) {

		String weight = JOptionPane.showInputDialog("�����Ը� �Է��Ͻÿ�");
		String height = JOptionPane.showInputDialog("Ű�� �Է��Ͻÿ�");
		

		double weight2 = Double.parseDouble(weight);
		double height2 = Double.parseDouble(height);
		
		double result =(height2-weight2)*100; 
		
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
	}

}
