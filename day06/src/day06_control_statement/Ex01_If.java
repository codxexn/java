package day06_control_statement;

import java.util.Scanner;

public class Ex01_If {
	public static void main(String[] args) {
		
		/* 
		 *  if 조건문
		 *  
		 *  	if (조건식){
		 *  		// 조건식이 참(true)일 때 실행
		 *  	} else {
		 * 			// 그 외 경우에 실행
		 * 		}
		 */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오. >> ");
		int a = sc.nextInt();
		
		if(a > 0) {		// 우선 순위로 처리해야하는 조건은 맨 위로 올려줘야 한다.
			System.out.println("양수");
		} else if(a == 0) {
			System.out.println("ZERO");
		} else {
			System.out.println("음수");
		}
	
		sc.close();
		
	
	}
}
