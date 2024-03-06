package test1;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("필기 점수를 입력하시오. >> ");
		double a = sc.nextDouble();
		System.out.print("실기 점수를 입력하시오. >> ");
		double b = sc.nextDouble();
		
		if (a >= 70 && b >= 70) {
			System.out.println("합격");
		} else if ((a + b) / 2 >= 80) {
			System.out.println("합격");
		} else {	
			System.out.println("불합격");
		}

		sc.close();
	}
}
