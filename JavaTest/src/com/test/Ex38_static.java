package com.test;

public class Ex38_static {
	
	public static void main(String[] args) {
		
		//Ex38_static.java
		
		//클래스 설계시..
		//1. 개인 데이터
		//2. 공용 데이터
		
		Student.setSchool("역삼중학교");
		
		
		Student s1 = new Student();
		s1.setName("홍길동");
		//s1.setSchool("역삼중학교");
		
		
		Student s2 = new Student();
		s2.setName("아무게");
		//s2.setSchool("역삼중학교");
		//Student.setSchool("역삼중학교");
		
		Student s3 = new Student();
		s3.setName("하하하");
		//s3.setSchool("역삼중학교");
		//Student.setSchool("역삼중학교");
		
		System.out.println(s3.getName());
		//System.out.println(s3.getSchool()); //X
		System.out.println(Student.getSchool());
		
		
		
		
		
		Temp3 t3 = new Temp3();
		t3.a = 10; //객체 멤버 접근
		//t3.b = 10;//사용하지 말것!!
		
		Temp3 t4 = new Temp3();
		t4.a = 20;
		
		Temp3.b = 30; //정적(클래스) 멤버 접근
		//Temp3.a = 30;//사용 불가!!
	}
}


class Temp3 {
	public int a; //많이
	public static int b; //적게
	
	public void m1() {
		//객체 메소드
		// -> 객체 변수
		// -> 정적 변수
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(this.a);
		System.out.println(Temp3.b);
	}
	
	public static void m2() {
		//정적 메소드
		// -> 객체 변수
		// -> 정적 변수s
		//System.out.println(a);//X
		System.out.println(b);
		
		//System.out.println(this.a);//X
		System.out.println(Temp3.b);
	}
}




//"역삼 중학교" 학생 클래스(***)
class Student {
	
	//static 키워드
	//1. 멤버 변수
	//2. 멤버 메소드
	
	//외관 형태 구분
	//1. static X
	//	- 객체 멤버(변수, 메소드)
	//2. static O
	// 	- 정적 멤버, 클래스 멤버(변수, 메소드)
	
	//객체 멤버의 접근
	// - 객체명.멤버
	
	//정적 멤버의 접근
	// - 클래스명.멤버
	
	private String name;
	private int kor;
	private int math;
	private int eng;
	
	//private String school; //학교명
	private static String school;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public static String getSchool() {
		return school;
	}

	public static void setSchool(String school) {
		Student.school = school;
	}

//	public String getSchool() {
//		return school;
//	}
//
//	public void setSchool(String school) {
//		this.school = school;
//	}

	
	
	
}
























