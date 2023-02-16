package 상속;

public class Car {
	String Color;
	int price;
	int kg;
	
	public void Color() {
		System.out.println("밝은 갈색 커피차 나가신다~");
	}

	@Override
	public String toString() {
		return "Car [Color=" + Color + ", price=" + price + ", kg=" + kg + "]";
	}
	
}
