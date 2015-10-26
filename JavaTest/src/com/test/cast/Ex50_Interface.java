package com.test.cast;

public class Ex50_Interface {
	
	public static void main(String[] args) {
		
		//Ex50_Interface.java
		
		//인터페이스, interface
		//	- 클래스의 일종
		//	- 추상클래스와 유사(추상 메소드 보유)
		
		
		/*
		
			일반 클래스 vs 추상 클래스
			- 구현부를 가진다.(일반변수, 일반메소드)
			- 추상클래스만이 추상메소드를 가진다.
			- 추상클래는 객체화가 불가능(추상메소드)
			
			추상클래스 vs 인터페이스
			- 추상 메소드를 가진다.(표준화 역할)
			- 객체화가 불가능
			- 인터페이스는 구현부를 가질 수 없다.(일반변수, 일반메소드)
			
			가이드
			1. 자식 클래스에게 변수와 구현된 메소드를 물려주면서.. + 행동에 대한 제약 추가 -> 추상 클래스 사용
			2. 자식 클래스에게 행동에 대한 제약 -> 인터페이스 사용
		
		*/
		
		
		Test t1 = new Test();
		//ITest t2 = new ITest();
		ITest t2;
		ITest t3 = new Test();//업캐스팅
		
		
		
	}
}


//인터페이스 선언
interface ITest {
	
	//내부 멤버?
	//	- 추상 메소드
	//	- 일반 멤버는 구현 불가능
	
//	public int a;
//	public void test() {
//		
//	}
	
	//추상클래스 - 일반멤버구현 = 인터페이스
	//일반클래스 + 인터페이스 = 추상클래스
	
	void aaa();
	void bbb(int n);
	String ccc();
	
}

//인터페이스 상속 -> 인터페이스 구현
class Test implements ITest {

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb(int n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String ccc() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}


//인터페이스 - 추상클래스 - 일반클래스

//1. 직원 인터페이스
//2. 간부 인터페이스
//3. 평사원 인터페이스


interface GGG {
	void test();
}

abstract class HHH implements GGG {
	public int b;
	public abstract void test2();
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}

class III extends HHH {
	public int a;

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
}
















