package �ڹ�DB����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BBSDAO {

	public void delete(int NO) {
		try {
			// 1.����Ŭ 11g�� ������ ��ǰ ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. ����Ŭ�� �ڹ� ������ ��ǰ ���� ����.");
//			Locale.setDefault(Locale.US); //�� locale�������� �е鸸!!!
			
			// 2.����Ŭ 11g�� �����غ���.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("�̸��Է�"); //String, �Ӿƹ��� 
			System.out.println("2. ����Ŭ ���� ����.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//�ڹٴ� ��ǰ�������̿���,String�� ���� ���ڿ��� Ư���� ��ǰ���� �ν����� ����.
			//Ư���� ��ǰ���� �ν��Ϸ��� �� ��ǰ���� ������־�� �Ѵ�.
			//SQL��ǰ���� ������־�� ��.
			//PreparedStatement�� SQL��ǰ!!
			
			String sql = "delete from hr.BBS where NO = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setInt(1, NO);
			//con��ǰ���� sql��Ʈ���� �ִ� �� SQL��ǰ���� ������ּ���.
			System.out.println("3. SQL�� ��ǰ(��ü)���� ������ֱ� ����.");
			
			ps.executeUpdate();  //insert, update, delete����!! sql�� �������� int
			System.out.println("4. SQL�� ����Ŭ�� ������ ����.");
			
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(int NO,String content) {
		try {
			// 1.����Ŭ 11g�� ������ ��ǰ ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. ����Ŭ�� �ڹ� ������ ��ǰ ���� ����.");
//			Locale.setDefault(Locale.US); //�� locale�������� �е鸸!!!
			
			// 2.����Ŭ 11g�� �����غ���.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("�̸��Է�"); //String, �Ӿƹ��� 
			System.out.println("2. ����Ŭ ���� ����.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//�ڹٴ� ��ǰ�������̿���,String�� ���� ���ڿ��� Ư���� ��ǰ���� �ν����� ����.
			//Ư���� ��ǰ���� �ν��Ϸ��� �� ��ǰ���� ������־�� �Ѵ�.
			//SQL��ǰ���� ������־�� ��.
			//PreparedStatement�� SQL��ǰ!!
			
			String sql = "update hr.BBS set content = ? where NO = ?";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1, content);
			ps.setInt(2, NO);
			//con��ǰ���� sql��Ʈ���� �ִ� �� SQL��ǰ���� ������ּ���.
			System.out.println("3. SQL�� ��ǰ(��ü)���� ������ֱ� ����.");
			
			ps.executeUpdate();  //insert, update, delete����!! sql�� �������� int
			System.out.println("4. SQL�� ����Ŭ�� ������ ����.");
			
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void insert(int NO, String title, String content, String writer) {
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
			
			String sql = "insert into hr.BBS values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			//con ��ǰ���� sql ��Ʈ���� �ִ°� SQL ��ǰ���� ������ּ���
			//R ����, �ε��� 0���� ����!!
			//�����ϰ� db�� �ε����� 1���� ����
			
			ps.setInt(1, NO); // ps.setInt(1,NO);
			ps.setString(2, title); 
			ps.setString(3, content); 
			ps.setString(4, writer); 
			//==> insert into hr.MEMBER values ('a','a','a','a');
			
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