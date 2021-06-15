package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {
	private Circle[] cArr;
	private int x;
	
	public CircleList() {
		this.cArr=new Circle[3];
		x=0;
	}

	public Circle[] getcArr() {
		return cArr;
	}

	public void setcArr(Circle[] cArr) {
		this.cArr = cArr;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "CircleList [cArr=" + Arrays.toString(cArr) + ", x=" + x + "]";
	}
	
	public void add(Circle c) {
		this.cArr[x]=c;
		x++;
	}
	
	public int size() {
		return x;
	}
	
	public Circle get(int index) {
		return cArr[index];
	}
}
