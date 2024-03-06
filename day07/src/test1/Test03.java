package test1;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하시오. >> ");
		int age = sc.nextInt();
		
		if (age < 1 || age > 120) {
			System.out.println("불가능한 나이");
		} else if (age <= 7) {
			System.out.println("미취학");
		} else if (age <= 13) {
			System.out.println("초등학생");
		} else if (age <= 16) {
			System.out.println("중학생");
		} else if (age <= 19) {
			System.out.println("고등학생");
		} else if (age >= 20) {
			System.out.println("성인");
		} else if (age < 1) {
			System.out.println("불가능한 나이");
		}
		
		sc.close();
	}
}
