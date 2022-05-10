package com.capgemini.books;

public class BookImplementor implements Bookitrf
{
	Book []  bk = null;
	
	public BookImplementor() 
	{
		bk [0] = new Book(109, "Java", "JG", 2000.0);
		bk [1] = new Book(101, "introduction to Java", "dsd", 1000.0);
		bk [2] = new Book(107, "J2ee", "ada", 1299.0);
		bk [3] = new Book(103, "SQL", "qd", 999.0);
		bk [4] = new Book(101, "Servlets", "JadG", 1999.0);
	}

	@Override
	public void listAllBook()
	{
		
	}

	@Override
	public void showBook(int bcode)
	{
		
	}

	@Override
	public void updateBookPrice(int bcode, double price)
	{
		for (int i = 0; i < bk.length; i++)
		{
			
			
		}
		
	}
	

}
