package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		
		Set<Integer> point = new HashSet<Integer>();
		
		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 2);
		Point p3 = new Point(3, 3);
		Point p4 = new Point(1, 1);
		
		
		point.add(p1);
		point.add(p2);
		point.add(p3);
		point.add(p4);
		
		
		
	}

}
