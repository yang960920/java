package ���;

public class FlyCar extends Car{
	boolean fly;
	
	public void fly() {
		System.out.println("�ϴ��� ����");
	}

	public FlyCar(String color, boolean fly) {
		this.Color = color;
		this.fly = fly;
	}

	@Override
	public String toString() {
		return "FlyCar [fly=" + fly + ", Color=" + Color + "]";
	}
	
	
	
}
