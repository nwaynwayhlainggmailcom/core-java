package com.jdc.gen1.test;
import org.junit.jupiter.api.Test;

import com.jdc.gen1.ContainerBox;

public class AfterGenericTest {
	
	@Test
	void test_method_after_generic() {
		// usage layer
		ContainerBox<String> c1 = new ContainerBox<String>("Hello");
		ContainerBox<Integer> c2 = new ContainerBox<Integer>(1000);
	}
}
