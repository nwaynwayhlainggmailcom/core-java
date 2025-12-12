package com.jdc.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
	public static void main(String[] args) {
		
		// absolutepath
		Path p1 =  Paths.get("C:/Users/modern/Desktop/FileLists/file1.txt");
		System.out.println(p1.getFileName());
		//System.out.println(p1.getFileSystem());
		System.out.println("parent" +p1.getParent());
		System.out.println("root(drive)" +p1.getRoot());
		System.out.println("Path  Segment" +p1.getNameCount());
		
		System.out.println("Absolute path : " + p1.toAbsolutePath());
		System.out.println("Normalize" + p1.normalize());
		
		Path base = Paths.get("C:/Users/modern");
		Path full = base.resolve("Desktop/FileLists/file1.txt");
		System.out.println("Fill path :" + full);
		
		Path p3 = Paths.get("C:/Users/modern/Desktop");
		Path p4 = Paths.get("C:/Users/modern/Documents");
		System.out.println("Relative :" + p3.relativize(p4)); // ../Documents >
		
		Path p = Paths.get("C:/Users/modern/Desktop/FileLists/test1.java");
		System.out.println(p.startsWith("C:/Users"));
		System.out.println(p.endsWith("test1.java"));
		
		// relative path
//		Path p2 = Paths.get("src/main/resources/info","line1.txt");
//		
//		System.out.println("Absolute path : " +p1);
//		System.out.println("Relative path : " +p2);
	}

}
