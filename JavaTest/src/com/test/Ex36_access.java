package com.test;

public class Ex36_access {

	public static void main(String[] args) {
		
		//Ex36_access.java
		
		//접근 지정자, Access Modifier
		// - 클래스 멤버(변수, 메소드)의 보안 제어 역할
		// - 캡슐화, 정보 은닉화, 인터페이스.. 
		// - 클래스의 변수나 메소드 선언앞에 표현
		
		//1. public
		// - 클래스 멤버를 공개할 때..
		// - 어디서든 접근 가능
		// - 100% 공개
		
		//2. private
		// - 클래스 멤버를 비공개할 때..
		// - 외부에서 접근 불가능
		// - 100% 비공개
		
		AccessTest at = new AccessTest();
		at.a = 10;
		//at.b = 20;
		
		
//		Employee e1 = new Employee();
//		e1.name = "홍길동";
//		e1.age = 30;
//		
//		Employee e2 = new Employee();
//		e2.name = "AAAAAAAAAAAAAAAAAAAAAAAAAAA";
//		e2.age = -100000;
//		e2.name = "2 x 2 = 4";
//		e2.age = 1000000;
//		
//		System.out.println(e1.name);
//		System.out.println(e2.name);
//		
//		System.out.println(e1.age);
//		System.out.println(e2.age);
		
		
		Employee e1 = new Employee();
		e1.setName("홍길동");
		e1.setAge(20);
		
		System.out.println(e1.getName());
		
		Temp t1 = new Temp();
		t1.setNum(10);
		
		Temp t2 = new Temp();
		t2.setNum(20);
		
	}
}


class Temp {
	
	private int num;
	
	public void setNum(int num) {
		//t1.num = num;
		this.num = num; //**
	}
	
	public void setNum2(int n) {
		//비권장
		num = n;
		
		//권장(가독성)
		this.num = n;
		
		//이클립스 기능 사용
		this.num = n;
		
	}
	
}



class Employee {
	
	//public String name;
	//public int age;
	
	private String name;
	private int age;
	private int weight;
	
	public void setWeight(int weight) {
		//변수 충돌
		// - 멤버변수와 지역변수(매개변수)가 충돌하면 지역변수가 이긴다.
		
		//this 지정(접근) 연산자
		// - 객체 자신
		this.weight = weight;
		
	}
	
	
	//setName() 메소드
	// - 외부 -> 내부 값 대입
	// - setter
	// - 메소드명 : setXXX()
	public void setName(String str) {
		
		//변수를 public 으로 열어놓았을때는 값의 제어가 안되지만.. 
		//private으로 막아놓은 뒤 public 메소드를 통해서 값을 넣을 때는 값의 유효성 검사가 가능하다.
		if (str.length() >= 2 && str.length() <= 4) {
			name = str;
		}
	}
	
	public void setAge(int n) {
		if (n >= 1 && n <= 130) {
			age = n;
		}
	}
	
	//getName() 메소드
	// - 내부 -> 외부 값 반환
	// - getter
	// - 메소드명 : getXXX()
	public String getName() {
		return name;
	}
	
}


class AccessTest {
	
	//멤버 변수
	public int a;
	private int b;
	
	public void test() {
		//같은 클래스에서는 접근 지정자가 의미 없음
		
		//같은 클래스 내부에서는 private 멤버도 접근 가능
		b = 20;
		System.out.println(b);
		
		//public 멤버
		a = 30;
		System.out.println(a);
	}
	
}












