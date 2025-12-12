package com.jdc.gen3;

public class Box<T extends Number> implements Storage<T>{
	private T item;
	
	@Override
	public void put(T item) {
		this.item = item;
	}

	@Override
	public T take() {
		return item;
	}

}
