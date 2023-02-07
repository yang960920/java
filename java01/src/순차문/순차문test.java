package 순차문;

// 부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문test {

	public static void main(String[] args) {

		String weight = JOptionPane.showInputDialog("몸무게를 입력하시오");
		String height = JOptionPane.showInputDialog("키를 입력하시오");
		

		double weight2 = Double.parseDouble(weight);
		double height2 = Double.parseDouble(height);
		
		double result =(height2-weight2)*100; 
		
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
	}

}
