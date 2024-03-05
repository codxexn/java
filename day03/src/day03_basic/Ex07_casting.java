package day03_basic;

public class Ex07_casting {
	public static void main(String[] args) {
	
		/* 
		 * 형 변환(casting) : 우선은 기본 자료형에만 해당형
		 * 
		 * 1. 자동 형 변환
		 * 		1) Java가 스스로 형 변환
		 * 		2) 타입이 섞여 있는 경우 작은 크기의 타입을 큰 크기의 타입으로 통일하는 방향으로 동작
		 * 			예) int 와 long 타입을 연산 -> int 가 long 으로 변환
		 * 		3) 정수와 실수 타입을 연산 -> 실수로 변환
		 * 
		 * 2. 강제 형 변환
		 * 		1) 개발자가 직접 형 변환
		 * 		2) 기존 타입 상관 없이 원하는 타입으로 무조건 변환
		 * 		3) 변수명 앞에 (타입)을 붙여서 사용
		 * 			예) int n = 10;
		 * 			    (double)n
		 * 
		 */
		
		// 자동 형 변환
		System.out.println(1 + 1.5);	// 1 -> 1.0 + 1.5 = 2.5
		/* 1은 int(정수) 1.5는 double(실수)
		 * 작은 크기와 큰 크기를 연산했을 때 결과값이 문제 없이 작동하려면 큰 크기의 타입으로 나타나야 한다.
		 */
		double a = 10;
		// Java 가 스스로 double a = 10.0; 으로 변환 후 처리
		System.out.println(a);
		
		
		// 강제 형 변환 : 변수값 앞에 (type 명)을 기재한다.
		int b = (int)10.9;
		System.out.println(b);
		// 올림이 아니라 소수점 뒷자리를 버리고 출력함. 값의 손실이 생긴다.﻿
		
		

		
		int c = 23;
		double d = (double)c;
		System.out.println(d);
		
		
		
		
		}
}
