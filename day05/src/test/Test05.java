package test;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 입력 >> ");
		double korean = sc.nextDouble();
		System.out.print("수학점수 입력 >> ");
		double math = sc.nextDouble();
		System.out.print("영어점수 입력 >> ");
		double english = sc.nextDouble();
		System.out.println((korean + math + english) / 3);
		
		sc.close();
		
	}
}
