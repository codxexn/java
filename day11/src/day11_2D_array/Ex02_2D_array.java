
package day11_2D_array;

import java.util.Scanner;

public class Ex02_2D_array {
	public static void main(String[] args) {
		
		/*
		 * 	가변형 2차원 배열
		 * 		1. 각 행의 열 개수가 서로 다른 배열
		 * 		2. 선언 방법
		 * 			int[][] arr = new int[3][];		// 3행 n열
		 * 			arr[0] = new int[2];			// 0행은 2열
		 * 			arr[1] = new int[3];			// 1행은 3열
		 * 			arr[2] = new int[4];			// 2행은 4열
		 */
		
		int[][] arr1 = new int[3][];
		
		arr1[0] = new int[2];
		arr1[1] = new int[3];
		arr1[2] = new int[4];
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
		
		/*
		 *  1번 손님 몇 좌석을 예약할까요? >> 3
		 *  2번 손님 몇 좌석을 예약할까요? >> 2
		 *  3번 손님 몇 좌석을 예약할까요? >> 3
		 *  
		 *  예약현황
		 *  1번 : 000
		 *  2번 : 00
		 *  3번 : 00000
		 */
		
		int[][] arr2 = new int[3][];

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr2.length; i++) {
				System.out.print((i + 1) + "번 손님 몇 좌석을 예약할까요? >> ");
				int seat = sc.nextInt();
				arr2[i] = new int[seat];
		}
		
		
		System.out.println("예약현황");
		for(int i = 0; i < arr2.length; i++) {
		System.out.print((i + 1) + "번 : ");
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
