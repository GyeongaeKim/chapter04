package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Set<Integer> lottoNum = new HashSet<Integer>();
		
		//1~45까지의 숫자중 임의의 6개의 숫자를 출력하세요
		Integer num1 = (int)(Math.random()*45) + 1;
		Integer num2 = (int)(Math.random()*45) + 1;
		Integer num3 = (int)(Math.random()*45) + 1;
		Integer num4 = (int)(Math.random()*45) + 1;
		Integer num5 = (int)(Math.random()*45) + 1;
		Integer num6 = (int)(Math.random()*45) + 1;
		
		lottoNum.add(num1);
		lottoNum.add(num2);
		lottoNum.add(num3);
		lottoNum.add(num4);
		lottoNum.add(num5);
		lottoNum.add(num6);
		
		//
		System.out.println("임의의 [" + lottoNum.size() + "]개의 숫자 출력");
		System.out.println("--------------------------");
		for(Integer num : lottoNum) {
			System.out.print(num.toString() + "\t");
		}

	}

}
