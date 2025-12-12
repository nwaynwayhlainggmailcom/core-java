package com.jdc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalInterfaceTest {
	
	public static Map<Integer,String> map = new HashMap<Integer,String>();
	
	public static void main(String[] args) {
		map.put(1, "Java");
		map.put(2, "Spring");
		map.put(3, "React");
		map.put(4, "Python");
		
		forEach();
		replaceAll();
		compute();
		computeIfAbscent();
		computeIfPresent();
		merge();
	}
	
	//forEach ******************************  process every K,V pair in map
	static void forEach() {
		System.out.println("====ForEach========");
		// anonymous class
		map.forEach(new BiConsumer<Integer,String>() {
			@Override
			public void accept (Integer k, String v) {
				System.out.println(k+"=>" +v);
			}
				
			});
	}
	
	//replaceAll
	static void replaceAll() {
		System.out.println("=======Replace========");
		                       //// 2 inputs (int,string) and 1 return (string)
		map.replaceAll(new BiFunction<Integer,String,String>(){
			
			@Override
			public String apply(Integer k,String v) {
				return v.toUpperCase();
			}
		});
		System.out.println(map);
		
	}
	
	static void compute() {
		System.out.println("====compute=======");
		//Parameters:key → the key to update
		//BiFunction<K, V, V> → takes (key, oldValue) and returns new value
		map.compute(2, new BiFunction<Integer,String,String>(){
			
			@Override
			public String apply(Integer t,String u) {
				return u + "Framework".toUpperCase();   //index 2's react+framework(upper) =>REACTFRAMEWORK
			}
		});
		System.out.println(map);  
	}
	
	// computeIfAbscent
		static void computeIfAbscent() {
			System.out.println("===== computeIfAbscent =====");
			
			map.computeIfAbsent(5, new Function<Integer, String>() {

				@Override
				public String apply(Integer k) {
					return "Ruby";                       // index 5 is not in there so add Ruby in index 5
				}
			});

			System.out.println(map);
		}

		// computeIfAbscent
		static void computeIfPresent() {
			System.out.println("===== computeIfPresennt =====");

			map.computeIfPresent(4, new BiFunction<Integer, String, String>() {

				@Override
				public String apply(Integer t, String u) {
					return " Core";
				}
			});

			System.out.println(map);
		}
		
		// merge
		static void merge() {
			System.out.println("===== merge =====");
			map.merge(3, " JS", new BiFunction<String, String, String>() {

				@Override
				public String apply(String oldVal, String newVal) {
					return oldVal + newVal;
				}
			});
			
			System.out.println(map);
		}
	}
