package com.multi.www.web03;

public class CoffeeMain1 {

	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {
			Coffee c1 = new Coffee(1000, "라떼");
			System.out.println("c1의 주소는 >>" +c1);
		}
		for (int i = 0; i < 1; i++) {
			Coffee c2 = new Coffee(2000, "아메리카노");
			System.out.println("c2의 주소는 >>" + c2);
		}
	

	}

}
