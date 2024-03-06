package test2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = 0;
		int a = 0;
		
		System.out.print("양수를 입력하시오. >> ");
		a = sc.nextInt();
		
			int b = 0;
			while (b <= a) {
				c = c + b; 
				b++;
			if (a < 2) {
				System.out.print("2 이상의 수를 다시 입력하시오. >> ");
				a = sc.nextInt();
			}
		}
		
		System.out.println("입력받은 양수까지의 수의 합계는 " + c + "입니다.");
		
		sc.close();
	}
}
