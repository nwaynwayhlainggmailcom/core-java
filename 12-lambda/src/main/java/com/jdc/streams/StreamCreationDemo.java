package com.jdc.streams;

public class StreamCreationDemo {
	public static void main(String[] args) {
		var st = new StreamData();
		//st.fromCollection();
		//st.fromArray();
		//st.fromTextFile();
//		st.fromRange();
//		st.fromIterate();
		
		st.fromGenerate();
		st.fromFactory();
		st.fromBuilder();
		
	}
}


