package day08_control_statement;

public class Ex07_loop_in_loop {
	public static void main(String[] args) {
		
		// 구구단
		
		// fix(고정)값을 바깥쪽 loop에 배치
		
		// 1. 세로로 출력
		
		for(int dan = 2; dan < 10; dan++) {	// 밑의 for문(안쪽 loop)이 돌 때까지는 fix
			for(int n = 1; n < 10; n++) {
				System.out.println(dan + "x" + n + "=" + (dan * n));
			}
		}
		
		// 2. 가로로 출력
		
		for(int n = 1; n < 10; n++) {
			for(int dan = 2; dan < 10; dan++) {
				System.out.print(n + "x" + dan + "=" + (dan * n)+ "\t");
		}
		System.out.println();
		}
		
	}
}
