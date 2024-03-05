package test;

import java.util.Scanner;

public class Test03_slove {
	public static void main(String[] args) {
		
		/* Test03.java
		 * 매출액과 등급("VIP", "일반")을 입력 받아 등급이 "VIP"이면 매출액에서 20%를 할인하고, 
		 * 등급이 "일반"이면 매출액에서 5%를 할인해서 실제 매출액 출력하기
		 * 둘 다 아니라면 "인식할 수 없는 값입니다." 출력하기
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("매출액 입력 >> ");
		int sales = sc.nextInt();
		
		System.out.print("등급 입력 >> ");
		String grade = sc.next();
		
		
		boolean isvip = grade.equals("VIP");
		// grade 에 있는 문자열이 "VIP" 와 같으면 isvip 에 true, 아니면 false 저장
		boolean isuser = grade.equals("일반");
		// grade 에 있는 문자열이 "일반" 와 같으면 isuser 에 true, 아니면 false 저장
		
		double realsales = isvip ? (sales * 0.8) : (sales * 0.95);
		// realsales 라는 공간에 isvip 가 
		// ture 면 sales 에 있는 값에 0.8 을 곱해서 double 타입으로 저장
		// false 면 sales 에 있는 값에 0.95를 곱해서 double 타입으로 저장
		
		String success = "실제 매출액은 " + (int)realsales + "원 입니다.";
		// success 라는 공간에 "realsales 라는 double 타입의 값을 int 타입으로 반환한 값과 앞뒤 문자열을 더해서 저장
		
		String message = isvip ? (success) : (isuser ? success : "인식할 수 없는 값입니다.");
		// message 라는 공간에 
		// isvip 가 true 면 success 에 있는 문자열을 저장
		// false 인 상황 중에서
		// isuser 가 true 면 또 success 에 있는 문자열을 저장
		// 그마저도 false 면 "인식할 수 없는 값입니다." 를 저장
		
		System.out.println(message);
		// message 에 저장된 문자열 출력
		
		sc.close();
		
	
	}
}
