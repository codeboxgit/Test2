package com.test;
import java.util.Random;
import java.util.Scanner;

public class Ex30_Array {

	public static void main(String[] args) {

		// Ex30_Array.java

		// 배열, Array
		// - 같은 자료형의 변수를 여러개 모아 놓은 집합
		// - char x 10 -> String -> char배열
		// - 같은 자료형을 가지며 같은 성격의 데이터를 넣는 집합(***)

		// 배열 선언
		// - 자료형[] 배열명 = new 자료형[길이];
		// - 자료형 : 방 1개의 자료형
		// - 길이 : 방의 갯수
		// - int[] kors = new int[3];

		// m1();
		// m2();
		// m3();
		//m4();
		//m5();
		//m6();
		
		//m7();
		
		//m8();
		//m9();
		
		//m10();
		
		m11();		
	}

	private static void m11() {
		
		//2차원 배열
		int[][] nums = new int[5][5];
		
		int n = 1;//1~25
		
		//입력(이곳을 수정)
		for (int i=4; i>=0; i--) {
			for (int j=4; j>=0; j--) {
				nums[i][j] = n;
				n++;
			}
		}
		
		//출력(터치X)
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.printf("%4d", nums[i][j]);
			}
			System.out.println();
		}
		
		
	}

	private static void m10() {
		
		//초기화 리스트
		int[] ns1 = {1, 2, 3};//3칸짜리
		int[][] ns2 = {{1, 2, 3}, {4, 5, 6}};//2x3
		int[][][] ns3 = {{{1, 1, 1}, {2, 2, 2}}, {{3, 3, 3}, {4, 4, 4}}};//2x2x3
		
		
		
		//배열의 길이
		//int[][] ns4 = {{1, 2, 3}, {4, 5, 6}};//2x3
		int[][] ns4 = new int[2][3];
		
		System.out.println(ns4.length);
		
		for (int i=0; i<ns4.length; i++) {
			for (int j=0; j<ns4[0].length; j++) {
				
			}
		}
		
		
		
		//향상된 for
		int[][] ns5 = {{1, 2, 3}, {4, 5, 6}};
		
		for (int[] n : ns5) {
			for (int nn : n) {
				System.out.println(nn);
			}
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	private static void m9() {
		
		//3차원 배열
		int[][][] nums = new int[2][3][4];
		
		nums[0][1][3] = 100;
		nums[1][2][0] = 200;
		
		//탐색 -> 3차원 -> 3중 for문
		for (int i=0; i<2; i++) {//동번호
			for (int j=0; j<3; j++) {//층번호
				for (int k=0; k<4; k++) {//방번호
					System.out.print(nums[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}

	private static void m8() {
		
		//다차원 배열
		int[][] nums = new int[2][3];
		
		nums[0][0] = 100;
		nums[0][1] = 200;
		nums[0][2] = 300;
		
		nums[1][0] = 400;
		nums[1][1] = 500;
		nums[1][2] = 600;
		
		//2차원 배열 -> 2중 for문 탐색
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.printf("nums[%d][%d] = %d\n"
						, i, j
						, nums[i][j]);
			}
		}
		
		
		
		
	}

	private static void m7() {
		
		//배열 활용 예
		
		//난수 발생 -> Random
		
		//1, 4, 5, 9, 11, 15
		//배열 + Random
		int[] nums = {1, 4, 5, 9, 11, 15};
		Random rnd = new Random();
		int n = nums[rnd.nextInt(nums.length)];
		System.out.println(n);
		
		
		//지역 중 하나 임의 선택
		String[] areas = {"서울", "부산", "광주", "대전", "강릉", "제주"};
		System.out.println(
				areas[rnd.nextInt(areas.length)]);
		
		
		//회원 100명 생성
		String[] name1 = {"홍", "김", "이", "박", "최", "성", "민", "유"};//성
		String[] name2 = {"민", "세", "재", "하", "석", "명", "준", "희", "현", "인"};//이름
		
		for (int i=0; i<100; i++) {
			
			System.out.printf("회원 : %s%s%s\n"
				, name1[rnd.nextInt(name1.length)]
				, name2[rnd.nextInt(name2.length)]
				, name2[rnd.nextInt(name2.length)]);
		
		}
		
	}

	private static void m6() {
		
		//배열 초기화
		// - 방을 만든 직 후 초기화를 하지 않더라도 자동으로 초기화가 된다.
		// - 정수형 : 0
		// - 실수형 : 0.0
		// - 문자형 : \0(문자코드값 0 -> 널문자)
		// - 논리형 : false
		// - 참조형 : null
		
		//String s;
		//System.out.println(s);
		
		//int n;
		//System.out.println(n);
		
		int[] nums = new int[3];
		System.out.println(nums[0]);
		
		boolean[] list = new boolean[3];
		System.out.println(list[0]);
		
		
		
		int[] ns1 = new int[5];
		ns1[0] = 10;
		ns1[1] = 7;
		ns1[2] = 1;
		ns1[3] = 4;
		ns1[4] = 9;
		
		
		//배열 초기화 리스트
		int[] ns2 = new int[] {10, 7, 1, 4, 9};
		
		int[] ns3 = {10, 7, 1, 4, 9};
		
		
		String[] names = {"홍길동", "아무게", "하하하"};
		
		boolean[] flags = {true, false, true, true};
			
	}

	private static void m5() {
		
		//향상된 for문
		// - foreach문
		// - 배열(컬렉션)을 대상으로 실행
		// - 읽기 전용
		// - 배열의 요소(방)을 접근하는 순서가 무조건 첫번째방~ 마지막방 순이다.
		
		int[] nums = new int[5];
		
		nums[0] = 100;
		nums[1] = 50;
		nums[2] = 70;
		nums[3] = 30;
		nums[4] = 90;
		
		
		//출력
		/*for (int i=0; i<5; i++) {
			//System.out.println(nums[i]);
			nums[i] *= 2;//수정
		}*/
		
		
		//for (변수 : 배열) {}
		
		for (int n : nums) {
			//System.out.println(n);
			n *= 3; //수정
		}
		
		for (int n : nums) {
			System.out.println(n);
		}
		
	}

	private static void m4() {

		// 배열은 한번 생성하면 절대로 방의 길이를 수정할 수 없다.
		// - 증가X
		// - 감소X

		// Ctrl + Shift + F -> format
		// Ctrl + Shift + O -> import
		
		//동적으로 배열의 길이를 선언할 수 있다.
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		int n = scan.nextInt();
		
		int[] nums = new int[n];//***
		
		Random rnd = new Random();
		
		for (int i=0; i<nums.length; i++) {
			nums[i] = rnd.nextInt(10) + 1;
		}
		
		
		for (int i=0; i<nums.length; i++) {
			System.out.printf("nums[%d] = %d\n"
							, i
							, nums[i]);
		}
		
	}

	private static void m3() {

		// 각 자료형으로 배열 선언
		int[] list1 = new int[3];
		list1[0] = 100;
		System.out.println(list1[0]);

		double[] list2 = new double[3];
		list2[0] = 3.14;
		System.out.println(list2[0]);

		char[] list3 = new char[3];
		list3[0] = 'a';
		System.out.println(list3[0]);

		boolean[] list4 = new boolean[3];
		list4[0] = true;
		System.out.println(list4[0]);

		String[] list5 = new String[3];
		list5[0] = "홍길동";
		System.out.println(list5[0]);

	}

	private static void m2() {

		int[] nums = new int[5];

		// 초기화(100, 200.. 500)
		for (int i = 0; i < nums.length; i++) {
			// 0~4 : 배열의 index로 사용(방번호)
			nums[i] = (i + 1) * 100;
		}

		System.out.println(nums[0]);// 방 1개씩
		System.out.println(nums[4]);

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		// 주의!!
		// java.lang.ArrayIndexOutOfBoundsException
		// System.out.println(nums[5]);

	}

	private static void m1() {

		// 학생 3명 -> 국어 점수 -> 총점, 평균
		// 학생 3명 -> 300명
		int kor1;
		int kor2;
		int kor3;// + 297

		kor1 = 100;
		kor2 = 90;
		kor3 = 80;// + 297

		int total = kor1 + kor2 + kor3; // + kor4 + kor5..

		double avg = total / 3.0;// 3.0 -> 300.0

		System.out.printf("총점 : %d, 평균 : %.1f\n", total, avg);

		// 배열 사용
		// - 자료형
		// - 배열 선언(= 변수 선언)

		int kor = 10;

		String s = "abc"; // 길이 s.length()

		// 3명 -> 300명
		// 배열 선언
		int[] kors = new int[300];

		// 배열 초기화
		kors[0] = 95;
		kors[1] = 88;
		kors[2] = 77;// + 297

		total = kors[0] + kors[1] + kors[2];// + kors[3]..

		total = 0;

		// int i = 0;
		// kors[i]

		for (int i = 0; i < kors.length; i++) {
			total += kors[i];
		}

		// avg = 100 / 10; //10
		avg = total / (double) kors.length;

		System.out.printf("총점 : %d, 평균 : %.1f\n", total, avg);

	}
}
