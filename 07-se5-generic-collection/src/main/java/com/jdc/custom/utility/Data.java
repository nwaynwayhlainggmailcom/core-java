package com.jdc.custom.utility;

public class Data {
	public String value;
	public Data(String value) {
		if(value == null) {
			throw new IllegalArgumentException();  //If you give null, it throws an error.
		}
		this.value = value;
	}
	public String toString() {
		return value;
	}
//	// shift+alter+s=> equal and hashcode..
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return super.hashCode();
//	}
	@Override
	public boolean equals(Object obj) {
		if(null != obj) {
			Data d = (Data) obj;  // cast (Data) cuz want to access the value field of Data.
			return this.value.equals(d.value);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}
	
	
	

}
