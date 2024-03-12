package day25_exception2;

// 예외 클래스
// Exception class를 상속 받아서 만든다.

class MyException extends Exception {
	// Constructor
	public MyException(String message) {
		super(message);		// = getMessage
		// Exception(String message) { } 호출 -> Throwable(String message) 호출
	}
}

public class Ex01_Exception_class {
	public static void main(String[] args) {
		
		try {
			// MyException 던지기
			throw new MyException("내가 만든 예외 메시지 ");
		} catch (Exception e) {
			System.out.println("MyException 이 발생했다.");
			System.out.println("사용자 정의 예외 메시지  : " + e.getMessage());
		}
	}
}
