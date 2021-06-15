package com.javaex.ex02;

public class MyList {
	
	//필드
	private Object[] oArr;
	private int crtPos;
	
	public MyList() {
		this.oArr=new Object[3];
		crtPos=0;
	}
	
	
	public void add(Object obj) {
		oArr[crtPos]=obj;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}
	
	public Object get(int index) {
		return oArr[index];	
	}
}
