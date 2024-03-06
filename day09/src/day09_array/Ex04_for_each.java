package day09_array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04_for_each {
	public static void main(String[] args) {
		
		String[] friends = {"앨리스", "제임스", "데이빗"};
		
		// 1. 일반 for문
		for(int i = 0; i < friends.length; i++) {
			System.out.print(friends[i]+ " ");
		}
		
		System.out.println();
		
		// 2. 항상 for문 (for each)
		for(String friend : friends) {		// friend 라는 이름의 공간을 확보해준 것(배열의 값에 따라 타입이 달라짐) : 배열
											// 순차적으로 돌아서 하나씩 friend 공간에 담아준다.
			System.out.print(friend + " ");	// 실행하고 다시 처음으로 돌아가서 다시 실행
		}
		
		System.out.println();
		
		// 길이가 3인 hobbies 배열을 선언하고,
		// 사용자로부터 취미를 3가지 입력 받아 hobbies 배열에 저장 후 출력하기
		
		String[] hobbies = new String[3];	// 세칸을 만들어준다.
		
		// 1. 입력
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < hobbies.length; i++) {
			System.out.print((i + 1) + " 번째 취미를 입력하시오. >> ");
			hobbies[i] = sc.next();			// 여기서 [] 안은 인덱스, #번째 칸
		}
		
		// 2. 출력
		for(String hobby : hobbies) {
			System.out.print(hobby + " ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(hobbies));

		sc.close();
		
	}
}
