package com.test;
import java.io.BufferedReader;
import java.util.Scanner;

public class Ex27_String {
	
	public static void main(String[] arge) {
		
		//실행 -> Ctrl + F11
		//실행 -> F11 //사용 X
//		System.out.println("테스트~");
		
		
		//Code Asist, 자동 완성, 인텔리센스
		//Ctrl + Space
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//		System.out.println("홍길동");
//		System.out.printf("홍길동 %d세", 20);
		
		//Ctrl + / : 단일 라인 주석달기
		//Ctrl + Shift + /(\) : 다중 라인 주석달기
		
		//자동 줄바꿈
		//http://ahtik.com/eclipse-update/
		
		//문자열, String
		//	- String 클래스
		//	- 문자열 데이터의 저장과 문자열을 조작하는 여러가지 기능을 제공
		
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		m9();
	}
	
	private static void m9() {
		
		//9. 포함 유무
		// - boolean contains(String val)
		
		String str = "안녕하세요~ 홍길동님~";
		
		System.out.println(str.contains("홍길동"));
		System.out.println(str.indexOf("홍길동") > -1);
		
		System.out.println(mycontains(str, "홍길동"));
	}
	
	public static boolean mycontains(String content
								, String str) {
		
		if (content.indexOf(str) > -1) {
			return true;
		} else {
			return false;
		}
		
	}

	private static void m8() {
		
		//8. 치환
		// - String replace(String old, String new)
		
		String str = "안녕하세요~ 홍길동님~ 안녕히 가세요~ 홍길동님";
		
		//홍길동 -> 아무게
		System.out.println(str.replace("홍길동", "아무게"));
		
		
		//주민번호 입력 -> '-' 쓰지 말고..
		//사용자 편의성 -> 쓰더라고.. 자연럽게 넘어가게..
		String jumin = "901105-1014784";
		
		System.out.println(jumin.replace("-", ""));
		
		String content = "  하나 둘 셋 넷 다섯  ";
		System.out.println(content.replace(" ", ""));
		
		//할수있다
		//할 수 있다
		//할 수있다
		//할수 있다.
		
		
		//쇼핑몰
		// - 옵션 1. 빨강, 2. 파랑, 3. 노랑
		String color = "2";
		String colorText = ""; //선택한 색상명
		
		if (color.equals("1")) colorText = "빨강";
		else if (color.equals("2")) colorText = "파랑";
		else if (color.equals("3")) colorText = "노랑";
		
		System.out.printf("선택한 색상은 %s색입니다.\n"
							, colorText);

		
		System.out.println("홍길동".replace("홍", "김"));
		System.out.println("홍길동".replace("박", "김"));
		
		
		
		color = "2";
		colorText = color.replace("1", "빨강")
						.replace("2", "파랑")
						.replace("3", "노랑");
		
		System.out.printf("선택한 색상은 %s색입니다.\n"
				, colorText);
		
		
		
		
		
	}

	private static void m7() {

		//7. 공백 제거
		// - String trim()
		// - 문자열 좌우의 공백을 제거
		
		String str = "     하나     둘     ";
		
		System.out.printf("[%s]\n", str);
		System.out.printf("[%s]\n", str.trim());
		
		//" java".equals("java")
		
			
	}

	private static void m6() {
		
		//6. 추출
		// - String substring(int startIndex, int endIndex) 
		// - String substring(int startIndex)
		// - startIndex(inclusive)
		// - endIndex(exclusive)
		
		String str = "안녕하세요~ 홍길동입니다~";
		System.out.println(str.substring(3, 8));
		
		
		String jumin = "901005-1025147";
		System.out.println(jumin.charAt(7));
		System.out.println(jumin.substring(0, 2));
		
		
		String path = "D:\\Class\\Java\\Hello.java";
		System.out.println(path);
		
		int index = path.lastIndexOf("\\");
		
		//String fileName = path.substring(index + 1, path.length());
		String fileName = path.substring(index + 1);
		
		System.out.println(fileName);
		
		
		
	}




	private static void m5() {
		
		//5. 패턴 검색
		// - boolean startsWith(String pattern)
		// - boolean endsWith(String pattern)
		
		String name = "홍길동";
		
		//홍씨?
		System.out.println(name.startsWith("홍"));
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf("홍") == 0);
		
		
		System.out.println(name.startsWith("길"));
		
		String hello = "안녕하세요~ 저는 홍길동입니다.";
		
