package com.jdc.library;

public class LibraryMain {
	public static void main(String[] args) {
		//composition target
		
		Library mainLibrary = new Library();
		
		//inherit obj
		PublicLibrary publicLib = new PublicLibrary(mainLibrary);
		UniversityLibrary uniLib = new UniversityLibrary(mainLibrary);
		
		//UPcasting( Child => Parent )
		int i = 10;
		byte b =20;
		i = b;
		
		Library lib1 = publicLib;
		Library lib2 = uniLib;
		
		// Add books via up-casted references
		lib1.addBook(new Book("Harray Potter", "J.K Rowling", 1995));
		lib2.addBook(new Book("Java Programming", "James Gosling", 1995));
		
		//show book
		//lib1.showBook();
		//lib2.showBook();
		
		//Down casting[Explict] (Child = Parent)
		
//		Library lib = new Library();
//		lib.addBook(new Book("Ma Eain Kan" , "Khain Khin Htoo", 2000));
//		PublicLibrary p1 = (PublicLibrary) lib; // error cuz lib's obj type ka Library,if its type is PublicLibrary true
		
		if(lib1 instanceof PublicLibrary) {
			PublicLibrary p1 = (PublicLibrary)lib1;
			p1.readingRoom();
			
		}else{
			System.err.println("Class Cast Exception");
		}
		
		Library lb = new Library();
		lb.addBook(new Book("Ma Eain Kan" , "Khain Khin Htoo", 2000));
		
		if(lb instanceof UniversityLibrary) {
			UniversityLibrary uni = (UniversityLibrary)lb;
			uni.doResearch();
		}else {
			System.err.println("Class Cast Exception");
		}
//		
	}

}
