//package com.test.collection;
//
//public class Example {
//	
//	public static void main(String[] args) {
//		
//		MyArrayList list1 = new MyArrayList();
//		list1.add("홍길동");
//		list1.add("아무게");
//		list1.add("하하하");
//		list1.add("호호호");
//		list1.add("가가가");
//		list1.add("나나나");
//		list1.add("다다다");
//		list1.add("라라라");
//		list1.add("마마마");
//		
//		for (int i=0; i<list1.size(); i++) {
//			System.out.println(list1.get(i));
//		}
//		
//		//System.out.println(list1.length());
//		
//		list1.remove(1);
//
//		list1.add("바바바");
//		list1.add(5, "사사사");
//		System.out.println();
//		
//		for (int i=0; i<list1.size(); i++) {
//			System.out.println(list1.get(i));
//		}
//		
//		
//	}
//}
//
//
//class MyArrayList {
//	
//	private String[] values;
//	private int nowIndex;
//	
//	public MyArrayList() {
//		this.nowIndex = 0;
//	}
//	
//	public void add(String value) {
//		
//		if (this.values == null) {
//			this.values = new String[4];
//		} 
//		
//		if (this.values.length == this.nowIndex) {
//			String[] temp = new String[this.values.length * 2];
//			for (int i=0; i<this.values.length; i++) {
//				temp[i] = this.values[i];
//			}
//			
//			this.values = temp;
//		}
//		
//		this.values[nowIndex] = value;
//		this.nowIndex++;
//		
//	}
//	
//	
//	public void add(int index, String value) {
//		
//		if (this.values == null) {
//			this.values = new String[4];
//		} 
//		
//		if (this.values.length == this.nowIndex) {
//			String[] temp = new String[this.values.length * 2];
//			for (int i=0; i<this.values.length; i++) {
//				temp[i] = this.values[i];
//			}
//			
//			this.values = temp;
//		}
//		
//		for (int i=index; i<this.values.length-1; i++) {
//			this.values[i+1] = this.values[i];
//		}
//		
//		this.values[index] = value;
//		this.nowIndex++;
//		
//	}
//	
//	public String get(int index) {
//		
//		return this.values[index];
//		
//	}
//	
//	public int size() {
//		
//		return this.nowIndex;
//	}
//	
//	public int length() {
//		
//		return this.values.length;
//	}
//	
//	public void remove(int index) {
//		
//		for (int i=index; i<this.values.length-1; i++) {
//			this.values[i] = this.values[i+1];
//		}
//		
//		this.values[this.nowIndex-1] = null;
//		this.nowIndex--;
//	}
//	
//}
//
//
//
//
//
//
//
