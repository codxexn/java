package day25_exception;

public class Ex08_throws {
	public static void divide(int a, int b) throws Exception {	
		/* 문제가 발생한 것에 대해서 그 발생한 지점에 예외를 던진다.
		 * "내 안에서 문제가 발생한 것은 맞는데 처리는 호출된 쪽~ 너네가 해줘."
		 * divide() 호출부인 main() 메소드로 Exception을 던진다.
		 * try, catch를 안 쓰고 예외처리를 할 수 있는 것. (문제 발생시 책임)
		 * 예외 발생에 대한 책임 전가.
		 */
		
		System.out.println("몫 : " + (a / b));
		System.out.println("나머지 : " + (a % b));
	}
	
	public static void main(String[] args) throws Exception {
		
		// try 처리를 하지 않는다.
		// 다시 다른 곳으로 Exception을 던질 수 있다.
		// throws가 던져지면 2가지 방법이 있다.
		// try를 하거나, 다른 곳으로 다시 Exception을 던져야 한다.
		// main이 Exception을 던지면 프로그램이 종료된다.
		
		divide(10, 0);
	
	}	
}