		if (hello.startsWith("안녕하세요")) {
			System.out.println("면접 시작");
		} else {
			System.out.println("탈락~");
		}
		
		
		System.out.println(name.endsWith("동"));
		System.out.println(name.charAt(name.length()-1) == '동');
		System.out.println(name.indexOf("동") == name.length() - 1);
		
		
		System.out.println(hello.endsWith("."));
		
		
		
	}

	private static void m4() {
		
		//4. 대소문자 변환
		// - String toUpperCase() : 대문자
		// - String toLowerCase() : 소문자
		
		String str = "abc ABC";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		
		
		//검색
		//System.out.println("java".equals("JAVA"));
		
		String content = "테스트입니다. JAVA. 안녕~ java";
		String word = "Java";
		
		//메소드 체인
		//content.toLowerCase().indexOf().test().aaa()
		
		//검색률 높임
		//정확도 낮춤
		if (content.toLowerCase()
				.indexOf(word.toLowerCase()) > -1) {
			System.out.println("검색 결과 있음");
		} else {
			System.out.println("검색 결과 없음");
		}
		
	}

	private static void m3() {
		
		//3. 검색
		// - 문자열내에 원하는 문자(열)이 존재하는지 검색
		// - int indexOf(char c)
		// - int indexOf(String s)
		// - int indexOf(char c, int startIndex)
		// - int indexOf(String s, int startIndex)
		
		// - int lastIndexOf(String s)
		
		// - 찾은 문자(열)의 위치값(index)을 반환
		// - 못찾으면 -1을 반환
		
		String str = "안녕하~세요 홍길동님~";
		
		//int index = str.indexOf('요');
		//int index = str.indexOf("홍길동");
		int index = str.indexOf("~");
		System.out.println(index);
		
		index = str.indexOf("~", index + 1);
		System.out.println(index);
		
		index = str.indexOf("아무게");
		System.out.println(index);
		
		
		String jumin = "921005-1021212";
		
		//'-' 필수
		//if (jumin.charAt(6) == "-")
		if (jumin.indexOf("-") == 6) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		//'-' 사용 금지
		//if (jumin.charAt(6) != "-")
		if (jumin.indexOf("-") > -1) { //발견O?
			System.out.println("X");
		} else {
			System.out.println("O");
		}
		
		
		//게시판 글쓰기
		// -> 금지어
		String content = "안녕하세요~ 바보 하하하~ 잘가~";
		String word = "바보";//금지어
		
		if (content.indexOf(word) > -1) {
			System.out.println("금지어 사용 불가!!!");
		} else {
			System.out.println("글쓰기 완료!!");
		}
		
			
		
		str = "일이삼사오삼일이삼사오";
		System.out.println(str.indexOf("삼"));
		System.out.println(str.lastIndexOf("삼"));
		
		
		
		
		
	}

	private static void m2() {
		
		//2. 문자열 추출
		// - 특정 위치의 문자를 추출
		// - char charAt(int index)
		// - 자바는 서수가 0부터 시작(Zero-based Index)
		
		String str = "안녕하세요~ 홍길동님";
		
		char c = str.charAt(0);
		System.out.println(c);
		
		//마지막 글자를 가져오시오 -> '~'
		//문자열 길이 - 1 = 문자열의 최대 index값
		c = str.charAt(str.length()-1);
		System.out.println(c);
		
		
		//문자열 탐색
		for (int i=0; i<str.length(); i++) {
			System.out.printf("str.charAt(%d) : %c\n"
					, i, str.charAt(i));
		}
		
		
		//주민번호 입력(반드시 '-'을 입력)
		//	-> 유효성 검사
		String jumin = "901210-1021541";
		
		if (jumin.charAt(6) == '-') {
			System.out.println("올바른 주민번호");
		} else {
			System.out.println("올바르지 않은 주민번호");
		}
		
		if (jumin.charAt(7) == '1') {
			System.out.println("남자");
		} else if (jumin.charAt(7) == '2') {
			System.out.println("여자");
		}
		
		
		//사용자 입력 -> 단어
		//조건] 영소문자로만 입력
		String word = "홍길동";
		boolean result = true;
		
		for (int i=0; i<word.length(); i++) {
			
			char w = word.charAt(i);
			
			//if ((int)w < 97 || (int)w > 122) {
			//if ((int)w < (int)'a' || (int)w > (int)'z') {
			//if (w < 'a' || w > 'z')
			//if ((w < 'a' || w > 'z') &&
			//		(w < 'A' || w > 'Z') &&
			//		(w < '0' || w > '9')) {
			if (w < '가' || w > '힝') {				//System.out.println("영소문자X");
				result = false;
			} else {
				//System.out.println("영소문자O");
			}			
			
		}//for
		
		if (result) {
			System.out.println("올바른 단어");
		} else {
			System.out.println("올바르지 않은 단어");
		}
		
		
		
		
	}//m2



	private static void m1() {
		
		//1. 문자열의 길이
		// - 문자의 갯수
		// - int length()
		
		String str = "홍길동입니다.";		
		int length = str.length();		
		System.out.println(length);
		
		
		
		//이름 입력 -> 유효성 검사
		//1. 2~5자 이내
		
		//Ctrl + Shift + O : import
		//Ctrl + D : Line Delete
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		
		String name = scan.nextLine();
		
		//글자수?
		if (name.length() >= 2 && name.length() <= 5) {
			System.out.println("통과~");
		} else {
			System.out.println("거절~");
		}
		
				
		
		
	}
	
	
	
}













