package �ڹ�DB����;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

public class ��ȯ������ {
	// �ش� ��ǰ�� ����� ó���ϱ� ���� ���� ��ǰ
	// �޴����� ��� !!! ==> �Լ� (�޼���)
	// �ڵ��ϼ� ==> ��Ʈ�� + �����̽���
	
	public void add2() {
		System.out.println("���ϱ� ����� �����մϴ�");
	}
	public int add(int x,int y) {
		return x+y;
	}
	// �ڹٴ� �Է°��� �ٸ��ٸ� , �Լ� �̸� (�޼��� �̸�) �� �����ϰ� ��� �� �� �ִ�.
	public double add(double x , int y) {
		return x + y; // �ڹٿ����� �ϳ��� double �̸� ������ ����� double!!
	}
	public String add(String x , String y) {
		return x + y; // + �������� ��� �ϳ��� String�̸� ������ ����� String!!
	}
	public String add(int x , String y) {
		return x + y;
	}
	public int[] add() {
		int[] x = {1,2,3}; // x �տ� �ִ� Ÿ���� ���ش�!! (int[]<= x)
		return x;
	}
	public Date getDate() {
		Date date = new Date();
		return date;
	}
	public Random getRandom() {
		Random r = new Random();
		return r;
	}
	public int getRandom2() {
		Random r = new Random();
		return r.nextInt();
	}
	public int getHour() {
		Date date = new Date();
		return date.getHours();
	}
	public ArrayList getList() {
		ArrayList list = new ArrayList();
		list.add("����");
		list.add("����");
		return list;
	}
	
	public HashSet getSet() {
		HashSet bag = new HashSet();
		bag.add("����");
		bag.add("��");
		return bag;
	}
	
//	public Connection getConnection(String url,String user , String password) {
//		//����ó��
//		Connection con = ����ó���ϴ� Ŀ�ؼ�..;
//		return con;
//	}
	
	
}
