package com.test;

public class Ex37_access {
	
	public static void main(String[] args) {
		
		//Ex37_access.java
		Mouse m1 = new Mouse();
		m1.setModel("SM7PCP");
		System.out.println(m1.getModel());
		
		//쓰기 전용
		m1.setPrice(10000);
		//System.out.println(m1.getpr);
		
		//m1.price = 10;
		//System.out.println(m1.price);
		
		//읽기 전용
		System.out.println(m1.getButton());
		
		Baby b1 = new Baby();
		b1.setAge(3);
		System.out.println(b1.getAge());
		System.out.println(b1.getBirthYear());
	}
}

class Temp2 {
	
	//접근 지정자 사용???
	//1. 멤버 변수
	// - 무조건 private
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	//2. 멤버 메소드
	// - 되도록 private
	// - 인터페이스 역할을 하거나 반드시 오픈되어야할 메소드만 일부 public
	
	
}

class Baby {
	
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	//가상 필드(계산된 필드, 속성)
	public int getBirthYear() {
		return 2015 - this.age;
	}
	
}


class Mouse {
	
	private String model;
	private int price; //쓰기 멤버
	private int button = 3; //읽기 멤버
	
	//setter X, getter O
	public int getButton() {
		return this.button;
	}
	
	//setter O, getter X
	public void setPrice(int price) {
		this.price = price;
	}	
	
	//setter O, getter O
	public void setModel(String model) {
		//유효성 검사 실행 가정
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
}















