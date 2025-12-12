package com.jdc.library;

public class PublicLibrary extends Library{
	private Library library;
	
	public PublicLibrary(Library library) {
		this.library = library;
	}

	@Override
	public void addBook(Book book) {
		library.addBook(book); // composition
		System.out.println("[Public Library ] :: Added :: " + book.getDetails());
	}

	@Override
	public void showBook() {
		System.out.println("[Public book]");
		for(int i = 0 ; i<library.getCount() ; i++) {
			System.out.println(library.getBooks()[i].getDetails());
		}
	}
	
	public void readingRoom() {
		System.out.println("Open Reading Room\n***");
		
	}

	
}
