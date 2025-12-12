package com.jdc.nio2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileUtilityClass {
	
	public static void main(String[] args) {
		try {
			Path file = Path.of("demo.txt");
			
			if(!Files.exists(file)) {
				Files.createFile(file);
				System.out.println("File created :" + file.toAbsolutePath());
			}
			
			// write to file
			Files.writeString(file, "Hello Baby coder !! \n Welcome to File Utility Class Demo");
			
			//Read from file
			System.out.println("Read all lines]\n**********");
			var list = Files.readAllLines(file);
			list.forEach(System.out::println);
			String content = Files.readString(file);
			System.out.println("\nFile content :" +content);
			
			//copy file
			Path copy = Path.of("demo_copy.txt");
		    //Path source, Path target, CopyOption... options
			Files.copy(file, copy, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("copied to :" +copy);
			
			//moved file
			Path moved = Path.of("demo_copy.txt");
			Files.copy(file,moved,StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Moved to :" + copy);
			
			
			//delete file
			Files.delete(moved);
			System.out.println("Deleted" + moved);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
