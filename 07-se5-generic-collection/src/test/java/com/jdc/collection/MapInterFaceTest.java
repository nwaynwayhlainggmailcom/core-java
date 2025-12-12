package com.jdc.collection;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MapInterFaceTest {
	
	static Map<String , String> map = new HashMap<>();
	static Map<String , String> tmap;
	
	@BeforeEach
	void init() {
		map.put("Myanmar", "Yangon");
		map.put("Japan", "Tukyo");
		map.put("China", "Shang Hai");
		map.put("India" , "Monbai");
		map.put("Indoneisa", "Jarkatar");
		map.put("Korea", "Soul");
		map.put("Thailand", "Bangkok");
		
		
	}
	
	@Test
	void test_for_enterprise() {
		// getOrDefault(K,default V)  ********
		var result = map.getOrDefault("China", "Hong Kung");  // if key have not change , if key= china1 = hong kung
		System.out.println(result);
		
		map.replace("Japan", "Kyoto");  //if key have value change , if not value not change
		System.out.println(map);
		
		map.replace("Thailand", "Bang Kok" ,"Copyland");
		System.out.println(map);
		
	}

	//@Test
	void test_for_basic_method() {
		map.put("Myanmar", "Mandalay"); // cannot access duplicate but mandalay replace to yangon by over write
		System.out.println(map.get("India"));
		map.remove("Thailand","Soul");
		
		System.out.println(map.containsKey("USA"));      //finding this key have or not
		System.out.println(map.containsValue("Soul"));   // finding values that stay or not
		System.out.println(map.size());               //7
		
		tmap = new TreeMap<>(); //obj built
		tmap.putAll(map);     // K,V are same as map
		
		Set<String> keySet = map.keySet();              // out keys name
		System.out.println("Keys :: " + keySet);
		
		Collection<String> values = map.values();         // output values
		System.out.println("Values : " + values);
		
		Set<Map.Entry<String,String>> entrySet = map.entrySet();        //output K=V,..
		System.out.println("EntrySet :: " + entrySet);
		
		
	}
	
	@AfterAll
	static void shutDown() {
		System.out.println("Map :: " + map);
	}

}
