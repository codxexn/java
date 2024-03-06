package test2;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
//		Test01.java
//		평점을 정수(1~5)로 입력받아 별(★, ★★, ★★★, ★★★★, ★★★★★) 출력하기
//		잘못된 평점이 입력되면 다시 입력 받고,
//		System.out.print("★")를 평점만큼 반복해서 사용할 것
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("평점을 정수(1~5)로 입력하시오. >> ");
		int a = sc.nextInt();

		int star = 0;
		while ( star < a ) {
		System.out.print("★");
		star++; 
			if(a < 1 && a >5) {
				System.out.print("1~5 사이의 숫자로로 다시 입력하시오. >> ");
				a = sc.nextInt();
			}
		}
		
		sc.close();
		
	}
}
