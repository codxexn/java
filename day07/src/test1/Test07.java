package test1;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
//		Test07.java
//		알파벳을 하나 입력 받아 
//		대문자가 입력되면 소문자로 변환해서 출력하고,
//		소문자가 입력되면 대문자로 변환해서 출력하고, 
//		나머지 문자들은 입력된 그대로 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 알파벳을 입력하시오. >> ");
		char alphabet = sc.next().charAt(0);
		
		if ( alphabet >= 'A' && alphabet <= 'Z' ) {
			System.out.println((char)(alphabet + 32));
			} else if (alphabet >= 'a' && alphabet <= 'z') {
			System.out.println((char)(alphabet - 32));
			} else {
			System.out.println((char)(alphabet));
			}
		sc.close();
	}
}
