package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		
		//Point관리
		MyList<Point> pList = new MyList<Point>();
		
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.size());
		System.out.println(pList.get(0).toString());
		
		System.out.println("---------------------------------");
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).getX());     //이제 이렇게 간결하게 관리가능
			
		}
		System.out.println("=================================");
		
		//////////////////////////////////////////////////////////////////////
		//원 관리
		
		MyList<Circle> cList = new MyList<Circle>();
		
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(13);
		
		cList.add(c01);
		cList.add(c02);
		
		
		System.out.println(cList.size());
		System.out.println(cList.get(0).toString());
		
		System.out.println("---------------------------------");
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
			//Circle c = (Circle)cList.get(i);
			//System.out.println("Circle" + i + "의 radius 값: " + c.getRadius());          //point의 x값만 보고싶으면 이런식으로;
			System.out.println(cList.get(i).getRadius());
			
		}
		
		
		
		
		
	}

}
