package com.test;

public class Ex44_abstract {

	public static void main(String[] args) {
		
		//Ex44_abstract.java
		
		//추상 클래스 특징
		//1. 추상 클래스는 객체를 만들 수 없다.
		//2. 추상 클래스는 참조 변수는 만들 수 있다.
		
		//추상 클래스 용도
		//1. 일반 클래스의 부모 클래스 역할
		//	- 일반 멤버 -> 상속
		// 	- 추상 멤버 -> 자식에게 강제로 생성 -> 구현
		//2. 추상 클래스 변수를 생성 -> 사용
		
		//Shape s1 = new Shape();
		//s1.setName("aa");
		//s1.draw();
		
		
		Circle c1 = new Circle();
		c1.setName("원1");
		c1.draw();
		c1.erase();
		
		Rectangle r1 = new Rectangle();
		r1.setName("사각형1");
		r1.draw();
		r1.erase();
		
	}
}

//추상 클래스의 사용 목적

//	1. 파생 클래스의 메소드 형식을 통일
//		- 추상 메소드 사용
//		- 객체들의 행동이 동일(통일) -> 최종 사용자에게 같은 사용법을 제공(비슷한 종류의 객체를 사용하기 용이)

//	2. 자식 클래스에게 상속해줄 멤버 구현
//		- 일반 변수
//		- 일반 메소드


//추상 클래스 -> 도형 클래스
abstract class Shape {
	
	//일반 멤버 구현
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void check() {
		System.out.printf("저는 %s입니다.\n", this.name);
	}
	
	
	//추상 멤버 구현
	//	- 모든 도형들의 공통 행동 정의 -> 도형 사용법
	public abstract void draw();
	public abstract void erase();
	
}



//원 클래스
// - extends Shape : 추상 클래스를 상속 받겠다.(추상 클래스의 일반 멤버를 물려받고, 추가로 추상 메소드를 실체화(구현) 하겠습니다.)
class Circle extends Shape {
	
	public void draw() {
		System.out.println("원을 그립니다.");
	}
	
	public void erase() {
		System.out.println("원을 지웁니다.");
	}
	
}


//사각형 클래스
class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}

	@Override
	public void erase() {
		System.out.println("사각형을 지웁니다.");
	}
	
}
















