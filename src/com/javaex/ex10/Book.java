package com.javaex.ex10;

public class Book {

	// 필드
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	// 생성자
	public Book() {

	}

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	// 메소드 g/s
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// 메소드 일반
	public void rent() {
		stateCode = 0;
		System.out.println(getTitle() + "이(가) 대여 됐습니다.");
	}

	public void print() {
		String rentState;
		
		if (stateCode == 1) {
			rentState = "재고있음";
		} else {
			rentState = "대여중";
		}
		
		System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + author + ", 대여유무:" + rentState);
	}

}
