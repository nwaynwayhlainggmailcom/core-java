package com.jdc.enum_with_other_mems;

public class EnumWithOtherMethod {
	public static void main(String[] args) {
		System.out.println(Data.ONE);
		
		//get enum value as a string value
		String value = Data.ONE.name();
		System.out.println(value + " is 1.");
		System.out.println(value.concat("is 1."));
		
		//as an index value
		System.out.println("Index '0' ::" + Data.ONE.ordinal());
		System.out.println("Index '0'+1 ::" +( Data.ONE.ordinal() +1));
		
		// get enum in array
		Data[] datas = Data.values();
		for(Data d : datas) {
			System.out.println(d + " ");
		}
		
		Data sData = Data.valueOf("ONE");
		System.out.println(sData);
		
		boolean same = (Data.ONE == Data.valueOf("ONE"));
		System.out.println("Same ::: " + same);
	}  

}

enum Data{
	ONE, TWO , THREE
}
