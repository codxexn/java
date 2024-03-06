package day09_array;

public class Ex02_array_copy {
	public static void main(String[] args) {
		
		/*
		 * 	배열의 길이
		 * 	1. 배열의 길이는 length 필드값을 확인한다.
		 * 	2. 배열 선언시 배열의 길이는 변수로 처리할 수 있다.
		 * 	3. 한번 생성된 배열의 길이는 변경할 수 없다.
		 * 		-> 기존 배열의 크기를 변경할 수 없다.
		 * 	4. 기존 배열의 크기를 늘리려면 큰 배열을 새로 만들고, 기존 배열을 복사한다.
		 */
		
		int[] arr = {10, 20, 30, 40, 50};
		int[] tmp = new int[arr.length * 2];
		
		System.out.println("변경 전 arr의 길이 = " + arr.length);	// 5칸
		for(int i = 0; i < arr.length; i++) {	// 반복, 0부터 시작해서 arr 의 길이만큼 반복 
			System.out.print(arr[i] + " ");		// arr 칸마다 있는 값을 문자로 출력해주기
		}
		System.out.println();					// enter
	
		
		// 1. arr -> tmp 로 복사
		for(int i = 0; i < arr.length; i++) {	// 반복, arr 길이만큼 반복
			tmp[i] = arr[i];					// arr[번째 있는 값] 을 tmp[번째 있는 칸] 으로 넣어줌
		}
	
		// 2. tmp 정보를 arr 이 가져가야 함
		arr = tmp;		// tmp 주소값을 arr 이 가져감. 기존의 arr 주소값에 있던 값은 메모리 누수
						// 안 쓰는 값을 치워달라고 해야 함, .gc(garbage collector) 사용해서 치움, java에서 제공하는 기능
		
		System.out.println("변경 후 arr의 길이 = " + arr.length);	// 10칸으로 바뀜
		for(int i = 0; i < arr.length; i++) {	// 변경된 arr의 길이만큼 반복
			System.out.print(arr[i] + " ");		// 해서 [번째 있는 값]을 출력해줌 
		}
		System.out.println();
	
	
	}
}