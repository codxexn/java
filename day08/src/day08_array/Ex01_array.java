package day08_array;

public class Ex01_array {
	public static void main(String[] args) {
		
		/*
		 * 	배열(Array)
		 * 
		 * 	1. 선언 방법 : 빈칸인 배열만 만들어주는 것
		 * 		1) int[] arr = new int[3];
		 * 		   int[](배열 만들거야) arr(공간 이름) = new int[3](3칸짜리);	
		 * 		// 추천 : 현직 개발자가 가장 많이 씀 
		 * 		// int [] 안에는 칸수가 들어감
		 * 		// arr[] 몇번째 칸으로 접근할 건지 숫자 넣어주기	
		 * 						
		 * 		2) int arr[] = new int[3];	// 잘 안 씀
		 * 		3) int[] arr;				// 참조변수 arr 선언 (arr에는 주소를 저장할 수 있다.)
		 * 		// 주소값을 일단 만든 것. 
		 * 		// int a = 0; 으로 선언만 해두는 것과 마찬가지
		 * 		// 칸수는 정해지지 않았을 때 선언만 해둔 것
		 * 		   arr = new int[3];		// int 변수를 3개 생성하고 그 주소를 arr에 저장
		 * 
		 * 	2. 초기화 방법 : 0으로 만들 건지, 값을 집어넣을 건지, 초기값을 집어넣는 것
		 * 		1) int[] arr = new int[]{10, 20, 30};
		 * 		2) int[] arr = {10, 20, 30};	// 많이들 쓰는 방식
		 * 		3) int [] arr;
		 * 		   arr = {10, 20, 30};		// 불가능한 초기화 방식(선언 시점에만 가능)
		 * 
		 * 	3. 주요 특징
		 * 		1) 배열의 인덱스는 0부터 시작한다.
		 * 		2) 배열이 생성되면 자동으로 0으로 초기화한다.
		 * 		3) 배열이 생성되면 배열의 길이를 가지고 있는 length 필드값을 사용할 수 있다.
		 * 		4) 배열의 인덱스 사용 범위를 벗어나면 ArrayIndexOutOfBoundsException 예외가 발생한다.
		 * 		(3칸짜리면 인덱스는 2까지만 존재한다. [] 안의 수 -1 = 인덱스)
		 */
		
		int[] arr1 = new int[3];		// 모든 요소가 0으로 초기화 된다. 3칸 만들어짐.
		int[] arr2 = {10, 20, 30};
		
		System.out.println("arr1의 길이 = " + arr1.length);
		System.out.println("arr2의 길이 = " + arr2.length);
		// 이런식으로 length 사용하면 길이가 얼마나 되는지 자동으로 알려줌
		
		// length 값의 1 작은 수가 인덱스 값
		// 3칸짜리면 인덱스 값은 2까지 밖에 없다.
		// 따라서 아래에 i < arr1.length 를 같거나 작다고 해준 게 아니라 작다로 해준 것.
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
