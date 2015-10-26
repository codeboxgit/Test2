package com.test;

import java.util.Calendar;

public class Ex46_final {
	
	public static void main(String[] args) {
		
		//Ex46_final.java
		
		//final 키워드
		//1. 변수 적용(***)
		//2. 메소드 적용
		//3. 클래스 적용
		
		
		//final 변수
		// - 값을 수정할 수 없는 변수
		// - 초기화만 가능
		// - 값을 변경하면 안되는 값을 사용할 때..
		// - 고정값이 필요할 때 사용
		// - 식별자는 모두 대문자
		int a = 10;
		final int b = 20;
		
		System.out.println(a * 2);
		System.out.println(b * 2);
		
		a = 30;
		//b = 40;//불가능
		
		
		final double pi = 3.14;
		//pi = 100;
		
		//final 변수 -> 상수
		final double PI = 3.14;
		
		//int NUM = 0;
		
		//Calendar.YEAR = 2;
		System.out.println(Calendar.YEAR);
		System.out.println(MyCalendar.YEAR);
		
	}
}

class MyCalendar {
	public final static int YEAR = 1;
}




//final 메소드
class FinalParent {
	//여러가지 멤버 구현..
	
	//이 메소드는 절대로 수정하면 안되는 메소드
	public final void hello() {
		System.out.println("안녕하십니까~");
	}
}

class FinalChild extends FinalParent {
	
//	@Override
//	public void hello() {
//		System.out.println("방가~");
//	}
	
}



//final 클래스
// - 더 이상 파생하고 싶지 않은 때..
// - 최종 클래스, 봉인 클래스
// - 미리 예측하기 힘든 미래 상황을 대처하기 힘들기 때문에.. 프로그램 안정성을 위해서..
// - 일반 vs 최종 -> 최종 클래스 속도 빠름
final class FinalA {
	//여러가지 멤버 구현..
}

//상속
//class FinalB extends FinalA {
//	
//}


























