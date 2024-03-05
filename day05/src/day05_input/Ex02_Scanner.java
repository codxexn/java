package day05_input;

import java.util.Scanner;

public class Ex02_Scanner {
	public static void main(String[] args) {
		
		// import 하는 방법
		// 클래스명을 끝까지 쓰지 말고, 자동완성(ctrl + space) 를 이용한다.
		// 경로를 위에 만들어줬기 때문에 밑에 입력해주지 않아도 된다.
		
		// 1) Scanner 클래스의 sc 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성명 입력 >> ");
		String name = sc.nextLine();
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		System.out.print("키 입력 >> ");
		double height = sc.nextDouble();
		System.out.print("성별 입력 >> ");
		String gender = sc.next();
	
		System.out.println("성명 : " + name);
		System.out.println("신장 : " + height + " cm");
		System.out.println("나이 : " + age + " 세");
		System.out.println("성별 : " + gender);
		
		sc.close();
		

		
		
	}
	
}
