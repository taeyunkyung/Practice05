package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member m1 = new Member("jws","정우성",50000);
		m1.showInfo();
		
		Member m2 = new Member("yjs","유재석",30000);
		m2.showInfo();
	
		Member m3 = new Member("lhr","이효리",40000);
		m3.showInfo();
	}

}
