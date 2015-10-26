package com.test.cast;

public class Ex47_Casting {
	
	public static void main(String[] args) {
		
		//Ex47_Casting.java
		
		//형변환
		
		//1. 값형식 형변환
		//	- 숫자형끼리 형변환(정수,실수,문자)
		
		//2. 참조형식 형변환
		//	- 상속관계에 있는 클래스끼리 형변환이 가능
		
		//- 값형식 <-> 참조형식 : 형변환 불가능
		
		
		
		//클래스(참조형) 형변환
		//1. 암시적인 형변환
		//	- 업캐스팅, Up Casting
		//	- 자식 클래스 -> 부모 클래스
		//	- 부모 멤버는 자식이 100% 구현하기 때문에 이 형변환은 100% 안전한 형변환
		//	- 단점 : 자식 객체의 모든 멤버를 다 사용할 수 없다!!
		
		//2. 명시적인 형변환
		//	- 다운캐스팅, Down Casting
		//	- 부모 클래스 -> 자식 클래스
		//	- 100% 불가능
		
		short s1;
		int n1;
		
		s1 = 10; //원본
		
		n1 = s1; //복사 -> 복사본이 원본과 동일?
		
		
		Parent p1;
		Child c1;
		
		c1 = new Child(); //원본
		
		//Parent <= Child
		//형변환 -> 업캐스팅
		//부모 = 자식
		//복사된 p1이 객체로서 역할을 제대로 수행하는지?
		p1 = c1;
		
		p1.a = 10;
		p1.b = 20;
		
		System.out.println(p1.a);
		System.out.println(p1.b);
		
		
		
		
		Parent p2;
		Child c2;
		
		p2 = new Parent();
		
		//Child = Parent
		//자식 = 부모
		//다운 캐스팅
//		c2 = (Child)p2;
//		
//		c2.a = 10;
//		c2.b = 20;
//		c2.c = 30;
//		c2.d = 40;
//		
//		System.out.println(c2.a);
//		System.out.println(c2.b);
//		System.out.println(c2.c);
//		System.out.println(c2.d);
		
		
		
		
		//다운 캐스팅 -> 불가능
		
		Parent p3;
		Child c3;
		
		c3 = new Child();
		
		//Parent = Child
		p3 = c3;
		
		
		Child c4;
		
		//Child = Parent
		//다운 캐스팅 가능?
		c4 = (Child)p3;
		
		c4.a = 10;
		
		
		
		
		
	}//main
}


//부모 클래스
class Parent {
	public int a;
	public int b;
}

//자식 클래스
class Child extends Parent {
	public int c;
	public int d;
}

























