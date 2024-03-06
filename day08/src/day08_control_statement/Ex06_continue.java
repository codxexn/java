package day08_control_statement;

import java.util.Scanner;

public class Ex06_continue {
	public static void main(String[] args) {
		
		//	continue : 반복에서 제외하고 싶은 데이터를 처리할 때
		
		// 1. 1 ~ 20 사이에서 3의 배수를 제외하고 출력
		for(int a = 1; a < 21 ; a++) {
			if(a % 3 == 0) continue;	// continue 만나는 순간 그 순서는 패스하고 계속
										// break 는 그 반복이 끝
			System.out.println(a);
		}
		
		// 2. 애들 밥 먹이기
		// "굴" 빼고 모두 잘 먹는 아이
		// 어떤 반찬이든 5번만 먹게 처리
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String food = "";
		
		while(cnt < 5) {
			System.out.print("어떤 반찬을 줄까? >> ");
			food = sc.next();
			if(food.equals("굴")) {
				System.out.println("굴 싫어 싫어!");
				continue;
			}
			System.out.println(food + ", 잘 먹겠습니다~!");
			System.out.println("또 주세용!");
			cnt++;
			
			
			sc.close();
			
			
		}
	}
}
