package day19_RecursiveCall;

public class Ex01_RecursiveCall {
	
	// static 메소드 (클래스 메소드) 내에서는
	// static 필드와 static 메소드를 호출할 수 있다.
	
	// Field
	static int cnt = 0;	// 몇번 호출되었는지 카운트 할 목적
	
	// Method
	static void recursive () {
		System.out.println(++cnt + "번째 recursive()가 호출됨");
		if(cnt == 10) {
			System.out.println("return을 만나서 10번째 recursive()" + "부터 종료시작");
			return;						// 재귀는 연쇄고리를 끝내주는 return 이 꼭 필요하다.
		}
		recursive();					// recursive() 메소드 호출
		System.out.println(--cnt + "번째 recursive()가 종료됨");		// 어떻게 보면 if 문으로 cnt 횟수를 정해준 만큼 반복해주는 건가?
	}
	
	public static void main(String[] args) {
		
		recursive();
	}
}
