package com.javaex.ex04;

import java.util.ArrayList;

public class PointApp {

	public static void main(String[] args) {

		ArrayList<Point> pList=new ArrayList<Point>();
		
		Point p00=new Point(2,4);
		Point p01=new Point(3,6);
		Point p02=new Point(4,8);
		Point p03=new Point(5,10);
		
		pList.add(p00);
		System.out.println("배열크기: "+pList.size());

		pList.add(p01);
		System.out.println("배열크기: "+pList.size());
		
		pList.add(p02);
		System.out.println("배열크기: "+pList.size());
		
		
		Point p=pList.get(0);
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p);
		
		System.out.println("--------------------------");
		
		for(int i=0;i<pList.size();i++) {
			System.out.print(pList.get(i).getX());
		}
		System.out.println();
		System.out.println(pList.toString());
		
		
		//p04를-->[1]add
		
		pList.add(1, p03);
		System.out.println(pList.toString());

		pList.remove(1);
		System.out.println(pList.toString());
		
		System.out.println("==========================");
		//향상된 for문 무조건 처음-->끝
		for(Point ppp:pList) {
			System.out.println(ppp);
		}
		
		Circle c00=new Circle(100);
		
		
		
	}

}
