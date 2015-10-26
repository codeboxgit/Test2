package com.test;

public class Ex40_Constructor {
	
	public static void main(String[] args) {
		
		//Ex40_Constructor.java
		
		Time t1 = new Time();
		System.out.println(t1.getTime());
		
		Time t2 = new Time(2, 30, 40);
		System.out.println(t2.getTime());
		
		Time t3 = new Time(2, 70, 80);//3, 11, 20
		System.out.println(t3.getTime());
	}
}


//시간 클래스(시, 분, 초)
class Time {
	
	//멤버
	private int hour;
	private int min;
	private int sec;
	
	//멤버 초기화
	public Time() {
		this.hour = 1;
		this.min = 0;
		this.sec = 0;
	}
	
	//생성자 오버로딩(객체 생성 다형성)
	// - new Time(2, 30, 40);
	// - new Time(2, 70, 40);
	// - new Time(2, 30, 70);
	public Time(int hour, int min, int sec) {
		
		if (hour >= 0) {
			this.hour = hour;
		}
		
		if (min >= 0) {
			if (min < 60) {
				//0~59분
				this.min = min;
			} else {
				//60분 이상 -> 반올림
				// new Time(2, 130, 40)
				this.hour = this.hour + min / 60;
				this.min = min % 60;
			}
		}
		
		
		if (sec >= 0) {
			if (sec < 60) {
				//0~59초
				this.sec = sec;
			} else {
				//60초 이상 -> 반올림
				this.min = this.min + sec / 60;
				this.sec = sec % 60;
			}
		}
		
	}
	
	
	// new Time(1000) -> 0:16:40
	public Time(int sec) {
		//직접 구현..
	}
	
	
	
	//시간 확인(8:50:20)
	public String getTime() {
		//return this.hour + ":" + this.min + ":" + this.sec;
		
		//형식 문자 사용
		//1. printf()
		//2. String String.format()
		return String.format("%d:%d:%d"
							, this.hour
							, this.min
							, this.sec);
	}
	
}

















