package day05_input;

import java.util.Scanner;

public class Ex04_Scanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("나이 입력 >> ");	
		int Age = sc.nextInt();
		
		System.out.print("키 입력 >> ");		
		double height = sc.nextDouble();
		
		// Q. String name = sc.next();(만약 next(); 로 계속 써주면 입력스트림에는 계속 /n 이 쌓이고 잔여하는가?) 
		// sc.nextLine(); 을 한번 더 입력해서 입력스트림에 잔여한 /n 을 삭제해줌
		
		sc.nextLine();	// 청소
		
		System.out.print("성명 입력 >> ");
		String name = sc.nextLine();		
											
		
		System.out.print("성별 입력 >> ");
		String gender = sc.next();
	
		System.out.println("성명 : " + name);
		System.out.println("신장 : " + height + " cm");
		System.out.println("나이 : " + Age + " 세");
		System.out.println("성별 : " + gender);
		
		sc.close();		// 생략 가능(생략하면 JVM이(자바를 동작시켜주는 소프트웨어) 스스로 닫아줌(없애줌))
						// JRE(Java Runtime Environment) > JVM(Java Virtual Machine)
		
	}
}
