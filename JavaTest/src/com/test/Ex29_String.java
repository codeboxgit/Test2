package com.test;
import java.util.Calendar;

public class Ex29_String {
	
	public static void main(String[] args) {
		
		//m1();
		//m2();
		
		m3();//String
		m4();//StringBuilder
	}
	
	private static void m4() {
		
		//StringBuilder
		System.out.println("StringBuilder 테스트");
		
		//시작 시간
		Calendar start = Calendar.getInstance();
		
		//업무 실행
		StringBuilder str = new StringBuilder("홍길동");
		
		for (int i=0; i<100000; i++) {
			str.append(".");
		}		
		
		//종료 시간
		Calendar end = Calendar.getInstance();
		
		
		//출력
		long startTick = start.getTime().getTime();
		long endTick = end.getTime().getTime();
		long span = endTick - startTick;
		
		System.out.printf("총 %d자이고, 소요시간 %d밀리초\n", str.length(), span);
		
		
	}

	private static void m3() {
		
		//String
		System.out.println("String 테스트");
		
		//시작 시간
		Calendar start = Calendar.getInstance();
		
		//업무 실행
		String str = "홍길동";
		
		for (int i=0; i<100000; i++) {
			str += ".";
		}		
		
		//종료 시간
		Calendar end = Calendar.getInstance();
		
		
		//출력
		long startTick = start.getTime().getTime();
		long endTick = end.getTime().getTime();
		long span = endTick - startTick;
		
		System.out.printf("총 %d자이고, 소요시간 %d밀리초\n", str.length(), span);
		
		
	}

	private static void m2() {
		
		//문자열을 수정하거나 잦은 조작을 하는 경우
		String s1 = "홍길동";
		String s2 = new String("홍길동");//FM
		
		StringBuilder s3 = new StringBuilder("홍길동");
		//StringBuilder s3 = "홍길동";
		
		System.out.println(s1);
		System.out.println(s3);
		
		//"홍길동" + "님"
		// -> 참조형은 연산자의 피연산자가 될 수 없음
		System.out.println(s3.append("님"));
		//System.out.println(s3 + "님");
		
		System.out.println(s3.length());
		
		
	}

	private static void m1() {
		
		//자바에서 문자열을 대상으로 하면 안되는 행동

		//1. 큰 문자열을 수정하는 행동
		String txt1 = "홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. 홍길동입니다. ";
		
		txt1 = txt1 + "!"; //X
		
		System.out.println(txt1);
		
		
		
		//2. 잦은 수정을 반복하는 행동
		String txt2 = "안녕";
		
		for (int i=0; i<100; i++) {
			txt2 = txt2 + ".";
		}
		

		
	}
	
}










