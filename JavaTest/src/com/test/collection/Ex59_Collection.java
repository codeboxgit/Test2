package com.test.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Ex59_Collection {
	
	public static void main(String[] args) {
		
		//Ex59_Collection.java
		
		//m1();
		//m2();
		//m3();
		m4();
		
	}

	private static void m4() {
		
		//int[] ns = {1, 2, 3, 4};
		ArrayList<Integer> ns = new ArrayList<Integer>();
		ns.add(1);//ArrayList
		ns.add(2);//HashMap
		ns.add(3);//Queue
		ns.add(4);//Stack
		
		ArrayList<String> ns2 = new ArrayList<String>();
		ns2.add("ArrayList");
		ns2.add("HashMap");
		ns2.add("HashMap");
		ns2.add("Queue");
		ns2.add("Stack");
		
		Random rnd = new Random();
		
		int index = rnd.nextInt(ns2.size());//0~4
		String q = ns2.get(index);
		System.out.print("1조 : " + q);
		ns2.remove(index);
		
		index = rnd.nextInt(ns2.size());
		q = ns2.get(index);
		System.out.print("2조 : " + q);
		ns2.remove(index);
		
		index = rnd.nextInt(ns2.size());
		q = ns2.get(index);
		System.out.print("3조 : " + q);
		ns2.remove(index);
		
		index = rnd.nextInt(ns2.size());
		q = ns2.get(index);
		System.out.print("4조 : " + q);
		ns2.remove(index);
		
		index = rnd.nextInt(ns2.size());
		q = ns2.get(index);
		System.out.print("5조 : " + q);
		ns2.remove(index);
		
		
		
		
	}

	private static void m3() {
		
		//Queue, Stack
		
		//Queue, 큐
		// - FIFO, First Input First Output
		// - 선입선출 구조
		
		//Stack, 스택
		// - LIFO, Last Input First Output
		// - 후입선출 구조
		
		
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("하나");
		queue.add("둘");
		queue.add("셋");
		
		System.out.println(queue.size());
		
		//System.out.println(queue.poll());
		//System.out.println(queue.poll());
		//System.out.println(queue.poll());
		
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		
		System.out.println(queue.size());
		
		
		
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		
		System.out.println(stack.size());
		
		//System.out.println(stack.pop());
		//System.out.println(stack.pop());
		//System.out.println(stack.pop());
		
		System.out.println(stack.peek());
		
		System.out.println(stack.size());
		
		
		
		
		
		
		
		
		
	}

	private static void m2() {
		
		//학생 객체 -> 집합 관리
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		//학생들 -> 1학년 1반 학생들
		ArrayList<Student> list1 
			= new ArrayList<Student>();
		list1.add(new Student());
		
		//역할
		HashMap<String,Student> map1 
			= new HashMap<String,Student>();
		map1.put("반장", s1);
		map1.put("부반장", s2);
		map1.put("미술부장", s3);
		
		
		//교실 1개
		ArrayList<Student> class1 
			= new ArrayList<Student>();
		
		ArrayList<Student> class2 
			= new ArrayList<Student>();
		
		ArrayList<Student> class3 
			= new ArrayList<Student>();
		
		
		HashMap<String,ArrayList<Student>> 학년4 = new HashMap<String,ArrayList<Student>>();
		학년4.put("햇님반", class1);
		학년4.put("달님반", class2);
		
		ArrayList<ArrayList<Student>> 학년1 = new ArrayList<ArrayList<Student>>();
		학년1.add(class1);//0번째 반
		학년1.add(class2);//1번째 반
		
		
		
		ArrayList<ArrayList<Student>> 학년2 = new ArrayList<ArrayList<Student>>();
		
		ArrayList<ArrayList<Student>> 학년3 = new ArrayList<ArrayList<Student>>();
		
		ArrayList<ArrayList<ArrayList<Student>>> 학교 = new ArrayList<ArrayList<ArrayList<Student>>>();
		
		
		
		
		
		
	}

	private static void m1() {
		
		int[] nums1 = new int[3];
		
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(10);
		nums2.add(20);
		nums2.add(30);
		nums2.add(40);
		nums2.add(50);
		nums2.add(60);
		nums2.add(70);
		nums2.add(80);
		nums2.add(90);
		
		nums2.trimToSize();
		
	}
}


//class ArrayList<T> {
//	T[] list = new T[10];
//}















