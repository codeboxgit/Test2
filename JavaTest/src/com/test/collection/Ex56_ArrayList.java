package com.test.collection;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

public class Ex56_ArrayList {
	
	public static void main(String[] args) {
		
		//com.test.collection 패키지
		//Ex56_ArrayList.java
		
		//컬렉션, Collection
		//	- 배열의 버전업
		//	- 길이 가변(늘리거나 줄이는것이 가능)
		//	- 배열을 목적에 맞게 특성화(자료 구조)
		//	- 내부 타입(Object형 집합)
		
		//ArrayList 클래스
		//	- 순수 배열과 가장 유사
		//	- 첨자(index)로 요소를 접근
		
		//m1();
		//m2();
		m3();
		
	}

	private static void m3() {
		
		ArrayList<String> names
			= new ArrayList<String>();
		
		//1. 요소 추가(append : 배열의 맨 끝에 추가)
		names.add("홍길동");
		names.add("아무게");
		names.add("호호호");
		
		//2. 요소 갯수
		//	- 배열의 방 갯수(X)
		//	- 배열안에 들어있는 데이터(요소) 갯수
		System.out.println(names.size());
		
		//3. 요소 접근
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//4. 요소 수정
		names.set(1, "하하하"); //names[1] = "하하하";
		
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
		
		//5. 요소 삭제
		//	- *****
		//	- 순수 배열은 방삭제가 불가능
		//	- 순수 배열 : 방번호(절대 위치값)
		//	- 컬렉션 : 방번호(상대 위치값)
		
		System.out.println("0 : " + names.get(0));
		names.remove(0); //0번째방 삭제
		System.out.println("0 : " + names.get(0));
		
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
		//6. 요소 추가(insert : 배열의 원하는
		//						위치에 삽입)
		//	- **** 삽입된 위치 이후의 방들은 방번호가 +1 씩 증가한다.
		
		//0번째 위치에 "후후후"를 끼워 넣으시오.
		names.add(0, "후후후");
		
		names.add("하하하");
		names.add("하하하");
		names.add("하하하");
		
		//삭제
		// - 방번호(유일)
		// - 데이터(첫번째 데이터가 삭제)
		//System.out.println(names.remove("하하하"));
		
		//while (names.remove("하하하"));
		
//		while (true) {
//			boolean result = names.remove("하하하");
//			
//			if (!result) {
//				break;
//			}
//		}
		
		
		
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
		
		
		//7. 초기화(모든 요소를 삭제)
		//	- 배열을 재사용할 때
		System.out.println(names.size());
		names.clear();//****
		System.out.println(names.size());
		
		
		//8. 비었는지?
		System.out.println(names.isEmpty());
		System.out.println(names.size() == 0);
		
		
		names.add("가가가");
		names.add("나나나");
		names.add("다다다");
		names.add("라라라");
		
		System.out.println(names.indexOf("나나나"));
		System.out.println(names.lastIndexOf("나나나"));
		
		System.out.println(names.contains("다다다"));
		
		
		
		
		
	}

	private static void m2() {
		
		//Object 배열
		ArrayList list1 = new ArrayList();
		
		//제네릭 배열
		ArrayList<String> list2
			= new ArrayList<String>();
		
		list1.add("홍길동");
		list2.add("홍길동");
		
		System.out.println((String)list1.get(0));
		System.out.println(list2.get(0));//형변환X
		
		
		//ArrayList<int> nums = new ArrayList<int>();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		System.out.println(nums.get(0) * 2);	
		
		
	}

	private static void m1() {
		
		//A. 배열생성
		//	- 타입 명시
		//	- 길이(방갯수) 명시
		int[] nums1 = new int[3];
		
		nums1[0] = 10;
		nums1[1] = 20;
		nums1[2] = 30;
		
		System.out.println(nums1[0]);
		
		
		//A. 컬렉션생성
		//	- 타입X -> Object 배열
		//	- 길이X -> 길이 가변
		ArrayList nums2 = new ArrayList();
		
		nums2.add(10);//0번째방
		nums2.add(20);//1번째방
		nums2.add(30);//2번째방
		
		System.out.println(nums2.get(0));//nums2[0]
		//System.out.println(nums2.get(3));
		
		for (int i=0; i<nums2.size(); i++) {
			System.out.println((int)nums2.get(i) * 2);
		}
		
		for (Object num : nums2) {
			System.out.println((int)num);
		}
		
		
		for (int i=0; i<100; i++) {
			nums2.add(i);
		}
		
		System.out.println(nums2.size());
		
		
		//nums2.add("홍길동");
		//System.out.println(nums2.get(103));
		
		
		for (Object num : nums2) {
			System.out.println((int)num);
		}
		
	}
}






















