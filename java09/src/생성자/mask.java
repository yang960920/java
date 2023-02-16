package 생성자;

public class mask {
	String color;
	int price;
	int 개수;
	
	
	public mask(String color, int price, int 개수) {

		this.color = color;
		this.price = price;
		this.개수 = 개수;
	}
	@Override
	public String toString() {
		return "mask [color=" + color + ", price=" + price + ", 개수=" + 개수 + "]";
	}

	
	
}
