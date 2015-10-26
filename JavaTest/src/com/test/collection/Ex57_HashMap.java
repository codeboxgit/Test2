package com.test.collection;

import java.util.HashMap;

public class Ex57_HashMap {
	
	public static void main(String[] args) {
		
		//Ex57_HashMap.java
		
		//ArrayList
		//	- 요소(방)의 접근 -> 첨자(index) 사용
		//	- 스칼라 배열, Scalar Array
		
		//HashMap
		//	- 요소(방)의 접근 -> 키(key) 사용
		//	- 키(key) -> 숫자, 문자, 문자열(***) 등..
		//	- 연관 배열, 사전 구조(Dictionary)
		
		
		
		//ArrayList<T> list = new ArrayList<T>();
		//	- index + value
		//	- 정수 : 첨자 
		//	- T : 값의 타입
		
		//HashMap<T,U> map = new HashMap<T,U>();
		//	- key + value
		//	- T : 키의 타입 - 방 구분하는 식별자(문자열)
		//	- U : 값의 타입
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		//map.put(key, value);
		map.put("dog", "강아지");
		map.put("cat", "고양이");
		map.put("monkey", "원숭이");
		
		System.out.println(map.get("dog"));
		System.out.println(map.get("cat"));
		System.out.println(map.get("monkey"));
		
		
		//학생의 점수 배열(국어,영어,수학)
		int[] jumsu = {100, 90, 80};
		System.out.println(jumsu[1]);//어떤 과목?
		
		HashMap<String,Integer> jumsu2
			= new HashMap<String,Integer>();
		jumsu2.put("국어", 100);
		jumsu2.put("영어", 90);
		jumsu2.put("수학", 80);
		
		System.out.println(jumsu2.get("영어"));//무슨과목?
		
		
		//데이터 갯수
		System.out.println(jumsu2.size());
		
		
		//데이터 수정
		jumsu2.put("영어", 100);
		System.out.println(jumsu2.get("영어"));
		System.out.println(jumsu2.size());
		
		
		//데이터 삭제
		jumsu2.remove("영어");
		System.out.println(jumsu2.size());
		System.out.println(jumsu2.get("영어"));
		
		
		//key 존재 유무?
		System.out.println(jumsu2.containsKey("국어"));
		System.out.println(jumsu2.containsKey("영어"));
		
		//value 존재 유무?
		System.out.println(jumsu2.containsValue(100));
		System.out.println(jumsu2.containsValue(0));
		
		
		//초기화
		jumsu2.clear();
		
		System.out.println(jumsu2.isEmpty());
		
		
		
		
		//데이터 집합이 필요한 업무
		//1. 데이터 동일한 자료형?
		//	- 배열
		//	- ArrayList
		
		//2. 데이터 다른 자료형?
		//	- 클래스(멤버변수만) : 재사용
		//	- HashMap : 1회용
		
		
		//학생 데이터의 객체가 몇번이나 필요한가?
		
		//s1(객체, 데이터집합)
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 20;
		s1.weight = 70;
		s1.height = 180;
		
		
		HashMap<String,String> s2
			= new HashMap<String,String>();
		s2.put("name", "아무게");
		s2.put("age", "25");
		s2.put("weight", "75");
		s2.put("height", "170");
		
		
		
	}
}

class Student {
	public String name;
	public int age;
	public int weight;
	public int height;
}

















