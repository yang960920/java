package ������;

public class Bbs����ϱ� {
	
	public static void main(String[] args) {
		System.out.println("�Խ���");
		System.out.println("--------------------------------------------");
		System.out.println("no" + "\t title" + "\t content" + "\t writer");
		Bbs bbs1 = new Bbs(1,"�ڹ�","������ ������ �ϴ� ��" , "ȫ�浿");
		System.out.println(bbs1);
		Bbs bbs2 = new Bbs(2,"JSP","������ �����α׷� �ϴ� ��" , "ȫ�浿");
		System.out.println(bbs2);
		Bbs bbs3 = new Bbs(3,"SPRING","������ �ǹ� �����α׷� �ϴ� ��" , "ȫ�浿");
		System.out.println(bbs3);
	}

}
