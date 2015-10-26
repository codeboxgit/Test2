package com.test;

public class Ex28_String {
	
	public static void main(String[] args) {
		
		//문자열
		// - 문자열은 참조형이다.
		// - 문자열은 불변이다.
		//값형 : 데이터가 변해도 공간의 크기가 똑같으면
		//참조형 : 데이터가 변하면 공간의 크기도 변하면
		
		//참조형, Reference-Type
		int a = 10;
		String b = "홍길동";
		
		
		//불변(immutable)
		// - 문자열 데이터는 한번 만들면 절대로 수정할 수 없다!!!
		
		String name = "홍길동";
		name = name + "님";
		
		
		
		int n1 = 10;
		int n2 = 10;
		int n3 = 5;
		n3 = n3 + 5;
		
		System.out.println(n1 == n2);
		System.out.println(n1 == n3);
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3 + "길동";
		
		
		//참조형 변수는 값을 비교X -> 주소값을 비교O
		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
		
		System.out.println(s1.equals(s3));
		
		
		
		
		
		
	}
	
}











