package com.jdc.anno4;

@Book(
		title ="Java Annotation Guide",
		author = @Author(name = "James Gosling", age = 60)
      )
public class MyBook {
	
	public static void main(String[] args) {
		Class<MyBook> clazz = MyBook.class;
		if (clazz.isAnnotationPresent(Book.class)) {
			var book = clazz.getAnnotation(Book.class);
			
			//data print
			System.out.println("Book Title :" + book.title());
			System.out.println("Author Name:" + book.author().name());
			System.out.println("Author age : " + book.author().age());
		}else {
			System.out.println("@Book annotation not found");
		}
	}

}
