package com.test;

import java.util.Random;

public class Ex41_Inheritance {
	
	public static void main(String[] args) {
		
		//Ex41_Inheritance.java
		
		//상속, Inheritance
		// - 클래스간의 상속
		// - 부모 클래스가 가진 재산을 자식 클래스에게 물려주는 행동
		// - 뭘 상속(재산)? -> 클래스 멤버(변수, 메소드)
		// - 부모 클래스가 가진 멤버 변수와 멤버 메소드를 자식 클래스에게 물려주는 행동
		
		//부모 클래스 vs 자식 클래스
		//슈퍼(super) 클래스 vs 서브(sub) 클래스
		//기본 클래스 vs 파생 클래스
		
		
		//상속을 했을 때의 장점
		// - 자식 클래스 구현할 때 구현할 내용이 줄어든다.(부모 클래스의 멤버를 자신의 멤버처럼 사용 가능하기 때문) -> 코드 재사용(생산성)
		
		Parent p = new Parent();
		p.a = 10;
		
		Child c = new Child();
		c.a = 10;
		c.b = 20;
		
		
		
		Child2 c2 = new Child2();
		c2.b = 10;
		c2.d = 20;
		
		
		
		//1. -21~21
		MyRandom rnd = new MyRandom();
		System.out.println(rnd.nextInt());
		
		//2. 1~10
		System.out.println(rnd.getNum());
		
		//3. 색상
		System.out.println(rnd.getColor());
		
		
		
	}//main
}

class Parent2 {
	private int a; //** private 멤버는 상속이 됐어도 자식이 접근이 불가능
	public int b;
}

class Child2 extends Parent2 {
	private int c;
	public int d;
	
	public void test() {
		
	}
}




//부모 클래스
class Parent {
	public int a;
}

//자식 클래스
class Child extends Parent {
	public int b;
}


//상황] 내 업무 -> 난수 발생 잦음 -> Random 클래스 사용 빈도가 높음
//상황] 1~10사이의 정수
//상황] 색상 난수 -> "red", "yellow", "blue"
//사용] 1. nextInt()

//Random 클래스를 상속 받아 새로운 클래스를 선언
// = 기존의 Random 클래스의 기능도 필요하고, 추가로 새로운 기능도 필요할 때

class MyRandom extends Random {
	
	public int getNum() {
		Random rnd = new Random();
		return rnd.nextInt(10) + 1;
	}
	
	public String getColor() {
		Random rnd = new Random();
		String[] colors = {"빨강", "노랑", "파랑"};
		
		return colors[rnd.nextInt(colors.length)];
	}
	
}














