package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BBSDAO {

	public void delete(int NO) {
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
//			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "delete from hr.BBS where NO = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setInt(1, NO);
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			ps.executeUpdate();  //insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(int NO,String content) {
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
//			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "update hr.BBS set content = ? where NO = ?";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1, content);
			ps.setInt(2, NO);
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			ps.executeUpdate();  //insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void insert(int NO, String title, String content, String writer) {
		try {
			// 1. 오라클 11g 와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			// 2. 오라클 11g 에 연결해보자 (java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);//Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2.오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "insert into hr.BBS values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			//con 부품으로 sql 스트링에 있는것 SQL 부품으로 만들어주세요
			//R 빼고, 인덱스 0부터 시작!!
			//유일하게 db는 인덱스가 1부터 시작
			
			ps.setInt(1, NO); // ps.setInt(1,NO);
			ps.setString(2, title); 
			ps.setString(3, content); 
			ps.setString(4, writer); 
			//==> insert into hr.MEMBER values ('a','a','a','a');
			
			System.out.println("3.SQL 문 부품(객체)으로 만들어주기");
			
			ps.executeUpdate();
			System.out.println("4.SQL문 오라클로 보내기 성공!");
			//System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}