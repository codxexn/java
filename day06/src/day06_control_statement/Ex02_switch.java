package day06_control_statement;

import java.util.Scanner;

public class Ex02_switch {
	public static void main(String[] args) {
		
		/*
		 * 	switch 문
		 * 
		 * 	1. 형식
		 * 		switch(표현식){
		 * 		case 값1 : 실행문; break;	// break : 동작의 흐름을 멈추게 해주는 것.
		 * 		case 값2 : 실행문; break;
		 * 		default : 실행문;
		 * 
		 *  2. 실제 사용
		 *  	switch (a + b) {
		 *  	case >= 10 : 		// 불가능 (범위 지정 불가, 값만 가능)
		 *  	case 10 :			// 가능
		 *  	case 1.5 :			// 불가능 (표현식의 결과는 실수 타입일 수 없다.)
		 *  	case '남' :			// 가능
		 *  	case "홍길동" :		// 가능
		 *  	}
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하시오. >> ");
		int age = sc.nextInt();
		
		switch (age/10) {
		case 0 : 
			System.out.println("미성년자");
			break;
		case 1 :	
			System.out.println("미성년자");
			break;
		default:
			System.out.println("성인");
		}
		
		sc.close();
		
	}
}
