package day02_basic;

public class Ex03_plus_operator {
	public static void main(String[] args) {
		
		// 1. 숫자끼리 + 연산자 : 산술 연산자
		System.out.println(1+1);
		System.out.println(1.5+2.5);
		System.out.println(1.5+2);
		
		// 2. 문자열이 포함된 + 연산사 : 연결 연산자
		// c 에서는 strcat 함수
		System.out.println("Hello"+"world");
		
		// 3. 출력 결과를 예상해보자.
		System.out.println(100+"원");	// 100원
		System.out.println(100+100+"원");	// 200원
		System.out.println("$"+100);	// $100
		System.out.println("$"+100+100);	// $200
		// "$" 와 다음 숫자 100을 먼저 연결해서 "$100"이 된다.
		// 따라서 반환값이 문자열이 된다.
		// 그 다음 "$100" 과 100을 더하기 때문에 $100100이 된다.
		System.out.println("$"+(100+100)); // $200
		// 괄호가 붙었기 때문에 (100+100) 를 먼저 연산.
		
		
		
		// 궁금한 점? ( ) 괄호 안에 입력하는 값은 띄어쓰기를 해야 하는가?
		
		/* escape 문자
		 * \n : 줄바꿈(enter)
		 * \t : 들여쓰기(tab)
		 * \" : 쌍따옴표 출력(문자로 인식)
		 * \' : 홑따옴표 출력(문자로 인식)
		 */
		
		System.out.println("\n\"Hello\"");
		
	}

}
