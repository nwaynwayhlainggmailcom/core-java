package com.jdc.library;

public class Library {
	private Book[] books = new Book[10];
	private int count = 0;
	
	//addBOOK
	public void addBook(Book book) {
		if(count < books.length) {
			books[count++] = book;
		}else {
			System.out.println("Library is full !!");
		}
		
	}
	
	//showBook
	public void showBook() {
		System.out.println("Stock books");
		for(int i = 0 ; i < count ; i++) {
			System.out.println(books[i].getDetails());
		}
	}
	
	//getCount
	public int getCount() {
		return count;
	}
	
	//getBook
	public Book[] getBooks() {
		return books;
	}
	

}
