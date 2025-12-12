package com.jdc.methodRef;

public class ReferencesDemo {
	public static void main(String[] args) {
		showMessage();
		
	}
	
	static void showMessage() {
		UseInter i1 = msg -> System.out.println(msg);
		i1.use("Hello Lambda");
		
		ReferenceData data  = new ReferenceData();
		String message = "Hello Method Reference Message";
		
		//default con, args con, static meth, instance meth
		// :: => method references
		// instance method
		UseInter i2 = data :: showInstanceMessage;
		i2.use(message);
		
		//static method
		UseInter i3 =  ReferenceData :: showStaticMessage;
		i3.use(message);
		
		//constructor
		UseInter  i4 = ReferenceData :: new;
		i4.use(message);
		
		
		
	}

}
