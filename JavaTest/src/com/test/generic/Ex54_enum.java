package com.test.generic;

import java.util.Calendar;

public class Ex54_enum {
		
	public static void main(String[] args) {
		
		//Ex54_enum.java
		
		//열거형, Enumeration
		//	- 열거값을 가지는 자료형
		//	- 동일한 성격의 값들이 여러개 모여 있는 집합
		//  - 열거형 사용 -> 제시된 값 중 하나를 선택하는 상황
				
		//Color.BLUE
		//Color2.BLUE
		//c1.get(Calendar.YEAR)
		
		//c2.buy(Color.RED);
		//c3.buy(Color2.YELLOW);
		
		
		//색상 선택 요청
		//보유] red, yellow, blue
		String color = "red";
		System.out.println(color);
		
		
		Color2 color2 = Color2.RED;
		System.out.println(color2);
		
		직급 m = 직급.대리;
		
	}
}

enum Color2 { RED, BLUE, YELLOW }

enum 직급 { 부장, 과장, 대리, 사원 }


class Color {
	public final static String RED = "1";
	public final static String BLUE = "2";
	public final static String YELLOW = "3";
}















