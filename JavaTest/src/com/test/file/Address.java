package com.test.file;

public class Address {
	
	//address.dat의 1줄을 저장하기 위한 객체
	// - 홍길동,20,남,서울시
	
	//데이터 단위 객체
	private String name;
	private int age;
	private String gender;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
