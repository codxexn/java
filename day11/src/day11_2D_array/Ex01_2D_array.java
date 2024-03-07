package day11_2D_array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_2D_array {
	public static void main(String[] args) {
		
		/*
		 * 	고정형 2차원 배열 (테이블 같은 것) : 배열 안에 배열이 들어감 : 이중 배열
		 * 	안의 배열의 요소는 값이고, 바깥 배열의 요소는 배열이다.
		 * 	인덱스 값은 바깥 배열부터 차례로 [][]
		 * 	테이블로 치면 1. 몇번째 줄? 2. 몇번째 칸?
		 * 	첫번째 [] 숫자는 바깥 배열, 두번째 [] 숫자는 안 배열 칸
		 * 		1. 행과 열이 고정된 2차원 배열
		 * 		2. 선언 방법
		 * 			int[][] arr = new int[3][2];	// 3행 2열, 배열의 길이를 정해준 것!
		 * 		3. 초기화 방법
		 * 			1) int[][] arr = new int[][]{ {1, 2}, {3, 4}, {5, 6} };
		 * 			2) int[][] arr = { {1, 2}, {3, 4}, {5, 6} };	// 추천
		 * 
		 */
		
		int [][] arr = {
				{1, 2},
				{3, 4},
				{5, 6}
		};
		
		System.out.println("arr 의 행 수 = " + arr.length);
		System.out.println("arr[0] 의 열 수 = " + arr[0].length);
		System.out.println("arr[1] 의 열 수 = " + arr[1].length);
		System.out.println("arr[2] 의 열 수 = " + arr[2].length);
		
		// 배열은 for문, 이중 배열은 이중 for문
		// 행 인덱스 : i
		// 열 인덱스 : j
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\t");
		}
		
		System.out.println();
		
		
		// 2행 3열 배열을 생성하고,
		// 사용자로부터 데이터를 입력 받아 저장하고 출력하기
		
		int[][] arr1 = new int[2][3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print("배열에 넣을 값을 입력하시오. >> ");
				arr1[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		
		sc.close();
		
	}
}
