package com.javaex.ex05;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(this.x==((Point)obj).x&&this.y==((Point)obj).y) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	
	
	
}
