package com.javaex.ex07;

public class Point {
	

	//생성자
	private int x;
	private int y;
	
	
	
	//필드
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	//메소드 gs
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	//메소드 일반
	//여기 toString은 꼭 만들어줘야됨!! 아니면 Object의 toString으로 출력된다!!!
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public int hashCode() {
		int result = x + y;
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean result;
		
		Point p = (Point)obj;
		if((this.x == p.x)&&(this.y == p.y)) {
			result =  true;
		}else {
			result = false;
		}
		
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
