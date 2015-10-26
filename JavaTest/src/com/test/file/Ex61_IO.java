package com.test.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex61_IO {
	
	private static String path;
	
	static {
		path = "D:\\Class\\File\\student.dat";
	}
	
	public static void main(String[] args) {
		
		//Ex61_IO.java
		
		//파일 입출력
		//	- 텍스트 입출력 //O
		//	- 이진 데이터 입출력(바이너리) //X
		
		//인코딩, Encoding
		//	- 문자 코드를 부호화(1,0) 시키는 작업
		//	- 디코딩(인코딩의 반대작업, 복호화)
		
		//인코딩 방식
		//1. ISO-8859-1
		//2. EUC-KR
		//3. ANSI
		//4. UTF-8
		//5. UTF-16
		//6. MS949
		// 1 = 2 = 3 = 6 //동일
		
		//EUC-KR(ANSI)
		//	- 영어 : 1byte
		//	- 한글 : 2byte
		
		//UTF-8
		//	- 영어 : 1byte
		//	- 한글 : 3byte(이상)
		
		//UTF-16
		//	- 영어 : 2byte
		//	- 한글 : 2byte
		
		//m1();
		//m2();
		//m3();
		
		//m4();
		//m5();
		
		//m6();
		//m7();
		//m8();
		
		//m9();
		m10();
				
	}//main

	
	private static void m10() {
		
		//정보 읽기 -> 학생 목록 출력
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String txt = "";
			
			while((txt = reader.readLine()) != null) {
				//루프 1회전 -> 학생 1명(txt)
				//홍길동,20,서울시
				
				//"," : 구분자(seperator)
				String[] temp = txt.split(",");
				
				System.out.printf("%s\t%s\t%s\r\n"
						, temp[0]
						, temp[1]
						, temp[2]);
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}


	private static void m9() {
		
		//학생 정보 관리
		// -> 이름, 나이, 주소
		
		//정보 쓰기
		try {
			
			//기본 -> 생성 모드
			//추가 모드
			//1. 파일 없음 -> 새로 생성
			//2. 파일 있음 -> 이어 쓰기
			BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
			
			String name = ""		//이름
				, age = ""			//나이
				, address = "";		//주소
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름 : ");
			name = scan.nextLine();
			
			System.out.print("나이 : ");
			age = scan.nextLine();
			
			System.out.print("주소 : ");
			address = scan.nextLine();

			
			String txt = String.format("%s,%s,%s"
					, name
					, age
					, address);
			
			writer.write(txt);
			writer.newLine();			
			
			
			writer.close();
			System.out.println("등록 완료");
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}


	private static void m8() {
		
		try {
			
			String path = "D:\\Class\\JavaTest\\src\\com\\test\\Ex27_String.java";
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String txt = "";	//한줄
			int lineNumber = 1;	//행번호
			
			while((txt = reader.readLine()) != null) {
				System.out.printf("%4d: %s\r\n"
						, lineNumber
						, txt);
				lineNumber++;
			}
			
			reader.close();
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}


	private static void m7() {
		
		//파일 읽기
		//BufferedReader 클래스
		
		try {
			
			//콘솔 입력
			//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			//파일 입력
			BufferedReader reader = new BufferedReader(new FileReader("D:\\Class\\File\\ccc.txt"));
			
			//개행문자 전까지 읽어서 반환 -> 한줄 읽기
			//텍스트파일의 개행문자 -> 자동 버림
//			String txt = reader.readLine();
//			System.out.println(txt);
//			
//			txt = reader.readLine();
//			System.out.println(txt);
//			
//			txt = reader.readLine();
//			System.out.println(txt);
			
			String txt = "";
			
			while ((txt = reader.readLine()) != null) {
				System.out.println(txt);
			}
			
			
			reader.close();			
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}


	private static void m6() {
		
		//파일 쓰기
		//BufferedWriter 클래스
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Class\\File\\ccc.txt"));
			
			writer.write("홍길동입니다.");
			writer.newLine();//writer.write("\r\n");
			writer.write("반갑습니다~");
			
			writer.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}


	private static void m5() {
		
		//파일 읽기
		//FileReader 클래스
		
		try {
			
			FileReader reader = new FileReader("D:\\Class\\File\\bbb.txt");
			
			int code = -1;
			
			//code = reader.read();
			//System.out.println((char)code);
			
			while ((code = reader.read()) != -1) {
				System.out.print((char)code);
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}
	
	

	private static void m4() {
		
		//파일 쓰기
		//FileWriter 클래스
		
		try {
			
			//스트림 객체(쓰기 전용 빨대)
			FileWriter writer = new FileWriter("D:\\Class\\File\\bbb.txt");
			
			//writer.write("안녕하세요~");
			Scanner scan = new Scanner(System.in);
			
			while (true) {
				System.out.print("입력 : ");
				String txt = scan.nextLine();
				
				if (txt.equals("exit"))
					break;
				
				writer.write(txt + "\r\n");
			}
			
			writer.close();
			
			System.out.println("완료");
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}


	private static void m3() {

		//데이터 읽기
		// -> 바이트 읽기(System.in.read() 유사)
		
		try {
			
			//읽기 전용 빨대(스트림)
			FileInputStream stream = new FileInputStream("D:\\Class\\File\\aaa.txt");
			
			//스트림의 처음 문자 코드 반환
//			int code = stream.read();
//			System.out.println((char)code);
//			
//			code = stream.read();
//			System.out.println((char)code);
//			
//			code = stream.read();
//			System.out.println((char)code);
//			
//			//더이상 읽을 문자가 없으면..
//			stream.read(); //-1
			
			//*** 자주 쓰는 패턴
			int code = 0;
			
			code = stream.read();
			System.out.println((char)code);
			
			
			
			stream.close();
			
			//다시 처음부터 읽으려면..
			stream = new FileInputStream("D:\\Class\\File\\aaa.txt");
			
			while((code = stream.read()) != -1) {
				System.out.print((char)code);
			}
			
			//자원 해제 코드
			// -> Clean up code
			stream.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			//stream.close();
		}
		
	}
	
	


	private static void m2() {
		
		//바이트 쓰기
		//File file = new File("D:\\Class\\File\\aaa.txt");
		//FileOutputStream stream = new FileOutputStream(file);
		
		
		try {
			
			//생성 모드
			//1. 파일 없음 -> 새로 만든다.
			//2. 파일 있음 -> 덮어 쓴다.
			FileOutputStream stream = new FileOutputStream("D:\\Class\\File\\aaa.txt");
			
			//stream.write(97);//a
			//stream.write(98);//b
			
			String txt = "hello~ java~";
			
			for (int i=0; i<txt.length(); i++) {
				char c = txt.charAt(i);
				stream.write((int)c);
			}
			
			txt = "hi~ oracle~";
			
			//개행
			stream.write((int)'\r');//13
			stream.write((int)'\n');//10
			
			
			for (int i=0; i<txt.length(); i++) {
				char c = txt.charAt(i);
				stream.write((int)c);
			}
			
			
			stream.close();
			
			
			System.out.println("완료");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		
	}
	
	
	
	
	


	private static void m1() {
		
		//쓰기
		//1. 바이트 단위 쓰기
		//	-> System.in.read() -> 바이트 단위 읽기
		//	-> 문자 1개 읽고 쓰기 -> 코드값 입출력
		
		try {

			//파일 쓰기
			//1. 스트림 객체 생성 -> 쓰기 전용 스트림
			
			
			//data.txt파일에 데이터를 쓸 수 있는 빨대 생성
			//스트림 열기
			
			//Create Mode(생성 모드) : 파일이 없으면 생성 -> 쓰기, 파일이 있으면 -> 덮어쓰기
			FileOutputStream stream = new FileOutputStream("D:\\Class\\File\\data.txt");
			
			//데이터를 파일에 쓰기
			stream.write(65);//문자코드값
			stream.write(66);
			stream.write(67);
			
			stream.close();
			
			System.out.println("파일 쓰기 완료");
			
		} catch (Exception e) {

		}
		
	}
}






















