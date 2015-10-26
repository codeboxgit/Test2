package com.test.exception;

import java.util.Random;
import java.util.Scanner;

public class Ex55_Exception {

	public static void main(String[] args) {
		
		//Ex55_Exception.java
		
		//예외, Exception, 런타임 에러
		//	- 컴파일 X
		//	- 실행중 O
		//	- 파일 입출력, DB, Network.. 외부 환경
		
		
		//예외처리, Exception Handling
		//1. 전통적인 방법(제어문 사용)
		//2. try catch
		
		//m1();
		//m2();
		//m3();//****
		//m4();
		
		try {
			m5();
		} catch (Exception e) {
			
		}
		
		
		try {
			m6();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//main

	private static void m6() throws Exception {
		
		System.in.read();
		
	}

	//예외 미루기
	private static void m5() throws Exception {
		
		int num = 0;
		System.out.println(100 / num);
		
	}

	private static void m4() {
		
		//업무
		// - 3의 배수 입력
		// - 3의 배수가 아닌 숫자는 에러
		int num = 5;
		
		if (num % 3 == 0) {
			System.out.println("업무 진행");
		} else {
			System.out.println("예외 처리");
		}
		
		//if -> try 사용
		try {
			
			//예외 조건
			if (num % 3 != 0) {
				//예외 던지기
				throw new Exception();
			}
			
			System.out.println("업무 진행");
		} catch (Exception e) {
			System.out.println("예외 처리");
		}
		
		
		
	}

	private static void m3() {
		
		try {
			int n = 10; //사용자 입력
			System.out.println(100 / n);
		} catch (Exception e) {
			System.out.println("0입력 불가");
		}
		
		try {
			int[] nums = {10, 20, 30};
			System.out.println(nums[5]);
		} catch (Exception e) {
			System.out.println("0~2까지 입력");
		}
		
		
		
		try {
			
			int n = 10; //사용자 입력
			System.out.println(100 / n);
			
			int[] nums = {10, 20, 30};
			System.out.println(nums[5]);
			
		} catch (Exception e) {
			System.out.println("에러 났음");
		}
		
		
		
		try {
			
			int n = 10; //사용자 입력
			System.out.println(100 / n);
			
			int[] nums = {10, 20, 30};
			System.out.println(nums[0]);
			
			Random rnd = null;
			//1. new NullPointerException() 객체 생성
			//2. 던진다.
			System.out.println(rnd.nextInt());
			
		} catch (ArithmeticException e) {
			System.out.println("0입력X");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("0~2까지");
		} catch (Exception e) {
			System.out.println("에러났음");
		}
		
		
	}

	private static void m2() {
		
		//배열
		int[] nums = {10, 20, 30};
		
		try {
			
			for (int i=0; i<4; i++) {
				//ArrayIndexOutOfBoundsException
				System.out.println(nums[i]);
			}
			
		} catch (Exception e) {
			System.out.println("첨자 오류");
		}
		
	}

	private static void m1() {
		Scanner scan = new Scanner(System.in);
		
		//숫자 입력
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		
		
		//예외 검사
		if (num != 0) {
			
			//업무 코드, 비즈니스 코드
			System.out.println("업무 시작");
			//ArithmeticException
			System.out.printf("100 / %d = %d\n"
								, num, 100 / num);
			System.out.println("업무 종료");
			
		} else {
			
			//예외 처리 코드
			System.out.println("숫자 0 금지");
			
		}
		
		
		//권장X
		if (num == 0) {
			
			System.out.println("숫자 0 금지");
			
		} else {
			
			System.out.println("업무 시작");
			System.out.printf("100 / %d = %d\n"
					, num, 100 / num);
			System.out.println("업무 종료");
			
		}
		
		
		
		try {
			
			//업무 코드
			System.out.println("업무 시작");
			System.out.printf("100 / %d = %d\n"
								, num, 100 / num);
			System.out.println("업무 종료");
			
		} catch(Exception e) {
			
			//예외처리 코드
			System.out.println("숫자 0 금지");
			
		}
		
		
		
		
		
		try {
			
			//업무 코드
			System.out.println("업무 시작");
			System.out.printf("100 / %d = %d\n"
								, num, 100 / num);
			System.out.println("업무 종료");
			
		} catch(Exception e) {
			
			//예외처리 코드
			System.out.println("숫자 0 금지");
			
		} finally {
			
			System.out.println("끝~");
					
		}
	}
}















