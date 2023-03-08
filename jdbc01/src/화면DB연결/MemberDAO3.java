package ȭ��DB����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class MemberDAO3 {

	public int delete(String id) {
		
		int result = 0;
		
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
			
			String sql = "delete from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1, id);
			//con��ǰ���� sql��Ʈ���� �ִ� �� SQL��ǰ���� ������ּ���.
			System.out.println("3. SQL�� ��ǰ(��ü)���� ������ֱ� ����.");
			
			result = ps.executeUpdate();  //insert, update, delete����!! sql�� �������� int
			System.out.println("4. SQL�� ����Ŭ�� ������ ����.");
			if(result == 1) {
				System.out.println("Ż�� ����.");
			}
			
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int update(MemberVO bag) {
		
		int result = 0;
		
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
			
			String sql = "update hr.MEMBER set tel = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());
			//con��ǰ���� sql��Ʈ���� �ִ� �� SQL��ǰ���� ������ּ���.
			System.out.println("3. SQL�� ��ǰ(��ü)���� ������ֱ� ����.");
			
			result = ps.executeUpdate();  //insert, update, delete����!! sql�� �������� int
			System.out.println("4. SQL�� ����Ŭ�� ������ ����.");
			if (result == 1) {
				System.out.println("ȸ�� ���� ����!");
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public int insert(MemberVO bag) {
		// 1. ������ �޾Ƽ� ������ �־��ּ���. MemberVO bag
		int result = 0;
		
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
			
			String sql = "insert into hr.MEMBER values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			//con ��ǰ���� sql ��Ʈ���� �ִ°� SQL ��ǰ���� ������ּ���
			//R ����, �ε��� 0���� ����!!
			//�����ϰ� db�� �ε����� 1���� ����
			
			//2. ���濡�� ������ �ϳ��� ����������
			
			ps.setString(1, bag.getId()); // ps.setInt(1,no);
			ps.setString(2, bag.getPw()); 
			ps.setString(3, bag.getName()); 
			ps.setString(4, bag.getTel()); 
			//==> insert into hr.MEMBER values ('a','a','a','a');
			
			System.out.println("3.SQL �� ��ǰ(��ü)���� ������ֱ�");
			
			result = ps.executeUpdate();
			System.out.println("4.SQL�� ����Ŭ�� ������ ����!");
			if(result == 1){
				System.out.println("ȸ�����Լ���!!");
			}
//			System.out.println(result);
		} catch (Exception e) {
			// insert �� ����� ������ �ȵ� ���, ������ ��Ȳ�̶� �Ǵ�!
			// catch�� ����ȴ�.
			result = 0;
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
		
	}
	
}