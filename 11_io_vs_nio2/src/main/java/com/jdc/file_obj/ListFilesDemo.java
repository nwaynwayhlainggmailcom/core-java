package com.jdc.file_obj;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class ListFilesDemo {
	public static void main(String[] args) {
		File dir = new File("C:/Users/modern/Desktop/FileLists"); // for window
		// File macorLin = new File("/Users/username/Desktop/FileLists"); // for mac or
		// linux

		if (!dir.exists() || !dir.isDirectory()) {
			System.err.println("Directory not found : " + dir.getAbsolutePath());
			return;
		}

		testList(dir);
		testListWithFilter(dir);
		testListFiles(dir);
		testListFilesWithFilenameFilter(dir);
		testListFilesWithFilter(dir);

	}

	static void testListFilesWithFilter(File dir) {
		System.out.println("\n===== listFiles(FilenFilter) =====");
		File[] files = dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File f) {
				return f.isDirectory();
			}
		});
		
		// File [] fs = dir.listFiles((File f) -> f.isDirectory());
		
		if(files != null) {
			for (File f : files) {
				System.out.println(f.getName());
			}
		}
	}

	static void testListFilesWithFilenameFilter(File dir) {
		System.out.println("\n===== listFiles(FilenameFilter) =====");
		File[] files = dir.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt");
			}
		});
		
		if(files != null) {
			for (File f : files) {
				System.out.println(f.getName());
			}
		}
	}

	static void testListFiles(File dir) {
		System.out.println("\n===== listFiles(FIlename dir) =====");
		File[] files = dir.listFiles();
		
		if(files != null) {
			for (File f : files) {
				System.out.println(f.getName());
				System.out.println(f.isDirectory() ? "[DIRECOTY]" : "[FILES]");
			}
		}

	}

	static void testListWithFilter(File dir) {
		System.out.println("\n===== list(FilenameFilter) =====");
		String[] files = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				
				return name.endsWith(".txt"); // filter text file with .txt
			}
		});
		
		if(files != null) {
			for(var name : files) {
				System.out.println(name);
			}
		}
	}

	static void testList(File dir) {
		System.out.println("\n===== list() =====");
		String[] files = dir.list();

		if (files != null) {
			for (var name : files) {
				System.out.println(name);
			}
		}
	}

}
