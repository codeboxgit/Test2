package com.test.generic;

public class Ex52_Generic {

	public static void main(String[] args) {
		
		//Ex52_Generic.java
		
		//제네릭, Generic
		// - 제네릭 클래스(***)
		// - 제네릭 메소드
		// - 제네릭 사용 -> 제네릭 컬렉션
		
		//제네릭 <-> Object 클래스
		// - 모든 자료형을 담을 수 있다.
		
		
		//정수
		WrapperInt n1 = new WrapperInt(10);
		System.out.println(n1.getData() * 2);
		
		WrapperObject n2 = new WrapperObject(20);
		System.out.println((int)n2.getData() * 2);
		
		Wrapper<Integer> n3 = new Wrapper<Integer>(30);
		System.out.println(n3.getData() * 2);
		
		
		
		//문자열
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1.getData());
		
		WrapperObject s2 = new WrapperObject("아무게");
		System.out.println((String)s2.getData());
		System.out.println(s2.getData().toString());//
		
		Wrapper<String> s3 = new Wrapper<String>("하하하");
		System.out.println(s3.getData());
		
		
		//논리형
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1.getData());
		
		WrapperObject b2 = new WrapperObject(false);
		System.out.println((boolean)b2.getData());
		
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3.getData());
		
	}
}


//int -> Integer (Wrapper Class, Util Class)
//요구사항] int 값 1개를 조작(제어)하는 클래스를 선언
//추가사항] String 값 1개를 조작(제어)하는 클래스를 선언
//추가사항] boolean 값 1개를 조작(제어)하는 클래스를 선언
//추가사항] 기본형 모두 선언 x 8개, 참조형 x 무한대


//제네릭 클래스
class Wrapper<T> {
	
	private T data;
	
	public Wrapper(T data) {
		this.setData(data);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}


class WrapperObject {
	
	private Object data;
	
	public WrapperObject(Object data) {
		this.setData(data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}


class WrapperBoolean {
	
	private boolean data;
	
	public WrapperBoolean(boolean data) {
		this.setData(data);
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}
	
}



class WrapperString {
	
	private String data;
	
	public WrapperString(String data) {
		this.setData(data);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}



class WrapperInt {
	
	private int data; //<- 핵심, 클래스의 중심
	
	public WrapperInt(int data) {
		this.setData(data);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}















