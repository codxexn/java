package test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수를 입력 받아 짝수, 홀수 구분해서 출력하기 (단, 3의 배수는 3의 배수로 출력하기)
		
		System.out.print("정수를 입력하시오. >> ");
		int b = sc.nextInt();
		
		if (b % 3 == 0) {
			System.out.println("3의 배수");	
		} else if (b % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		sc.close();
		
	}
}
