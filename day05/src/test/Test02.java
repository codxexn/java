package test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이입력 >> ");
		
		int age = sc.nextInt();
		System.out.println(age >= 20 ? "성인" : "미성년자");
		
		sc.close();
		
	}
}
