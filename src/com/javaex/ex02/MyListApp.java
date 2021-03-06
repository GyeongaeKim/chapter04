package com.javaex.ex02;

import com.javaex.ex04.Circle;
import com.javaex.ex04.Point;

public class MyListApp {

	public static void main(String[] args) {
		
		MyList pList = new MyList();
		
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.size());
		System.out.println(pList.get(0).toString());
		
		System.out.println("---------------------------------");
		for(int i=0; i<pList.size(); i++) {
			//System.out.println(pList.get(i).toString());
			Point p = (Point)pList.get(i);
			System.out.println("point" + i + "의 x 값: " + p.getX());          //point의 x값만 보고싶으면 이런식으로;
		}
		System.out.println("=================================");
		
		//////////////////////////////////////////////////////////////////////
		//원 관리
		
		MyList cList = new MyList();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(9);
		
		cList.add(c01);
		cList.add(c02);
		
		
		System.out.println(cList.size());
		System.out.println(cList.get(0).toString());
		
		System.out.println("---------------------------------");
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
			//Circle c = (Circle)cList.get(i);
			//System.out.println("Circle" + i + "의 radius 값: " + c.getRadius());          //point의 x값만 보고싶으면 이런식으로;
		}
		
		
		
		
		
	}

}
