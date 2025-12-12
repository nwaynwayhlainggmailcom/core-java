package com.jdc.library;

public class UniversityLibrary extends Library{
	
	private Library library; // composition
	
	public UniversityLibrary(Library library) {
		this.library = library;
	}
	
	@Override
	public void addBook(Book book) {
		library.addBook(book); // composition
		System.out.println("[University Library ] :: Added :: " + book.getDetails());
	}


	@Override
	public void showBook() {
		System.out.println("[University Library]");
		for(int i = 0 ; i < library.getCount(); i++) {
			System.out.println(library.getBooks()[i].getDetails());
		}
	}

	
	
	public void doResearch() {
		
	}

}
