package com.capgemini.books;

public class Book
{
	static int bookCode;
	String title;
	String author;
	double price;
	
	public Book(int bookCode, String title, String author, double price) {
		super();
		this.bookCode = bookCode;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
}
