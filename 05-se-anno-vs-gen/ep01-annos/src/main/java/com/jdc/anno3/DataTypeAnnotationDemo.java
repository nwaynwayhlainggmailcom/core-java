package com.jdc.anno3;

public class DataTypeAnnotationDemo {
	
	public static void main(String[] args) {
		// load class
		//var test = TestData.class;
		Class<?> clazz = TestData.class;
		
		// display , dowork
		for(var method : clazz.getDeclaredMethods()) {
			System.out.println("Methods :: " + method.getName());
			
			//check , have anno?
			// @Info
			if(method.isAnnotationPresent(Info.class)) {
				// get annotation
				var info  = method.getAnnotation(Info.class);
				System.out.println("----Info----");
				System.out.println("[Version] ::" + info.version());
				System.out.println("[Author] :" + info.author());
				System.out.println();
			}
			
			//@Tasks
			if(method.isAnnotationPresent(Tasks.class)) {
				// get annotation
				var task  = method.getAnnotation(Tasks.class);
				System.out.println("----Tasks----");
				
				for(var tag : task.tag()) {
					System.out.println("[Tags] ::" + task.tag());
				}
				
				System.out.println("[Priority] :" + task.priority());
				System.out.println();
			}
		}
	}

}
