package day05_input;

import java.util.Scanner;

public class Ex03_Scanner {
	public static void main(String[] args) {
		
		// 1) Scanner 클래스의 sc 객체 생성
		
		Scanner sc = new Scanner(System.in);
		
		// nextInt(), nextDouble() : 숫자 뒤 /n 을 통해 숫자로 인식 (enter 전까지의 숫자였다고 인식하고 거기까지만 챙겨감)
		
		System.out.print("나이 입력 >> ");	
		int age = sc.nextInt();				// 20/n (여기서 /n은 사용자가 친 enter 가 남는 것, 인식은 20까지, /n 남음)
		
		System.out.print("키 입력 >> ");
		double height = sc.nextDouble();	// /n180.5/n = 180.5 저장, 앞의 /n 버려짐(없어짐), 뒤의 /n 남음)
		
		sc.nextLine();
		
		System.out.print("성명 입력 >> ");	
		String name = sc.nextLine();		
		
		System.out.print("성별 입력 >> ");	
		char gender = sc.nextLine().charAt(0);
		
		
		
	
		System.out.println("성명 : " + name);
		System.out.println("신장 : " + height + " cm");
		System.out.println("나이 : " + age + " 세");
		System.out.println("성별 : " + gender);
		
		sc.close();
	
	
	
	
	
	
	}
}
