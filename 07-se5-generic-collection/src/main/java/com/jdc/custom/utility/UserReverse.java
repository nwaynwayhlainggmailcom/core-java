package com.jdc.custom.utility;

import java.util.Comparator;

public class UserReverse implements Comparator<User>{

	@Override
	public int compare(User u1, User u2) {
		if(u1 == null) {
			return 1;
		}
		if(u2 == null) {
			return -1;
		}
		
		return u2.compareTo(u1); //equals
	}
	

}
