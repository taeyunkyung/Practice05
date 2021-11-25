package com.javaex.ex08;

public class Account {

	// 필드
	private String accountNo;
	private int balance;

	// 생성자 작성
	public Account() {

	}

	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(accountNo+" 계좌가 개설되었습니다.");
	}

	// 메소드 g/s

	// 메소드 일반
	public void deposit(int money) {
		this.balance = balance + money;
	}

	public void withdraw(int money) {
		this.balance = balance - money;
	}

	public void showBalance() {
		System.out.println(balance);
	}

}
