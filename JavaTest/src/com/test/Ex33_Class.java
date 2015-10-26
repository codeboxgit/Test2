package com.test;

public class Ex33_Class {

	//main 메소드(함수, 프로시저, 서브루틴 등..)
	public static void main(String[] args) {
		
		Pen2 p1 = new Pen2();
		p1.color = "red";
		p1.ink = 100;
		
		Pen2 p2 = new Pen2();
		p2.color = "blue";
		p2.ink = 100;
		
		Pen2 p3;
		p3 = new Pen2();
		p3.color = "orange";
		p3.ink = 200;
		
		Pen2 p4 = null;
		
		System.out.println(p4.color);
		
		
		
	}
}

class Pen2 {
	
	public String color; //색상
	public int ink; 	 //잉크량(ml)
	
}













