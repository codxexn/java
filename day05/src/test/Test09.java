package test;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하시오. >> ");
		double height = (sc.nextDouble()*0.01);
		System.out.print("몸무게를 입력하시오. >> ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);

		boolean isover = bmi >= 25;
		boolean isnormal = bmi < 25 && bmi >= 20;
		String result = isover ? "과체중" : isnormal ? "일반체중" : "저체중";
		
		System.out.println(result);
		
		sc.close();
		
				
		
	}
}
