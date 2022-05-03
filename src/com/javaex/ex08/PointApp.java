package com.javaex.ex08;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(1, 2);
		Point p02 = new Point(3, 6);
		Point p03 = new Point(5, 10);
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		
		for(Point p :pSet) {
			System.out.println(p.toString());		//출력하면 순서개념 없이 그냥 출력됨!
		}
		System.out.println(pSet.toString()); 		//위의 toString과 비교해보기
		System.out.println(pSet.size());
		
		System.out.println("====================================================");
		
		Point p04 = new Point(3, 6);				//위의 p02와 중복
		pSet.add(p04);
		System.out.println(pSet.toString()); 	//엥; 중복체크를 못하네?
												//그럼 hashCode를 쓰면된다!
												//hashCode가 다르면 진짜 아예 다른거임!
		
		//hashCode를 출력해보기
		//그냥 hashCode를 쓰면 hashCode가 다르게 나오니까
		//Point클래스에 새로운 hashCode를 만든다.
		for(Point p : pSet) {
			System.out.println(p.hashCode()); 	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
