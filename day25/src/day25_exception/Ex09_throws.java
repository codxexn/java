package day25_exception;

import java.util.Scanner;

class Calculator {
	// Field
	private int count;
	
	// Method
	public void calculate(String a, String b) throws NumberFormatException, ArithmeticException {
		count++;
		int n1 = Integer.parseInt(a);	// NumberFormatException 발생 가능 (숫자 입력받아야 하는데 문자 입력받은 경우)
		int n2 = Integer.parseInt(b);
		
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));	// ArithmeticException 발생 가능
	}
	
	public void countInfo() {
		System.out.println("계산기 사용 횟수 : " + count + "회");
	}
}

public class Ex09_throws {
	public static void main(String[] args) {
		
		// Calculator 클래스를 이용해 myCalculator 객체 생성
		Calculator myCalculator = new Calculator();
		
		// 정수 입력 (String 사용)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a 입력 >> ");
		String a = sc.next();
		
		System.out.print("정수 b 입력 >> ");
		String b = sc.next();
		
		try {								// method 호출시 예외 발생하면 처리해줘라.
			myCalculator.calculate(a, b);
			myCalculator.countInfo();
		} catch(NumberFormatException e) {
			System.out.println("정수를 입력하시오.");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception e) {
			System.out.println("예외 메시지 : " + e.getMessage());
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
	}
}
