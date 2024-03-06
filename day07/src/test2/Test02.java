package test2;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
//		Test02.java
//		2 ~ 9 사이 정수를 입력 받아 해당 구구단만 출력하기
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("구구단 수를 입력하시오. >> ");
		int a = sc.nextInt();

			int x = 1;
			while ( x < 10 ) {
			System.out.println(a * x);
			x++; 
			}
			
		sc.close();
			
	}
}
