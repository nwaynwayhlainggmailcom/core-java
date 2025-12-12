package com.jdc.gen3;

public interface Storage<T> {
	void put(T item);
	T take();

}
