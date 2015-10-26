package com.test.generic;

public class Ex53_Generic {
	
	public static void main(String[] args) {
		
		//Ex53_Generic.java
		
		Test t1 = new Test();
		Test<String> t2 = new Test<String>();
		t2.data = "홍길동";
		
		Test<Integer> t3 = new Test<Integer>();
		t3.data = 10;
		//t3.data = "홍길동";
		System.out.println(t3.data * 20);
		
		Test2<Boolean> t4 = new Test2<Boolean>();
		
		
		Test3<String,Integer> t5
			= new Test3<String,Integer>();
		
		//this.swap();
		//Ex53_Generic m = new Ex53_Generic();
		//m.swap();
		
		swap(10, 20);
		swap("홍길동", "아무게");
		swap(true, false);
		
		//swap<String>("홍","김");
		
	}//main
	
	
	//제네릭 메소드
	//	 -> 인자값의 자료형을 전달
	public static <T> void swap(T a, T b) {
		T temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a : " + a + ", b : " + b);
	}
	
	
}

//제네릭 클래스
// -> 메소드(인자값)
//T : 타입 변수(자료형을 저장하는 변수)
//	  참조형만 가능
class Test<T> {
	public T data;
}


class Test2<T> {
	//타입변수는 멤버변수의 자료형으로 보통 사용
	public T a;
	public T b;
	public T c;
	
	public void test(T data) {
		
	}
}

class Test3<T,U> {
	public T a;
	public U b;
}

class Test4<T> {
	public T a;
	
	public void test() {
		//업무 -> 자료형과 무관한 작업
		//System.out.println(a * 2);
	}
	
	public void aaa() {
		this.test();
	}
}




















