package �ڹ�DB����;

import java.sql.DriverManager;

public class DB�����׽�Ʈ {

	public static void main(String[] args) {
		try {
			// 1. ����Ŭ 11g �� ������ ��ǰ ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. ����Ŭ�� �ڹ� ������ ��ǰ ���� ����.");
			// 2. ����Ŭ 11g �� �����غ��� (java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			DriverManager.getConnection(url, user, password);
			System.out.println("2.����Ŭ ���� ����.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
