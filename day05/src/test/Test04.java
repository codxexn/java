package test;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("남자면 홀수, 여자면 짝수를 입력하시오. >> ");
		int num = sc.nextInt();
		boolean isgender = num % 2 == 1;
		System.out.println(isgender ? "남자" : "여자");
		
		sc.close();
		
	
	}
}
