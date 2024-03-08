package day19_RecursiveCall;

public class Ex02_RecursiveCall {
	
	// static Method
	static void recursive(int cnt) {	// int로 횟수 넣어준다.
		if(cnt == 0) return;			// 횟수가 0이랑 같으면 끝내준다.
		else {							// 아니라면
			System.out.println(cnt + "번째 recursive가 호출되었다."); 	// 출력
			recursive(cnt -1);			// 넣어준 횟수에서 -1 해서 다시 recursive 처음부터 비교
		}
	}
	
	public static void main(String[] args) {
		
		recursive(10);
		
		
	}
}
