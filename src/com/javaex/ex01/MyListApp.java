package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {
		//////////포인트 관리/////////////
		System.out.println("Point 관리====================");
		//포인트를 관리하는 리스트(배열대용)를 만든다.
		PointList pList=new PointList();
		Point p00=new Point(2,2);
		Point p01=new Point(3,3);
		Point p02=new Point(3,3);
		
		pList.add(p00);  //배열 1개
		pList.add(p01);  //배열 2개
		pList.add(p02);  //배열 3개
		
		
		System.out.println(pList);
		
		
		pList.size(); 
		System.out.println(pList.size());
		
		System.out.println(pList.get(1));  //Point [x=3, y=3]
		System.out.println(pList.get(1).toString()); //Point [x=3, y=3]
		System.out.println(pList.get(1).getX()); //3
		System.out.println("--------------------------");
		
		for(int i=0;i<pList.size();i++) {
			System.out.println(pList.get(i).getX());
		}
		
		/*
		pList.remove(1);  //1데이터 삭제 --> 배열 2개
		
		Point p03=new Point (100,100);
		pList.add(p03); //배열 3개
		*/
		/*
		//배열 사용시
		Point[] pArr=new Point[2]; //개수를 정해야 한다.
		
		Point p01=new Point(2,2);
		Point p02=new Point(3,3);
		
		pArr[0]=p01;
		pArr[1]=p02;
		
		for(int i=0;i<pArr.length;i++) {
			System.out.println(pArr[i].toString());
		}
		 */
		System.out.println("Point 관리====================");
		////////원 관리//////////////
		CircleList cList=new CircleList();
		
		Circle c00=new Circle(2);
		Circle c01=new Circle(3);
		Circle c02=new Circle(4);
		
		cList.add(c00);
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList);
		
		System.out.println(cList.size());
		
		for(int i=0;i<cList.size();i++) {
			System.out.println("원의 반지름: "+cList.get(i).getRadius());
			System.out.println("원의 넓이: "+cList.get(i).area());
		}
		
		
	}

}
