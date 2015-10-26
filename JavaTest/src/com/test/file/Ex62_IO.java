package com.test.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex62_IO {
	
	private static String path;
	private static Scanner scan;
	
	static {
		//path = "D:\Class\JavaTest\src\com\test\file\address.dat";
		path = "src\\com\\test\\file\\address.dat";
		scan = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		
		//Ex62_IO.java
		
		//주소록 관리
		//1. address.dat
		//2. 추가,목록,검색,삭제
		//3. 아이템(이름,나이,주소,성별)
		
		//address.dat 구조
		/*
			
			이름,나이,성별,주소
			이름,나이,성별,주소
			이름,나이,성별,주소		
			
		*/
		
//		File file = new File(path);
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getPath());
//		System.out.println(file.exists());
		
		
		boolean loop = true;
		
		while (loop) {
			
			menu();
			
			String sel = scan.nextLine();
			
			if (sel.equals("1")) addMember();
			else if (sel.equals("2")) listMember();
			else if (sel.equals("3")) searchMember();
			else if (sel.equals("4")) deleteMember();
			else loop = false;
			
			pause();
			
		}//while
		
		System.out.println("\n프로그램을 종료합니다.");
		
		
	}//main

	private static void addMember() {
		
		//주소록 추가
		System.out.println("=======================");
		System.out.println("주소록 추가");
		System.out.println("=======================");
		
		String name = ""
				, age = ""
				, gender = ""
				, address = "";
		
		System.out.print("이름 : ");
		name = scan.nextLine();
		System.out.print("나이 : ");
		age = scan.nextLine();
		System.out.print("성별(남|여) : ");
		gender = scan.nextLine();
		System.out.print("주소 : ");
		address = scan.nextLine();
		
		try {
			
			BufferedWriter writer = getWriter();
			writer.write(String.format("%s,%s,%s,%s\r\n"
					, name
					, age
					, gender
					, address));//1명 기록
			writer.close();
			
			System.out.println("추가 완료!!");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	private static BufferedWriter getWriter() throws IOException {
		return new BufferedWriter(new FileWriter(path, true));
	}

	private static void listMember() {
		
		//주소록 목록
		System.out.println("=======================");
		System.out.println("주소록 목록");
		System.out.println("=======================");
		
		try {
			
			BufferedReader reader = getReader();
			
			System.out.println("[이름]\t[나이]\t[성별]"
								+ "\t[주소]");
			
			String txt = "";
			
			while((txt = reader.readLine()) != null) {
				//루프 1회전 -> 주소록 1명(txt)
				String[] temp = txt.split(",");
				
				System.out.printf("%s\t%s\t%s\t%s\n"
						, temp[0]
						, temp[1]
						, temp[2]
						, temp[3]);
			}
			
			reader.close();
			
			System.out.println("출력 완료!!");
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	private static BufferedReader getReader() throws FileNotFoundException {
		return new BufferedReader(new FileReader(path));
	}

	private static void searchMember() {

		//주소록 검색
		System.out.println("=======================");
		System.out.println("주소록 검색");
		System.out.println("=======================");
		
		//검색
		String word = "";
		System.out.print("검색어(주소) : ");
		word = scan.nextLine();		
		
		try {
			
			BufferedReader reader = getReader();
			
			System.out.println("[이름]\t[나이]\t[성별]"
								+ "\t[주소]");
			
			
			String txt = "";
			
			while((txt = reader.readLine()) != null) {
				//루프 1회전 -> 주소록 1명(txt)
				String[] temp = txt.split(",");
				
				if (temp[3].contains(word)) {
					System.out.printf("%s\t%s\t%s\t%s\n"
						, temp[0]
						, temp[1]
						, temp[2]
						, temp[3]);
				}
			}
			
			reader.close();
			
			System.out.println("출력 완료!!");
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	private static void deleteMember() {
		
		//목록 출력 -> 이름 선택
		listMember();
		
		String name = "";
		System.out.print("삭제할 이름 : ");
		name = scan.nextLine();
		
		try {
			BufferedReader reader = getReader();
			String txt = "";
			String newData = "";//삭제할 내용을 뺀 나머지
			
			while ((txt = reader.readLine()) != null) {
				
				String[] temp = txt.split(",");
				
				if (!temp[0].equals(name)) {
					//보관할 주소
					newData += txt + "\r\n";
				} 
				
			}//while
			
			reader.close();
			
			//검색한 주소를 뺀 나머지 데이터(newData)를 address.dat에 덮어쓰기(***)
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));//덮어쓰기 모드
			writer.write(newData);
			writer.close();
			
			System.out.println("삭제 완료!!");
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
	}

	private static void menu() {
		
		System.out.println("=======================");
		System.out.println("주소록 관리");
		System.out.println("=======================");
		System.out.println("1. 주소록 추가");
		System.out.println("2. 주소록 목록");
		System.out.println("3. 주소록 검색");
		System.out.println("4. 주소록 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.println("=======================");
		System.out.print("선택 : ");
	}
	
	public static void pause() {
		System.out.println("\n계속하려면 엔터키를 입력하세요.");
		scan.nextLine();
	}
}

















