package com.test.collection;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex58_Collection {
	
	//회원 목록
	private static ArrayList<Member> list;
	private static Scanner scan;
	
	private int a;
	private static int b;
	
	//정적 생성자
	//	- static 변수들을 초기화하는 전용 생성자
	static {
		list = new ArrayList<Member>();
		scan = new Scanner(System.in);
		//this.a = 10;
		b = 20;
	}
	
	public static void main(String[] args) {
		
		//Ex58_Collection.java
		
		//회원 관리
		//	- 회원 정보(이름, 나이, 주소) 
		//		-> Member 클래스
		
		//	- 추가, 목록
		//		-> 배열 사용
		//		-> 어떤 배열? 순수배열 or ArrayList
		//		-> ArrayList<Member>
		
		//	- 메뉴 구성 -> 반복 실행
		
//		int[] list1 = new int[3];
//		Member[] list2 = new Member[3];
//		list2[0] = new Member("", 1, "");//객체
//		
//		ArrayList<Integer> list3 
//			= new ArrayList<Integer>();
//		
//		ArrayList<Member> list4
//			= new ArrayList<Member>();
//		list4.add(new Member("", 1, ""));
		
		addData();
		
		boolean loop = true;
		
		while (loop) {
			
			//메뉴 -> 선택 -> 업무 진행 -> 메뉴 -> 선택..
			
			menu();
			
			//메뉴 선택
			int m = scan.nextInt();
			scan.skip("\r\n");
			
			if (m == 1) {
				addMember();
			} else if (m == 2) {
				listMember();
			} else if (m == 3) {
				searchMember();
			} else if (m == 4) {
				searchAge();
			} else if (m == 5) {
				searchAddress();
			} else {
				//0
				loop = false;
			}
			
		}//while
		
		System.out.println("프로그램을 종료합니다.");
		
	}//main

	
	private static void searchAge() {
		
		//나이 검색
		// - 입력] 20 -> 20대 출력
		// 		   30 -> 30대 출력
		
	}


	private static void searchAddress() {
		
		//주소 검색
		// - 주소의 일부를 입력해서 검색
		
	}


	private static void addData() {
		
		//테스트용 데이터 추가
		String[] name1 = {"김", "이", "박", "최", "홍"};
		String[] name2 = {"길동", "순신", "재석", "하하", "형돈", "준현", "재근"};
		
		String[] addr1 = {"서울시", "인천시", "광주시", "대구시", "부산시"};
		String[] addr2 = {"동대문구", "서대문구", "남대문구", "강남구", "강서구"};
		
		Random rnd = new Random();
				
		for (int i=0; i<30; i++) {
			
			//Member 1개 생성
			String name = name1[rnd.nextInt(name1.length)] + name2[rnd.nextInt(name2.length)];
			
			int age = rnd.nextInt(20) + 20;
			
			String address = addr1[rnd.nextInt(addr1.length)] + addr2[rnd.nextInt(addr2.length)];
					
			Member member = new Member(name, age, address);
			list.add(member);
		}
		
	}


	private static void addMember() {
		
		//회원 추가
		//지역변수는 선언문을 위로 빼는것을 권장
		String name = "";		//이름
		int age = 0;			//나이
		String address = "";	//주소
		
		System.out.println("\n");
		
		System.out.println("====================");
		System.out.println("회원 추가");
		System.out.println("====================");
		
		System.out.print("이름 : ");
		name = scan.nextLine();
		
		System.out.print("나이 : ");
		age = scan.nextInt();
		scan.skip("\r\n");
		
		System.out.print("주소 : ");
		address = scan.nextLine();
		

		//회원 1명의 정보 -> new Member()
		Member member = new Member(name, age, address);
			
		//회원 목록에 회원 1명을 추가
		list.add(member);//*****
		
		System.out.println("\n회원 추가 완료!!\n");
		
		pause();		
		
	}//addMember()


	private static void pause() {
		
		System.out.println("계속하시려면 엔터키를 입력하시오.");
		scan.nextLine();//일시 정지
		
		
	}


	private static void listMember() {
		
		//회원 목록
		System.out.println("====================");
		System.out.println("회원 목록");
		System.out.println("====================");
		
		System.out.println("[이름]\t[나이]\t[주소]");
		
		for (int i=0; i<list.size(); i++) {
			
			Member member = list.get(i);
			
			System.out.printf("%s\t%5d\t%s\n"
					, member.getName()
					, member.getAge()
					, member.getAddress());
			
		}
		
		System.out.println("\n회원 목록 출력 완료!!\n");
		
		pause();
		
	}


	private static void searchMember() {
		
		//회원 검색
		// - 회원명 검색
		// - 정확, 일부
		System.out.println("====================");
		System.out.println("회원 검색");
		System.out.println("====================");
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		//검색 -> 회원 1명씩 검사 -> 일치 -> 출력
//		for (int i=0; i<list.size(); i++) {
//			Member member = list.get(i);
//			
//		}
		
		for (Member member : list) {
			
//			if (member.getName().contains(name)) {
//				
//			}
			
			if (member.getName().indexOf(name) > -1) {
				System.out.printf("이름 : %s\n", member.getName());
				System.out.printf("나이 : %d\n", member.getAge());
				System.out.printf("주소 : %s\n", member.getAddress());
			}
			
		}//for
		
		System.out.println("\n회원 검색 완료\n");
		
		pause();
		
	}


	private static void menu() {
		
		System.out.println("====================");
		System.out.println("회원 관리");
		System.out.println("1. 회원 추가");
		System.out.println("2. 회원 목록");
		System.out.println("3. 회원 검색(이름)");
		System.out.println("4. 회원 검색(나이)");
		System.out.println("5. 회원 검색(주소)");
		System.out.println("0. 프로그램 종료");
		System.out.println("====================");
		System.out.print("선택 : ");
		
	}
}












