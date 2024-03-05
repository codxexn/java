package test;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨(℃)를 입력하시오. >> ");
		double d = sc.nextDouble();
		double f = d * 1.8 + 32;
		System.out.println(f + "°F");
		
		sc.close();
				
	}
}
