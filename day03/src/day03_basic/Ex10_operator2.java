package day03_basic;

public class Ex10_operator2 {
	public static void main(String[] args) {
		
		/*
		 * 	4. 관계 연산자
		 * 		1) >=	: 이상, 크거나 같다
		 * 		2) >	: 초과, 크다
		 * 		3) <= 	: 이하, 작거나 같다
		 * 		4) <	: 미만, 작다
		 * 		5) !=	: 같지 않다	// ! = not
		 * 		6) ==	: 같다 (기본 자료형 : primitive type)
		 * 		   a.equals(b) : 같다 (참조 자료형 : reference type)
		 * 		   a 에는 문자열의 변수명(공간명), b에는 비교값(?)이 들어간다.
		 * 
		 * 	5. 논리 연산자
		 * 		1) &&	: and (모든 조건식을 만족하면 true, 아니면 false(하나라도 아니면))
		 * 		2) ||	: or (조건식을 하나라도 만족하면 true, 아니면 false(전부 다 아니여야))
		 * 		3) !	: not (결과를 반대로 변경을 해줌)
		 * 		4) short circuit evaluation 을 지원 (짧은 순환 평가)
		 * 			- && : false 조건이 하나라도 나타나면 그 이후는 처리하지 않음
		 * 				   (모든 조건식을 만족해야 true 이기 때문에 false 가 나오는 순간 더 볼 필요 없음)
		 * 					= false 가 나올 때까지, false 가 안나오면 끝날 때까지 연산해서 결과값 출력
		 * 			- || : true 조건이 하나라도 나타나면 그 이후는 처리하지 않음
		 * 				   (하나라도 만족하면 true 이기 때문에 true 가 나오는 순간 더 볼 필요 없음)
		 * 					= true 가 나올 때까지, true 가 안나오면 끝날 때까지 연산해서 결과값 출력
		 * 
		 *	6. 조건 연산자
		 *		1) 조건식 ? 조건식이 true 인 경우 : 조건식이 false 인 경우
		 *		2) if ~ else 대용으로 널리 사용
		 *
		 */
		

		// 1. 관계/ 조건 연산자
		int a = 100;
		
		// && and
		System.out.println(a == 100 && a > 10);
		// a 와 100 이 같다고 선언을 하는 게 아니라 같냐고 질문하는 것
		// 그래서 답은 true, false 로 나옴
		// 그리고 a 는 10 보다 크냐?
		// and 이기 때문에 둘 다 맞아야 true 둘 중 하나라도 아니면 false 가 나옴
		// ==, > 는 관계연산자라서 값에 영향을 끼치지 않음
		
		System.out.println(a == 100 && a < 10);
		// 둘 중 하나가 아니었기 때문에 답은 false
		
		// || or
		System.out.println(a == 100 || a < 10);
		// a 는 100과 같거나 10 보다 작은 것 중 하나라도 만족하면 true
		
		System.out.println(!(a == 100));
		// 원래 결과값은 true 인데 ! not 이 붙어서 not true = false
		
		// 2. short circuit evaluation
		// 잘 활용해서 연산을 빨리 처리하면 메모리를 작게 차지해서 실행 속도가 빠르다.
		int b = 100;
		boolean c = (a == 10) && (++b > 10);
		// ++b 는 증감 연산자라서 대입된 값에 영향을 끼침(연산 후 저장까지)
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		// 둘 다 만족해야 끝까지 처리하는데 이미 첫째 조건에서 false 라서
		// 둘째 조건을 처리할 필요가 없어서 b= 100 이라고 나온 건 이해했다.
		// 근데 boolean 뒤에 나오는 조건들도 값을 변화시킬 수 있는 건가?
		// 맞냐, 아니냐만 따지는 게 아니라 값을 바꿔서 출력하는 것에 영향을 끼치는 건가?
		// 어떤 자료형이 나오든 그 값에 연산자가 있으면 연산된 결과가 메모리에 저장되고 다음 줄로 넘어가는 것인가?
		
		boolean d = (a == 10) || (++b > 10);
		System.out.println("a = " + a + ", b = " + b + ", d = " + d);
		
		// 3. 조건 연산자
		// 	1) 요금 : 성인은 4,000원, 미성년자는 2,000원
		int age = 18;
		boolean isAdult = age >= 20;
		System.out.println(isAdult);
		int fee = isAdult ? 4000 : 2000;	// 3항 연산자라고도 부른다. 조건식/참/거짓
		
		/* Tip!
		 * boolean 사용 안하고 바로 
		 * int fee = age>= 20 ? 4000 : 2000;
		 * 해도 되지만 웬만하면 분리
		 * 변수를 선언을 해둬야 나중에 수정해야하는 상황이 왔을 때 유리하다.
		 * 코드 실행 속도는 메모리를 어떻게 썼냐에 달렸다.
		 * 메모리는 주소가 존재기 때문에 주소 단위로 접근하는 게 가장 빠르다.
		 */
		
		System.out.println("요금은 " + fee + "원 입니다.");
		
		//
		
		
		
		// 2) 아이디가 "admin" 이면 "관리자",  아니면 "일반유저" 라고 출력
		String userId = "admin";
		System.out.println(userId.equals("admin") ? "관리자" : "일반유저");
		// userId == "admin" 불가능, 주소값과 문자열 비교 불가
		
		
		
		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
