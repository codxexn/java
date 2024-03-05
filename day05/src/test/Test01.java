package test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		/*
		 * Test01.java
		 * 임의의 두 정수를 입력 받아 a, b에 저장한 뒤 두 변수의 값을 교환하여 출력하기
		 */
		
		System.out.print("임의의 정수를 입력하시오. >> ");
		int a = sc.nextInt();
		System.out.print("임의의 정수를 한번 더 입력하시오. >> ");
		int b = sc.nextInt();
		System.out.println("a = " + b + ", b = " + a);
		
		int tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("a = " + a + ", b = " + b);
		
		
		
		// a, b 의 값을 바꿔주려면 다른 공간 하나가 더 필요하다.
		
		
		
		
		
		sc.close();
		
	}

}
