package �ڹ�DB����;

import java.sql.Connection;
import java.sql.DriverManager;

public class TEST10_DAO {

	public void insert() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. ����Ŭ�� �ڹ� ������ ��ǰ ���� ����.");

			// 2. ����Ŭ 11g �� �����غ��� (java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);// Connection
			// String data = JOptionPane.showInputDialog("�̸��Է�"); //String, �Ӿƹ���
			System.out.println("2.����Ŭ ���� ����.");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
