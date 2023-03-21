package com.multi.www.web03;

public class Coffee2 {
	int price;
	String name;
	public static Coffee2 coffee2;
	
	public static Coffee2 getInstance() {
		// 이미 만들지 않았다면
		if(coffee2 == null) { // 아직 안만들어진것!!
		coffee2 = new Coffee2(1000,"자바칩프라푸치노");
		}
		return coffee2;
	}
	
	
	public static Coffee2 coffee;
	
	public static Coffee2 address() {
		// 이미 만들지 않았다면
		if(coffee == null) { // 아직 안만들어진것!!
			coffee = new Coffee2(2000,"아메리카노");
		}
		return coffee;
	}
	
	private Coffee2(int price,String name) {
		this.name = name;
		this.price = price;
	}

//	@Override
//	public String toString() {
//		return "Coffee [price=" + price + ", name=" + name + "]";
//	}
	
	
	
}
