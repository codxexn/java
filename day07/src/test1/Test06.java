package test1;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
//		Test06.java
//		사용자로부터 임의의 문자를 하나 입력 받아 
//		"대문자", "소문자", "아라비아 숫자", "일반 문자" 
//		구분해서 출력하기
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 문자를 입력하시오. >> ");
		char input = sc.next().charAt(0);
		
		if (input >= '1' && input <= '9') {
			System.out.println("숫자");
			} else if (input >= 'A' && input <= 'Z') {
			System.out.println("대문자");
			} else if (input >= 'a' && input <= 'z') {
			System.out.println("소문자");
			} else {
			System.out.println("일반 문자");
			}
		
		sc.close();
		
	}
}
