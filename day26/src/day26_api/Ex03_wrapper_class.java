package day26_api;

/*
 * Wrapper class
 * 
 * 	1. primitive type -> reference type 으로 변경해주는 클래스를 의미한다.
 * 	2. 종류
 * 		1) byte			-> Byte
 * 		2) char			-> Character
 * 		3) int			-> Integer
 * 		4) short		-> Short
 * 		5) long			-> Long
 * 		6) double		-> Double
 * 	3. 변수를 "객체(인스턴스)" 로 변환해주는 클래스이다.
 * 	4. 자동으로 변환되는 "Auto Boxing, UnBoxing" 을 지원한다.
 * 	5. 반드시 reference type 을 요구하는 클래스 및 메소드가 있다. 그럴 때 사용한다.
 */

public class Ex03_wrapper_class {
	public static void main(String[] args) {
		
		Integer a = new Integer(10);	// 그냥 Integer a = 10; 이라고 적으면 되고 없어질 기능이지만 낮은 버전에선 볼 수 있으니 알고 있을 것.
		Integer b = new Integer("10");	// 문자열로 넘겨줘도 숫자로 인식해서 저장한다.
		
		// Primitive 타입인 int 를 reference 타입인 Integer 로 사용한 것.
		
		// 동등 비교
		System.out.println("a 와 b의 참조(위치, 주소) 비교 : " + (a == b));	// 저장은 다른 곳에 됐기 때문에 false
		System.out.println("a 와 b의 값 비교 : " + (a.equals(b)));			// 값은 같기 때문에 true
		
		/*
		 * 크기 비교
		 * a.compareTo(b) : 결과는 a - b를 계산해서 결정(래퍼클래스가 가지고 있는 메소드)
		 * a > b : 결과 1
		 * a < b : 결과 -1
		 * a = b : 결과 0
		 */
		System.out.println("a와 b의 크기 비교 : " + a.compareTo(b));
		
		// Auto Boxing (int -> Integer 로 자동 변환) : int 선언과 똑같다.
		Integer c = 100;
		Integer d = 100;
		
		// Auto UnBoxing (Integer -> int 로 자동 변환)
		int result = c + d;
		System.out.println(result);
		
		
	}
}
