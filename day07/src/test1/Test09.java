package test1;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수준값을 정수로 입력하시오. >> ");
		int a = sc.nextInt();
		
		switch (a) {
		case 3:
			System.out.println("실행, 쓰기, 읽기");
			break;
		case 2:
			System.out.println("쓰기, 읽기");
			break;
		case 1:
			System.out.println("읽기");
			break;
		default:
			System.out.println("권한이 없습니다.");
			break;
		}
		
		sc.close();
	}
}
