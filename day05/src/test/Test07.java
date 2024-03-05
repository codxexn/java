package test;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호 13자리를 - 없이 입력하시오. >> ");
		char id = sc.nextLine().charAt(6);
		int gender = (int)id;
		System.out.println(gender % 2 == 1 ? "남자" : "여자");
		
		sc.close();
		
	}
}
