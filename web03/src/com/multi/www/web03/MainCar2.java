package com.multi.www.web03;

public class MainCar2 {

	public static void main(String[] args) {
		Car car; // 12
		for (int i = 0; i < 1000; i++) {
			car = new Car("빨강" + i, 10, 200);
			System.out.println(car);
		}
		System.out.println("메모리 크기 >> " + 12*1000);
		
	}

}
