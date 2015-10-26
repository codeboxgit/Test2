package com.test.cast;

public class Ex51_Interface {
	
	public static void main(String[] args) {
		
		//Ex51_Interface.java
		
		//인터페이스 사용
		// - 모듈과 모듈간의 연동할 때 규칙을 만들기 위한 용도
		// - 한쪽의 모듈이 교체되는 일이 발생했을 때 다른쪽 모듈이 영향을 받지 않도록..
		
		User user = new User();
		user.work();
		
	}//main
}


//사용자
// - 업무 : 텍스트 파일의 내용을 읽어서 처리
// - 수정 : DB의 내용을 읽어서 처리
// - 수정 : 텍스트 파일의 내용을 읽어서 처리
class User {
	
	public void work() {
		//텍스트 파일 읽기 -> 가공 -> 업무 처리
		
		//String data = "파일에서 읽은 데이터";
		//String data = "DB에서 읽기 데이터"; 
		
		//업무 분담
		//FileData file = new FileData();
		//String data = file.getText(); //위임
		
		//DBData db = new DBData();
		//String data = db.getDB(); //위임
		
		
		
		//FileData file = new FileData();
		//String data = file.getData();
		
		//DBData db = new DBData();
		//String data = db.getData();
		
		
		
		//IData d = new FileData();
		//String data = d.getData();
		
		//IData d = new DBData();
		//String data = d.getData();
		
		
		IData d = Support.getUser();
		String data = d.getData();
		
		System.out.println("가공 : " + data);
		System.out.println("업무 처리 : " + data);
	}
	
}


class Support {
	
	public static IData getUser() {
		//return new FileData();
		return new DBData();
	}
	
}



interface IData {
	//User라는 사람과 업무 협조를 하려면 적어도 이방식으로 해야 거래를 할 수 있습니다.
	String getData();
}


class FileData implements IData {
//	public String getText() {
//		String data = "파일에서 읽은 데이터";
//		return data;
//	}

	@Override
	public String getData() {
		String data = "파일에서 읽은 데이터";
		return data;
	}	
}

class DBData implements IData {
//	public String getDB() {
//		String data = "DB에서 읽은 데이터";
//		return data;
//	}

	@Override
	public String getData() {
		String data = "DB에서 읽은 데이터";
		return data;
	}
}






















