package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {
		
		ArrayList<Point> pList = new ArrayList<Point>();
		
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		Point p03 = new Point(113, 115);
		
		Point p04 = new Point(100, 101);
		
		//Circle c01 = new Circle(5);
		
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		//pList.add(c01);   --> 에러! 원은 담을 수 없다
		
		System.out.println(pList.size());
		System.out.println(pList.get(0).getX());
		System.out.println(pList.get(0).getY());
		System.out.println(pList.get(0).toString());
		System.out.println("--------------------------------");
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		pList.remove(1);
		//pList.remove(p02);
		System.out.println("-----------------------------------");
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).getX());
		}
		
		System.out.println("-----------------------------------");
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.toString());  //Point toString() 구분할 것
		}
		
		System.out.println("-----------------------------------");
		//for다른 표현법 ---> 향상된 for문
		for(Point p:pList) {
			System.out.println(p.toString());
			System.out.println(p.getX());
			System.out.println(p.getY());
		}
		
		//p04 를 2번째 (방번호[1])에 추가
		//pList.add(p04)         ---> 이건 그냥 맨 뒤에 추가될 뿐..
		pList.add(1, p04);     //---> 위치를 지정해서 p04를 넣어준다
		System.out.println(pList.toString());
		
		
		
		
		
		
		
	}

}
