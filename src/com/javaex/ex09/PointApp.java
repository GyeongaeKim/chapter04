package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		//HashMap을 생성하려면 키타입과 값타입을 파라미터로 주고, 기본생성자를 호출하면 된다.
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(3, 3);
		Point p02 = new Point(5, 5);
		Point p03 = new Point(14, 32);
		
		//HashMap값은 put(key, value)메소드로 설정
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);
		
		
		
		//size()로 값 개수 확인
		System.out.println(pMap.size());
		//toString으로 꺼낼 때, 키값도 같이 출력된다.
		System.out.println(pMap.toString());
		
		
		
		//순서개념이 없음. key값으로 호출할 수 있음.
		System.out.println(pMap.get("박명수").getX());
		
		
		
		System.out.println("---------------------------------------");
		
		
		
		Point p04 = new Point(100, 200);
		pMap.put("정우성", p04);		//값은 중복저장 가능, but 키는 중복저장될 수 없다.
		
		
		System.out.println(pMap.size());
		System.out.println(pMap.toString());
		System.out.println(pMap.get("정우성").getX()); 			//p01 과 p04의 키값은 중복.
		
		
		
		//전체출력
		// 1.키 목록을 만든다	ex - ["정우성", "이효리", "박명수", ......]
		// 2.출력할때는 pMap.get("키 값") 으로 출력한다
		
		
		// 1.키 목록 만들고 출력↓↓↓
		Set<String> keys = pMap.keySet();
		System.out.println(keys.toString());
		
		for(String name : keys) {
			System.out.println(pMap.get(name).getX());
		}
		
		
		
		
		
		
		

	}

}
