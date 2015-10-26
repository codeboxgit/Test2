package com.test;

public class Ex42_Object {
	
	public static void main(String[] args) {
		
		//Ex42_Object.java
		
		//Object 클래스
		// - 자바에서 존재하는 모든 클래스간의 관계의 최상위에 위치하는 클래스
		// - 모든 클래스의 부모 클래스
		// - 루트 클래스
		
		DDD d = new DDD();
		
		AAA a = new AAA();
		
		
	}
}


class AAA extends Object {
	//멤버 : a
	public int a;
}

class BBB extends AAA {
	//멤버 : a, b
	public int b;
}

class CCC extends BBB {
	//멤버 : a, b, c
	public int c;
}

class DDD extends CCC {
	//멤버 : a, b, c, d
	public int d;
}














