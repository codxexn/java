package test;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		/* Test03.java
		 * 매출액과 등급("VIP", "일반")을 입력 받아 등급이 "VIP"이면 매출액에서 20%를 할인하고, 
		 * 등급이 "일반"이면 매출액에서 5%를 할인해서 실제 매출액 출력하기
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("매출액 입력 >> ");
		int sales = sc.nextInt();
		// Q. 근데 127이 넘었는데 왜 int 로 저장이 되지?
		
		System.out.print("등급 입력(VIP or 일반) >> ");
		String grade = sc.next();
		// Q. sc.nextLine(); 이 안될 이유가 없는데 굳이? 라고 하셨는데
		// 여기서 sc.nextLine(); 을 써버리면 위에 nextInt(); 에서 남은 /n 만 스캔하고 종료되는 거 아닌가..?
		
		boolean isvip = grade.equals("VIP");
		double realsales = isvip ? (sales * 0.8) : (sales * 0.95);
		System.out.println("실제 매출액은 " + (int)realsales + "원 입니다.");
		// double realsales = isvip ? ((double)sales * 0.8) : ((double)sales * 0.95);
		// System.out.println("실제 매출액은 " + realsales + "원 입니다.");
		
		
		// 1. 처음 짠 것 : System.out.println(grade.equals("일반") ? (double)sales * 0.95 : (double)sales * 0.8);
		// (double)sales * 0.95 : (double)sales * 0.8 
		// 순서 바꾸니까 VIP 했을 때 8.0E7 인가..로 뜨는데 왜지?
		
		// 2. 두번째 짠 것 : System.out.println(isvip ? (double)sales * 0.8 : (double)sales * 0.95);
		// 이렇게 하면 안되는 건가?
		
		
		sc.close();
		
		
	}

}
