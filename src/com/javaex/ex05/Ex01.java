package com.javaex.ex05;

//Ctrl + Shift + O
import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		//int i = 12;		*자동 박싱/언박싱
		Integer i01 = 4;
		Integer i02 = 5;
		Integer i03 = 6;
		
		//중복된 값을 넣게 된다면...??
		//---> 나중에 size/toString등으로 출력시 해당 값은 출력되지 않음(중복이기때문에)
		Integer i04 = 5;	
		
		
		
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		
		iSet.add(i04);		//i02와 i04는 중복이다.
		
		
		
		System.out.println(iSet.size());	//iSet에 몇개 들어있는지	--->		.size()
		System.out.println(iSet.toString());
		
		//set인터페이스는 배열이 아니기때문에 방번호 개념이 없다.
		//	---> 향상된 for문 사용해야 됨
		for(Integer num : iSet) {
			System.out.println(num.toString());		//위의 .toString()과 비교해보기
		}
		
		
		
		

	}

}
