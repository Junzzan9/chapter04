package com.javaex.ex01;

import java.util.Arrays;

public class PointList {
	private Point[] pArr;
	private int x;
	
	public PointList() {
		this.pArr=new Point[3];
		x=0;
	
	}
	
	
	public void add(Point p) {
		pArr[x]= p;
		x++;
	}
	
	@Override
	public String toString() {
		return "PointList [pArr=" + Arrays.toString(pArr) + ", x=" + x + "]";
	}
	
	public void size() {
		System.out.println(pArr.length);
	}
	


	public void get() {
		
	}
	public void remove() {
		
	}
}
