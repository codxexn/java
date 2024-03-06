package day09_array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03_array_io {
	public static void main(String[] args) {
		
		//	사용자로부터 생성할 배열의 길이를 입력 받아서 해당 배열을 생성하고, 
		//	생성된 배열의 임의의 값을 입력 받고, 출력하기.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생성할 배열의 길이를 입력하시오. >> ");
		int i = sc.nextInt();
		
		int[] arr = new int[i];
		
		// 1. 입력
		for(int a = 0; a < arr.length; a++) {
			System.out.print((a + 1) + "번째 칸에 입력할 임의의 값을 입력하시오. >> ");
			arr[a] = sc.nextInt();
		}
		
		// 2. 출력
		for(int a = 0; a < arr.length; a++) {
			System.out.println((a + 1) + "번째 칸에 생성된 값은 " + (arr[a] + " ") + " 입니다.");
		}
		
		System.out.println();
		
		// 3. arr의 출력값?
		System.out.println(arr);	// 주소값은 출력한다고 출력되지 않음

		
		// 4. 배열의 요소를 출력하는 메소드(배열을 문자열화 해서 출력해주는 것)
		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}
}
