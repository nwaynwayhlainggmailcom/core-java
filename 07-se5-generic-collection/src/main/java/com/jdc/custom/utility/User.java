package com.jdc.custom.utility;

// comparable use to find min ,max,can use Collections.min(), Collections.max()
public class User implements Comparable<User>{
	String value;
	
	User(String value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}

	@Override
	public int compareTo(User userObj) {
		if(null != userObj) {
			return this.value.compareTo(userObj.value);
			
		}
		return 1;
	}

}
