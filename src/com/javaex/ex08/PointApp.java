package com.javaex.ex08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		List<Point> pList=new ArrayList<Point>();
		
		Map<String, Point> pMap=new HashMap<String,Point>();
		
		Point p01=new Point(1,1);
		Point p02=new Point(2,2);
		Point p03=new Point(3,3);
		
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("유재석", p03);
		
		System.out.println(pMap.size());
		System.out.println(pMap);
	
		System.out.println(pMap.get("유재석").getX());
		
		Point p04=new Point(100,1000);
		
		pMap.put("유재석", p04);
		System.out.println(pMap.size());
		System.out.println(pMap);
		
		Set<String> keys=pMap.keySet();
		
		for(String key:keys) {
			System.out.println(pMap.get(key).getY());
		}
	}
	

}
