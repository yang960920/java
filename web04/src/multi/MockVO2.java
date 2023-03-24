package multi;

public class MockVO2 {
	String id;
	String model;
	String color;
	String money;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "MockVO2 [id=" + id + ", model=" + model + ", color=" + color + ", money=" + money + "]";
	}
	
	
}
