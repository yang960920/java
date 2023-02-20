package 상속;

public class FlyCar extends Car{
	boolean fly;
	
	public void fly() {
		System.out.println("하늘을 날다");
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
