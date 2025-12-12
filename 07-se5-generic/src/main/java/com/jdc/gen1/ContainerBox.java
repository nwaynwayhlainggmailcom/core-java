package com.jdc.gen1;

// generic class
public class ContainerBox<T> {
	private T value;
	
	public ContainerBox(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
}
