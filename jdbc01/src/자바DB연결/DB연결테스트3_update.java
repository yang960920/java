package �ڹ�DB����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB�����׽�Ʈ3_update {

	public static void main(String[] args) {
		try {
			// 1. ����Ŭ 11g �� ������ ��ǰ ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. ����Ŭ�� �ڹ� ������ ��ǰ ���� ����.");
			
			// 2. ����Ŭ 11g �� �����غ��� (java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);//Connection
			//String data = JOptionPane.showInputDialog("�̸��Է�"); //String, �Ӿƹ��� 
			System.out.println("2.����Ŭ ���� ����.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//�ڹٴ� ��ǰ�������̿���,String�� ���� ���ڿ��� Ư���� ��ǰ���� �ν����� ����.
			//Ư���� ��ǰ���� �ν��Ϸ��� �� ��ǰ���� ������־�� �Ѵ�.
			//SQL��ǰ���� ������־�� ��.
			//PreparedStatement�� SQL��ǰ!!
			
			String sql = "update hr.MEMBER set tel = '5555' where id = 'APPLE'";
			PreparedStatement ps = con.prepareStatement(sql);
			//con��ǰ���� sql��Ʈ���� �ִ� �� SQL��ǰ���� ������ּ���.
			
			System.out.println("3.SQL �� ��ǰ(��ü)���� ������ֱ�");
			
			ps.executeUpdate();
			System.out.println("4.SQL�� ����Ŭ�� ������ ����!");
			//System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}