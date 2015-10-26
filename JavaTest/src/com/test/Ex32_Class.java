package com.test;

import aaa.Phone;

public class Ex32_Class {

	public static void main(String[] args) {
		
		//Ex32_Class.java
		
		/*
		 	클래스, Class
		 	
		 	1. 객체 지향 프로그래밍, OOP
		 	 - 절차 지향 프로그래밍
		 	
		 	2. 객체, Object
		 	 - 데이터 + 행동 = 객체
		 	 - (변수) + (메소드)
		 	 
		 	 - 독자성, Identifiy
		 	 - 상태, State
		 	 - 행동, Behavior
		 	 
		 	 - 캡슐화, Encapsulation(***)
		 	 - 정보 은닉화
		 	 - 인터페이스
		 	
		 	3. 클래스, Class
		 	 - 객체를 생성하기 위한 설계도
		 	 - 자료형
		 	 - 코드의 집합		 	
		 	
		 	4. 클래스 vs 객체 vs 인스턴스
		 	 - 클래스 : 틀, 추상적
		 	 - 객체 : 클래스를 기반 실체화된 요소
		 	 - 인스턴스 : (=객체) 메모리상에 객체화된 요소
		  
		  
		  
		  자바에서 클래스 만들기
		  - 붕어빵 틀 만들기
		  
		  class 클래스명 {
		  	
		  }
		  
		  1. 실제 파일명과 클래스명은 반드시 같아야 한다.
		   : Ex001.java -> class Ex001 {}
		  
		  2. 클래스명은 반드시 대문자로 시작해야 한다.
		   : 필수(X) -> 권장(O)
		  
		  3. 자바 파일 1개당 클래스 1개 선언(권장)		  
		  	: 여러개 작성 -> 코드 관리 불편
		  	a. 모든 클래스 중 public 키워드는 딱 1개
		  	b. 나머지 클래스는 public 키워드 사용 불가
		  	c. public 클래스의 이름이 파일명이 된다.
		 */
		
		
		//클래스 -> 객체 생성
		//클래스명 변수명 = new 클래스명();
		//클래스명 객체명 = new 생성자;
		Test1 t1 = new Test1();
		t1.n = 10;
		
		Test1 t2 = new Test1();
		t2.n = 20;
		
		
		//좌표값 저장
		int x = 100;
		int y = 200;
		
		int x2 = 300;
		int y2 = 350;
		
		
		Point p1 = new Point();
		p1.x = 100;
		p1.y = 200;
		
		Point p2 = new Point();
		p2.x = 300;
		p2.y = 350;
		
		
		Size s1 = new Size();
		s1.name = "모니터";
		s1.width = 20;
		s1.height = 15;
		
		
		
		Test2.hello();
		Test2.test();
		//Test2.bye();//?
		
		Test2 s2 = new Test2();
		s2.bye();
		
		
		hi();
		Ex32_Class.hi();//FM
		
		
		
		Test3 t3 = new Test3();
		t3.a = 10;
		t3.test();
		
		
		
		
		//첫번째 학생
		Student2 st1 = new Student2();
		st1.name = "홍길동";
		st1.age = 15;
		st1.hello();
		
		Student2 st2 = new Student2();
		st2.name = "아무게";
		st2.age = 16;
		st2.hello();
		
		
		
		
		
		
		
		
		
		
		
	}//main
	
	public static void hi() {
		System.out.println("안녕~");
	}
} //Ex


//클래스 선언하기(붕어빵틀 만들기)
// - 클래스 -> 객체 생성
// - 객체 = 데이터 + 행동
// - 클래스 제작 -> 데이터 + 행동 정의


//클래스 종류
//1. 데이터의 집합 //***
//2. 행동의 집합 //*
//3. 데이터 + 행동 집합 //*****


//1. 데이터 집합 역할
class Test1 {
	//클래스 구성 요소(데이터 + 행동)
	public int n;
}


//좌표값 저장
class Point {
	public int x;
	public int y;
}


//사물의 크기 저장
class Size {
	public String name;
	public int width;
	public int height;
}



//2. 행동의 집합 -> 유틸 클래스
class Test2 {
	
	//클래스 메소드
	public static void hello() {
		System.out.println("안녕하세요");
	}
	
	public static void test() {
		System.out.println("테스트입니다.");
	}
	
	//객체 메소드
	public void bye() {
		System.out.println("잘가~");
	}
}


class MyMath {
	
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void square(int a) {
		System.out.println(a * a);
	}
	
	//..
	
}



//3. 데이터 + 행동 집합
class Test3 {
	
	public int a;
	
	public void test() {
		System.out.println("테스트");
	}
	
}


class Student2 {
	
	public String name;	//학생명
	public int age;		//학생나이
	
	public void hello() {
		System.out.printf("안녕하세요. 저는 %s입니다. 제 나이는 %d살입니다.\n", name, age);
		
		
		java.util.Scanner scan;
		
		Phone p1;
		
		//Full Name(패키지명.클래스명)
		bbb.Phone p2;//bbb패키지
		
		
	}
	
}























