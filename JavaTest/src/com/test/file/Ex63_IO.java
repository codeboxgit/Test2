package com.test.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ex63_IO {
	
	private static String path;
	private static Scanner scan;
	
	//주소록 파일을 대신 저장하고 있을 컬렉션-address.dat
	private static ArrayList<Address> list;//*****
	
	private static Comparator<Address> mycom;
	
	static {
		path = "src\\com\\test\\file\\address.dat";
		scan = new Scanner(System.in);
		list = new ArrayList<Address>();
		
		mycom = new Comparator<Address>() {
			
			@Override
			public int compare(Address o1, Address o2) {
				Collator coll = Collator.getInstance();
				return coll.compare(o1.getName(), o2.getName());
			}
		};
	}
	
	public static void main(String[] args) {
		
		//Ex62_IO.java
		
		//주소록 관리
		//1. address.dat
		//2. 추가,목록,검색,삭제
		//3. 아이템(이름,나이,주소,성별)
		
		loadData();
		
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
		
		saveData();
		
	}//main

	
	
	private static void saveData() {
		
		//ArrayList -> 텍스트파일 옮기기
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
			
			for (Address address : list) {
				//address 1개 -> 텍스트 1줄
				String txt = String.format("%s,%d,%s,%s\r\n"
						, address.getName()
						, address.getAge()
						, address.getGender()
						, address.getAddress());
				writer.write(txt);
			}
			
			writer.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}



	private static void loadData() {
		
		//텍스트파일 -> ArrayList 옮기기
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String txt = "";
			
			while ((txt = reader.readLine()) != null) {
				//텍스트 1줄 -> 주소록 1개 -> Address 객체 1개
				String[] temp = txt.split(",");
				
				Address address = new Address();
				address.setName(temp[0]);//복사
				address.setAge(Integer.parseInt(temp[1]));
				address.setGender(temp[2]);
				address.setAddress(temp[3]);
				
				list.add(address);
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

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
		
		
		//주소록 1개 추가  -> ArrayList에 Address추가
		Address addr = new Address();
		addr.setName(name);
		addr.setAge(Integer.parseInt(age));
		addr.setGender(gender);
		addr.setAddress(address);
		
		list.add(addr);
		
		System.out.println("추가 완료!!");
	}

	private static BufferedWriter getWriter() throws IOException {
		return new BufferedWriter(new FileWriter(path, true));
	}

	private static void listMember() {
		
		//주소록 목록
		System.out.println("=======================");
		System.out.println("주소록 목록");
		System.out.println("=======================");
		
		
		System.out.println("[이름]\t[나이]\t[성별]"
				+ "\t[주소]");
		
		list.sort(mycom);
		
		for (Address address : list) {
			System.out.printf("%s\t%d\t%s\t%s\n"
					, address.getName()
					, address.getAge()
					, address.getGender()
					, address.getAddress());
		}
		
		System.out.println("출력 완료!!");
		
		
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
		
		System.out.println("[이름]\t[나이]\t[성별]"
				+ "\t[주소]");
		
		for (Address address : list) {
			if (address.getAddress().contains(word)) {
				System.out.printf("%s\t%d\t%s\t%s\n"
						, address.getName()
						, address.getAge()
						, address.getGender()
						, address.getAddress());
			}
		}
		
		System.out.println("검색 완료");
		
	}

	private static void deleteMember() {
		
		//목록 출력 -> 이름 선택
		listMember();
		
		String name = "";
		System.out.print("삭제할 이름 : ");
		name = scan.nextLine();
		
		//삭제할 address 객체 검색
		for (Address address : list) {
			if (address.getName().equals(name)) {
				list.remove(address);
				break;//**
			}
		}
		
		System.out.println("삭제 완료");
		
		
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

















