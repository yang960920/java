package com.multi.www.web03;

public class Car2 {
	//멤버 변수
	//멤버 메서드
	//toString()
	//객체 생성시 멤버 변수값을 한꺼번에 넣어서 초기화 하고 싶어요!
	//-> 객체 생성시 자동호출 되는 메서드를 추가해주세요
	//-> 생성자 (메서드) , constructor
	String color; // 주소 (4바이트)
	int price; // 4
	int speed; // 4
	//하나만 제공하는 객체는
	//static : 하나만 변수 만들 때 ( 전역변수 만들때 )
	//public : 제공하는 car2 를 아무데서나 쓸수있어야 하므로!
	public static Car2 car2; // Null --> 주소
	
	// 싱글톤은 해당 클래스에서 (본인이 직접)하나만 만들어서 제공한다.
	
	public static Car2 getInstance() {
		// 이미 만들지 않았다면
		if(car2 == null) { // 아직 안만들어진것!!
		car2 = new Car2("빨강",100,110);
		}
		return car2;
	}
	
	public void run() {
		System.out.println("달려보자규~~~!!!");
	}
	
	private Car2(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
	
	
}
