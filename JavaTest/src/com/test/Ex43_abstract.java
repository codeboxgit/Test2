package com.test;

public class Ex43_abstract {
	
	public static void main(String[] args) {
		
		//Ex43_abstract.java
		
		//추상 클래스, Abstract Class
		// - 상속받는 클래스(객체)의 사용법을 표준화
		// - 멤버 중 메소드에 대한 제약 사항
		// - 행동에 대한 강제성 부여
		
		//추상 메소드, Abstract Method
		// - 상속받는 클래스(객체)의 사용법을 표준화
	
		//Dell150 d1 = new Dell150();
		Dell150 d1 = new Dell150("Dell150", 1024, 768);
		d1.on();
		d1.off();
		
		
		HP300 h1 = new HP300();
		h1.start();
		h1.stop();
		
		
		
		Dell160 d2 = new Dell160();
		d2.on();
		d2.off();
		
		HP400 h2 = new HP400();
		h2.on();
		h2.off();
		
		//Apple3 a3 = new Apple3();
		//a3.on();
		//a3.off();
	}
}


//모니터 클래스 -> 객체 생성 -> 객체 사용
class Dell150 {
	private String model;
	private int width;
	private int height;
	
	public Dell150(String model, int width, int height) {
		//유효성 검사
		this.model = model;
		this.width = width;
		this.height = height;
	}
	
	public void checkModel() {
		System.out.printf("모델명 : %s\n", this.model);
	}
	
	//전원 켜기
	public void on() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	//전원 끄기
	public void off() {
		System.out.println("전원이 껴졌습니다.");
	}
	
}



class HP300 {
	private String model;
	private int width;
	private int height;
	
	//HP300만의 멤버들...
	
	//전원 켜기
	public void start() {
		System.out.println("파워 온");
	}
	
	//전원 끄기
	public void stop() {
		System.out.println("파워 오프");
	}
	
}

//추상 클래스 선언
abstract class Monitor {
	
	//추상 메소드 선언
	public abstract void on();
	public abstract void off();
	
}

class Dell160 extends Monitor {
	
	public void on() {
		System.out.println("Dell160 On");
	}
	
	public void off() {
		System.out.println("Dell160 Off");
	}
	
}


class HP400 extends Monitor {
	
//	public void start() {
//		System.out.println("HP400 On");
//	}
//	
//	public void stop() {
//		System.out.println("HP400 Off");
//	}
	
	public void on() {
		System.out.println("HP400 On");
	}
	
	public void off() {
		System.out.println("HP400 Off");
	}
	
}




















