package day02_basic;

public class Ex04_primitive_type {
	public static void main(String[] args) {
		
		/*
		 * 기본 자료형 (primitive type)
		 * - 값을 저장하는 자료형
		 * 
		 * 	1. 정수형 (각각의 사이즈가 다름)
		 * 		1) byte
		 * 			(1) 크기 : 1바이트 (8비트)
		 * 			(2) 개수 : 2의 8제곱 (256개)
		 * 			(3) 범위 : -128 ~ 127 (-2의 7제곱 ~ 2의 7제곱 -1)
		 * 			(4) 용도 : 이미지, 동영상을 그대로 저장하기 위한 byte배열용
		 * 
		 *		2) short
		 *			(1) 크기 : 2바이트 (16비트)
		 * 			(2) 개수 : 2의 16제곱 (65,536개)
		 * 			(3) 범위 : -32,768 ~ -32,767
		 * 
		 *		3) int
		 *			(1) 크기 : 4바이트 (32비트)
		 *			(2) 개수 : 2의 32제곱 (4,294,967,296개)
		 *			(3) 범위 : -2,147,483,648 ~ 2,147,483,647
		 *			(4) 용도 : 일반적인 정수 저장용
		 *
		 *		4) long
		 *			(1) 크기 : 8바이트 (64비트)
		 * 			(2) 개수 : 2의 64제곱 (18,446,744,073,709,551,616개)
		 * 			(3) 범위 : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		 * 			(4) 용도 : int 보다 크거나 작은 정수 저장용
		 * 
		 * 		5) 100억 : 10,000,000,000
		 * 				  10000000000 이라고 처리는 안되고
		 * 			      10000000000L 이라고 표기를 해야 한다. (int 범위를 벗어나는 정수값은 접미사 L이 필요)
		 * 
		 * 		6) 만약 long형으로도 처리가 안되는 숫자는 BigInteger 클래스를 이용하면 된다.
		 * 
		 * 
		 * 	2. 실수형
		 *		1) float
		 *			(1) 크기 : 4바이트
		 *			(2) 범위 : -1.4E-45 ~ (-, 1.4 곱하기 10의 -45 제곱)
		 *
		 *		2) double
		 *			(1) 크기 : 8바이트
		 *			(2) 범위 : -4.0E-324 ~
		 *
		 *		3) 구성 : 부호 + 소수부 + 지수부
		 *
		 *	3. 문자형
		 *		1) char
		 *			(1) 크기 : 2바이트 (c의 char는 1바이트)
		 *			(2) 일반 문자 크기
		 *				- 영문 : 1바이트
		 *				- 한글 : 2바이트
		 *			(3) 문자 표현 코드
		 *				- ASCII : 1바이트 영문 국제 표준 코드 (C)
		 *				- UNICODE : 2바이트 국제 표준 코드 (JAVA)
		 *
		 *	4. 논리형
		 *		1) boolean
		 *			(1) 크기 : 이론상 1bit
		 *			(2) 참 : ture
		 *			(3) 거짓 : false
		 *
		 */
		
		// 동일한 코드 복사
		// 커서를 두고, ctrl + alt + (com) + 방향키 업, 다운
		
		// 정수
		byte a = 127;
		short b = 32767;
		int c = 100000;
		long d = 10000000000L;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d); 
		
		// 실수
		float e = 3.141592F;	// float 타입에 저장하는 실수는 접미사 F를 붙인다.
		double f = 3.141592;
		
		System.out.println(e);
		System.out.println(f);
		
		// 문자
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		// 주의할 점
		System.out.println(ch1 + ch2); // 코드단위로 저장해서 산수열로 계산 (코드값끼리 더해짐)
		System.out.println("" + ch1 + ch2); // 빈문자 입력해주면 문자열이 됨
		
		// 논리값
		// 논리값은 일반적으로 변수명이 is로 시작한다.
		boolean isPositive;
		isPositive = true;	// 참이라고 말해주는 것
		if (isPositive) { // ()안이 참이면 {}안에 것 실행, 거짓이면 실행X 
			System.out.println("양수이다.");
			
		}
		
		
		
				
	}
}
