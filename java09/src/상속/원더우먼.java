package 상속;

public class 원더우먼 extends 우먼{
	boolean cry;
	
	public void thro() {
		System.out.println("세게 던지다.");
	}

	
	public void eat() {
		System.out.println("조금만 먹다");
	}
	
	@Override
	public String toString() {
		return "원더우먼 [cry=" + cry + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
