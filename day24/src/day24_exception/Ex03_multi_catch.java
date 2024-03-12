package day24_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03_multi_catch {
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("a 입력 >> ");
			int a = sc.nextInt();
			
			System.out.print("b 입력 >> ");
			int b = sc.nextInt();
			
			System.out.println(a + " + " +  b  + " = " + (a + b));
			System.out.println(a + " - " +  b  + " = " + (a - b));
			System.out.println(a + " * " +  b  + " = " + (a * b));
			System.out.println(a + " / " +  b  + " = " + (a / b));
			
			sc.close();
			
		} catch (InputMismatchException e) {
			System.out.println("입력은 정수만 가능합니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("문제가 발생하여 처리할 수 없습니다.");
		}
		
		/*
		 * 다 받아서 처리하는 Exception은 가장 마지막에 적어주어야 한다.
		 * 무조건 마지막catch 블록에 배치해야 한다.
		 */
		
	}
}
