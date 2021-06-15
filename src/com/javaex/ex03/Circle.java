package com.javaex.ex03;

public class Circle {
	private int radius;
	
	public Circle() {
		
	}
	public Circle(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius +"]";
	}
	
	public double area() {
		return this.radius*this.radius*3.14;
	}
	
	
}
