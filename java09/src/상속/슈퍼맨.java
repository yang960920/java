package ���;

public class ���۸� extends ��{
	boolean fly;

	public void space() {
		sleep();
		
		System.out.println("�̸��� "+ name);
		System.out.println("���ָ� ����");
	}

	@Override
	public void eat() {
		System.out.println("���� �Դ�");
		
	}
	
	
	@Override
	public String toString() {
		return "���۸� [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}


	
}
