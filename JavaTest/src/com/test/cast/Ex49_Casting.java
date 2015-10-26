package com.test.cast;

import java.util.Random;
import java.util.Scanner;

public class Ex49_Casting {

	public static void main(String[] args) {
		
		java.lang.Object s;
		java.lang.String s2;
		
		//Ex49_Casting.java
		
		AAA a = new AAA();
		AAA b = new BBB(); //업캐스팅
		AAA c = new CCC(); //업캐스팅
		AAA d = new DDD();
		
		Object o1 = new AAA(); //업캐스팅
		Object o2 = new BBB();
		Object o3 = new CCC();
		
		Object o4 = new Random();
		Object o5 = new Scanner(System.in);
		
		Object o6 = "문자열";
		Object o7 = new int[4];
		
		Object o8 = 10;
		Object o9 = true;
		
		//Object은 자바상에 존재하는 모든 자료형의 객체를 담을 수 있다. -> 만능 변수
		
		
		//****
		Object n = 10;
		n = "하하하";
		
		Object[] list = new Object[10];
		list[0] = "홍길동";
		list[1] = "아무게";
		list[2] = new Random();
		list[3] = "하하하";
		
		
		for (int i=0; i<list.length; i++) {
			System.out.println(list[i] + "님");
		}
		
		
		
		
		//박싱 vs 언박싱
		//Boxing vs UnBoxing
		
		//Object 변수 = 참조형 객체;
		Object rnd = new Random();
		Object name = "홍길동";
		
		//Object 변수 = 값형 데이터;
		//박싱
		// int -> Integer (Wrapper Class, Util Class)
		// short -> Short
		// boolean -> Boolean
		Object num = 10;// new Integer();
		System.out.println((int)num * 2);
		
		//절대 불가능한 행동!!!!
		//1. 참조형 변수 = 값데이터;
		//2. 값형 변수 = 참조형 객체; int n = new Random()
		
		
	}
}


class AAA {}

class BBB extends AAA {}

class CCC extends BBB {}

class DDD extends CCC {}














