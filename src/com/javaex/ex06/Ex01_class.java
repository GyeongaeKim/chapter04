package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01_class {

	public static void main(String[] args) {
		
		// 1.set을 만든다
		// *반복한다 - set의 갯수가 6보다 작을때까지
		// 2.번호를 생성한다
		// 3.set에 add한다
		
		
		
		// 1.set을 만든다
		Set<Integer> iSet = new HashSet<Integer>();
		
		// *반복한다 - set의 갯수가 6보다 작을때까지
		while(true) {
			
			if(iSet.size()>=6) {	// 4. 6개까지 출력하고나면 while문에서 탈출한다.
				break;
			}
			
			// 2.번호를 생성한다
			int num = (int)(Math.random()*45)+1;
			System.out.println(num);	//여기서는 중복된 숫자 나올수 있음
			
			// 3.set에 add한다
			iSet.add(num);
		}
		
		
		System.out.println("====================================");
		//결과 도출
		for(Integer num : iSet) {
			System.out.print(num + "\t");
		}
		
		
		
	}

}
