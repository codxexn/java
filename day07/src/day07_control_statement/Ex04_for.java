package day07_control_statement;

import java.util.Scanner;

public class Ex04_for {
	public static void main(String[] args) {
		
		/* 
		 *	for 반복문
		 *
		 *	for(초기문; 조건문(종료문); 증감문){
		 *		// 조건이 참인 동안 실행될 문장
		 *	}
		 */
		
		// 1. 1 ~ 10 까지 출력
		int a = 0;	// 변수 선언
		for (a = 1; a < 11; a++) {
			System.out.println(a);
		}
		
		for	(int b = 1; b < 11; b++) {
			System.out.println(b);
		}
		
		// a 는 for { } 안이 아니라 main { } 안에서 선언했기 때문에 a 를 사용할 수 있다.
		// b 는 변수 선언을 for 문 안에서 선언했기 때문에 { } 를 벗어나면 b 값을 사용할 수 없다.
		
		
		
		// 2. 사용자가 입력한 값만큼 "Hello" 출력하기 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문구를 반복할 횟수를 입력하시오. >> ");
		int repeat = sc.nextInt();
		
		for (int c = 1; repeat >= c; c++) {
			System.out.println("hello");
		}
		
		sc.close();
		
	}
}
