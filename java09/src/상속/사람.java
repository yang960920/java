package ���;

public class ��� extends Object {// extends object �� ����� �����ִ� ���̴�. 
	// ����� �⺻���� ���� ==> �������
	String name;
	int age;
	// ����� ���� ==> ����޼���
	public void eat() {
		System.out.println(
				"�Դ�");
	}
	public void sleep() {
		System.out.println(
				"���ڴ�");
	}
	@Override
	public String toString() {
		return "��� [name=" + name + ", age=" + age + "]";
	}
	
	
}
