package test1;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오. >> ");
		int grade = sc.nextInt();
		
		if (grade < 70) {
			System.out.println("F");
		} else if (grade < 74) {
			System.out.println("C-");
		} else if (grade < 77) {
			System.out.println("C0");
		} else if (grade < 80) {
			System.out.println("C+");
		} else if (grade < 84) {
			System.out.println("B-");
		} else if (grade < 87) {
			System.out.println("B0");
		} else if (grade < 90) {
			System.out.println("B+");
		} else if (grade < 94) {
			System.out.println("A-");
		} else if (grade < 97) {
			System.out.println("A0");
		} else if (grade < 100) {
			System.out.println("A+");
		} else if (grade == 100) {
			System.out.println("S");
		}
			
		sc.close();
			
		}
	}

