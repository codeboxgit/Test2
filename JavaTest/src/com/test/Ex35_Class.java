package com.test;

import java.util.Scanner;

public class Ex35_Class {
	
	public static void main(String[] args) {
		
		//Ex35_Class.java
		
		Student3 hong = new Student3();
		
		hong.name = "홍길동";
		hong.kor = 100;
		hong.math = 90;
		hong.eng = 80;
		
		hong.score();
		
		
		
		//학생 5명
		Student3[] list = new Student3[5];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<list.length; i++) {
			
			//루프 1회 -> 학생 객체 1개 생성
			list[i] = new Student3();//실제 객체 생성(***)
			
			System.out.print("이름 : ");
			list[i].name = scan.nextLine();
			
			System.out.print("국어 : ");
			list[i].kor = scan.nextInt();
			
			System.out.print("수학 : ");
			list[i].math = scan.nextInt();
			
			System.out.print("영어 : ");
			list[i].eng = scan.nextInt();
			
			scan.skip("\r\n");			
		}
		
		
		//확인
		for (int i=0; i<list.length; i++) {
			list[i].score();
		}
		
		
		
		
		
		
	}
}


class Student3 {
	
	//데이터, 특성(Property), 상태(State), 속성(Attribute)
	//필드(field) or 멤버 변수
	public String name;		//학생명
	public int kor;			//국어
	public int math;		//수학
	public int eng;			//영어
	
	//행동
	public void score() {
		
		int total = kor + math + eng;
		double avg = total / 3.0;
		
		System.out.printf("저는 %s이고, 총점은 %d점, 평균은 %.1f점입니다.\n", name, total, avg);
		
	}
	
}
















