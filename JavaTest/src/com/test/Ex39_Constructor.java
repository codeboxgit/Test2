package com.test;

public class Ex39_Constructor {
	
	public static void main(String[] args) {
		
		//Ex39_Constructor.java
		
		//생성자, Constructor
		// - 메소드명이 클래스명과 동일한 메소드
		// - 객체의 멤버를 초기화하는 역할
		// - 반환값을 가지지 않는다. 인자값은 가질 수 있다
		
		
		//생성자 vs setter
		// 1. 객체가 만들어지자 마자 가져야 하는 값
		//	-> 생성자
		// 2. 객체가 만들어진 후 수정을 해야 하는 값
		//  -> setter
		
		Location l1 = new Location();
		
		//초기화
		l1.setName("우리집");
		l1.setLocation(100, 200);
		
		System.out.println(l1.getLocation());
		
		
		Location l2 = new Location();
		//l2.setLocation(100, 100);
		
		System.out.println(l2.getLocation());
		
		
		
		//l3 -> 500, 1000 좌표 저장
		//l3(100,100) -> l3(500,1000)
		Location l3 = new Location();
		l3.setLocation(500, 1000);
		
		//l3(500, 1000)
		Location l4 = new Location(500, 1000);
		
		
	} //main
	
}

class Location {
	
	private String name; 	//장소명
	private int x; 			//좌표값
	private int y;			//좌표값
	
	
	//생성자 선언
	// 1. public을 가진다.
	// 2. 반환값을 가질 수 없다.
	// 3. 메소드명이 클래스명과 동일하다.
	
	//기본 생성자
	// 1. 인자값이 없는 생성자
	// 2. 개발자가 만들지 않으면 컴파일러가 자동으로 만들어준다.
	
	//생성자의 역할
	// -> 객체의 초기 상태를 지정
	// -> 객체의 멤버 변수들을 초기화하는 역할
	public Location() {
		//일반 메소드와 동일한 영역
		// -> 멤버 변수의 초기화 구문이 자동으로 생성
		this.name = "미정";
		this.x = 100;
		this.y = 100;
	}
	
	
	//생성자 -> 메소드
	// -> 메소드 오버로딩
	// -> 생성자 오버로딩
	//		-> 사용자가 원하는대로 객체를 다양한 형태로 생성하기 위한 용도
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//setter
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//getter
	public String getLocation() {
		return x + " : " + y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}












