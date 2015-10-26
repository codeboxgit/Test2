package com.test.cast;

public class Ex48_Casting {
	
	public static void main(String[] args) {
		
		//Ex48_Casting.java(************)
		
		//기술]
		//	- 추상클래스(추상메소드)
		//	- 상속
		//	- 형변환
		//	- 배열
		//	- 제어문
		
		//상황]
		//	1. 전자 제품 대리점
		//	2. 프린터 기기 판매
		//	3. LG550 x 5대, HP660 x 3대
		
		//운영방침]
		//	1. 한달 1번 -> 제품 테스트
		//		a. 출력 기능 테스트
		
		//수정사항]
		//	1. 프린터 증가 -> LG(100대), HP(50대)
		//	2. 브랜드 증가 -> Dell, Samsung, BenQ.. 10종
		//	3. 각 제품의 고유 기능 테스트
		
		
		//업캐스팅 & 다운캐스팅
		// - 앱캐스팅
		//	: 서로 다른 타입의 형제들을 관리하기 편하도록 부모 타입으로 형변환 한 뒤 배열등으로 관리
		// - 다운캐스팅
		//	: 특정 객체만이 할 수 있는 행동(멤버)이 필요하면.. 그 때만 일시적으로 원래의 자기 클래스 형태로 다운캐스팅을 해서 고유 멤버를 사용
		
		
		
		//m1();
		//m2();
		m3();
		
	}//main

	
	private static void m3() {
		
//		//캐스팅
//		LG550 lg = new LG550();
//		Printer p;
//		
//		//업캐스팅
//		p = lg;
//		
//		Printer p2 = new LG550();
//		
//		Printer p3 = new HP660();
//		
//		Printer[] list = new Printer[5];
//		list[0] = new LG550();
//		list[1] = new HP660();
		
		
		Printer[] ps = new Printer[8];
		
		for (int i=0; i<ps.length; i++) {
			if (i < 5) {
				ps[i] = new LG550();
			} else {
				ps[i] = new HP660();
			}
		}
		
		
		
		//한달.. 점검
		for (int i=0; i<ps.length; i++) {
			
			//print() -> 추상메소드
			ps[i].print();
			
			//ps[i].call();
			
			//자식 객체 고유 기능 접근
			//	-> 다운 캐스팅
			
//			if (i < 5) {
//				LG550 lg = (LG550)ps[i];
//				lg.call();
//			} else {
//				HP660 hp = (HP660)ps[i];
//				hp.check();
//			}
			
			
			//연산자
			// 객체 instanceof 클래스
			// - 앞의 객체가 뒤의 클래스형으로 형변환이 가능합니까?
			//System.out.println(ps[i] instanceof LG550);
			
			if (ps[i] instanceof LG550) {
				
				LG550 lg = (LG550)ps[i];
				lg.call();
				
				((LG550)ps[i]).call();
				
				
			} else if (ps[i] instanceof HP660) {
				
				((HP660)ps[i]).check();
				
			}
			
			
		}
				
	}

	
	
	
	

	private static void m2() {
		
		LG550[] lgs = new LG550[5];
		//lgs[0] = new LG550();
		
		for (int i=0; i<lgs.length; i++) {
			lgs[i] = new LG550();
		}
		
		HP660[] hps = new HP660[3];
		
		for (int i=0; i<hps.length; i++) {
			hps[i] = new HP660();
		}
		
		
		
		//한달.. 점검
		//lgs[0].print();
		
		for (int i=0; i<lgs.length; i++) {
			lgs[i].print();
		}
		
		for (int i=0; i<hps.length; i++) {
			hps[i].print();
		}
		
	}


	private static void m1() {
		
		//가장 원시적인 방법
		LG550 lg1 = new LG550();
		LG550 lg2 = new LG550();
		LG550 lg3 = new LG550();
		LG550 lg4 = new LG550();
		LG550 lg5 = new LG550();
		
		HP660 hp1 = new HP660();
		HP660 hp2 = new HP660();
		HP660 hp3 = new HP660();
		
		
		
		//핵심 업무 -> 한달 -> 점검
		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();
		
		hp1.print();
		hp2.print();
		hp3.print();
		
		
	}
}



//추상 클래스
abstract class Printer {
	
	public String model;
	public int ink;
	
	//추상 메소드(업무X -> 접근성O, 행동O)
	// - 출력기능
	public abstract void print();	
	
}


//제품 클래스
class LG550 extends Printer {

	@Override
	public void print() {
		System.out.println("LG550 출력..");
	}
	
	//LG550 독자 기술
	public void call() {
		System.out.println("상담원 연결..");
	}
	
}


class HP660 extends Printer {

	@Override
	public void print() {
		System.out.println("HP660 출력..");
	}
	
	//HP660 독자 기술
	public void check() {
		System.out.println("자가 진단 기능..");
	}
	
}
















