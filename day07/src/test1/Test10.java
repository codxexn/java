package test1;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하시오. >> ");
		int month = sc.nextInt();

		switch (month) {
		case 1 :
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 2 :
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
		case 3 :
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 4 :
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		case 5 :
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 6 :
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		case 7 :
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 8 :
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 9 :
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		case 10 :
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 11 :
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		case 12 :
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		default:
			System.out.println("유효하지 않은 값입니다.");
			break;
		}
		
		sc.close();

	}
}
