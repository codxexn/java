package day03_basic;

public class Ex09_operator1 {
	public static void main(String[] args) {
		
		/*
		 * 	1. 산술 연산사
		 * 		1) +
		 * 		2) -
		 * 		3) *
		 * 		4) / : 정수(몫), 실수(나누기)
		 * 		5) % : 정수(나머지)
		 * 	
		 * 	2. 대입 연산자
		 * 		1) =	: 대입
		 * 		2) +=	: 더해서 대입
		 * 			int a = 3;
		 * 			a = a + 4;
		 * 			(여기서 좌변 a는 공간 이름, 우변의 a는 값 3을 나타낸다. 구분해야함.)
		 * 			a += 4;
		 * 		3) -=	: 빼서 대입
		 * 		4) *=	: 곱해서 대입
		 * 		5) /=	: 몫을 구해서 대입, 나눠서 대입 (몫을 구해서 그 공간에다가 덮어쓰기 하는 것)
		 * 		6) %=	: 나머지를 구해서 대입 (나머지를 공간에 덮어쓰기)
		 * 
		 * 	3. 증감 연산자 : 1단위로 증가해주냐 감소해주냐/ 앞에 붙고 뒤에 붙고의 차이를 알아야 함
		 * 		1) a++ : a를 사용하고 1증가 
		 * 	 	2) ++a : a를 1증가시켜서 사용
		 * 			++ 이 붙으면 1증가를 시켜주는데 ++이 뒤에 붙으면 일단 a를 먼저 사용하고 1증가는 나중에
		 * 			++이 먼저 붙으면 1증가를 시켜준 다음 a를 사용하겠다는 의미
		 * 		3) a-- : a를 사용하고 1감소
		 * 		4) --a : a를 1감소시켜서 사용
		 * 
		 */
		
		
		System.out.println(1 + 2);
		System.out.println(4 - 2);
		System.out.println(7 * 8);
		System.out.println(10 / 2);
		System.out.println(10 / 3);
		System.out.println(10 % 3);
		System.out.println(10.5 / 3);
		
		int a = 100;
		a = a + 3;
		System.out.println(a);
		a -= 90;
		System.out.println(a);
		
		// alt + 방향키 = 이동
		
		int b = 100;
		b += 4;
		System.out.println(b);
		b *= 2;
		System.out.println(b);
		b /= 4;
		System.out.println(b);
		b %= 5;
		System.out.println(b);
			
		System.out.println("---------");
		
		int num = 1;
		System.out.println(num++);	// 1이라는 것을 프린트 먼저 하고 ++ 로 1증가를 시켜놓은 상태
									// 1증가된 상태는 프린트 안하고 저장만 된 상태
		System.out.println(num);	// 그리고 다시 프린트 하면 1증가된 저장 상태(2)가 출력됨
		System.out.println(++num);	// 2로 저장된 상태에서 먼저 1증가하고 num을 사용해서 출력
		
		System.out.println("---------");
		
		int num2 = 3;
		System.out.println(num2--); // 우선 3 사용해서 출력 후 1감소로 저장(출력은 3, 저장 2)
		System.out.println(num2);	// 2 출력
		System.out.println(--num2);	// 2에서 1감소 먼저 하고 출력 = 1
		
		
		// 임의의 2자리 정수(10~99)를 선언하고
		// 그 수가 카프리카수인지 판단해서 맞으면 true, 아니면 false를 저장하라.
		// (81은 카프리카수이다.)
		// 카프리카수란? 제곱 수를 임의로 나눠서 더하면 다시 그 수가 되는 수.
		// ex) 3025 = 30+25 = 55의 제곱 = 3025
		
		System.out.println("---------");
		
		int c = 45;
		int square = c * c;				// square 에는 45를 제곱한 값이 저장됨
		int front = square / 100;		// 2025 나누기 100한 몫
		int back = square % 100;		// 2025 나누기 100한 나머지
		boolean isKaprekar = c == (front + back);
		// Kaprekar 가 c 와 front와 back을 더한 값이랑 같니?
		// 같으면 true값 저장, 아니면 false 값 저장
		System.out.println(isKaprekar); // 저장한 것 출력
				
				
		System.out.println("---------");
		
		int d = 35;
		int square2 = d * d;
		int front2 = square2 / 100;
		int back2 = square2 % 100;
		boolean isKaprekar2 = d == (front2 + back2);
		System.out.println(isKaprekar2);

		
	}
}
