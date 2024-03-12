package day25_exception;

public class Ex06_printStackTrace {
	public static void main(String[] args) {
		
		try {
			System.out.println(args[0]);
		} catch(Exception e) {
			e.printStackTrace();		// 예외가 발생한 구역을 순차적으로 추적해주는 메소드
		}
		
		/* 개발자
		 * 1. 개발 당시의 예외 처리 : e.printStackTrace();
		 * 2. 개발 완료 후 : 적절한 예외 메시지 등 처리
		 */
	}
}
