package com.javaex.ex03;

public class MyList<T> {
	
	//필드
	private T[] oArr;
	private int crtPos;
	
	public MyList() {
		this.oArr=(T[])new Object[3];
		crtPos=0;
	}
	
	
	public void add(T obj) {
		oArr[crtPos]=obj;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}
	
	public T get(int index) {
		return oArr[index];	
	}
}
