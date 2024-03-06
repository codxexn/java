package day08_control_statement;

import java.util.Scanner;

public class Ex05_break {
	public static void main(String[] args) {
		
		// 1. 1~100 모든 정수의 합 구하기
		// 단, 합이 2000 이상이면 멈추고, 어디까지 더한 결과가 최초 2000 이상인지 출력하기
		// for문 사용(횟수 지정할 수 밖에 없다. 리밋 존재)
		
		int total = 0;
		int i = 0;
		for(i = 1; i < 101 ; i++) {	// from, to, 그때까지 어떻게 하겠다.
			total += i;
			if(total > 2000) break;
		}
		System.out.println("최초로 총값이 2000보다 커지는 곳은 " + i + "까지 더했을 때다.");
		
		// 2. 수도 맞추기
		// 대한민국의 수도를 맞출 때까지 묻기
		// 몇번만에 맞췄는지 함께 출력
		// while문 사용 (조건만 충족하면 무한번도 가능)
		
		String city = "";
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("대한민국의 수도를 입력하시오. >> ");
			city = sc.next();
			count++;
			if(city.equals("서울") || city.equalsIgnoreCase("seoul"))	 break;// case 대소문자
			// case sensitive 하냐 (대소문자 분간하며 입력해야하나?)
			System.out.println("틀렸습니다. 다시 입력하세요.");
		}
		System.out.println(count + "번만에 맞췄습니다.");
		
		sc.close();
	}
}
