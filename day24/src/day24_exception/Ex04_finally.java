package day24_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04_finally {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// 스캐너는 선언과 동시에 초기화가 진행돼야 한다.
		
		try {
			System.out.print("a 입력 >> ");
			int a = sc.nextInt();
			
			System.out.print("b 입력 >> ");
			int b = sc.nextInt();
			
			System.out.println(a + " + " +  b  + " = " + (a + b));
			System.out.println(a + " - " +  b  + " = " + (a - b));
			System.out.println(a + " * " +  b  + " = " + (a * b));
			System.out.println(a + " / " +  b  + " = " + (a / b));
			
			
		} catch (InputMismatchException e) {
			System.out.println("입력은 정수만 가능합니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("문제가 발생하여 처리할 수 없습니다.");
		} finally {			// try가 끝까지 실행되든 catch가 실행되서 중단이 되든 무조건 실행해야 하는 것을 넣어주는 블록
			if(sc != null) sc.close();
		}
		
		
	}
}
