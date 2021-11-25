package com.javaex.ex06;

public class CConverter {

	// 필드
	public static double rate;

	// 생성자

	// 메소드 g/s
	public static void setRate(double rate) {
		CConverter.rate = rate;
	}

	// 메소드 일반
	public static double toDoller(double won) {
		return won / rate;
	}

	public static double toKWR(double dollar) {
		return dollar * rate;
	}

}
