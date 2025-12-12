package com.jdc.gen1.test;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.jdc.gen1.IntegerBox;
import com.jdc.gen1.ObjectBox;
import com.jdc.gen1.StringBox;

public class BeforeGenericTest {
	
	@Test
	void test_for_before_generic() {
		var stBox = new StringBox("Hello Generic");
		System.out.println(stBox.getValue());
		
		var iBox = new IntegerBox(1000);
		System.out.println(iBox.getValue());
		
		// easy going(insert)
		var obj1 = new ObjectBox("Hello");
		var obj2 = new ObjectBox(10000);
		var obj3 = new ObjectBox(new Date()); // DataTime object
		
//		String result = (String) obj1;
//		String res1 = (String)obj3;
		
	
	}
	
	
	
	
}
