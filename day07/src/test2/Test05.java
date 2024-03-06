package test2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		
//		Test05.java
//		두 정수를 입력 받아 두 정수 사이의 모든 정수의 합계 출력하기
//		입력 순서와 무관하게 동일한 결과를 출력
//		실행 예1)
//		   첫 번째 정수 >> 1
//		   두 번째 정수 >> 10
//		   1부터 10까지 모든 정수의 합은 55입니다.
//		실행 예2)
//		   첫 번째 정수 >> 10
//		   두 번째 정수 >> 1
//		   1부터 10까지 모든 정수의 합은 55입니다.
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하시오.");
		System.out.print("첫번째 정수 >> ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 >> ");
		int second = sc.nextInt();
		
		
		if (first > second) {
			
			int result = 0;
			while (first >= second) {
				result = result + second;
				second++;
			}
			System.out.print((second-first) + "부터 " + first + "까지 모든 정수의 합은 " + result + " 입니다.");
		} else {
			int result = 0;
			while (second >= first) {
				result = result + first;
				first++;
			}
			System.out.print((first-second) + "부터 " + second + "까지 모든 정수의 합은 " + result + " 입니다.");
		}
		
		sc.close();
		
	}
}
