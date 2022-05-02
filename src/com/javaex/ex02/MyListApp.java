package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {
		
		MyList pList = new MyList();
		
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.size());
		System.out.println(pList.get(0).toString());
		
		
	}

}
