package com.javaex.ex09;

public class StringUtil {

	// 필드

	// 생성자

	// 메소드 g/s

	// 메소드
	public static String concatString(String[] strArray) {
		String[] sum = {strArray[0]};
		for (int i=1; i<strArray.length; i++) {
			sum[0] = sum[0]+strArray[i];
		}
		return sum[0];
	}

}
