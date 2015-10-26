package com.test;

public class Ex34_Class {
	
	public static void main(String[] args) {
		
		//Ex34_Class.java
		//p1 : 객체, 객체변수, 참조변수, 인스턴스
		Pen p1 = new Pen(); 
		
		p1.color = "빨강";
		p1.ink = 100;
		
		p1.draw();
		p1.check();
		
		
		Pen p2 = new Pen();
		
		//p1과 동일하게 생겼지만.. 각자 자신의 데이터를 다르게 소유 가능
		p2.color = "노랑"; 
		p2.ink = 200;
		
		p2.draw();
		p2.check();
		
		
		
		//클래스 -> 자료형(? : 변수를 만들 수 있는 것) ->  배열
		//펜 100개 -> 배열 사용?
		int[] nums = new int[3];
		
		Pen[] pens = new Pen[3]; //*** 주의!!!!
		//pens[0].draw();//실수~
		
		pens[0] = new Pen();//실제 펜 생성
		pens[1] = new Pen();
		pens[2] = new Pen();
		
		pens[0].draw();
		
		
		Pen[] pens2 = new Pen[100];
		
		for (int i=0; i<pens2.length; i++) {
			pens2[i] = new Pen();//펜 x100개 생성
		}
		
		
		
	}
}

//클래스 선언
// -> 객체 생성을 위한 설계
// -> 객체가 스스로 어떤 정보를 가지며.. 어떤 행동을 하게 될지 -> 미리 예측 -> 클래스내에서 설계
class Pen {
	
	//펜 객체가 가지는 데이터
	public String color;	//색상
	public int ink; 		//잉크량
	
	//펜 객체가 가지는 행동
	public void draw() {
		System.out.printf("%s색을 사용해서 원을 그리기\n"
				, color);
	}
	
	public void check() {
		System.out.printf("남아있는 잉크량 %dml\n"
				, ink);
	}
	
}

















