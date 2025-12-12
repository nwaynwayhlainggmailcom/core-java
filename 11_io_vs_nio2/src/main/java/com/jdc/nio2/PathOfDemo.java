package com.jdc.nio2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class PathOfDemo {
	
	public static void main(String[] args) {
		
		//single string
		Path p1 = Path.of("C:/Users/modern/Desktop/FileLists/test1.java");
		System.out.println(p1);
		
		//multi String
		Path p2 = Path.of("C:","Users","modern","Desktop","FileLists","test1.java");
		System.out.println(p2);
		
		// create a new file
		Path file = Path.of("example.txt");
		//System.out.println(file);
		
		try {
			if(!Files.exists(file)) {
				Files.createFile(file);
				System.out.println("File created :: " + file.toAbsolutePath());
			}else {
				System.out.println("File already exists ::" +file.toAbsolutePath());
			}
			
			//copy the file
			var copy = Path.of("src/main/resources/Copy/nio_copy.txt");
			Files.copy(file,copy,StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File copied to :" + copy.toAbsolutePath());
			
			//move the file
			var moved = Path.of("nio_move.txt");
			Files.move(file, moved, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File moved to :" + moved.toAbsolutePath());
			
			Files.delete(moved);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
