package test;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("입력할 온도의 종류를 선택하세요.(섭씨 또는 화씨) >> ");
		String choice = sc.next();
		
		switch (choice) {
		case "섭씨" :
			System.out.print("섭씨 입력 >> ");
			double c = sc.nextDouble();
			double f = (c * 1.8) + 32;
			System.out.println("변환된 화씨는 " + f + "°F 입니다.");
			break;
		case "화씨" :
			System.out.print("화씨 입력 >> ");
			double f2 = sc.nextDouble();
			double c2 = (f2 - 32) / 1.8;
			System.out.println("변환된 섭씨는 " + c2 + "°C 입니다.");
			break;
		default:
			System.out.print("잘못된 입력입니다.");
			break;
		}
		
		sc.close();
		
	}
}
