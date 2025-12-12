package com.jdc.file_obj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MethodForFilesClassDemo {
	public static void main(String[] args) throws IOException {

		var file = new File("method.txt"); // relative
		file.createNewFile();
		
		var update = new File("method_update.txt");
		
		if(file.exists())
			System.out.println(file.renameTo(update));
		

		//check_state(file);
		
		manipulate();
		check_state(file);
	}
	
	static void manipulate() throws IOException {
		File man = new File("C:/Users/modern/Desktop/manipulate_file/");
		man.mkdir();
		
		var dir = new File(man, "child_folder");
		dir.mkdirs();
		
		var data = new File(man, "data.txt");
		data.createNewFile();
		
		if(data.exists()) {
			data.delete();
		} else {
			throw new FileNotFoundException("File not found exception.");
		}
		
//		System.out.println(man.isDirectory());
//		System.out.println(man.isFile());
		
		System.out.println("Terminated.");
	}

	static void check_state(File file) {
		System.out.println(file.isAbsolute());
		System.out.println(file.isDirectory());
		System.out.println(file.isHidden());
		System.out.println(file.canExecute()); // read , write
		System.out.println(file.canRead());
		System.out.println(file.exists());
	}
}
