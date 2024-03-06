package day07_control_statement;

import java.util.Scanner;

public class Ex03_while {
	public static void main(String[] args) {
		
		/*
		 *	while 반복문
		 *
		 *	초기문
		 *	while(조건문(반복문)){
		 *		// 조건이 참인 동안 반복적으로 실행될 문장 (무한 루프가 발생할 수도 있다.)
		 *		증감문	// 그래서 다시 반복하러 들어갈 부분은 조건문이다. 초기문으로 돌아가지 않는다.
		 *	}
		 */
		
		// 1. 0 ~ 9 까지 출력
		int a = 0;
		while (a < 10) {	// 조건문(종료문 : false 가 되는 순간 while 문이 종료된다.)
			System.out.println(a);
			a++;
		}
		
		System.out.println("-------");
		
		// 2. 9 ~ 0 까지 출력 
		int b = 9;
		while (b >= 0) {
			System.out.println(b);
			b--;
		}
		
		System.out.println("-------");
		
		// 3. 'A' ~ 'Z' 까지 출력
		
//		char alpha = 'A';
//		int c = (int)alpha;
//		while (c <= 90) {
//			System.out.println((char)c);
//			c++;
//		}		
		
		char ch = 'A';
		while (ch <= 'Z') {
			System.out.println(ch);
			ch++;
		}
		
		// char 타입은 ASCII 코드(숫자)로 저장되기 때문에 대소 비교, 연산 모두 가능하다. (ㅜ_ㅜ)
		
		
		// 4. "admin" 아이디가 입력될 때까지 계속 입력받기
		// 몇번만에 입력되었는지 출력
		
		int cnt = 0;
		String id = "";
		
		Scanner sc = new Scanner(System.in);

		while (!id.equals("admin")) {
			System.out.print("아이디를 입력하시오. >> ");
			id = sc.next();
			cnt++;	
			if (!id.equals("admin")) {
				System.out.println("아이디가 틀렸습니다. 다시 입력하시오.");
			}
		}
		System.out.println(cnt + "번만에 아이디를 맞췄습니다.");

		sc.close();
		
	}
}
