package edu;

public class Exercise01 {

	public static void main(String[] args) {
		//1. 은행 계좌번호를 저장할 account 변수를 선언합니다 . 계좌번호는 "01-123-456" 입니다
		String account = "01-123-456";
		//2. 잔액을 저장할 balance 변수를 선언합니다. 초기값은 0입니다.
		int balance = 0;
		//3. 입금액을 저장할 deposit 변수를 선언합니다. 초기값은 0입니다.
		int deposit = 0;
		//4. 출금액을 저장할 withdraw 변수를 선언합니다. 초기값은 0입니다
		int withdraw = 0;
		//5. 은행 이율을 계산할 rate 변수를 선언합니다. 이율은 3.3 입니다.
		double rate = 3.3;
		//6. 이자 금액을 저장할 interest 변수를 선언합니다. 초기값은 0.0 입니다
		double interest = 0.0;
		//7. deposit 변수에 입금할 500,000만원을 저장합니다.
		deposit = 500000;
		//8. 잔액을 계산합니다 (balance = balance + deposit)
		balance += deposit;
		//9. withdraw 변수에 출금할 200,000만원 저장합니다.
		withdraw = 200000;
		//10. 잔액을 계산합니다 (balance = balance - withdraw)
		balance -= withdraw;
		//11. 이자 계산을 합니다 (interest = balance*rate)
		interest = (balance*rate)/100;
		//12. 현재 잔액을 출력합니다
		System.out.println("현재 남은 잔액은 " + (balance+interest) +"원 입니다.");
	
	}
	
}
