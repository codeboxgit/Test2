package com.test;

import java.util.Date;
import java.util.Random;

public class Ex45_Override {
	
	public static void main(String[] args) {
		
		//Ex45_Override.java
		
		//메소드 오버로딩
		//	- 동일한 이름의 메소드를 여러개 만드는 기술
		//  - 상속 유무와 관계없이 발생
		
		//메소드 오버라이딩
		//	- 상속할 때 발생
		
		
		OverrideParent p = new OverrideParent();
		p.hello();
		
		OverrideChild c = new OverrideChild();
		c.hello();
		//c.hi();
		
		
		
		
		
		//Override 실제 예
		Date d1 = new Date();
		System.out.println(d1);//출력
		System.out.println(d1.toString());//실제
		
		Time2 t1 = new Time2(5, 20);
		System.out.println(t1.getTime()); //**
		System.out.println(t1);
		System.out.println(t1.toString()); //**
				
		//com.test.Time2@7d4991ad
		//자료형@해시코드
		
		
		MyRandom2 rnd = new MyRandom2();
		System.out.println(rnd.nextInt());
		
		rnd.test();
	}//main
}


class MyRandom2 extends Random {
	//멤버 구성
	//1. Random의 멤버 상속
	//2. 자신 멤버
	
	//사용 빈도 높음 -> nextInt()
	@Override
	public int nextInt() {
		Random rnd = new Random();
		return rnd.nextInt(10) + 1;
	}
	
	
	public void test() {
		//this : 객체 접근 지정자(연산자), 현재 코드를 가지고 있는 객체(인스턴스)를 가르키는 예약어
		//super : 부모 객체 접근 지정자
		
		System.out.println(this.nextInt());
		System.out.println(super.nextInt());
		
	}
}


class Time2 {
	private int hour;
	private int min;
	
	public Time2(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}
	
	public String getTime() { //시간 확인용
		return String.format("%d:%d"
					, this.hour
					, this.min);
	}
	
	//부모가 물려준 toString()을 재정의(Overriding)
	@Override
	public String toString() {
		//내부구현은 내맘
		// -> 주로.. toString() 메소드는 객체 자신이 가지고 있는 데이터를 문자열로 돌려주는 코드를 구현
		return String.format("%d:%d"
				, this.hour
				, this.min);
	}
}




class OverrideParent {
	public String name;
	
	public void hello() {
		System.out.println("안녕하십니까~");
	}
}

class OverrideChild extends OverrideParent {
	//public String name;//사용X
	
	//아빠의 인사 방식X -> 자신만의 인사 방식O
	/*
	public void hi() {
		System.out.println("하이~");
	}
	*/
	
	
	//메소드 재정의, Method Overriding
	// -> 왜??
	// -> 전세대에서 정의한 메소드가 후세대에서 내용을 변경할 일이 생겼을때..
	// -> 제 3자의 입장에서는 메소드 내용이 바뀌어도 접근 방식을 동일하게 제공하고 싶을때..
	public void hello() {
		System.out.println("하이~");
	}
}





























